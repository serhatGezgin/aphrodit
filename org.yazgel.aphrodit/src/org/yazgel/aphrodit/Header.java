/**
 */
package org.yazgel.aphrodit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.Header#getType <em>Type</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.Header#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends SectionElement, CarouselPageElement, MenuElement, CardPageElement, RowElement, DivisionElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.aphrodit.HeaderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.aphrodit.HeaderType
	 * @see #setType(HeaderType)
	 * @see org.yazgel.aphrodit.AphroditPackage#getHeader_Type()
	 * @model
	 * @generated
	 */
	HeaderType getType();

	/**
	 * Sets the value of the '{@link org.yazgel.aphrodit.Header#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.aphrodit.HeaderType
	 * @see #getType()
	 * @generated
	 */
	void setType(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.yazgel.aphrodit.AphroditPackage#getHeader_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.yazgel.aphrodit.Header#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Header
