/**
 */
package org.yazgel.aphrodit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.Menu#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.aphrodit.AphroditPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends Element {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.aphrodit.MenuElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.yazgel.aphrodit.AphroditPackage#getMenu_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuElement> getItems();

} // Menu
