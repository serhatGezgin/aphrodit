/**
 */
package org.yazgel.aphrodit.tests;

import junit.textui.TestRunner;

import org.yazgel.aphrodit.AphroditFactory;
import org.yazgel.aphrodit.Card;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardTest extends SectionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CardTest.class);
	}

	/**
	 * Constructs a new Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Card getFixture() {
		return (Card)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AphroditFactory.eINSTANCE.createCard());
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

} //CardTest
