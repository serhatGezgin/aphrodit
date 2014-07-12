/**
 */
package org.yazgel.aphrodit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.aphrodit.AphroditPackage;
import org.yazgel.aphrodit.Carousel;
import org.yazgel.aphrodit.CarouselElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carousel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.aphrodit.impl.CarouselImpl#getCarouselPages <em>Carousel Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarouselImpl extends SectionElementImpl implements Carousel {
	/**
	 * The cached value of the '{@link #getCarouselPages() <em>Carousel Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarouselPages()
	 * @generated
	 * @ordered
	 */
	protected EList<CarouselElement> carouselPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarouselImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AphroditPackage.Literals.CAROUSEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarouselElement> getCarouselPages() {
		if (carouselPages == null) {
			carouselPages = new EObjectContainmentEList<CarouselElement>(CarouselElement.class, this, AphroditPackage.CAROUSEL__CAROUSEL_PAGES);
		}
		return carouselPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AphroditPackage.CAROUSEL__CAROUSEL_PAGES:
				return ((InternalEList<?>)getCarouselPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AphroditPackage.CAROUSEL__CAROUSEL_PAGES:
				return getCarouselPages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AphroditPackage.CAROUSEL__CAROUSEL_PAGES:
				getCarouselPages().clear();
				getCarouselPages().addAll((Collection<? extends CarouselElement>)newValue);
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
			case AphroditPackage.CAROUSEL__CAROUSEL_PAGES:
				getCarouselPages().clear();
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
			case AphroditPackage.CAROUSEL__CAROUSEL_PAGES:
				return carouselPages != null && !carouselPages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarouselImpl
