package org.yazgel.aphrodit.codegenerator.template

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.yazgel.aphrodit.Page

class CodeGenerator implements IGenerator {
	val pg = new org.yazgel.aphrodit.codegenerator.template.PageGenerator

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
			o.compile(fsa)
		}
	}

	def dispatch compile(Page p, IFileSystemAccess fsa) {
		pg.generateFile(p, fsa)
	}

	def dispatch compile(EObject o, IFileSystemAccess fsa) {
	}
}
