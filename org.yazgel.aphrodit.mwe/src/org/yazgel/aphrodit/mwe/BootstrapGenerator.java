package org.yazgel.aphrodit.mwe;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.yazgel.aphrodit.codegenerator.mwe.ThemeGenerator;

public class BootstrapGenerator extends WorkflowComponentWithSlot {

	private String outPutFolderUri;

	@Override
	public void invoke(IWorkflowContext ctx) {
		String parentFolderPath = (String) ctx.get(getSlot());

		if (parentFolderPath != null && !parentFolderPath.isEmpty()
				&& !getOutPutFolderUri().isEmpty()) {
			new ThemeGenerator().generate(parentFolderPath,
					getOutPutFolderUri());
		}
	}

	public String getOutPutFolderUri() {
		return outPutFolderUri;
	}

	public void setOutPutFolderUri(String outPutFolderUri) {
		this.outPutFolderUri = outPutFolderUri;
	}

}
