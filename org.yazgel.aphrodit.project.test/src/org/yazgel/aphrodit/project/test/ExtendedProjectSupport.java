package org.yazgel.aphrodit.project.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.yazgel.aphrodit.project.test.natures.ProjectNature;

public class ExtendedProjectSupport {
	
	/**
	 * For this marvelous project we need to: - create the default Eclipse
	 * project - add the custom project nature - create the folder structure
	 * 
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 */

	public static IProject createProject(String projectName, URI location) {

		ArrayList<IProject> referencedProjects = new ArrayList<IProject>();

		ArrayList<String> srcFolders = new ArrayList<String>();
		srcFolders.add("src");
		
		ArrayList<String> folders = new ArrayList<String>();
		folders.add("model");

		HashSet<String> requiredBundles = new HashSet<String>();
		requiredBundles.add("org.eclipse.ui");
		requiredBundles.add("org.eclipse.core.runtime");
		requiredBundles.add("org.yazgel.aphrodit.mwe");
		requiredBundles.add("org.eclipse.emf.mwe2.launch");
		requiredBundles.add("org.apache.log4j");
		requiredBundles.add("org.yazgel.aphrodit.util");
		requiredBundles.add("org.yazgel.aphrodit.codegenerator");
		requiredBundles.add("org.apache.commons.logging");
		requiredBundles.add("org.yazgel.aphrodit");

		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);

