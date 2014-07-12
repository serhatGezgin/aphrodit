package org.yazgel.aphrodit.mwe;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class StopWatch implements IWorkflowComponent {
	private long start;
	private boolean shouldStop = false;

	public void invoke(IWorkflowContext ctx) {
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
