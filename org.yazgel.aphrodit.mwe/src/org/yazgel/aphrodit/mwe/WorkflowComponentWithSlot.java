package org.yazgel.aphrodit.mwe;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;

public abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	private long start;
	private boolean shouldStop = false;
	private String slot = "model";

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getSlot() {
		return slot;
	}

	public void postInvoke() {
		if (shouldStop) {
			long elapsed = System.currentTimeMillis() - start;
			System.out.println("Time elapsed: " + elapsed + " ms");
		}
		shouldStop = true;
	}

	public void preInvoke() {
		start = System.currentTimeMillis();
	}
}
