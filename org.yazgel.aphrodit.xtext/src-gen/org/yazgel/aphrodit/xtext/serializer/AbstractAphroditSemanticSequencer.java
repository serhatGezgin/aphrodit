package org.yazgel.aphrodit.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.yazgel.aphrodit.Anchor;
import org.yazgel.aphrodit.AphroditPackage;
import org.yazgel.aphrodit.Card;
import org.yazgel.aphrodit.CardPage;
import org.yazgel.aphrodit.Carousel;
import org.yazgel.aphrodit.CarouselPage;
import org.yazgel.aphrodit.Division;
import org.yazgel.aphrodit.Header;
import org.yazgel.aphrodit.Image;
import org.yazgel.aphrodit.Map;
import org.yazgel.aphrodit.Menu;
import org.yazgel.aphrodit.MenuItem;
import org.yazgel.aphrodit.Model;
import org.yazgel.aphrodit.Page;
import org.yazgel.aphrodit.Paragraf;
import org.yazgel.aphrodit.Row;
import org.yazgel.aphrodit.Section;
import org.yazgel.aphrodit.xtext.services.AphroditGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractAphroditSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AphroditGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AphroditPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AphroditPackage.ANCHOR:
				if(context == grammarAccess.getAnchorRule() ||
				   context == grammarAccess.getCardPageElementRule() ||
				   context == grammarAccess.getCarouselPageElementRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Anchor(context, (Anchor) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.CARD:
				if(context == grammarAccess.getCardRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Card(context, (Card) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.CARD_PAGE:
				if(context == grammarAccess.getCardElementRule() ||
				   context == grammarAccess.getCardPageRule()) {
					sequence_CardPage(context, (CardPage) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.CAROUSEL:
				if(context == grammarAccess.getCarouselRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Carousel(context, (Carousel) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.CAROUSEL_PAGE:
				if(context == grammarAccess.getCarouselElementRule() ||
				   context == grammarAccess.getCarouselPageRule()) {
					sequence_CarouselPage(context, (CarouselPage) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.DIVISION:
				if(context == grammarAccess.getCardPageElementRule() ||
				   context == grammarAccess.getCarouselPageElementRule() ||
				   context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Division(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.HEADER:
				if(context == grammarAccess.getCardPageElementRule() ||
				   context == grammarAccess.getCarouselPageElementRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getHeaderRule() ||
				   context == grammarAccess.getMenuElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.IMAGE:
				if(context == grammarAccess.getCardPageElementRule() ||
				   context == grammarAccess.getCarouselPageElementRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getImageRule() ||
				   context == grammarAccess.getMenuElementRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.MAP:
				if(context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getMapRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Map(context, (Map) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (Menu) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.MENU_ITEM:
				if(context == grammarAccess.getMenuElementRule() ||
				   context == grammarAccess.getMenuItemRule()) {
					sequence_MenuItem(context, (MenuItem) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.PARAGRAF:
				if(context == grammarAccess.getCardPageElementRule() ||
				   context == grammarAccess.getCarouselPageElementRule() ||
				   context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getParagrafRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Paragraf(context, (Paragraf) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.ROW:
				if(context == grammarAccess.getDivisionElementRule() ||
				   context == grammarAccess.getRowRule() ||
				   context == grammarAccess.getRowElementRule() ||
				   context == grammarAccess.getSectionElementRule()) {
					sequence_Row(context, (Row) semanticObject); 
					return; 
				}
				else break;
			case AphroditPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         title=EString? 
	 *         link=EString? 
	 *         type=AnchorType?
	 *     )
	 */
	protected void sequence_Anchor(EObject context, Anchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (elements+=CardPageElement elements+=CardPageElement*)?
	 *     )
	 */
	protected void sequence_CardPage(EObject context, CardPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (pages+=CardElement pages+=CardElement*)?
	 *     )
	 */
	protected void sequence_Card(EObject context, Card semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (elements+=CarouselPageElement elements+=CarouselPageElement*)?
	 *     )
	 */
	protected void sequence_CarouselPage(EObject context, CarouselPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (carouselPages+=CarouselElement carouselPages+=CarouselElement*)?
	 *     )
	 */
	protected void sequence_Carousel(EObject context, Carousel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (elements+=DivisionElement elements+=DivisionElement*)?
	 *     )
	 */
	protected void sequence_Division(EObject context, Division semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         type=HeaderType? 
	 *         content=EString?
	 *     )
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         src=EString? 
	 *         borderRadius=EString?
	 *     )
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         x=EString? 
	 *         y=EString?
	 *     )
	 */
	protected void sequence_Map(EObject context, Map semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         title=EString? 
	 *         section=[Section|EString]?
	 *     )
	 */
	protected void sequence_MenuItem(EObject context, MenuItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (items+=MenuElement items+=MenuElement*)?
	 *     )
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (page=Page?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? introSection=[Section|EString]? (sections+=Section sections+=Section*)? menu=Menu?)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         content=EString?
	 *     )
	 */
	protected void sequence_Paragraf(EObject context, Paragraf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (elements+=RowElement elements+=RowElement*)?
	 *     )
	 */
	protected void sequence_Row(EObject context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         colSpan=EInt? 
	 *         color=EString? 
	 *         backgroundColor=EString? 
	 *         backgroundImage=EString? 
	 *         (elements+=SectionElement elements+=SectionElement*)?
	 *     )
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
