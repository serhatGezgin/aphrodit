/**
 */
package org.yazgel.aphrodit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.yazgel.aphrodit.AphroditPackage;
import org.yazgel.aphrodit.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.impl.ElementImpl#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.impl.ElementImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.impl.ElementImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.yazgel.aphrodit.impl.ElementImpl#getBackgroundImage <em>Background Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_SPAN_EDEFAULT = 12;

	/**
	 * The cached value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected int colSpan = COL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundImage() <em>Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundImage() <em>Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected String backgroundImage = BACKGROUND_IMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AphroditPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AphroditPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColSpan() {
		return colSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColSpan(int newColSpan) {
		int oldColSpan = colSpan;
		colSpan = newColSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AphroditPackage.ELEMENT__COL_SPAN, oldColSpan, colSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AphroditPackage.ELEMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AphroditPackage.ELEMENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundImage(String newBackgroundImage) {
		String oldBackgroundImage = backgroundImage;
		backgroundImage = newBackgroundImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AphroditPackage.ELEMENT__BACKGROUND_IMAGE, oldBackgroundImage, backgroundImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AphroditPackage.ELEMENT__NAME:
				return getName();
			case AphroditPackage.ELEMENT__COL_SPAN:
				return getColSpan();
			case AphroditPackage.ELEMENT__COLOR:
				return getColor();
			case AphroditPackage.ELEMENT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case AphroditPackage.ELEMENT__BACKGROUND_IMAGE:
				return getBackgroundImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AphroditPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case AphroditPackage.ELEMENT__COL_SPAN:
				setColSpan((Integer)newValue);
				return;
			case AphroditPackage.ELEMENT__COLOR:
				setColor((String)newValue);
				return;
			case AphroditPackage.ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case AphroditPackage.ELEMENT__BACKGROUND_IMAGE:
				setBackgroundImage((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AphroditPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AphroditPackage.ELEMENT__COL_SPAN:
				setColSpan(COL_SPAN_EDEFAULT);
				return;
			case AphroditPackage.ELEMENT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case AphroditPackage.ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case AphroditPackage.ELEMENT__BACKGROUND_IMAGE:
				setBackgroundImage(BACKGROUND_IMAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AphroditPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AphroditPackage.ELEMENT__COL_SPAN:
				return colSpan != COL_SPAN_EDEFAULT;
			case AphroditPackage.ELEMENT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case AphroditPackage.ELEMENT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case AphroditPackage.ELEMENT__BACKGROUND_IMAGE:
				return BACKGROUND_IMAGE_EDEFAULT == null ? backgroundImage != null : !BACKGROUND_IMAGE_EDEFAULT.equals(backgroundImage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", colSpan: ");
		result.append(colSpan);
		result.append(", color: ");
		result.append(color);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", backgroundImage: ");
		result.append(backgroundImage);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
