/*
* generated by Xtext
*/
package org.yazgel.aphrodit.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AphroditStandaloneSetup extends AphroditStandaloneSetupGenerated{

	public static void doSetup() {
		new AphroditStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

