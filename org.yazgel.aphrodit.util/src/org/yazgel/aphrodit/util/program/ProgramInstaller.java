package org.yazgel.aphrodit.util.program;

import java.io.File;

import org.yazgel.aphrodit.util.file.FolderHelper;

public abstract class ProgramInstaller extends Installer {

	/**
	 * Program yuklu degilse, yukler.
	 */
	public void tryInstall() {
		if (!shouldInstall()) {
			return;
		}

		install();
	}

	public boolean shouldInstall() {
		return !new File(exePath()).exists();
	}

	public abstract String exePath();

	@Override
	protected File installationFolder() {
		return FolderHelper.INSTANCE.getMdd4ccaFolder();
	}
}
