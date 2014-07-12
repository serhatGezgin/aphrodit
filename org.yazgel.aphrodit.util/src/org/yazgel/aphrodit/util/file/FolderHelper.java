package org.yazgel.aphrodit.util.file;

import java.io.File;

public class FolderHelper {
	public static final FolderHelper INSTANCE = new FolderHelper();

	public File getMdd4ccaFolder() {
		String file = PathManager.create().home().folder(mdd4ccaFolderName())
				.build();

		return new File(file);
	}

	protected String mdd4ccaFolderName() {
		return ".mdd4cca";
	}
}
