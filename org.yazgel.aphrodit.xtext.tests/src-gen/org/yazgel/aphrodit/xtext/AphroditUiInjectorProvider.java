/*
* generated by Xtext
*/
package org.yazgel.aphrodit.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AphroditUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.yazgel.aphrodit.xtext.ui.internal.AphroditActivator.getInstance().getInjector("org.yazgel.aphrodit.xtext.Aphrodit");
	}
	
}