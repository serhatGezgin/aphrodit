package org.yazgel.aphrodit.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.yazgel.aphrodit.util.file.FileCopier;
import org.yazgel.aphrodit.util.file.TempFileFactory;

public class BundleUtil {
	static final Logger LOG = Logger.getLogger(BundleUtil.class.getName());
	public static final BundleUtil INSTANCE = new BundleUtil();

	public File getResource(String bundleName, String resourceLocation) {
		Bundle bundle = Platform.getBundle(bundleName);
		URL entryURL = bundle.getEntry(resourceLocation);

		try {
			URL resolvedURL = FileLocator.resolve(entryURL);
			String fileString = escapeProtocol(resolvedURL.toString());
			File file = new File(fileString);

			return file;
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return null;
	}

	public File getResource(ClassLoader c, String resourceLocation) {
		URL resourceURL = c.getResource(resourceLocation);

		try {
			/* Gecici bir dosya olustur. */
			File tempFile = TempFileFactory.INSTANCE
					.createFile(getExtension(resourceLocation));
			LOG.info("ResourceLocation on jar: " + resourceLocation);
			LOG.info("ResourceLocation on disk: " + tempFile.toString());

			FileCopier.INSTANCE.copy(resourceURL.openStream(),
					new FileOutputStream(tempFile));

			return tempFile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	protected String getExtension(String resourcePath) {
		int lastIndexOf = resourcePath.lastIndexOf(".");

		if (lastIndexOf < 0) {
			lastIndexOf = 0;
		}

		return resourcePath.substring(lastIndexOf);
	}

	protected String escapeProtocol(String uri) {
		final String protocolSign = ":/";
		int protocolIndex = uri.indexOf(protocolSign);

		if (protocolIndex < 0) {
			return uri;
		}

		protocolIndex += protocolSign.length();

		return uri.substring(protocolIndex);
	}
}
