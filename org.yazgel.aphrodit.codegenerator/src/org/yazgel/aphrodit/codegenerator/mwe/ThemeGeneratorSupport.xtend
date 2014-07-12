package org.yazgel.aphrodit.codegenerator.mwe

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport

import com.google.inject.Module

class ThemeGeneratorSupport extends AbstractGenericResourceSupport {

	override Module createGuiceModule() {
		new ThemeGeneratorModule
	}
}
