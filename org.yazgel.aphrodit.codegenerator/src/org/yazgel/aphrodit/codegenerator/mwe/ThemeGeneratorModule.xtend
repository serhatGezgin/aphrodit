package org.yazgel.aphrodit.codegenerator.mwe;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.eclipse.xtext.resource.generic.XMLEncodingProvider;
import org.yazgel.aphrodit.codegenerator.template.CodeGenerator

public class ThemeGeneratorModule extends AbstractGenericResourceRuntimeModule {

	override String getLanguageName() {
		return "org.yazgel.aphrodit.ThemeEditorID";
	}

	override String getFileExtensions() {
		return "aphrodit";
	}

	def Class<? extends IGenerator> bindIGenerator() {
		CodeGenerator
	}

	def Class<? extends ResourceSet> bindResourceSet() {
		ResourceSetImpl
	}

	override Class<? extends IEncodingProvider> bindIEncodingProvider() {
		MyXmlEncodingProvider
	}
}

class MyXmlEncodingProvider extends XMLEncodingProvider {

	override String getEncoding(URI uri) {
		if (uri == null || !new File(uri.toFileString()).exists()) {
			return "UTF-8"
		}

		return super.getEncoding(uri)
	}
}
