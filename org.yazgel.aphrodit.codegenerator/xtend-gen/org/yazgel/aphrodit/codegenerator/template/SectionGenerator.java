package org.yazgel.aphrodit.codegenerator.template;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.yazgel.aphrodit.Anchor;
import org.yazgel.aphrodit.Card;
import org.yazgel.aphrodit.CardElement;
import org.yazgel.aphrodit.CardPage;
import org.yazgel.aphrodit.CardPageElement;
import org.yazgel.aphrodit.Division;
import org.yazgel.aphrodit.DivisionElement;
import org.yazgel.aphrodit.Header;
import org.yazgel.aphrodit.Image;
import org.yazgel.aphrodit.Map;
import org.yazgel.aphrodit.Paragraf;
import org.yazgel.aphrodit.Row;
import org.yazgel.aphrodit.RowElement;
import org.yazgel.aphrodit.Section;
import org.yazgel.aphrodit.SectionElement;
import org.yazgel.aphrodit.codegenerator.ext.Extensions;

@SuppressWarnings("all")
public class SectionGenerator extends Extensions {
  public void generateFile(final Section section, final IFileSystemAccess fsa) {
    String _phpfilename = this.phpfilename(section);
    CharSequence _sectionContent = this.sectionContent(section);
    fsa.generateFile(_phpfilename, _sectionContent);
    String _cssfilename = this.cssfilename(section);
    String _plus = ("css/" + _cssfilename);
    CharSequence _sectionCssContent = this.sectionCssContent(section);
    fsa.generateFile(_plus, _sectionCssContent);
  }
  
  public CharSequence sectionContent(final Section section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<section id=\"");
    String _name = section.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    {
      EList<SectionElement> _elements = section.getElements();
      for(final SectionElement r : _elements) {
        _builder.append("\t\t");
        String _createContent = this.createContent(r);
        _builder.append(_createContent, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</section>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence sectionCssContent(final Section section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@CHARSET \"UTF-8\";");
    _builder.newLine();
    return _builder;
  }
  
  protected String _createContent(final Object o) {
    try {
      String _string = o.toString();
      String _plus = ("Section content type not known. You missed a case. content: " + _string);
      throw new Exception(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _createContent(final Row row) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div id=\"");
    String _name = row.getName();
    _builder.append(_name, "");
    _builder.append("\" class=\"row\">");
    _builder.newLineIfNotEmpty();
    {
      EList<RowElement> _elements = row.getElements();
      for(final RowElement r : _elements) {
        _builder.append("\t");
        String _createContent = this.createContent(r);
        _builder.append(_createContent, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _createContent(final Header header) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h1 id=\"");
    String _name = header.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    String _content = header.getContent();
    _builder.append(_content, "");
    _builder.append("</h1> ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _createContent(final Division div) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div id=\"");
    String _name = div.getName();
    _builder.append(_name, "");
    _builder.append("\" class=\"");
    String _colwidth = this.colwidth(div);
    _builder.append(_colwidth, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<DivisionElement> _elements = div.getElements();
      for(final DivisionElement i : _elements) {
        _builder.append("\t");
        String _createContent = this.createContent(i);
        _builder.append(_createContent, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _createContent(final Paragraf paragraph) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p id=\"");
    String _name = paragraph.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    String _content = paragraph.getContent();
    _builder.append(_content, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _createContent(final Card card) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul class=\"card-container\">");
    _builder.newLine();
    {
      EList<CardElement> _pages = card.getPages();
      for(final CardElement p : _pages) {
        _builder.append("\t");
        String _createContent = this.createContent(p);
        _builder.append(_createContent, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _createContent(final CardPage cardPage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li class=\"col-sm-");
    int _colSpan = cardPage.getColSpan();
    _builder.append(_colSpan, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    {
      EList<CardPageElement> _elements = cardPage.getElements();
      for(final CardPageElement i : _elements) {
        _builder.append("\t");
        String _createContent = this.createContent(i);
        _builder.append(_createContent, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _createContent(final Anchor anchor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a ");
    String _hrefAttr = this.hrefAttr(anchor);
    _builder.append(_hrefAttr, "");
    _builder.append(" ");
    String _classAttr = this.classAttr(anchor);
    _builder.append(_classAttr, "");
    _builder.append(">");
    String _title = anchor.getTitle();
    _builder.append(_title, "");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _createContent(final Map map) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div id=\"map_canvas\"></div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _createContent(final Image image) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String createContent(final Object anchor) {
    if (anchor instanceof Anchor) {
      return _createContent((Anchor)anchor);
    } else if (anchor instanceof Card) {
      return _createContent((Card)anchor);
    } else if (anchor instanceof CardPage) {
      return _createContent((CardPage)anchor);
    } else if (anchor instanceof Division) {
      return _createContent((Division)anchor);
    } else if (anchor instanceof Header) {
      return _createContent((Header)anchor);
    } else if (anchor instanceof Image) {
      return _createContent((Image)anchor);
    } else if (anchor instanceof Map) {
      return _createContent((Map)anchor);
    } else if (anchor instanceof Paragraf) {
      return _createContent((Paragraf)anchor);
    } else if (anchor instanceof Row) {
      return _createContent((Row)anchor);
    } else if (anchor != null) {
      return _createContent(anchor);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(anchor).toString());
    }
  }
}
