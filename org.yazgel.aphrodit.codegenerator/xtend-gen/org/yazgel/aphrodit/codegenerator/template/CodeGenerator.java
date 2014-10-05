package org.yazgel.aphrodit.codegenerator.template;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.yazgel.aphrodit.Page;
import org.yazgel.aphrodit.codegenerator.template.PageGenerator;

@SuppressWarnings("all")
public class CodeGenerator implements IGenerator {
  private final PageGenerator pg = new PageGenerator();
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }
  
  protected Object _compile(final Page p, final IFileSystemAccess fsa) {
    this.pg.generateFile(p, fsa);
    return null;
  }
  
  protected Object _compile(final EObject o, final IFileSystemAccess fsa) {
    return null;
  }
  
  public Object compile(final EObject p, final IFileSystemAccess fsa) {
    if (p instanceof Page) {
      return _compile((Page)p, fsa);
    } else if (p != null) {
      return _compile(p, fsa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p, fsa).toString());
    }
  }
}
