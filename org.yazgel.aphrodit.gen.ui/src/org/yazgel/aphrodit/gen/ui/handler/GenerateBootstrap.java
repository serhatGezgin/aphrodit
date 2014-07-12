package org.yazgel.aphrodit.gen.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;
import org.yazgel.aphrodit.codegenerator.mwe.ThemeGenerator;
import org.yazgel.aphrodit.util.plug_in.AbstractJob;

public class GenerateBootstrap extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		new AbstractJob(PlatformUI.getWorkbench().getActiveWorkbenchWindow()) {

			@Override
			protected void runInsideJob() {
				new ThemeGenerator().generate(getIFileSelection().get(0)
						.getParent().getLocation().toOSString(), "src-gen");
			}

			@Override
			protected String jobName() {
				return "Generate Bootstrap";
			}
		}.execute();

		return null;
	}

}
