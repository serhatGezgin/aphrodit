/**
 */
package org.yazgel.aphrodit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carousel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.Carousel#getCarouselPages <em>Carousel Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getCarousel()
 * @model
 * @generated
 */
public interface Carousel extends SectionElement, RowElement, DivisionElement {
	/**
	 * Returns the value of the '<em><b>Carousel Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.aphrodit.CarouselElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carousel Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carousel Pages</em>' containment reference list.
	 * @see org.yazgel.aphrodit.AphroditPackage#getCarousel_CarouselPages()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarouselElement> getCarouselPages();

} // Carousel
