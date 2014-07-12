package org.yazgel.aphrodit.project.wizard;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.yazgel.aphrodit.project.test.ExtendedProjectSupport;

public class BootstrapProject extends Wizard implements INewWizard,
		IExecutableExtension {
	private static final String WIZARD_NAME = "Bootstrap Project Creation Wizard"; //$NON-NLS-1$
	private static final String PAGE_NAME = "Bootstrap Plug-in Project Wizard";
	private static final String PAGE_TITLE = "From Scratch Project";
	private static final String PAGE_DESCRIPTION = "Create something from scratch.";

	private WizardNewProjectCreationPage _pageOne;
	private IConfigurationElement _configurationElement;

	public BootstrapProject() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if (!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
			System.err.println("location: " + location.toString()); //$NON-NLS-1$
		} // else location == null

		ExtendedProjectSupport.createProject(name, location);
		// Add this
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		_pageOne.setTitle(PAGE_TITLE);
		_pageOne.setDescription(PAGE_DESCRIPTION);

		addPage(_pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}

}
