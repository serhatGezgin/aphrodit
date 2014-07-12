package org.yazgel.aphrodit.codegenerator.mwe;

import com.google.common.base.Objects;
import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.generic.XMLEncodingProvider;

@SuppressWarnings("all")
public class MyXmlEncodingProvider extends XMLEncodingProvider {
  public java.lang.String getEncoding(final URI uri) {
    boolean _or = false;
    boolean _equals = Objects.equal(uri, null);
    if (_equals) {
      _or = true;
    } else {
      java.lang.String _fileString = uri.toFileString();
      File _file = new File(_fileString);
      boolean _exists = _file.exists();
      boolean _not = (!_exists);
      _or = _not;
    }
    if (_or) {
      return "UTF-8";
    }
    return super.getEncoding(uri);
  }
}
