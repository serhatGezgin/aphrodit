package org.yazgel.aphrodit.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.yazgel.aphrodit.codegenerator.mwe.ThemeGenerator;
import org.yazgel.util.ui.AbstractJob;

public class GeneratorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		new AbstractJob(PlatformUI.getWorkbench().getActiveWorkbenchWindow()) {

			@Override
			protected IStatus runInsideJob(IProgressMonitor monitor) {
				final IFile iFile = getIFileSelection().get(0);
				final String modelPath = iFile.getParent().getLocation()
						.toString();
				final String targetDir = iFile.getParent().getLocation()
						.toString();

				final ThemeGenerator themeGenerator = new ThemeGenerator();
				themeGenerator.generate(modelPath, targetDir);

				return Status.OK_STATUS;
			}

			@Override
			protected String jobName() {
				return "Generating Code";
			}
		}.execute();

		return null;
	}
}
