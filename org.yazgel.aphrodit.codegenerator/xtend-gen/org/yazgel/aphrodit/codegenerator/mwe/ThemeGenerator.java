package org.yazgel.aphrodit.codegenerator.mwe;

import java.io.File;
import java.net.URL;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.yazgel.aphrodit.AphroditPackage;
import org.yazgel.aphrodit.Model;
import org.yazgel.aphrodit.codegenerator.template.CodeGenerator;
import org.yazgel.aphrodit.util.program.Installer;
import org.yazgel.aphrodit.util.xtend.AbstractGenerator;
import org.yazgel.util.ecore.ModelIO;
import org.yazgel.util.xtend.SimpleFileSystemAccess;

/**
 * FIXME: extends AbstractGenerator kaldir.
 */
@SuppressWarnings("all")
public class ThemeGenerator extends AbstractGenerator {
  public URI workflowURI() {
    Class<? extends ThemeGenerator> _class = this.getClass();
    ClassLoader _classLoader = _class.getClassLoader();
    URL resource = _classLoader.getResource("org/yazgel/aphrodit/codegenerator/mwe/workflow.mwe2");
    String _externalForm = resource.toExternalForm();
    return URI.createURI(_externalForm);
  }
  
  public void generate(final String modelFilePath, final String targetDir) {
    URI _createFileURI = URI.createFileURI(modelFilePath);
    List<Model> _read = new ModelIO<Model>() {
      protected void registerPackages(final EPackage.Registry packageRegistry) {
        packageRegistry.put(AphroditPackage.eNS_URI, AphroditPackage.eINSTANCE);
      }
    }.read(_createFileURI);
    Model model = _read.get(0);
    CodeGenerator generator = new CodeGenerator();
    String _normalizePath = this.normalizePath(targetDir);
    SimpleFileSystemAccess _simpleFileSystemAccess = new SimpleFileSystemAccess(_normalizePath);
    generator.doGenerate(model, _simpleFileSystemAccess);
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
