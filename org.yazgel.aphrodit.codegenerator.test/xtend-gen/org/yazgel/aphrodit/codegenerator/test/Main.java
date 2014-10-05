package org.yazgel.aphrodit.codegenerator.test;

import org.yazgel.aphrodit.codegenerator.mwe.ThemeGenerator;

@SuppressWarnings("all")
public class Main {
  private final static String MODEL_FOLDER = "C:/Users/akgun/git/aphrodit/unit-site-models";
  
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _equals = (_length == 2);
    if (_equals) {
      ThemeGenerator _themeGenerator = new ThemeGenerator();
      String _get = args[0];
      _themeGenerator.generate(_get, "src-gen");
    } else {
      ThemeGenerator _themeGenerator_1 = new ThemeGenerator();
      _themeGenerator_1.generate(Main.MODEL_FOLDER, "src-gen");
    }
  }
}
