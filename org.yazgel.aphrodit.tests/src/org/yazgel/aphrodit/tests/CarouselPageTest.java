/**
 */
package org.yazgel.aphrodit.tests;

import junit.textui.TestRunner;

import org.yazgel.aphrodit.AphroditFactory;
import org.yazgel.aphrodit.CarouselPage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carousel Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarouselPageTest extends CarouselElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarouselPageTest.class);
	}

	/**
	 * Constructs a new Carousel Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Carousel Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CarouselPage getFixture() {
		return (CarouselPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AphroditFactory.eINSTANCE.createCarouselPage());
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

} //CarouselPageTest
