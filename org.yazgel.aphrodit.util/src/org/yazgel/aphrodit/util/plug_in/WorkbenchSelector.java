package org.yazgel.aphrodit.util.plug_in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.yazgel.aphrodit.util.uri.URIUtils;

public class WorkbenchSelector {
	private IWorkbenchWindow activeWindow;
	private URI originURI;

	public WorkbenchSelector(IWorkbenchWindow activeWindow) {
		this.activeWindow = activeWindow;
	}

	public WorkbenchSelector(URI originURI) {
		this.originURI = originURI;
	}

	public IStructuredSelection getStructuredSelection() {
		if (activeWindow == null) {
			return null;
		}

		ISelectionService service = activeWindow.getSelectionService();

		IStructuredSelection structuredSelection = (IStructuredSelection) service
				.getSelection("org.eclipse.jdt.ui.PackageExplorer");

		if (structuredSelection == null) {
			structuredSelection = (IStructuredSelection) service
					.getSelection("org.eclipse.ui.navigator.ProjectExplorer");
		}

		return structuredSelection;
	}

	@SuppressWarnings("unchecked")
	public List<IResource> getIResourceSelection() {
		IStructuredSelection selection = getStructuredSelection();

		/* Selection yoksa, origin uri kullan. */
		if (selection == null) {
			IResource res = null;

			try {
				res = URIUtils.getFile(originURI);
			} catch (Exception e) {
				try {
					res = URIUtils.getFolder(originURI);
				} catch (Exception e1) {
					throw new RuntimeException(
							"OriginURI ne IFile ne de IFolder.");
				}
			}

			return Arrays.asList(res);
		}

		return (List<IResource>) selection.toList();
	}

	public List<IFile> getIFileSelection() {
		List<IResource> iResourceSelection = getIResourceSelection();

		List<IFile> fileList = new ArrayList<IFile>();
		for (IResource res : iResourceSelection) {
			if (res instanceof IFile) {
				IFile file = (IFile) res;

				if (fileExtension() == null) {
					fileList.add(file);
				} else {
					if (file.getName().endsWith(fileExtension())) {
						fileList.add(file);
					}
				}
			}
		}

		return fileList;
	}

	public List<IFolder> getIFolderSelection() {
		List<IResource> iResourceSelection = getIResourceSelection();

		List<IFolder> folderList = new ArrayList<IFolder>();
		for (IResource res : iResourceSelection) {
			if (res instanceof IFolder) {
				folderList.add((IFolder) res);
			}
		}

		return folderList;
	}

	public List<URI> getURISelection() {
		List<IResource> resourceSelection = getIResourceSelection();

		List<URI> uriList = new ArrayList<>();

		for (IResource iResource : resourceSelection) {
			URI uri = URI.createFileURI(iResource.getLocation().toFile()
					.getAbsolutePath());
			uriList.add(uri);
		}

		return uriList;
	}

	public IProject getSelectionProject() {
		return getIResourceSelection().get(0).getProject();
	}

	protected String fileExtension() {
		return null;
	}
}
