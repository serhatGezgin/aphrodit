/**
 */
package org.yazgel.aphrodit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Anchor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.yazgel.aphrodit.AphroditPackage#getAnchorType()
 * @model
 * @generated
 */
public enum AnchorType implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default"),

	/**
	 * The '<em><b>Btn default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_DEFAULT(1, "btn_default", "btn-default"),

	/**
	 * The '<em><b>Btn primary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_PRIMARY(2, "btn_primary", "btn-primary"),

	/**
	 * The '<em><b>Btn success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_SUCCESS(3, "btn_success", "btn-success"),

	/**
	 * The '<em><b>Btn info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_INFO(4, "btn_info", "btn-info"),

	/**
	 * The '<em><b>Btn warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_WARNING(5, "btn_warning", "btn-warning"),

	/**
	 * The '<em><b>Btn danger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTN_DANGER_VALUE
	 * @generated
	 * @ordered
	 */
	BTN_DANGER(6, "btn_danger", "btn-danger");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Btn default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_DEFAULT
	 * @model name="btn_default" literal="btn-default"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>Btn primary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn primary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_PRIMARY
	 * @model name="btn_primary" literal="btn-primary"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_PRIMARY_VALUE = 2;

	/**
	 * The '<em><b>Btn success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn success</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_SUCCESS
	 * @model name="btn_success" literal="btn-success"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_SUCCESS_VALUE = 3;

	/**
	 * The '<em><b>Btn info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn info</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_INFO
	 * @model name="btn_info" literal="btn-info"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_INFO_VALUE = 4;

	/**
	 * The '<em><b>Btn warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn warning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_WARNING
	 * @model name="btn_warning" literal="btn-warning"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_WARNING_VALUE = 5;

	/**
	 * The '<em><b>Btn danger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Btn danger</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTN_DANGER
	 * @model name="btn_danger" literal="btn-danger"
	 * @generated
	 * @ordered
	 */
	public static final int BTN_DANGER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Anchor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnchorType[] VALUES_ARRAY =
		new AnchorType[] {
			DEFAULT,
			BTN_DEFAULT,
			BTN_PRIMARY,
			BTN_SUCCESS,
			BTN_INFO,
			BTN_WARNING,
			BTN_DANGER,
		};

	/**
	 * A public read-only list of all the '<em><b>Anchor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AnchorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Anchor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnchorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnchorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Anchor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnchorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnchorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Anchor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnchorType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case BTN_DEFAULT_VALUE: return BTN_DEFAULT;
			case BTN_PRIMARY_VALUE: return BTN_PRIMARY;
			case BTN_SUCCESS_VALUE: return BTN_SUCCESS;
			case BTN_INFO_VALUE: return BTN_INFO;
			case BTN_WARNING_VALUE: return BTN_WARNING;
			case BTN_DANGER_VALUE: return BTN_DANGER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AnchorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AnchorType
