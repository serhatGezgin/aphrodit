/**
 */
package org.yazgel.aphrodit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.aphrodit.AphroditFactory
 * @model kind="package"
 * @generated
 */
public interface AphroditPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aphrodit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yazgel.org/aphrodit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aphrodit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AphroditPackage eINSTANCE = org.yazgel.aphrodit.impl.AphroditPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.ElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COL_SPAN = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BACKGROUND_IMAGE = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.ElementGroupImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__COL_SPAN = ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__COLOR = ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__BACKGROUND_COLOR = ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__BACKGROUND_IMAGE = ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.ModelImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PAGE = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.PageImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MENU = 2;

	/**
	 * The feature id for the '<em><b>Intro Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INTRO_SECTION = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.SectionImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ELEMENTS = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.SectionElementImpl <em>Section Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.SectionElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getSectionElement()
	 * @generated
	 */
	int SECTION_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Section Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Section Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.RowImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ELEMENTS = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.HeaderImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TYPE = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CONTENT = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.ParagrafImpl <em>Paragraf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.ParagrafImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getParagraf()
	 * @generated
	 */
	int PARAGRAF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF__CONTENT = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAF_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CarouselImpl <em>Carousel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CarouselImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarousel()
	 * @generated
	 */
	int CAROUSEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Carousel Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL__CAROUSEL_PAGES = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Carousel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.ImageImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BORDER_RADIUS = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CarouselElementImpl <em>Carousel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CarouselElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselElement()
	 * @generated
	 */
	int CAROUSEL_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Carousel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carousel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CarouselPageImpl <em>Carousel Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CarouselPageImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselPage()
	 * @generated
	 */
	int CAROUSEL_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__NAME = CAROUSEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__COL_SPAN = CAROUSEL_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__COLOR = CAROUSEL_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__BACKGROUND_COLOR = CAROUSEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__BACKGROUND_IMAGE = CAROUSEL_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE__ELEMENTS = CAROUSEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Carousel Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_FEATURE_COUNT = CAROUSEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Carousel Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_OPERATION_COUNT = CAROUSEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CarouselPageElementImpl <em>Carousel Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CarouselPageElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselPageElement()
	 * @generated
	 */
	int CAROUSEL_PAGE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Carousel Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carousel Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAROUSEL_PAGE_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CardImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__PAGES = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.MenuImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__COL_SPAN = ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__COLOR = ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__BACKGROUND_COLOR = ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__BACKGROUND_IMAGE = ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.MenuElementImpl <em>Menu Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.MenuElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenuElement()
	 * @generated
	 */
	int MENU_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Menu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.MenuItemImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__NAME = MENU_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__COL_SPAN = MENU_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__COLOR = MENU_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__BACKGROUND_COLOR = MENU_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__BACKGROUND_IMAGE = MENU_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__TITLE = MENU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__SECTION = MENU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = MENU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_OPERATION_COUNT = MENU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CardPageElementImpl <em>Card Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CardPageElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardPageElement()
	 * @generated
	 */
	int CARD_PAGE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Card Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Card Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CardElementImpl <em>Card Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CardElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardElement()
	 * @generated
	 */
	int CARD_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Card Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Card Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.CardPageImpl <em>Card Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.CardPageImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardPage()
	 * @generated
	 */
	int CARD_PAGE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__NAME = CARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__COL_SPAN = CARD_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__COLOR = CARD_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__BACKGROUND_COLOR = CARD_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__BACKGROUND_IMAGE = CARD_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE__ELEMENTS = CARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_FEATURE_COUNT = CARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Card Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_PAGE_OPERATION_COUNT = CARD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.AnchorImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__NAME = CARD_PAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__COL_SPAN = CARD_PAGE_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__COLOR = CARD_PAGE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__BACKGROUND_COLOR = CARD_PAGE_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__BACKGROUND_IMAGE = CARD_PAGE_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TITLE = CARD_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__LINK = CARD_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__TYPE = CARD_PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = CARD_PAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = CARD_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.RowElementImpl <em>Row Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.RowElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getRowElement()
	 * @generated
	 */
	int ROW_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Row Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.DivisionImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = CARD_PAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__COL_SPAN = CARD_PAGE_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__COLOR = CARD_PAGE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__BACKGROUND_COLOR = CARD_PAGE_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__BACKGROUND_IMAGE = CARD_PAGE_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ELEMENTS = CARD_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = CARD_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = CARD_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.DivisionElementImpl <em>Division Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.DivisionElementImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getDivisionElement()
	 * @generated
	 */
	int DIVISION_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT__COL_SPAN = ELEMENT_GROUP__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT__COLOR = ELEMENT_GROUP__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT__BACKGROUND_COLOR = ELEMENT_GROUP__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT__BACKGROUND_IMAGE = ELEMENT_GROUP__BACKGROUND_IMAGE;

	/**
	 * The number of structural features of the '<em>Division Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_ELEMENT_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.impl.MapImpl
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = SECTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COL_SPAN = SECTION_ELEMENT__COL_SPAN;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COLOR = SECTION_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BACKGROUND_COLOR = SECTION_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BACKGROUND_IMAGE = SECTION_ELEMENT__BACKGROUND_IMAGE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__X = SECTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__Y = SECTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = SECTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = SECTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.HeaderType <em>Header Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.HeaderType
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.yazgel.aphrodit.AnchorType <em>Anchor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.aphrodit.AnchorType
	 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getAnchorType()
	 * @generated
	 */
	int ANCHOR_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.yazgel.aphrodit.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.aphrodit.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Element#getColSpan <em>Col Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Span</em>'.
	 * @see org.yazgel.aphrodit.Element#getColSpan()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ColSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Element#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.yazgel.aphrodit.Element#getColor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Element#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.yazgel.aphrodit.Element#getBackgroundColor()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Element#getBackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Image</em>'.
	 * @see org.yazgel.aphrodit.Element#getBackgroundImage()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BackgroundImage();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see org.yazgel.aphrodit.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.yazgel.aphrodit.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.yazgel.aphrodit.Model#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see org.yazgel.aphrodit.Model#getPage()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Page();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.yazgel.aphrodit.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.yazgel.aphrodit.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Page#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.yazgel.aphrodit.Page#getSections()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Sections();

	/**
	 * Returns the meta object for the containment reference '{@link org.yazgel.aphrodit.Page#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see org.yazgel.aphrodit.Page#getMenu()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Menu();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.aphrodit.Page#getIntroSection <em>Intro Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intro Section</em>'.
	 * @see org.yazgel.aphrodit.Page#getIntroSection()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_IntroSection();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.yazgel.aphrodit.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Section#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.yazgel.aphrodit.Section#getElements()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Elements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.yazgel.aphrodit.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Row#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.yazgel.aphrodit.Row#getElements()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Elements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.yazgel.aphrodit.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.aphrodit.Header#getType()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Header#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.yazgel.aphrodit.Header#getContent()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Content();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Paragraf <em>Paragraf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraf</em>'.
	 * @see org.yazgel.aphrodit.Paragraf
	 * @generated
	 */
	EClass getParagraf();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Paragraf#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.yazgel.aphrodit.Paragraf#getContent()
	 * @see #getParagraf()
	 * @generated
	 */
	EAttribute getParagraf_Content();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Carousel <em>Carousel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel</em>'.
	 * @see org.yazgel.aphrodit.Carousel
	 * @generated
	 */
	EClass getCarousel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Carousel#getCarouselPages <em>Carousel Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carousel Pages</em>'.
	 * @see org.yazgel.aphrodit.Carousel#getCarouselPages()
	 * @see #getCarousel()
	 * @generated
	 */
	EReference getCarousel_CarouselPages();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.yazgel.aphrodit.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.yazgel.aphrodit.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Image#getBorderRadius <em>Border Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Radius</em>'.
	 * @see org.yazgel.aphrodit.Image#getBorderRadius()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_BorderRadius();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CarouselPage <em>Carousel Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel Page</em>'.
	 * @see org.yazgel.aphrodit.CarouselPage
	 * @generated
	 */
	EClass getCarouselPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.CarouselPage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.yazgel.aphrodit.CarouselPage#getElements()
	 * @see #getCarouselPage()
	 * @generated
	 */
	EReference getCarouselPage_Elements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.SectionElement <em>Section Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Element</em>'.
	 * @see org.yazgel.aphrodit.SectionElement
	 * @generated
	 */
	EClass getSectionElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CarouselPageElement <em>Carousel Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel Page Element</em>'.
	 * @see org.yazgel.aphrodit.CarouselPageElement
	 * @generated
	 */
	EClass getCarouselPageElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.yazgel.aphrodit.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Card#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.yazgel.aphrodit.Card#getPages()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Pages();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.yazgel.aphrodit.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Menu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.yazgel.aphrodit.Menu#getItems()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Items();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see org.yazgel.aphrodit.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.MenuItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.yazgel.aphrodit.MenuItem#getTitle()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_Title();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.aphrodit.MenuItem#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see org.yazgel.aphrodit.MenuItem#getSection()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_Section();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.MenuElement <em>Menu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Element</em>'.
	 * @see org.yazgel.aphrodit.MenuElement
	 * @generated
	 */
	EClass getMenuElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CardPageElement <em>Card Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Page Element</em>'.
	 * @see org.yazgel.aphrodit.CardPageElement
	 * @generated
	 */
	EClass getCardPageElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CardPage <em>Card Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Page</em>'.
	 * @see org.yazgel.aphrodit.CardPage
	 * @generated
	 */
	EClass getCardPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.CardPage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.yazgel.aphrodit.CardPage#getElements()
	 * @see #getCardPage()
	 * @generated
	 */
	EReference getCardPage_Elements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see org.yazgel.aphrodit.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Anchor#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.yazgel.aphrodit.Anchor#getTitle()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Anchor#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.yazgel.aphrodit.Anchor#getLink()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Anchor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.aphrodit.Anchor#getType()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Type();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CardElement <em>Card Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Element</em>'.
	 * @see org.yazgel.aphrodit.CardElement
	 * @generated
	 */
	EClass getCardElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.CarouselElement <em>Carousel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carousel Element</em>'.
	 * @see org.yazgel.aphrodit.CarouselElement
	 * @generated
	 */
	EClass getCarouselElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.RowElement <em>Row Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Element</em>'.
	 * @see org.yazgel.aphrodit.RowElement
	 * @generated
	 */
	EClass getRowElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.yazgel.aphrodit.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.aphrodit.Division#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.yazgel.aphrodit.Division#getElements()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Elements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.DivisionElement <em>Division Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division Element</em>'.
	 * @see org.yazgel.aphrodit.DivisionElement
	 * @generated
	 */
	EClass getDivisionElement();

	/**
	 * Returns the meta object for class '{@link org.yazgel.aphrodit.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.yazgel.aphrodit.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Map#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.yazgel.aphrodit.Map#getX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_X();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.aphrodit.Map#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.yazgel.aphrodit.Map#getY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Y();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.aphrodit.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Header Type</em>'.
	 * @see org.yazgel.aphrodit.HeaderType
	 * @generated
	 */
	EEnum getHeaderType();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.aphrodit.AnchorType <em>Anchor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anchor Type</em>'.
	 * @see org.yazgel.aphrodit.AnchorType
	 * @generated
	 */
	EEnum getAnchorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AphroditFactory getAphroditFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.ElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Col Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COL_SPAN = eINSTANCE.getElement_ColSpan();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COLOR = eINSTANCE.getElement_Color();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BACKGROUND_COLOR = eINSTANCE.getElement_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Background Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BACKGROUND_IMAGE = eINSTANCE.getElement_BackgroundImage();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.ElementGroupImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.ModelImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PAGE = eINSTANCE.getModel_Page();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.PageImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SECTIONS = eINSTANCE.getPage_Sections();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__MENU = eINSTANCE.getPage_Menu();

		/**
		 * The meta object literal for the '<em><b>Intro Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INTRO_SECTION = eINSTANCE.getPage_IntroSection();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.SectionImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ELEMENTS = eINSTANCE.getSection_Elements();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.RowImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__ELEMENTS = eINSTANCE.getRow_Elements();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.HeaderImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TYPE = eINSTANCE.getHeader_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__CONTENT = eINSTANCE.getHeader_Content();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.ParagrafImpl <em>Paragraf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.ParagrafImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getParagraf()
		 * @generated
		 */
		EClass PARAGRAF = eINSTANCE.getParagraf();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAF__CONTENT = eINSTANCE.getParagraf_Content();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CarouselImpl <em>Carousel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CarouselImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarousel()
		 * @generated
		 */
		EClass CAROUSEL = eINSTANCE.getCarousel();

		/**
		 * The meta object literal for the '<em><b>Carousel Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL__CAROUSEL_PAGES = eINSTANCE.getCarousel_CarouselPages();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.ImageImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '<em><b>Border Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__BORDER_RADIUS = eINSTANCE.getImage_BorderRadius();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CarouselPageImpl <em>Carousel Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CarouselPageImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselPage()
		 * @generated
		 */
		EClass CAROUSEL_PAGE = eINSTANCE.getCarouselPage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAROUSEL_PAGE__ELEMENTS = eINSTANCE.getCarouselPage_Elements();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.SectionElementImpl <em>Section Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.SectionElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getSectionElement()
		 * @generated
		 */
		EClass SECTION_ELEMENT = eINSTANCE.getSectionElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CarouselPageElementImpl <em>Carousel Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CarouselPageElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselPageElement()
		 * @generated
		 */
		EClass CAROUSEL_PAGE_ELEMENT = eINSTANCE.getCarouselPageElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CardImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__PAGES = eINSTANCE.getCard_Pages();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.MenuImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ITEMS = eINSTANCE.getMenu_Items();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.MenuItemImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__TITLE = eINSTANCE.getMenuItem_Title();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__SECTION = eINSTANCE.getMenuItem_Section();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.MenuElementImpl <em>Menu Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.MenuElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMenuElement()
		 * @generated
		 */
		EClass MENU_ELEMENT = eINSTANCE.getMenuElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CardPageElementImpl <em>Card Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CardPageElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardPageElement()
		 * @generated
		 */
		EClass CARD_PAGE_ELEMENT = eINSTANCE.getCardPageElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CardPageImpl <em>Card Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CardPageImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardPage()
		 * @generated
		 */
		EClass CARD_PAGE = eINSTANCE.getCardPage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_PAGE__ELEMENTS = eINSTANCE.getCardPage_Elements();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.AnchorImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TITLE = eINSTANCE.getAnchor_Title();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__LINK = eINSTANCE.getAnchor_Link();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__TYPE = eINSTANCE.getAnchor_Type();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CardElementImpl <em>Card Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CardElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCardElement()
		 * @generated
		 */
		EClass CARD_ELEMENT = eINSTANCE.getCardElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.CarouselElementImpl <em>Carousel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.CarouselElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getCarouselElement()
		 * @generated
		 */
		EClass CAROUSEL_ELEMENT = eINSTANCE.getCarouselElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.RowElementImpl <em>Row Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.RowElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getRowElement()
		 * @generated
		 */
		EClass ROW_ELEMENT = eINSTANCE.getRowElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.DivisionImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__ELEMENTS = eINSTANCE.getDivision_Elements();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.DivisionElementImpl <em>Division Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.DivisionElementImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getDivisionElement()
		 * @generated
		 */
		EClass DIVISION_ELEMENT = eINSTANCE.getDivisionElement();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.impl.MapImpl
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__X = eINSTANCE.getMap_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__Y = eINSTANCE.getMap_Y();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.HeaderType <em>Header Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.HeaderType
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getHeaderType()
		 * @generated
		 */
		EEnum HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '{@link org.yazgel.aphrodit.AnchorType <em>Anchor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.aphrodit.AnchorType
		 * @see org.yazgel.aphrodit.impl.AphroditPackageImpl#getAnchorType()
		 * @generated
		 */
		EEnum ANCHOR_TYPE = eINSTANCE.getAnchorType();

	}

} //AphroditPackage
