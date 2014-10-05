package org.yazgel.aphrodit.codegenerator.ext;

import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.yazgel.aphrodit.Anchor;
import org.yazgel.aphrodit.AnchorType;
import org.yazgel.aphrodit.Division;
import org.yazgel.aphrodit.Section;

@SuppressWarnings("all")
public class Extensions {
  public String phpfilename(final Section s) {
    String _name = s.getName();
    return (_name + ".php");
  }
  
  public String cssfilename(final Section s) {
    String _name = s.getName();
    return (_name + ".css");
  }
  
  public String colwidth(final Division div) {
    int _colSpan = div.getColSpan();
    return ("col-sm-" + Integer.valueOf(_colSpan));
  }
  
  public String classAttr(final Anchor anchor) {
    String _xblockexpression = null;
    {
      AnchorType _type = anchor.getType();
      int _value = _type.getValue();
      boolean _equals = (_value == 0);
      if (_equals) {
        return "";
      }
      AnchorType _type_1 = anchor.getType();
      String _literal = _type_1.getLiteral();
      _xblockexpression = String.format("class = \"btn %s\"", _literal);
    }
    return _xblockexpression;
  }
  
  public String hrefAttr(final Anchor anchor) {
    String _xblockexpression = null;
    {
      String link = "#";
      String _link = anchor.getLink();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_link);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _link_1 = anchor.getLink();
        link = _link_1;
      }
      _xblockexpression = String.format("href=\"%s\"", link);
    }
    return _xblockexpression;
  }
}
