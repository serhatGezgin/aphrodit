package org.yazgel.aphrodit.codegenerator.template;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.yazgel.aphrodit.Menu;
import org.yazgel.aphrodit.MenuElement;
import org.yazgel.aphrodit.MenuItem;
import org.yazgel.aphrodit.Page;
import org.yazgel.aphrodit.Section;
import org.yazgel.aphrodit.codegenerator.template.BaseGenerator;
import org.yazgel.aphrodit.codegenerator.template.SectionGenerator;

@SuppressWarnings("all")
public class PageGenerator extends BaseGenerator {
  private final SectionGenerator sectionGenerator = new SectionGenerator();
  
  public void generateFile(final Page p, final IFileSystemAccess fsa) {
    CharSequence _indexContent = this.indexContent(p);
    fsa.generateFile("index.php", _indexContent);
    CharSequence _indexCssContent = this.indexCssContent();
    fsa.generateFile("css/index.css", _indexCssContent);
    CharSequence _customJSContent = this.customJSContent();
    fsa.generateFile("js/custom.js", _customJSContent);
    CharSequence _headerContent = this.headerContent(p);
    fsa.generateFile("header.php", _headerContent);
    CharSequence _headerCssContent = this.headerCssContent();
    fsa.generateFile("css/header.css", _headerCssContent);
    EList<Section> _sections = p.getSections();
    final Consumer<Section> _function = new Consumer<Section>() {
      public void accept(final Section s) {
        PageGenerator.this.sectionGenerator.generateFile(s, fsa);
      }
    };
    _sections.forEach(_function);
  }
  
  public CharSequence customJSContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$(document).ready(function () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/* Scroll */");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\'.nav li\').localScroll({");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("duration: 1000");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence headerContent(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"navbar navbar-fixed-top\" role=\"navigation\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"navbar-header\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("data-target=\".navbar-collapse\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<span class=\"sr-only\">Toggle navigation</span> <span");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<a class=\"logo\" href=\"#\" title=\"");
    String _title = page.getTitle();
    _builder.append(_title, "\t\t\t");
    _builder.append("\"><img src=\"images/logo.png\" /></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"collapse navbar-collapse pull-right\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<ul class=\"nav navbar-nav\">");
    _builder.newLine();
    {
      Menu _menu = page.getMenu();
      EList<MenuElement> _ıtems = _menu.getItems();
      for(final MenuElement i : _ıtems) {
        _builder.append("\t\t\t\t");
        final MenuItem menuItem = ((MenuItem) i);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("<li><a href=\"#");
        Section _section = menuItem.getSection();
        String _name = _section.getName();
        _builder.append(_name, "\t\t\t\t");
        _builder.append("\">");
        String _title_1 = menuItem.getTitle();
        _builder.append(_title_1, "\t\t\t\t");
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!--/.nav-collapse -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence headerCssContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@CHARSET \"UTF-8\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #ffffff;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-color: #d3d3d3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-webkit-box-shadow: 0 2px 0 #d3d3d3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-moz-box-shadow: 0 2px 0 #d3d3d3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("box-shadow: 0 2px 0 #d3d3d3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("height: 70px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar .nav>li>a {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #ffffff;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color: #777777;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin: 10px 0px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-radius: 5px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-weight: bold;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text-transform: uppercase;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar .nav>li>a:hover {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #66cccc;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color: #ffffff;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar .logo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("position: relative;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("top: 20px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-left: 20px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar-toggle {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #66cccc;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".navbar-toggle .icon-bar {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #ffffff;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence indexContent(final Page p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"\">");
    _builder.newLine();
    _builder.append("<title>");
    String _title = p.getTitle();
    _builder.append(_title, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap-theme.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"css/index.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"css/header.css\">");
    _builder.newLine();
    {
      EList<Section> _sections = p.getSections();
      for(final Section s : _sections) {
        final Section section = ((Section) s);
        _builder.newLineIfNotEmpty();
        _builder.append("<link rel=\"stylesheet\" href=\"css/");
        String _cssfilename = this.ex.cssfilename(section);
        _builder.append(_cssfilename, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<?php include \'header.php\';?>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"root\">");
    _builder.newLine();
    {
      EList<Section> _sections_1 = p.getSections();
      for(final Section s_1 : _sections_1) {
        _builder.append("\t\t\t");
        final Section section_1 = ((Section) s_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<?php include \'");
        String _phpfilename = this.ex.phpfilename(section_1);
        _builder.append(_phpfilename, "\t\t\t");
        _builder.append("\';?>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/jquery/jquery.min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/bootstrap/bootstrap.min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/jquery/jquery.scrollTo-1.4.3.1-min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/jquery/jquery.localScroll-1.3.5.min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/custom.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence indexCssContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@CHARSET \"UTF-8\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("body {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin: 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-family: \'Open Sans\', Helvetica, Arial, sans-serif;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: 15px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("line-height: 24px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color: #393e46;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background-color: #ffffff;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append(".root {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding: 60px 15px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("section{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding-top: 60px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".card-container {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("list-style-type: none;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".card {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-webkit-box-sizing: border-box;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-moz-box-sizing: border-box;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("box-sizing: border-box;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("background: #66cccc;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-webkit-border-radius: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-moz-border-radius: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-ms-border-radius: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-o-border-radius: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-radius: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding: 10px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}