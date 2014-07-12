/**
 */
package org.yazgel.aphrodit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.CardPage#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getCardPage()
 * @model
 * @generated
 */
public interface CardPage extends CardElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.aphrodit.CardPageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.yazgel.aphrodit.AphroditPackage#getCardPage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CardPageElement> getElements();

} // CardPage
