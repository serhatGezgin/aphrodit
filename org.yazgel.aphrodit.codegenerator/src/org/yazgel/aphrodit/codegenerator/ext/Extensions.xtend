package org.yazgel.aphrodit.codegenerator.ext

import org.yazgel.aphrodit.Anchor
import org.yazgel.aphrodit.Division
import org.yazgel.aphrodit.Section

class Extensions {

	def phpfilename(Section s) {
		s.name + '.php'
	}

	def cssfilename(Section s) {
		s.name + '.css'
	}

	def colwidth(Division div) {
		'col-sm-' + div.colSpan
	}

	def classAttr(Anchor anchor) {
		if (anchor.type.value == 0) {
			return ''
		}

		String.format('class = "btn %s"', anchor.type.literal)
	}

	def hrefAttr(Anchor anchor) {
		var link = '#'
		if (!anchor.link.nullOrEmpty) {
			link = anchor.link
		}
		String.format('href="%s"', link)
	}
}
