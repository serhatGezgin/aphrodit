package org.yazgel.aphrodit.util.file;

import java.io.File;

public class FileWalker {

	public void walk(String path) {
		walk(new File(path));
	}

	public void walk(File file) {
		if (file == null || !file.exists()) {
			throw new RuntimeException("File yok.");
		}

		if (file.isDirectory()) {
			iterateFolder(file);
		} else {
			iterateFile(file);
		}
	}

	public void iterateFolder(File file) {
		greetFolder(file);

		final File[] files = file.listFiles();

		for (File f : files) {
			if (f.isDirectory()) {
				iterateFolder(f);
			} else if (f.isFile()) {
				iterateFile(f);
			} else {
				throw new RuntimeException("Ne dosya, ne de klasor.");
			}
		}
	}

	public void iterateFile(File file) {
		greetFile(file);
	}

	protected void greetFile(File file) {
		/* Alt siniflar tarafindan kullanilacak. */
	}

	protected void greetFolder(File file) {
		/* Alt siniflar tarafindan kullanilacak. */
	}
}
