package org.yazgel.aphrodit.util.file;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

public class TempFileFactory {
	public static final TempFileFactory INSTANCE = new TempFileFactory();

	public URI createURI() {
		return URI.createFileURI(createTempFile(filePrefix(), fileExtension()));
	}

	public URI createURI(String extension) {
		return URI.createFileURI(createTempFile(filePrefix(), extension));
	}

	public File createFile() {
		return new File(createTempFile(filePrefix(), fileExtension()));
	}

	public File createFile(String extension) {
		return new File(createTempFile(filePrefix(), extension));
	}

	protected String filePrefix() {
		return "gecici_";
	}

	protected String fileExtension() {
		return ".dosya";
	}

	private String createTempFile(String filePrefix, String fileSuffix) {
		try {
			return File.createTempFile(filePrefix, adjustExtension(fileSuffix))
					.getAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String adjustExtension(String extension) {
		if (extension.startsWith(".")) {
			return extension;
		}

		return "." + extension;
	}
}
