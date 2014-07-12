package org.yazgel.aphrodit.util.file;

import java.io.File;
import java.util.logging.Logger;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZipUtil {
	public static ZipUtil INSTANCE = new ZipUtil();
	static final Logger LOG = Logger.getLogger(ZipUtil.class.getName());

	public void unzip(String file) {
		unzip(new File(file));
	}

	public void unzip(String file, String destinationFolder) {
		unzip(new File(file), new File(destinationFolder));
	}

	public void unzip(File file) {
		unzip(file, file.getParentFile());
	}

	public void unzip(File file, File destinationFolder) {
		try {
			ZipFile zipFile = new ZipFile(file);
			zipFile.extractAll(destinationFolder.toString());
		} catch (ZipException e) {
			LOG.severe("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
