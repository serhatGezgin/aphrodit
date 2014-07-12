/**
 */
package org.yazgel.aphrodit.tests;

import junit.textui.TestRunner;

import org.yazgel.aphrodit.AphroditFactory;
import org.yazgel.aphrodit.CardPage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Card Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardPageTest extends CardElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CardPageTest.class);
	}

	/**
	 * Constructs a new Card Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Card Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CardPage getFixture() {
		return (CardPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AphroditFactory.eINSTANCE.createCardPage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CardPageTest
