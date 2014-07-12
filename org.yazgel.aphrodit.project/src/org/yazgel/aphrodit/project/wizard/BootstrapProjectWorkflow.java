package org.yazgel.aphrodit.project.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.yazgel.aphrodit.mwe.WorkflowContentCreater;

public class BootstrapProjectWorkflow extends Wizard implements INewWizard {

	private static final String WIZARD_NAME = "Bootstrap Project Workflow Wizard"; //$NON-NLS-1$

	protected IStructuredSelection selection;

	protected GeneratorWizardPageZero zero;
	private String _contentUri;
	private String _outPutFolder;

	public BootstrapProjectWorkflow() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void addPages() {
		zero = new GeneratorWizardPageZero("Create a new Workflow", selection);
		addPage(zero);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		String contents = WorkflowContentCreater.createWorkflow(
				zero.getFileName().substring(0, zero.getFileName().length() - zero.getFileExtension().length() - 1) , "model", "src-gen");

		IPath workflowFilePath = zero.getContainerFullPath().append(
				zero.getFileName());

		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(workflowFilePath);

		InputStream source = new ByteArrayInputStream(contents.getBytes());
		try {
			file.create(source, false, null);

			// Open file
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			IEditorDescriptor desc = PlatformUI.getWorkbench()
					.getEditorRegistry().getDefaultEditor(file.getName());
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return true;
	}

	public String get_contentUri() {
		return _contentUri;
	}

	public String get_outPutFolder() {
		return _outPutFolder;
	}

}
