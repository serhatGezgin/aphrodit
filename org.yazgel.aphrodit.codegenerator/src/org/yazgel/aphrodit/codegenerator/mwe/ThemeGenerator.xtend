package org.yazgel.aphrodit.codegenerator.mwe;

import java.io.File
import org.eclipse.emf.common.util.URI
import org.yazgel.aphrodit.util.program.Installer
import org.yazgel.aphrodit.util.xtend.AbstractGenerator

public class ThemeGenerator extends AbstractGenerator {

	override URI workflowURI() {
		var resource = getClass().getClassLoader().getResource("org/yazgel/aphrodit/codegenerator/mwe/workflow.mwe2")

		return URI.createURI(resource.toExternalForm)
	}

	override generate(String modelPath, String targetDir) {
		super.generate(modelPath, targetDir)

		installStaticFiles(targetDir)
	}

	def installStaticFiles(String targetDir) {
		new Installer() {

			override protected classLoader() {
				class.classLoader
			}

			override protected installationFolder() {
				var file = new File(normalizePath(targetDir) + File.separator + 'css/bootstrap')

				return file;
			}

			override protected resourcePath() {
				'bootstrap.zip'
			}
		}.install

		new Installer() {

			override protected classLoader() {
				class.classLoader
			}

			override protected installationFolder() {
				var file = new File(normalizePath(targetDir) + File.separator + 'fonts')

				return file;
			}

			override protected resourcePath() {
				'fonts.zip'
			}
		}.install

		new Installer() {

			override protected classLoader() {
				class.classLoader
			}

			override protected installationFolder() {
				var file = new File(normalizePath(targetDir) + File.separator + 'images')

				return file;
			}

			override protected resourcePath() {
				'images.zip'
			}
		}.install

		new Installer() {

			override protected classLoader() {
				class.classLoader
			}

			override protected installationFolder() {
				var file = new File(normalizePath(targetDir) + File.separator + 'js')

				return file;
			}

			override protected resourcePath() {
				'js.zip'
			}
		}.install
	}
}
