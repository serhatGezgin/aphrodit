package org.yazgel.aphrodit.codegenerator.template;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.yazgel.aphrodit.Model;
import org.yazgel.aphrodit.Page;
import org.yazgel.aphrodit.codegenerator.template.PageGenerator;

@SuppressWarnings("all")
public class CodeGenerator {
  private final PageGenerator pg = new PageGenerator();
  
  public void doGenerate(final Model model, final IFileSystemAccess fsa) {
    Page _page = model.getPage();
    this.compile(_page, fsa);
  }
  
  public void compile(final Page p, final IFileSystemAccess fsa) {
    this.pg.generateFile(p, fsa);
  }
}
