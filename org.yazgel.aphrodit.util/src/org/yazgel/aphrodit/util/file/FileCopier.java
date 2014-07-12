package org.yazgel.aphrodit.util.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class FileCopier {
	public static final FileCopier INSTANCE = new FileCopier();
	static final Logger LOG = Logger.getLogger(FileCopier.class.getName());

	public void copy(String source, String destination) {
		copy(new File(source), new File(destination));
	}

	public void copy(File source, File destination) {
		LOG.info(String.format("source: %s, destination: %s", source,
				destination.toString()));
		try {
			copy(getInputStream(source), getOutputStream(destination));
		} catch (IOException e) {
			LOG.severe("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void copy(InputStream inputStream, OutputStream outputStream) {
		try {
			IOUtils.copy(inputStream, outputStream);
		} catch (IOException e) {
			LOG.severe("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	protected OutputStream getOutputStream(File destination) throws IOException {
		return FileUtils.openOutputStream(destination);
	}

	protected InputStream getInputStream(File source) throws IOException {
		return FileUtils.openInputStream(source);
	}
}
