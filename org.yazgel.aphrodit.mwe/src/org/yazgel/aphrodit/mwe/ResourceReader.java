package org.yazgel.aphrodit.mwe;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.yazgel.aphrodit.util.uri.URIUtils;

public class ResourceReader extends WorkflowComponentWithSlot {
	private String uri;

	public void invoke(IWorkflowContext ctx) {
		
		ctx.put(getSlot(), URIUtils.getURI(uri).toFileString());
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

}