		IProject project = null;
		try {
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			project = workspace.getRoot().getProject(projectName);

			// Clean up any old project information.
			if (project.exists()) {
				return null;
			}

			final IJavaProject javaProject = JavaCore.create(project);
			final IProjectDescription projectDescription = ResourcesPlugin
					.getWorkspace().newProjectDescription(projectName);
			projectDescription.setLocation(null);
			project.create(projectDescription, new NullProgressMonitor());
			final List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
			if (referencedProjects.size() != 0) {
				projectDescription.setReferencedProjects(referencedProjects
						.toArray(new IProject[referencedProjects.size()]));
				for (final IProject referencedProject : referencedProjects) {
					final IClasspathEntry referencedProjectClasspathEntry = JavaCore
							.newProjectEntry(referencedProject.getFullPath());
					classpathEntries.add(referencedProjectClasspathEntry);
				}
			}

			projectDescription.setNatureIds(new String[] {ProjectNature.NATURE_ID, JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature"});
			
			final ICommand java = projectDescription.newCommand();
			java.setBuilderName(JavaCore.BUILDER_ID);

			final ICommand manifest = projectDescription.newCommand();
			manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");

			final ICommand schema = projectDescription.newCommand();
			schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

			projectDescription.setBuildSpec(new ICommand[] { java, manifest,
					schema });

			project.open(new NullProgressMonitor());
			project.setDescription(projectDescription,
					new NullProgressMonitor());

			//SourceFolder yaratma
			Collections.reverse(srcFolders);
			for (final String src : srcFolders) {
				final IFolder srcContainer = project.getFolder(src);
				if (!srcContainer.exists()) {
					srcContainer.create(false, true, new NullProgressMonitor());
				}
				final IClasspathEntry srcClasspathEntry = JavaCore
						.newSourceEntry(srcContainer.getFullPath());
				classpathEntries.add(0, srcClasspathEntry);
			}
			
			//Normal folder yaratma
			Collections.reverse(folders);
			for (String folder : folders) {
				final IFolder container = project.getFolder(folder);
				if (!container.exists()) {
					container.create(false, true, new NullProgressMonitor());
				}
			}
			
			//Java root Package olusturulur.
			createPackage(javaProject.getProject());
			
			classpathEntries
					.add(JavaCore
							.newContainerEntry(new Path(
									"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8")));
			classpathEntries.add(JavaCore.newContainerEntry(new Path(
					"org.eclipse.pde.core.requiredPlugins")));

			javaProject.setRawClasspath(classpathEntries
					.toArray(new IClasspathEntry[classpathEntries.size()]),
					new NullProgressMonitor());

			javaProject.setOutputLocation(new Path("/" + projectName + "/bin"),
					new NullProgressMonitor());
			createManifest(projectName, requiredBundles,
					new NullProgressMonitor(), project);
			createBuildProps(new NullProgressMonitor(), project, srcFolders);
		} catch (final Exception exception) {
			exception.printStackTrace();
		} finally {
		}

		return project;
	}

	private static void createManifest(final String projectName,
			final Set<String> requiredBundles,
			final IProgressMonitor progressMonitor, final IProject project)
			throws CoreException {
		final StringBuilder maniContent = new StringBuilder(
				"Manifest-Version: 1.0\n");
		maniContent.append("Bundle-ManifestVersion: 2\n");
		maniContent.append("Bundle-Name: " + projectName + "\n");
		maniContent.append("Bundle-SymbolicName: " + projectName
				+ "; singleton:=true\n");
		maniContent.append("Bundle-Version: 1.0.0\n");
		// maniContent.append("Bundle-Localization: plugin\n");
		
		maniContent.append("Require-Bundle: ");
		
		String requiredBundleString = String.join(",\n ", requiredBundles);
		maniContent.append(requiredBundleString + "\n");
		
		maniContent.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.8\r\n");

		final IFolder metaInf = project.getFolder("META-INF");
		metaInf.create(false, true, new NullProgressMonitor());
		createFile("MANIFEST.MF", metaInf, maniContent.toString(),
				progressMonitor);
	}

	public static IFile createFile(final String name,
			final IContainer container, final URL contentUrl,
			final IProgressMonitor progressMonitor) {

		final IFile file = container.getFile(new Path(name));
		InputStream inputStream = null;
		try {
			inputStream = contentUrl.openStream();
			if (file.exists()) {
				file.setContents(inputStream, true, true, progressMonitor);
			} else {
				file.create(inputStream, true, progressMonitor);
			}
			inputStream.close();
		} catch (final Exception e) {
			e.printStackTrace();
		} finally {
			if (null != inputStream) {
				try {
					inputStream.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
		progressMonitor.worked(1);

		return file;
	}

	public static IFile createFile(final String name,
			final IContainer container, final String content,
			final IProgressMonitor progressMonitor) {
		final IFile file = container.getFile(new Path(name));
		assertExist(file.getParent());
		try {
			final InputStream stream = new ByteArrayInputStream(
					content.getBytes(file.getCharset()));
			if (file.exists()) {
				file.setContents(stream, true, true, progressMonitor);
			} else {
				file.create(stream, true, progressMonitor);
			}
			stream.close();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		progressMonitor.worked(1);

		return file;
	}

	private static void assertExist(final IContainer c) {
		if (!c.exists()) {
			if (!c.getParent().exists()) {
				assertExist(c.getParent());
			}
			if (c instanceof IFolder) {
				try {
					((IFolder) c)
							.create(false, true, new NullProgressMonitor());
				} catch (final CoreException e) {
					e.printStackTrace();
				}
			}

		}

	}

	private static void createBuildProps(
			final IProgressMonitor progressMonitor, final IProject project,
			final List<String> srcFolders) {
		final StringBuilder bpContent = new StringBuilder("source.. = ");
		for (final Iterator<String> iterator = srcFolders.iterator(); iterator
				.hasNext();) {
			bpContent.append(iterator.next()).append('/');
			if (iterator.hasNext()) {
				bpContent.append(",");
			}
		}
		bpContent.append("\n");
		bpContent.append("bin.includes = META-INF/,.\n");
		createFile("build.properties", project, bpContent.toString(),
				progressMonitor);
	}

	private static IPackageFragment createPackage(IProject project) throws JavaModelException {
	    IJavaProject javaProject = JavaCore.create(project);
	    IFolder folder = project.getFolder("src");
	    // folder.create(true, true, null);
	    IPackageFragmentRoot srcFolder = javaProject
	        .getPackageFragmentRoot(folder);
	    IPackageFragment fragment = srcFolder.createPackageFragment(project.getName().toLowerCase(), true, null);
	    
	    return fragment;
	  }
}