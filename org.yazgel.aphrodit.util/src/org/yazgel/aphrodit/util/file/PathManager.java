package org.yazgel.aphrodit.util.file;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

public class PathManager {
	static final Logger LOG = Logger.getLogger(PathManager.class.getName());
	private static final String USER_HOME = System.getProperty("user.home");
	private static final String SEPARATOR = System
			.getProperty("file.separator");
	private String path = "";

	private PathManager(String path) {
		this.path = path;
	}

	public static PathManager create() {
		return new PathManager("");
	}

	public String getPath() {
		return path;
	}

	public PathManager reset() {
		this.path = "";
		return this;
	}

	public PathManager home() {
		append(USER_HOME);
		appendSeperator();

		return this;
	}

	public PathManager current() {
		File current = new File("").getAbsoluteFile();

		append(current.toString());

		if (current.isDirectory()) {
			appendSeperator();
		} else {
			LOG.error("Gecerli dosya, bir klasor degil.");
		}

		return this;
	}

	public PathManager folder(String folder) {
		append(folder);
		appendSeperator();

		return this;
	}

	public PathManager file(String file) {
		append(file);

		return this;
	}

	/**
	 * Dosyalari ve klasorleri olusturur.
	 *
	 * @return
	 */
	public String build() {
		File file = new File(getPath());

		/* dosya yoksa */
		if (!file.exists()) {

			/* path bir klasor ise */
			if (isFolder(getPath())) {
				file.mkdirs();
			}
			/* path bir dosya ise */
			else {
				/* parent klasorleri olustur. */
				file.getParentFile().mkdirs();

				try {
					/* dosyayi yarat. */
					file.createNewFile();
				} catch (IOException e) {
					LOG.error("Hata", e);
				}
			}
		}

		LOG.info("Builded Path : " + getPath());
		return getPath();
	}

	private boolean isFolder(String path) {
		if (path.endsWith(SEPARATOR)) {
			return true;
		}

		return false;
	}

	private void append(String str) {
		path += str;
	}

	private void appendSeperator() {
		if (!path.endsWith(SEPARATOR)) {
			path += SEPARATOR;
		}
	}
}
