package org.yazgel.aphrodit.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.aphrodit.Anchor
import org.yazgel.aphrodit.Card
import org.yazgel.aphrodit.CardPage
import org.yazgel.aphrodit.Division
import org.yazgel.aphrodit.Header
import org.yazgel.aphrodit.Paragraf
import org.yazgel.aphrodit.Section
import org.yazgel.aphrodit.Row
import org.yazgel.aphrodit.Map
import org.yazgel.aphrodit.Image
import org.yazgel.aphrodit.codegenerator.ext.Extensions

class SectionGenerator extends Extensions {

	def generateFile(Section section, IFileSystemAccess fsa) {
		fsa.generateFile(section.phpfilename, sectionContent(section))
		fsa.generateFile('css/' + section.cssfilename, sectionCssContent(section))
	}

	def sectionContent(Section section) '''
		<section id="«section.name»">
			<div class="container">
				«FOR r : section.elements»
					«r.createContent»
				«ENDFOR»
			</div>
		</section>
	'''

	def sectionCssContent(Section section) '''
		@CHARSET "UTF-8";
	'''

	def dispatch String createContent(Object o) {
		throw new Exception('Section content type not known. You missed a case. content: ' + o.toString)
	}

	def dispatch String createContent(Row row) '''
		<div id="«row.name»" class="row">
			«FOR r : row.elements»
				«r.createContent»
			«ENDFOR»
		</div>
	'''

	def dispatch String createContent(Header header) '''
		<h1 id="«header.name»">«header.content»</h1> 
	'''

	def dispatch String createContent(Division div) '''
		<div id="«div.name»" class="«div.colwidth»">
			«FOR i : div.elements»
				«i.createContent»
			«ENDFOR»
		</div>
	'''

	def dispatch String createContent(Paragraf paragraph) '''
		<p id="«paragraph.name»">«paragraph.content»</p>
	'''

	def dispatch String createContent(Card card) '''
		<div class="row">
			<ul class="card-container">
			«FOR p : card.pages»
				«p.createContent»
			«ENDFOR»
			</ul>
		</div>
	'''

	def dispatch String createContent(CardPage cardPage) '''
		<li class="col-sm-«cardPage.colSpan»">
			<div class="card">
			«FOR i : cardPage.elements»
				«i.createContent»
			«ENDFOR»
			</div>
		</li>
	'''

	def dispatch String createContent(Anchor anchor) '''
		<a «anchor.hrefAttr» «anchor.classAttr»>«anchor.title»</a>
	'''

	def dispatch String createContent(Map map) '''
		<div id="map_canvas"></div>
	'''

	def dispatch String createContent(Image image) ''''''
}
