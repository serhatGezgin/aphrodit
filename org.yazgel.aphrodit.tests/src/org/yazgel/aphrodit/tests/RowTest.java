/**
 */
package org.yazgel.aphrodit.tests;

import junit.textui.TestRunner;

import org.yazgel.aphrodit.AphroditFactory;
import org.yazgel.aphrodit.Row;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RowTest extends SectionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RowTest.class);
	}

	/**
	 * Constructs a new Row test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Row test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Row getFixture() {
		return (Row)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AphroditFactory.eINSTANCE.createRow());
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

} //RowTest
