/**
 */
package org.yazgel.aphrodit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.Image#getSrc <em>Src</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.Image#getBorderRadius <em>Border Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends SectionElement, CarouselPageElement, MenuElement, CardPageElement, RowElement, DivisionElement {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.yazgel.aphrodit.AphroditPackage#getImage_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.yazgel.aphrodit.Image#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Radius</em>' attribute.
	 * @see #setBorderRadius(String)
	 * @see org.yazgel.aphrodit.AphroditPackage#getImage_BorderRadius()
	 * @model
	 * @generated
	 */
	String getBorderRadius();

	/**
	 * Sets the value of the '{@link org.yazgel.aphrodit.Image#getBorderRadius <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Radius</em>' attribute.
	 * @see #getBorderRadius()
	 * @generated
	 */
	void setBorderRadius(String value);

} // Image
