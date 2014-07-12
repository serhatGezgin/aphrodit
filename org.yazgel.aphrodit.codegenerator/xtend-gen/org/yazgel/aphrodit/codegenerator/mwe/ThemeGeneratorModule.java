package org.yazgel.aphrodit.codegenerator.mwe;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.yazgel.aphrodit.codegenerator.mwe.MyXmlEncodingProvider;
import org.yazgel.aphrodit.codegenerator.template.CodeGenerator;

@SuppressWarnings("all")
public class ThemeGeneratorModule extends AbstractGenericResourceRuntimeModule {
  public String getLanguageName() {
    return "org.yazgel.aphrodit.ThemeEditorID";
  }
  
  public String getFileExtensions() {
    return "aphrodit";
  }
  
  public Class<? extends IGenerator> bindIGenerator() {
    return CodeGenerator.class;
  }
  
  public Class<? extends ResourceSet> bindResourceSet() {
    return ResourceSetImpl.class;
  }
  
  public Class<? extends IEncodingProvider> bindIEncodingProvider() {
    return MyXmlEncodingProvider.class;
  }
}
