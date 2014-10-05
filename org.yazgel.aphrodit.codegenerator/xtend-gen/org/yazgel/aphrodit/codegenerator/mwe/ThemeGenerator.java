package org.yazgel.aphrodit.codegenerator.mwe;

import java.io.File;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.yazgel.aphrodit.util.program.Installer;
import org.yazgel.aphrodit.util.xtend.AbstractGenerator;

@SuppressWarnings("all")
public class ThemeGenerator extends AbstractGenerator {
  public URI workflowURI() {
    Class<? extends ThemeGenerator> _class = this.getClass();
    ClassLoader _classLoader = _class.getClassLoader();
    URL resource = _classLoader.getResource("org/yazgel/aphrodit/codegenerator/mwe/workflow.mwe2");
    String _externalForm = resource.toExternalForm();
    return URI.createURI(_externalForm);
  }
  
  public void generate(final String modelPath, final String targetDir) {
    super.generate(modelPath, targetDir);
    this.installStaticFiles(targetDir);
  }
  
  public void installStaticFiles(final String targetDir) {
    new Installer() {
      protected ClassLoader classLoader() {
        Class<? extends Installer> _class = this.getClass();
        return _class.getClassLoader();
      }
      
      protected File installationFolder() {
        String _normalizePath = ThemeGenerator.this.normalizePath(targetDir);
        String _plus = (_normalizePath + File.separator);
        String _plus_1 = (_plus + "css/bootstrap");
        File file = new File(_plus_1);
        return file;
      }
      
      protected String resourcePath() {
        return "bootstrap.zip";
      }
    }.install();
    new Installer() {
      protected ClassLoader classLoader() {
        Class<? extends Installer> _class = this.getClass();
        return _class.getClassLoader();
      }
      
      protected File installationFolder() {
        String _normalizePath = ThemeGenerator.this.normalizePath(targetDir);
        String _plus = (_normalizePath + File.separator);
        String _plus_1 = (_plus + "fonts");
        File file = new File(_plus_1);
        return file;
      }
      
      protected String resourcePath() {
        return "fonts.zip";
      }
    }.install();
    new Installer() {
      protected ClassLoader classLoader() {
        Class<? extends Installer> _class = this.getClass();
        return _class.getClassLoader();
      }
      
      protected File installationFolder() {
        String _normalizePath = ThemeGenerator.this.normalizePath(targetDir);
        String _plus = (_normalizePath + File.separator);
        String _plus_1 = (_plus + "images");
        File file = new File(_plus_1);
        return file;
      }
      
      protected String resourcePath() {
        return "images.zip";
      }
    }.install();
    new Installer() {
      protected ClassLoader classLoader() {
        Class<? extends Installer> _class = this.getClass();
        return _class.getClassLoader();
      }
      
      protected File installationFolder() {
        String _normalizePath = ThemeGenerator.this.normalizePath(targetDir);
        String _plus = (_normalizePath + File.separator);
        String _plus_1 = (_plus + "js");
        File file = new File(_plus_1);
        return file;
      }
      
      protected String resourcePath() {
        return "js.zip";
      }
    }.install();
  }
}
