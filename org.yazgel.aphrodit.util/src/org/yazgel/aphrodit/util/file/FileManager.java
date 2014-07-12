package org.yazgel.aphrodit.util.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileManager {
	public static String ENCODING = "UTF-8";
	private static FileManager instance = new FileManager();

	private FileManager() {
	}

	public static FileManager get() {
		return instance;
	}

	public void write(File file, String data) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream(file), ENCODING);
			out.write(data);
			out.flush();
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String read(File file) {
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					new FileInputStream(file), ENCODING));
			String line;

			while ((line = in.readLine()) != null) {
				sb.append(line);
			}

			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

	public InputStream readAsStream(File file) {
		try {
			return new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void append(File file, String data) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(
					new FileOutputStream(file, true), ENCODING);
			out.write(data);
			out.flush();
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
