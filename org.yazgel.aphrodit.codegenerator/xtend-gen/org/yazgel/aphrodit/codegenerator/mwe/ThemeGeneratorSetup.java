package org.yazgel.aphrodit.codegenerator.mwe;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.yazgel.aphrodit.codegenerator.mwe.ThemeGeneratorModule;

@SuppressWarnings("all")
public class ThemeGeneratorSetup implements ISetup {
  public Injector createInjectorAndDoEMFRegistration() {
    ThemeGeneratorModule _themeGeneratorModule = new ThemeGeneratorModule();
    return Guice.createInjector(_themeGeneratorModule);
  }
}
