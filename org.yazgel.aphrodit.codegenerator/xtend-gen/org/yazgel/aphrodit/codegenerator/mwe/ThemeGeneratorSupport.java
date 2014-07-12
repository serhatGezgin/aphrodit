package org.yazgel.aphrodit.codegenerator.mwe;

import com.google.inject.Module;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import org.yazgel.aphrodit.codegenerator.mwe.ThemeGeneratorModule;

@SuppressWarnings("all")
public class ThemeGeneratorSupport extends AbstractGenericResourceSupport {
  public Module createGuiceModule() {
    return new ThemeGeneratorModule();
  }
}
