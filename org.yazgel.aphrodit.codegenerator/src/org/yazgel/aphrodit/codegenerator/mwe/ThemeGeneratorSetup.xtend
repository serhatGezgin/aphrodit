package org.yazgel.aphrodit.codegenerator.mwe

import org.eclipse.xtext.ISetup

import com.google.inject.Guice
import com.google.inject.Injector

class ThemeGeneratorSetup implements ISetup {

	override Injector createInjectorAndDoEMFRegistration() {
		Guice.createInjector(new ThemeGeneratorModule)
	}
}
