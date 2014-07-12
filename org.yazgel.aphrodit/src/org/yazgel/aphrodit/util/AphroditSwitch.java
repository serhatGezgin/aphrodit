/**
 */
package org.yazgel.aphrodit.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yazgel.aphrodit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.yazgel.aphrodit.AphroditPackage
 * @generated
 */
public class AphroditSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AphroditPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AphroditSwitch() {
		if (modelPackage == null) {
			modelPackage = AphroditPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AphroditPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.ELEMENT_GROUP: {
				ElementGroup elementGroup = (ElementGroup)theEObject;
				T result = caseElementGroup(elementGroup);
				if (result == null) result = caseElement(elementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseElementGroup(section);
				if (result == null) result = caseElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseSectionElement(row);
				if (result == null) result = caseRowElement(row);
				if (result == null) result = caseDivisionElement(row);
				if (result == null) result = caseElementGroup(row);
				if (result == null) result = caseElement(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseSectionElement(header);
				if (result == null) result = caseCarouselPageElement(header);
				if (result == null) result = caseMenuElement(header);
				if (result == null) result = caseCardPageElement(header);
				if (result == null) result = caseRowElement(header);
				if (result == null) result = caseDivisionElement(header);
				if (result == null) result = caseElementGroup(header);
				if (result == null) result = caseElement(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.PARAGRAF: {
				Paragraf paragraf = (Paragraf)theEObject;
				T result = caseParagraf(paragraf);
				if (result == null) result = caseSectionElement(paragraf);
				if (result == null) result = caseCarouselPageElement(paragraf);
				if (result == null) result = caseCardPageElement(paragraf);
				if (result == null) result = caseRowElement(paragraf);
				if (result == null) result = caseDivisionElement(paragraf);
				if (result == null) result = caseElementGroup(paragraf);
				if (result == null) result = caseElement(paragraf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CAROUSEL: {
				Carousel carousel = (Carousel)theEObject;
				T result = caseCarousel(carousel);
				if (result == null) result = caseSectionElement(carousel);
				if (result == null) result = caseRowElement(carousel);
				if (result == null) result = caseDivisionElement(carousel);
				if (result == null) result = caseElementGroup(carousel);
				if (result == null) result = caseElement(carousel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseSectionElement(image);
				if (result == null) result = caseCarouselPageElement(image);
				if (result == null) result = caseMenuElement(image);
				if (result == null) result = caseCardPageElement(image);
				if (result == null) result = caseRowElement(image);
				if (result == null) result = caseDivisionElement(image);
				if (result == null) result = caseElementGroup(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CAROUSEL_PAGE: {
				CarouselPage carouselPage = (CarouselPage)theEObject;
				T result = caseCarouselPage(carouselPage);
				if (result == null) result = caseCarouselElement(carouselPage);
				if (result == null) result = caseElementGroup(carouselPage);
				if (result == null) result = caseElement(carouselPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.SECTION_ELEMENT: {
				SectionElement sectionElement = (SectionElement)theEObject;
				T result = caseSectionElement(sectionElement);
				if (result == null) result = caseElementGroup(sectionElement);
				if (result == null) result = caseElement(sectionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CAROUSEL_PAGE_ELEMENT: {
				CarouselPageElement carouselPageElement = (CarouselPageElement)theEObject;
				T result = caseCarouselPageElement(carouselPageElement);
				if (result == null) result = caseElementGroup(carouselPageElement);
				if (result == null) result = caseElement(carouselPageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseSectionElement(card);
				if (result == null) result = caseRowElement(card);
				if (result == null) result = caseDivisionElement(card);
				if (result == null) result = caseElementGroup(card);
				if (result == null) result = caseElement(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.MENU_ITEM: {
				MenuItem menuItem = (MenuItem)theEObject;
				T result = caseMenuItem(menuItem);
				if (result == null) result = caseMenuElement(menuItem);
				if (result == null) result = caseElementGroup(menuItem);
				if (result == null) result = caseElement(menuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.MENU_ELEMENT: {
				MenuElement menuElement = (MenuElement)theEObject;
				T result = caseMenuElement(menuElement);
				if (result == null) result = caseElementGroup(menuElement);
				if (result == null) result = caseElement(menuElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CARD_PAGE_ELEMENT: {
				CardPageElement cardPageElement = (CardPageElement)theEObject;
				T result = caseCardPageElement(cardPageElement);
				if (result == null) result = caseElementGroup(cardPageElement);
				if (result == null) result = caseElement(cardPageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CARD_PAGE: {
				CardPage cardPage = (CardPage)theEObject;
				T result = caseCardPage(cardPage);
				if (result == null) result = caseCardElement(cardPage);
				if (result == null) result = caseElementGroup(cardPage);
				if (result == null) result = caseElement(cardPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseCardPageElement(anchor);
				if (result == null) result = caseCarouselPageElement(anchor);
				if (result == null) result = caseSectionElement(anchor);
				if (result == null) result = caseRowElement(anchor);
				if (result == null) result = caseDivisionElement(anchor);
				if (result == null) result = caseElementGroup(anchor);
				if (result == null) result = caseElement(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CARD_ELEMENT: {
				CardElement cardElement = (CardElement)theEObject;
				T result = caseCardElement(cardElement);
				if (result == null) result = caseElementGroup(cardElement);
				if (result == null) result = caseElement(cardElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.CAROUSEL_ELEMENT: {
				CarouselElement carouselElement = (CarouselElement)theEObject;
				T result = caseCarouselElement(carouselElement);
				if (result == null) result = caseElementGroup(carouselElement);
				if (result == null) result = caseElement(carouselElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.ROW_ELEMENT: {
				RowElement rowElement = (RowElement)theEObject;
				T result = caseRowElement(rowElement);
				if (result == null) result = caseElementGroup(rowElement);
				if (result == null) result = caseElement(rowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseCardPageElement(division);
				if (result == null) result = caseCarouselPageElement(division);
				if (result == null) result = caseDivisionElement(division);
				if (result == null) result = caseRowElement(division);
				if (result == null) result = caseSectionElement(division);
				if (result == null) result = caseElementGroup(division);
				if (result == null) result = caseElement(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.DIVISION_ELEMENT: {
				DivisionElement divisionElement = (DivisionElement)theEObject;
				T result = caseDivisionElement(divisionElement);
				if (result == null) result = caseElementGroup(divisionElement);
				if (result == null) result = caseElement(divisionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AphroditPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseSectionElement(map);
				if (result == null) result = caseRowElement(map);
				if (result == null) result = caseDivisionElement(map);
				if (result == null) result = caseElementGroup(map);
				if (result == null) result = caseElement(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementGroup(ElementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraf(Paragraf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarousel(Carousel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarouselPage(CarouselPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionElement(SectionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel Page Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarouselPageElement(CarouselPageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuElement(MenuElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Page Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardPageElement(CardPageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardPage(CardPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardElement(CardElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carousel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carousel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarouselElement(CarouselElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowElement(RowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionElement(DivisionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AphroditSwitch
