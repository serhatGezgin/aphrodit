/**
 */
package org.yazgel.aphrodit.tests;

import junit.textui.TestRunner;

import org.yazgel.aphrodit.AphroditFactory;
import org.yazgel.aphrodit.Carousel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carousel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarouselTest extends SectionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarouselTest.class);
	}

	/**
	 * Constructs a new Carousel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Carousel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Carousel getFixture() {
		return (Carousel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AphroditFactory.eINSTANCE.createCarousel());
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

} //CarouselTest
