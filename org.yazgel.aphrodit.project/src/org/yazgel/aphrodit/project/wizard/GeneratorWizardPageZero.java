package org.yazgel.aphrodit.project.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class GeneratorWizardPageZero extends WizardNewFileCreationPage{
	private static final String MWE2 = "mwe2";
	
	public GeneratorWizardPageZero(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
		
		setFileExtension(MWE2);
	}
	
	@Override
	public String getFileExtension() {
		return super.getFileExtension();
	}

}
