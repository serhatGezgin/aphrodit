package org.yazgel.aphrodit.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.aphrodit.Model
import org.yazgel.aphrodit.Page

class CodeGenerator {
	val pg = new PageGenerator

	def doGenerate(Model model, IFileSystemAccess fsa) {
		model.page.compile(fsa)
	}

	def compile(Page p, IFileSystemAccess fsa) {
		pg.generateFile(p, fsa)
	}
}
