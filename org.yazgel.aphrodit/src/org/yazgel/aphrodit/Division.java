/**
 */
package org.yazgel.aphrodit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.Division#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getDivision()
 * @model
 * @generated
 */
public interface Division extends CardPageElement, CarouselPageElement, DivisionElement, RowElement, SectionElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.aphrodit.DivisionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.yazgel.aphrodit.AphroditPackage#getDivision_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DivisionElement> getElements();

} // Division
