package org.yazgel.aphrodit.mwe;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class WorkflowContentCreater {
  public static String createWorkflow(final String fileName, final String contentDirectoryUri, final String outPutFolderUri) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module ");
    _builder.append(fileName, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.yazgel.aphrodit.mwe.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Workflow {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("component = ResourceReader {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("uri = \"");
    _builder.append(contentDirectoryUri, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("component = BootstrapGenerator{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("outPutFolderUri = \"");
    _builder.append(outPutFolderUri, "\t\t");
    _builder.append("\"\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
