package org.yazgel.aphrodit.codegenerator.test;

import org.yazgel.aphrodit.codegenerator.mwe.ThemeGenerator

class Main {
	static val String MODEL_FOLDER = "C:/Users/akgun/git/bootstrap-mde/unit-site-models"

	def static void main(String[] args) {
		if (args.length == 2) {
			new ThemeGenerator().generate(args.get(0), "src-gen")
		} else {
			new ThemeGenerator().generate(MODEL_FOLDER, "src-gen")
		}
	}
}
