package org.yazgel.aphrodit.util.program;

import java.io.File;

import org.yazgel.aphrodit.util.BundleUtil;
import org.yazgel.aphrodit.util.file.FileCopier;
import org.yazgel.aphrodit.util.file.TempFileFactory;
import org.yazgel.aphrodit.util.file.ZipUtil;

public abstract class Installer {

	public void install() {
		File resourceFile = BundleUtil.INSTANCE.getResource(classLoader(),
				resourcePath());
		File tempFile = TempFileFactory.INSTANCE
				.createFile(resourceExtension());
		FileCopier.INSTANCE.copy(resourceFile, tempFile);
		ZipUtil.INSTANCE.unzip(tempFile, installationFolder());
	}

	protected abstract ClassLoader classLoader();

	protected String resourceExtension() {
		return "zip";
	}

	/**
	 * Plugin projesi icerisindeki resource path'i. Ornegin
	 * <code>static/my_program.zip</code>.
	 *
	 * @return Resource path.
	 */
	protected abstract String resourcePath();

	protected abstract File installationFolder();
}
