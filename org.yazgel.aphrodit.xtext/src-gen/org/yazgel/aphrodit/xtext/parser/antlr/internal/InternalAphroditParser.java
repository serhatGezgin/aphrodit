package org.yazgel.aphrodit.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.yazgel.aphrodit.xtext.services.AphroditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAphroditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'page'", "'}'", "'Page'", "'title'", "'introSection'", "'sections'", "','", "'menu'", "'Section'", "'colSpan'", "'color'", "'backgroundColor'", "'backgroundImage'", "'elements'", "'Menu'", "'items'", "'-'", "'Row'", "'Header'", "'type'", "'content'", "'Paragraf'", "'Carousel'", "'carouselPages'", "'Image'", "'src'", "'borderRadius'", "'Card'", "'pages'", "'Anchor'", "'link'", "'Division'", "'Map'", "'x'", "'y'", "'CarouselPage'", "'CardPage'", "'MenuItem'", "'section'", "'H1'", "'H2'", "'H3'", "'H4'", "'H5'", "'H6'", "'default'", "'btn_default'", "'btn_primary'", "'btn_success'", "'btn_info'", "'btn_warning'", "'btn_danger'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAphroditParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAphroditParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAphroditParser.tokenNames; }
    public String getGrammarFileName() { return "../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g"; }



     	private AphroditGrammarAccess grammarAccess;
     	
        public InternalAphroditParser(TokenStream input, AphroditGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AphroditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_page_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:80:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )? otherlv_5= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )? otherlv_5= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )? otherlv_5= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )? otherlv_5= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:95:1: (otherlv_3= 'page' ( (lv_page_4_0= rulePage ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:95:3: otherlv_3= 'page' ( (lv_page_4_0= rulePage ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getPageKeyword_3_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:99:1: ( (lv_page_4_0= rulePage ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:100:1: (lv_page_4_0= rulePage )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:100:1: (lv_page_4_0= rulePage )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:101:3: lv_page_4_0= rulePage
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPagePageParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleModel177);
                    lv_page_4_0=rulePage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"page",
                            		lv_page_4_0, 
                            		"Page");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel191); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSectionElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:129:1: entryRuleSectionElement returns [EObject current=null] : iv_ruleSectionElement= ruleSectionElement EOF ;
    public final EObject entryRuleSectionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:130:2: (iv_ruleSectionElement= ruleSectionElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:131:2: iv_ruleSectionElement= ruleSectionElement EOF
            {
             newCompositeNode(grammarAccess.getSectionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_entryRuleSectionElement227);
            iv_ruleSectionElement=ruleSectionElement();

            state._fsp--;

             current =iv_ruleSectionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSectionElement237); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionElement"


    // $ANTLR start "ruleSectionElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:138:1: ruleSectionElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
    public final EObject ruleSectionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Row_0 = null;

        EObject this_Header_1 = null;

        EObject this_Paragraf_2 = null;

        EObject this_Carousel_3 = null;

        EObject this_Image_4 = null;

        EObject this_Card_5 = null;

        EObject this_Anchor_6 = null;

        EObject this_Division_7 = null;

        EObject this_Map_8 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:141:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:142:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:142:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 37:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
                }
                break;
            case 42:
                {
                alt2=7;
                }
                break;
            case 44:
                {
                alt2=8;
                }
                break;
            case 45:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:143:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleSectionElement284);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:153:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleSectionElement311);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:163:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleSectionElement338);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:173:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleSectionElement365);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:183:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleSectionElement392);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:193:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleSectionElement419);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:203:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleSectionElement446);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:213:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleSectionElement473);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:223:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleSectionElement500);
                    this_Map_8=ruleMap();

                    state._fsp--;

                     
                            current = this_Map_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionElement"


    // $ANTLR start "entryRuleMenuElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:239:1: entryRuleMenuElement returns [EObject current=null] : iv_ruleMenuElement= ruleMenuElement EOF ;
    public final EObject entryRuleMenuElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:240:2: (iv_ruleMenuElement= ruleMenuElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:241:2: iv_ruleMenuElement= ruleMenuElement EOF
            {
             newCompositeNode(grammarAccess.getMenuElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_entryRuleMenuElement535);
            iv_ruleMenuElement=ruleMenuElement();

            state._fsp--;

             current =iv_ruleMenuElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenuElement545); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenuElement"


    // $ANTLR start "ruleMenuElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:248:1: ruleMenuElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem ) ;
    public final EObject ruleMenuElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Image_1 = null;

        EObject this_MenuItem_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:251:28: ( (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:252:1: (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:252:1: (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 50:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:253:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleMenuElement592);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:263:5: this_Image_1= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getImageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleMenuElement619);
                    this_Image_1=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:273:5: this_MenuItem_2= ruleMenuItem
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getMenuItemParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMenuItem_in_ruleMenuElement646);
                    this_MenuItem_2=ruleMenuItem();

                    state._fsp--;

                     
                            current = this_MenuItem_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenuElement"


    // $ANTLR start "entryRuleRowElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:289:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:290:2: (iv_ruleRowElement= ruleRowElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:291:2: iv_ruleRowElement= ruleRowElement EOF
            {
             newCompositeNode(grammarAccess.getRowElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_entryRuleRowElement681);
            iv_ruleRowElement=ruleRowElement();

            state._fsp--;

             current =iv_ruleRowElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRowElement691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowElement"


    // $ANTLR start "ruleRowElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:298:1: ruleRowElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
    public final EObject ruleRowElement() throws RecognitionException {
        EObject current = null;

        EObject this_Row_0 = null;

        EObject this_Header_1 = null;

        EObject this_Paragraf_2 = null;

        EObject this_Carousel_3 = null;

        EObject this_Image_4 = null;

        EObject this_Card_5 = null;

        EObject this_Anchor_6 = null;

        EObject this_Division_7 = null;

        EObject this_Map_8 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:301:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:302:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:302:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 37:
                {
                alt4=5;
                }
                break;
            case 40:
                {
                alt4=6;
                }
                break;
            case 42:
                {
                alt4=7;
                }
                break;
            case 44:
                {
                alt4=8;
                }
                break;
            case 45:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:303:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleRowElement738);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:313:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleRowElement765);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:323:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleRowElement792);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:333:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleRowElement819);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:343:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleRowElement846);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:353:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleRowElement873);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:363:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleRowElement900);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:373:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleRowElement927);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:383:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleRowElement954);
                    this_Map_8=ruleMap();

                    state._fsp--;

                     
                            current = this_Map_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowElement"


    // $ANTLR start "entryRuleCarouselElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:399:1: entryRuleCarouselElement returns [EObject current=null] : iv_ruleCarouselElement= ruleCarouselElement EOF ;
    public final EObject entryRuleCarouselElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:400:2: (iv_ruleCarouselElement= ruleCarouselElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:401:2: iv_ruleCarouselElement= ruleCarouselElement EOF
            {
             newCompositeNode(grammarAccess.getCarouselElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_entryRuleCarouselElement989);
            iv_ruleCarouselElement=ruleCarouselElement();

            state._fsp--;

             current =iv_ruleCarouselElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselElement999); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarouselElement"


    // $ANTLR start "ruleCarouselElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:408:1: ruleCarouselElement returns [EObject current=null] : this_CarouselPage_0= ruleCarouselPage ;
    public final EObject ruleCarouselElement() throws RecognitionException {
        EObject current = null;

        EObject this_CarouselPage_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:411:28: (this_CarouselPage_0= ruleCarouselPage )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:413:5: this_CarouselPage_0= ruleCarouselPage
            {
             
                    newCompositeNode(grammarAccess.getCarouselElementAccess().getCarouselPageParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPage_in_ruleCarouselElement1045);
            this_CarouselPage_0=ruleCarouselPage();

            state._fsp--;

             
                    current = this_CarouselPage_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarouselElement"


    // $ANTLR start "entryRuleCardElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:429:1: entryRuleCardElement returns [EObject current=null] : iv_ruleCardElement= ruleCardElement EOF ;
    public final EObject entryRuleCardElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:430:2: (iv_ruleCardElement= ruleCardElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:431:2: iv_ruleCardElement= ruleCardElement EOF
            {
             newCompositeNode(grammarAccess.getCardElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_entryRuleCardElement1079);
            iv_ruleCardElement=ruleCardElement();

            state._fsp--;

             current =iv_ruleCardElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardElement1089); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardElement"


    // $ANTLR start "ruleCardElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:438:1: ruleCardElement returns [EObject current=null] : this_CardPage_0= ruleCardPage ;
    public final EObject ruleCardElement() throws RecognitionException {
        EObject current = null;

        EObject this_CardPage_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:441:28: (this_CardPage_0= ruleCardPage )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:443:5: this_CardPage_0= ruleCardPage
            {
             
                    newCompositeNode(grammarAccess.getCardElementAccess().getCardPageParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCardPage_in_ruleCardElement1135);
            this_CardPage_0=ruleCardPage();

            state._fsp--;

             
                    current = this_CardPage_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardElement"


    // $ANTLR start "entryRuleDivisionElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:459:1: entryRuleDivisionElement returns [EObject current=null] : iv_ruleDivisionElement= ruleDivisionElement EOF ;
    public final EObject entryRuleDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:460:2: (iv_ruleDivisionElement= ruleDivisionElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:461:2: iv_ruleDivisionElement= ruleDivisionElement EOF
            {
             newCompositeNode(grammarAccess.getDivisionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_entryRuleDivisionElement1169);
            iv_ruleDivisionElement=ruleDivisionElement();

            state._fsp--;

             current =iv_ruleDivisionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivisionElement1179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionElement"


    // $ANTLR start "ruleDivisionElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:468:1: ruleDivisionElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
    public final EObject ruleDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Row_0 = null;

        EObject this_Header_1 = null;

        EObject this_Paragraf_2 = null;

        EObject this_Carousel_3 = null;

        EObject this_Image_4 = null;

        EObject this_Card_5 = null;

        EObject this_Anchor_6 = null;

        EObject this_Division_7 = null;

        EObject this_Map_8 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:471:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:472:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:472:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 37:
                {
                alt5=5;
                }
                break;
            case 40:
                {
                alt5=6;
                }
                break;
            case 42:
                {
                alt5=7;
                }
                break;
            case 44:
                {
                alt5=8;
                }
                break;
            case 45:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:473:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleDivisionElement1226);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:483:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleDivisionElement1253);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:493:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleDivisionElement1280);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:503:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleDivisionElement1307);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:513:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleDivisionElement1334);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:523:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleDivisionElement1361);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:533:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleDivisionElement1388);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:543:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleDivisionElement1415);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:553:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleDivisionElement1442);
                    this_Map_8=ruleMap();

                    state._fsp--;

                     
                            current = this_Map_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionElement"


    // $ANTLR start "entryRuleCarouselPageElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:569:1: entryRuleCarouselPageElement returns [EObject current=null] : iv_ruleCarouselPageElement= ruleCarouselPageElement EOF ;
    public final EObject entryRuleCarouselPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselPageElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:570:2: (iv_ruleCarouselPageElement= ruleCarouselPageElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:571:2: iv_ruleCarouselPageElement= ruleCarouselPageElement EOF
            {
             newCompositeNode(grammarAccess.getCarouselPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_entryRuleCarouselPageElement1477);
            iv_ruleCarouselPageElement=ruleCarouselPageElement();

            state._fsp--;

             current =iv_ruleCarouselPageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselPageElement1487); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarouselPageElement"


    // $ANTLR start "ruleCarouselPageElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:578:1: ruleCarouselPageElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) ;
    public final EObject ruleCarouselPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Paragraf_1 = null;

        EObject this_Image_2 = null;

        EObject this_Anchor_3 = null;

        EObject this_Division_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:581:28: ( (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:582:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:582:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            case 44:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:583:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleCarouselPageElement1534);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:593:5: this_Paragraf_1= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getParagrafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleCarouselPageElement1561);
                    this_Paragraf_1=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:603:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleCarouselPageElement1588);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:613:5: this_Anchor_3= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getAnchorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleCarouselPageElement1615);
                    this_Anchor_3=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:623:5: this_Division_4= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getDivisionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleCarouselPageElement1642);
                    this_Division_4=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarouselPageElement"


    // $ANTLR start "entryRuleCardPageElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:639:1: entryRuleCardPageElement returns [EObject current=null] : iv_ruleCardPageElement= ruleCardPageElement EOF ;
    public final EObject entryRuleCardPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardPageElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:640:2: (iv_ruleCardPageElement= ruleCardPageElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:641:2: iv_ruleCardPageElement= ruleCardPageElement EOF
            {
             newCompositeNode(grammarAccess.getCardPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_entryRuleCardPageElement1677);
            iv_ruleCardPageElement=ruleCardPageElement();

            state._fsp--;

             current =iv_ruleCardPageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardPageElement1687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardPageElement"


    // $ANTLR start "ruleCardPageElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:648:1: ruleCardPageElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) ;
    public final EObject ruleCardPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Paragraf_1 = null;

        EObject this_Image_2 = null;

        EObject this_Anchor_3 = null;

        EObject this_Division_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:651:28: ( (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:652:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:652:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:653:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleCardPageElement1734);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:663:5: this_Paragraf_1= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getParagrafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleCardPageElement1761);
                    this_Paragraf_1=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:673:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleCardPageElement1788);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:683:5: this_Anchor_3= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getAnchorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleCardPageElement1815);
                    this_Anchor_3=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:693:5: this_Division_4= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getDivisionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleCardPageElement1842);
                    this_Division_4=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardPageElement"


    // $ANTLR start "entryRulePage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:709:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:710:2: (iv_rulePage= rulePage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:711:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage1877);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage1887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:718:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        EObject lv_sections_9_0 = null;

        EObject lv_sections_11_0 = null;

        EObject lv_menu_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:721:28: ( ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:722:1: ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:722:1: ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:722:2: () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:722:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:723:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPageAccess().getPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePage1933); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePage1945); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:736:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:736:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePage1958); 

                        	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTitleKeyword_3_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:740:1: ( (lv_title_4_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:741:1: (lv_title_4_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:741:1: (lv_title_4_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:742:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePage1979);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:758:4: (otherlv_5= 'introSection' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:758:6: otherlv_5= 'introSection' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage1994); 

                        	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getIntroSectionKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:762:1: ( ( ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:763:1: ( ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:763:1: ( ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:764:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getIntroSectionSectionCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePage2017);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:777:4: (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:777:6: otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePage2032); 

                        	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getSectionsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePage2044); 

                        	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:785:1: ( (lv_sections_9_0= ruleSection ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:786:1: (lv_sections_9_0= ruleSection )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:786:1: (lv_sections_9_0= ruleSection )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:787:3: lv_sections_9_0= ruleSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getSectionsSectionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSection_in_rulePage2065);
                    lv_sections_9_0=ruleSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		add(
                           			current, 
                           			"sections",
                            		lv_sections_9_0, 
                            		"Section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:803:2: (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:803:4: otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePage2078); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:807:1: ( (lv_sections_11_0= ruleSection ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:808:1: (lv_sections_11_0= ruleSection )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:808:1: (lv_sections_11_0= ruleSection )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:809:3: lv_sections_11_0= ruleSection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageAccess().getSectionsSectionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSection_in_rulePage2099);
                    	    lv_sections_11_0=ruleSection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sections",
                    	            		lv_sections_11_0, 
                    	            		"Section");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePage2113); 

                        	newLeafNode(otherlv_12, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:829:3: (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:829:5: otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) )
                    {
                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePage2128); 

                        	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getMenuKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:833:1: ( (lv_menu_14_0= ruleMenu ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:834:1: (lv_menu_14_0= ruleMenu )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:834:1: (lv_menu_14_0= ruleMenu )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:835:3: lv_menu_14_0= ruleMenu
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getMenuMenuParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenu_in_rulePage2149);
                    lv_menu_14_0=ruleMenu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		set(
                           			current, 
                           			"menu",
                            		lv_menu_14_0, 
                            		"Menu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePage2163); 

                	newLeafNode(otherlv_15, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEString"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:863:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:864:2: (iv_ruleEString= ruleEString EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:865:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2200);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:872:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:875:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:876:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:876:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:876:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2251); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:884:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2277); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSection"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:899:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:900:2: (iv_ruleSection= ruleSection EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:901:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSection_in_entryRuleSection2322);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSection2332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:908:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:911:28: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:912:1: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:912:1: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:912:2: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:912:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:913:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSectionAccess().getSectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSection2378); 

                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:922:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:923:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:923:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:924:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2399);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSection2411); 

                	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:944:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:944:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSection2424); 

                        	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:948:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:949:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:949:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:950:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSection2445);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:966:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:966:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSection2460); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:970:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:971:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:971:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:972:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2481);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:988:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:988:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSection2496); 

                        	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:992:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:993:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:993:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:994:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2517);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1010:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1010:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSection2532); 

                        	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1014:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1015:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1015:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1016:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2553);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1032:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1032:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSection2568); 

                        	newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSection2580); 

                        	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1040:1: ( (lv_elements_14_0= ruleSectionElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1041:1: (lv_elements_14_0= ruleSectionElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1041:1: (lv_elements_14_0= ruleSectionElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1042:3: lv_elements_14_0= ruleSectionElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getElementsSectionElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_ruleSection2601);
                    lv_elements_14_0=ruleSectionElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_14_0, 
                            		"SectionElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1058:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1058:4: otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSection2614); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1062:1: ( (lv_elements_16_0= ruleSectionElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1063:1: (lv_elements_16_0= ruleSectionElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1063:1: (lv_elements_16_0= ruleSectionElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1064:3: lv_elements_16_0= ruleSectionElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getElementsSectionElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_ruleSection2635);
                    	    lv_elements_16_0=ruleSectionElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_16_0, 
                    	            		"SectionElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSection2649); 

                        	newLeafNode(otherlv_17, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSection2663); 

                	newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleMenu"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1096:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1097:2: (iv_ruleMenu= ruleMenu EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1098:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenu_in_entryRuleMenu2699);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenu2709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1105:1: ruleMenu returns [EObject current=null] : ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_items_14_0 = null;

        EObject lv_items_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1108:28: ( ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1109:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1109:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1109:2: () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1109:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1110:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuAccess().getMenuAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMenu2755); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getMenuKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1119:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1120:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1120:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1121:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2776);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu2788); 

                	newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1141:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1141:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMenu2801); 

                        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1145:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1146:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1146:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1147:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMenu2822);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1163:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1163:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMenu2837); 

                        	newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1167:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1168:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1168:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1169:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2858);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1185:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1185:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMenu2873); 

                        	newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1189:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1190:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1190:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1191:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2894);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1207:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1207:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMenu2909); 

                        	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1211:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1212:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1212:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1213:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2930);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1229:4: (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1229:6: otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMenu2945); 

                        	newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getItemsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu2957); 

                        	newLeafNode(otherlv_13, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1237:1: ( (lv_items_14_0= ruleMenuElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1238:1: (lv_items_14_0= ruleMenuElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1238:1: (lv_items_14_0= ruleMenuElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1239:3: lv_items_14_0= ruleMenuElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsMenuElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_ruleMenu2978);
                    lv_items_14_0=ruleMenuElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_14_0, 
                            		"MenuElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1255:2: (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1255:4: otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMenu2991); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMenuAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1259:1: ( (lv_items_16_0= ruleMenuElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1260:1: (lv_items_16_0= ruleMenuElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1260:1: (lv_items_16_0= ruleMenuElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1261:3: lv_items_16_0= ruleMenuElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsMenuElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_ruleMenu3012);
                    	    lv_items_16_0=ruleMenuElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_16_0, 
                    	            		"MenuElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMenu3026); 

                        	newLeafNode(otherlv_17, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMenu3040); 

                	newLeafNode(otherlv_18, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleEInt"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1293:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1294:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1295:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3077);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1302:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1305:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1306:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1306:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1306:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1306:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1307:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEInt3127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3144); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRow"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1327:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1328:2: (iv_ruleRow= ruleRow EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1329:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRow_in_entryRuleRow3189);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRow3199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1336:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1339:28: ( ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1340:1: ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1340:1: ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1340:2: () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1340:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1341:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRowAccess().getRowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRow3245); 

                	newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1350:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1351:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1351:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1352:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRowAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3266);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRow3278); 

                	newLeafNode(otherlv_3, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1372:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1372:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRow3291); 

                        	newLeafNode(otherlv_4, grammarAccess.getRowAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1376:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1377:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1377:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1378:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRow3312);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1394:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1394:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRow3327); 

                        	newLeafNode(otherlv_6, grammarAccess.getRowAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1398:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1399:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1399:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1400:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3348);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1416:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1416:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRow3363); 

                        	newLeafNode(otherlv_8, grammarAccess.getRowAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1420:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1421:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1421:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1422:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3384);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1438:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1438:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRow3399); 

                        	newLeafNode(otherlv_10, grammarAccess.getRowAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1442:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1443:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1443:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1444:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3420);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1460:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1460:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRow3435); 

                        	newLeafNode(otherlv_12, grammarAccess.getRowAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRow3447); 

                        	newLeafNode(otherlv_13, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1468:1: ( (lv_elements_14_0= ruleRowElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1469:1: (lv_elements_14_0= ruleRowElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1469:1: (lv_elements_14_0= ruleRowElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1470:3: lv_elements_14_0= ruleRowElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_ruleRow3468);
                    lv_elements_14_0=ruleRowElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_14_0, 
                            		"RowElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1486:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1486:4: otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRow3481); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getRowAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1490:1: ( (lv_elements_16_0= ruleRowElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1491:1: (lv_elements_16_0= ruleRowElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1491:1: (lv_elements_16_0= ruleRowElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1492:3: lv_elements_16_0= ruleRowElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_ruleRow3502);
                    	    lv_elements_16_0=ruleRowElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRowRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_16_0, 
                    	            		"RowElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRow3516); 

                        	newLeafNode(otherlv_17, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRow3530); 

                	newLeafNode(otherlv_18, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleHeader"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1524:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1525:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1526:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeader_in_entryRuleHeader3566);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeader3576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1533:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        Enumerator lv_type_13_0 = null;

        AntlrDatatypeRuleToken lv_content_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1536:28: ( ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1537:1: ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1537:1: ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1537:2: () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1537:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1538:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHeaderAccess().getHeaderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHeader3622); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1547:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1548:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1548:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1549:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHeaderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3643);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHeader3655); 

                	newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1569:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1569:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHeader3668); 

                        	newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1573:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1574:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1574:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1575:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHeader3689);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1591:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1591:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleHeader3704); 

                        	newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1595:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1596:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1596:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1597:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3725);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1613:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1613:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleHeader3740); 

                        	newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1617:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1618:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1618:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1619:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3761);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1635:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1635:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleHeader3776); 

                        	newLeafNode(otherlv_10, grammarAccess.getHeaderAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1639:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1640:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1640:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1641:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3797);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1657:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1657:6: otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) )
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleHeader3812); 

                        	newLeafNode(otherlv_12, grammarAccess.getHeaderAccess().getTypeKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1661:1: ( (lv_type_13_0= ruleHeaderType ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1662:1: (lv_type_13_0= ruleHeaderType )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1662:1: (lv_type_13_0= ruleHeaderType )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1663:3: lv_type_13_0= ruleHeaderType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getTypeHeaderTypeEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleHeaderType_in_ruleHeader3833);
                    lv_type_13_0=ruleHeaderType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_13_0, 
                            		"HeaderType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1679:4: (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1679:6: otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleHeader3848); 

                        	newLeafNode(otherlv_14, grammarAccess.getHeaderAccess().getContentKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1683:1: ( (lv_content_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1684:1: (lv_content_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1684:1: (lv_content_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1685:3: lv_content_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getContentEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3869);
                    lv_content_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHeader3883); 

                	newLeafNode(otherlv_16, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleParagraf"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1713:1: entryRuleParagraf returns [EObject current=null] : iv_ruleParagraf= ruleParagraf EOF ;
    public final EObject entryRuleParagraf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraf = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1714:2: (iv_ruleParagraf= ruleParagraf EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1715:2: iv_ruleParagraf= ruleParagraf EOF
            {
             newCompositeNode(grammarAccess.getParagrafRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_entryRuleParagraf3919);
            iv_ruleParagraf=ruleParagraf();

            state._fsp--;

             current =iv_ruleParagraf; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParagraf3929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraf"


    // $ANTLR start "ruleParagraf"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1722:1: ruleParagraf returns [EObject current=null] : ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleParagraf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        AntlrDatatypeRuleToken lv_content_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1725:28: ( ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1726:1: ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1726:1: ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1726:2: () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1726:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParagrafAccess().getParagrafAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleParagraf3975); 

                	newLeafNode(otherlv_1, grammarAccess.getParagrafAccess().getParagrafKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1736:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1737:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1737:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1738:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParagrafAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf3996);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParagrafRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParagraf4008); 

                	newLeafNode(otherlv_3, grammarAccess.getParagrafAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1758:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1758:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParagraf4021); 

                        	newLeafNode(otherlv_4, grammarAccess.getParagrafAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1762:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1763:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1763:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1764:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParagraf4042);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParagrafRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1780:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1780:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParagraf4057); 

                        	newLeafNode(otherlv_6, grammarAccess.getParagrafAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1784:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1785:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1785:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1786:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf4078);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParagrafRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1802:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1802:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParagraf4093); 

                        	newLeafNode(otherlv_8, grammarAccess.getParagrafAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1806:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1807:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1807:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1808:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf4114);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParagrafRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1824:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1824:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParagraf4129); 

                        	newLeafNode(otherlv_10, grammarAccess.getParagrafAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1828:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1829:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1829:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1830:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf4150);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParagrafRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1846:4: (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1846:6: otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleParagraf4165); 

                        	newLeafNode(otherlv_12, grammarAccess.getParagrafAccess().getContentKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1850:1: ( (lv_content_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1851:1: (lv_content_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1851:1: (lv_content_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1852:3: lv_content_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getContentEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf4186);
                    lv_content_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParagrafRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParagraf4200); 

                	newLeafNode(otherlv_14, grammarAccess.getParagrafAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraf"


    // $ANTLR start "entryRuleCarousel"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1880:1: entryRuleCarousel returns [EObject current=null] : iv_ruleCarousel= ruleCarousel EOF ;
    public final EObject entryRuleCarousel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarousel = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1881:2: (iv_ruleCarousel= ruleCarousel EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1882:2: iv_ruleCarousel= ruleCarousel EOF
            {
             newCompositeNode(grammarAccess.getCarouselRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_entryRuleCarousel4236);
            iv_ruleCarousel=ruleCarousel();

            state._fsp--;

             current =iv_ruleCarousel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarousel4246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarousel"


    // $ANTLR start "ruleCarousel"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1889:1: ruleCarousel returns [EObject current=null] : ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCarousel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_carouselPages_14_0 = null;

        EObject lv_carouselPages_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1892:28: ( ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1893:1: ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1893:1: ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1893:2: () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1893:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1894:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarouselAccess().getCarouselAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCarousel4292); 

                	newLeafNode(otherlv_1, grammarAccess.getCarouselAccess().getCarouselKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1903:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1904:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1904:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1905:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarouselAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4313);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCarouselRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarousel4325); 

                	newLeafNode(otherlv_3, grammarAccess.getCarouselAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1925:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1925:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarousel4338); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarouselAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1929:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1930:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1930:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1931:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCarousel4359);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1947:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1947:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarousel4374); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarouselAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1951:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1952:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1952:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1953:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4395);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1969:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1969:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCarousel4410); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarouselAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1973:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1974:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1974:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1975:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4431);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1991:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1991:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCarousel4446); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarouselAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1995:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1996:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1996:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1997:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4467);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2013:4: (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2013:6: otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCarousel4482); 

                        	newLeafNode(otherlv_12, grammarAccess.getCarouselAccess().getCarouselPagesKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarousel4494); 

                        	newLeafNode(otherlv_13, grammarAccess.getCarouselAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2021:1: ( (lv_carouselPages_14_0= ruleCarouselElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2022:1: (lv_carouselPages_14_0= ruleCarouselElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2022:1: (lv_carouselPages_14_0= ruleCarouselElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2023:3: lv_carouselPages_14_0= ruleCarouselElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getCarouselPagesCarouselElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_ruleCarousel4515);
                    lv_carouselPages_14_0=ruleCarouselElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	        }
                           		add(
                           			current, 
                           			"carouselPages",
                            		lv_carouselPages_14_0, 
                            		"CarouselElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2039:2: (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==19) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2039:4: otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCarousel4528); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCarouselAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2043:1: ( (lv_carouselPages_16_0= ruleCarouselElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2044:1: (lv_carouselPages_16_0= ruleCarouselElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2044:1: (lv_carouselPages_16_0= ruleCarouselElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2045:3: lv_carouselPages_16_0= ruleCarouselElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarouselAccess().getCarouselPagesCarouselElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_ruleCarousel4549);
                    	    lv_carouselPages_16_0=ruleCarouselElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarouselRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"carouselPages",
                    	            		lv_carouselPages_16_0, 
                    	            		"CarouselElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarousel4563); 

                        	newLeafNode(otherlv_17, grammarAccess.getCarouselAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarousel4577); 

                	newLeafNode(otherlv_18, grammarAccess.getCarouselAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarousel"


    // $ANTLR start "entryRuleImage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2077:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2078:2: (iv_ruleImage= ruleImage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2079:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImage_in_entryRuleImage4613);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImage4623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2086:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        AntlrDatatypeRuleToken lv_src_13_0 = null;

        AntlrDatatypeRuleToken lv_borderRadius_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2089:28: ( ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2090:1: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2090:1: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2090:2: () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2090:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2091:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageAccess().getImageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleImage4669); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2100:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2101:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2101:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2102:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4690);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImage4702); 

                	newLeafNode(otherlv_3, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2122:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2122:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleImage4715); 

                        	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2126:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2127:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2127:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2128:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleImage4736);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2144:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2144:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleImage4751); 

                        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2148:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2149:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2149:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2150:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4772);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2166:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2166:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleImage4787); 

                        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2170:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2171:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2171:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2172:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4808);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2188:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2188:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleImage4823); 

                        	newLeafNode(otherlv_10, grammarAccess.getImageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2192:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2193:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2193:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2194:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4844);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2210:4: (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2210:6: otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleImage4859); 

                        	newLeafNode(otherlv_12, grammarAccess.getImageAccess().getSrcKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2214:1: ( (lv_src_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2215:1: (lv_src_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2215:1: (lv_src_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2216:3: lv_src_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getSrcEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4880);
                    lv_src_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"src",
                            		lv_src_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2232:4: (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2232:6: otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleImage4895); 

                        	newLeafNode(otherlv_14, grammarAccess.getImageAccess().getBorderRadiusKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2236:1: ( (lv_borderRadius_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2237:1: (lv_borderRadius_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2237:1: (lv_borderRadius_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2238:3: lv_borderRadius_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBorderRadiusEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4916);
                    lv_borderRadius_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"borderRadius",
                            		lv_borderRadius_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleImage4930); 

                	newLeafNode(otherlv_16, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCard"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2266:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2267:2: (iv_ruleCard= ruleCard EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2268:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCard_in_entryRuleCard4966);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCard4976); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2275:1: ruleCard returns [EObject current=null] : ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_pages_14_0 = null;

        EObject lv_pages_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2278:28: ( ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2279:1: ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2279:1: ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2279:2: () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2279:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCardAccess().getCardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCard5022); 

                	newLeafNode(otherlv_1, grammarAccess.getCardAccess().getCardKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2289:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2290:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2290:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2291:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5043);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCard5055); 

                	newLeafNode(otherlv_3, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2311:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==22) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2311:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCard5068); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2315:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2316:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2316:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2317:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCard5089);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2333:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==23) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2333:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCard5104); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2337:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2338:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2338:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2339:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5125);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2355:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2355:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCard5140); 

                        	newLeafNode(otherlv_8, grammarAccess.getCardAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2359:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2360:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2360:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2361:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5161);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2377:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2377:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCard5176); 

                        	newLeafNode(otherlv_10, grammarAccess.getCardAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2381:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2382:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2382:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2383:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5197);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2399:4: (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==41) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2399:6: otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCard5212); 

                        	newLeafNode(otherlv_12, grammarAccess.getCardAccess().getPagesKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCard5224); 

                        	newLeafNode(otherlv_13, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2407:1: ( (lv_pages_14_0= ruleCardElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2408:1: (lv_pages_14_0= ruleCardElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2408:1: (lv_pages_14_0= ruleCardElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2409:3: lv_pages_14_0= ruleCardElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getPagesCardElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_ruleCard5245);
                    lv_pages_14_0=ruleCardElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	        }
                           		add(
                           			current, 
                           			"pages",
                            		lv_pages_14_0, 
                            		"CardElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2425:2: (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==19) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2425:4: otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCard5258); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCardAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2429:1: ( (lv_pages_16_0= ruleCardElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2430:1: (lv_pages_16_0= ruleCardElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2430:1: (lv_pages_16_0= ruleCardElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2431:3: lv_pages_16_0= ruleCardElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCardAccess().getPagesCardElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_ruleCard5279);
                    	    lv_pages_16_0=ruleCardElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCardRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pages",
                    	            		lv_pages_16_0, 
                    	            		"CardElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCard5293); 

                        	newLeafNode(otherlv_17, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCard5307); 

                	newLeafNode(otherlv_18, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleAnchor"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2463:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2464:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2465:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_entryRuleAnchor5343);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnchor5353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2472:1: ruleAnchor returns [EObject current=null] : ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        AntlrDatatypeRuleToken lv_title_13_0 = null;

        AntlrDatatypeRuleToken lv_link_15_0 = null;

        Enumerator lv_type_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2475:28: ( ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2476:1: ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2476:1: ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2476:2: () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2476:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2477:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnchorAccess().getAnchorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnchor5399); 

                	newLeafNode(otherlv_1, grammarAccess.getAnchorAccess().getAnchorKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2486:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2487:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2487:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2488:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5420);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnchorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnchor5432); 

                	newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2508:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==22) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2508:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnchor5445); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnchorAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2512:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2513:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2513:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2514:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAnchor5466);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2530:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==23) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2530:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnchor5481); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnchorAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2534:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2535:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2535:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2536:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5502);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2552:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==24) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2552:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnchor5517); 

                        	newLeafNode(otherlv_8, grammarAccess.getAnchorAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2556:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2557:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2557:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2558:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5538);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2574:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2574:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnchor5553); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnchorAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2578:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2579:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2579:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2580:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5574);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2596:4: (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==16) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2596:6: otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnchor5589); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnchorAccess().getTitleKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2600:1: ( (lv_title_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2601:1: (lv_title_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2601:1: (lv_title_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2602:3: lv_title_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getTitleEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5610);
                    lv_title_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2618:4: (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==43) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2618:6: otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAnchor5625); 

                        	newLeafNode(otherlv_14, grammarAccess.getAnchorAccess().getLinkKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2622:1: ( (lv_link_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2623:1: (lv_link_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2623:1: (lv_link_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2624:3: lv_link_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getLinkEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5646);
                    lv_link_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"link",
                            		lv_link_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2640:4: (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==32) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2640:6: otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) )
                    {
                    otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnchor5661); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnchorAccess().getTypeKeyword_10_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2644:1: ( (lv_type_17_0= ruleAnchorType ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2645:1: (lv_type_17_0= ruleAnchorType )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2645:1: (lv_type_17_0= ruleAnchorType )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2646:3: lv_type_17_0= ruleAnchorType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getTypeAnchorTypeEnumRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnchorType_in_ruleAnchor5682);
                    lv_type_17_0=ruleAnchorType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnchorRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_17_0, 
                            		"AnchorType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnchor5696); 

                	newLeafNode(otherlv_18, grammarAccess.getAnchorAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleDivision"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2674:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2675:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2676:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivision_in_entryRuleDivision5732);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivision5742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2683:1: ruleDivision returns [EObject current=null] : ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2686:28: ( ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2687:1: ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2687:1: ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2687:2: () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2687:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDivisionAccess().getDivisionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDivision5788); 

                	newLeafNode(otherlv_1, grammarAccess.getDivisionAccess().getDivisionKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2697:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2698:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2698:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2699:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDivisionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5809);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDivision5821); 

                	newLeafNode(otherlv_3, grammarAccess.getDivisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2719:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==22) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2719:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDivision5834); 

                        	newLeafNode(otherlv_4, grammarAccess.getDivisionAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2723:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2724:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2724:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2725:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDivision5855);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2741:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==23) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2741:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDivision5870); 

                        	newLeafNode(otherlv_6, grammarAccess.getDivisionAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2745:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2746:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2746:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2747:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5891);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2763:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==24) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2763:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDivision5906); 

                        	newLeafNode(otherlv_8, grammarAccess.getDivisionAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2767:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2768:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2768:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2769:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5927);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2785:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==25) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2785:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDivision5942); 

                        	newLeafNode(otherlv_10, grammarAccess.getDivisionAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2789:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2790:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2790:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2791:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5963);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2807:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==26) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2807:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDivision5978); 

                        	newLeafNode(otherlv_12, grammarAccess.getDivisionAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDivision5990); 

                        	newLeafNode(otherlv_13, grammarAccess.getDivisionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2815:1: ( (lv_elements_14_0= ruleDivisionElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2816:1: (lv_elements_14_0= ruleDivisionElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2816:1: (lv_elements_14_0= ruleDivisionElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2817:3: lv_elements_14_0= ruleDivisionElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getElementsDivisionElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_ruleDivision6011);
                    lv_elements_14_0=ruleDivisionElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_14_0, 
                            		"DivisionElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2833:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==19) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2833:4: otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDivision6024); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDivisionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2837:1: ( (lv_elements_16_0= ruleDivisionElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2838:1: (lv_elements_16_0= ruleDivisionElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2838:1: (lv_elements_16_0= ruleDivisionElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2839:3: lv_elements_16_0= ruleDivisionElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDivisionAccess().getElementsDivisionElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_ruleDivision6045);
                    	    lv_elements_16_0=ruleDivisionElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_16_0, 
                    	            		"DivisionElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDivision6059); 

                        	newLeafNode(otherlv_17, grammarAccess.getDivisionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDivision6073); 

                	newLeafNode(otherlv_18, grammarAccess.getDivisionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleMap"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2871:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2872:2: (iv_ruleMap= ruleMap EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2873:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMap_in_entryRuleMap6109);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMap6119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2880:1: ruleMap returns [EObject current=null] : ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        AntlrDatatypeRuleToken lv_x_13_0 = null;

        AntlrDatatypeRuleToken lv_y_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2883:28: ( ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2884:1: ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2884:1: ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2884:2: () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2884:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2885:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMapAccess().getMapAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMap6165); 

                	newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2894:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2895:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2895:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2896:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMapAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6186);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMap6198); 

                	newLeafNode(otherlv_3, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2916:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==22) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2916:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMap6211); 

                        	newLeafNode(otherlv_4, grammarAccess.getMapAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2920:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2921:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2921:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2922:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMap6232);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2938:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==23) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2938:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMap6247); 

                        	newLeafNode(otherlv_6, grammarAccess.getMapAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2942:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2943:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2943:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2944:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6268);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2960:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==24) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2960:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMap6283); 

                        	newLeafNode(otherlv_8, grammarAccess.getMapAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2964:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2965:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2965:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2966:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6304);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2982:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==25) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2982:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMap6319); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2986:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2987:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2987:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2988:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6340);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3004:4: (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==46) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3004:6: otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMap6355); 

                        	newLeafNode(otherlv_12, grammarAccess.getMapAccess().getXKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3008:1: ( (lv_x_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3009:1: (lv_x_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3009:1: (lv_x_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3010:3: lv_x_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getXEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6376);
                    lv_x_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"x",
                            		lv_x_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3026:4: (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==47) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3026:6: otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMap6391); 

                        	newLeafNode(otherlv_14, grammarAccess.getMapAccess().getYKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3030:1: ( (lv_y_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3031:1: (lv_y_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3031:1: (lv_y_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3032:3: lv_y_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getYEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6412);
                    lv_y_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"y",
                            		lv_y_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMap6426); 

                	newLeafNode(otherlv_16, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleCarouselPage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3060:1: entryRuleCarouselPage returns [EObject current=null] : iv_ruleCarouselPage= ruleCarouselPage EOF ;
    public final EObject entryRuleCarouselPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselPage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3061:2: (iv_ruleCarouselPage= ruleCarouselPage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3062:2: iv_ruleCarouselPage= ruleCarouselPage EOF
            {
             newCompositeNode(grammarAccess.getCarouselPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPage_in_entryRuleCarouselPage6462);
            iv_ruleCarouselPage=ruleCarouselPage();

            state._fsp--;

             current =iv_ruleCarouselPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselPage6472); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarouselPage"


    // $ANTLR start "ruleCarouselPage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3069:1: ruleCarouselPage returns [EObject current=null] : ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCarouselPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3072:28: ( ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3073:1: ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3073:1: ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3073:2: () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3073:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3074:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarouselPageAccess().getCarouselPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleCarouselPage6518); 

                	newLeafNode(otherlv_1, grammarAccess.getCarouselPageAccess().getCarouselPageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3083:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3084:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3084:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3085:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarouselPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6539);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarouselPage6551); 

                	newLeafNode(otherlv_3, grammarAccess.getCarouselPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3105:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==22) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3105:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarouselPage6564); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarouselPageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3109:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3110:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3110:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3111:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCarouselPage6585);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3127:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==23) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3127:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarouselPage6600); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarouselPageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3131:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3132:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3132:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3133:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6621);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3149:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==24) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3149:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCarouselPage6636); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarouselPageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3153:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3154:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3154:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3155:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6657);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3171:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==25) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3171:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCarouselPage6672); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarouselPageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3175:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3176:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3176:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3177:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6693);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3193:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==26) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3193:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCarouselPage6708); 

                        	newLeafNode(otherlv_12, grammarAccess.getCarouselPageAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarouselPage6720); 

                        	newLeafNode(otherlv_13, grammarAccess.getCarouselPageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3201:1: ( (lv_elements_14_0= ruleCarouselPageElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3202:1: (lv_elements_14_0= ruleCarouselPageElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3202:1: (lv_elements_14_0= ruleCarouselPageElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3203:3: lv_elements_14_0= ruleCarouselPageElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getElementsCarouselPageElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6741);
                    lv_elements_14_0=ruleCarouselPageElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_14_0, 
                            		"CarouselPageElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3219:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==19) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3219:4: otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCarouselPage6754); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCarouselPageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3223:1: ( (lv_elements_16_0= ruleCarouselPageElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3224:1: (lv_elements_16_0= ruleCarouselPageElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3224:1: (lv_elements_16_0= ruleCarouselPageElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3225:3: lv_elements_16_0= ruleCarouselPageElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getElementsCarouselPageElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6775);
                    	    lv_elements_16_0=ruleCarouselPageElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarouselPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_16_0, 
                    	            		"CarouselPageElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarouselPage6789); 

                        	newLeafNode(otherlv_17, grammarAccess.getCarouselPageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarouselPage6803); 

                	newLeafNode(otherlv_18, grammarAccess.getCarouselPageAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarouselPage"


    // $ANTLR start "entryRuleCardPage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3257:1: entryRuleCardPage returns [EObject current=null] : iv_ruleCardPage= ruleCardPage EOF ;
    public final EObject entryRuleCardPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardPage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3258:2: (iv_ruleCardPage= ruleCardPage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3259:2: iv_ruleCardPage= ruleCardPage EOF
            {
             newCompositeNode(grammarAccess.getCardPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardPage_in_entryRuleCardPage6839);
            iv_ruleCardPage=ruleCardPage();

            state._fsp--;

             current =iv_ruleCardPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardPage6849); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardPage"


    // $ANTLR start "ruleCardPage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3266:1: ruleCardPage returns [EObject current=null] : ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCardPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3269:28: ( ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3270:1: ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3270:1: ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3270:2: () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3270:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3271:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCardPageAccess().getCardPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCardPage6895); 

                	newLeafNode(otherlv_1, grammarAccess.getCardPageAccess().getCardPageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3280:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3281:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3281:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3282:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6916);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCardPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCardPage6928); 

                	newLeafNode(otherlv_3, grammarAccess.getCardPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3302:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==22) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3302:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCardPage6941); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardPageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3306:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3307:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3307:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3308:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCardPage6962);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3324:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==23) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3324:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCardPage6977); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardPageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3328:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3329:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3329:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3330:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6998);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3346:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==24) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3346:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCardPage7013); 

                        	newLeafNode(otherlv_8, grammarAccess.getCardPageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3350:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3351:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3351:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3352:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage7034);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3368:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==25) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3368:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCardPage7049); 

                        	newLeafNode(otherlv_10, grammarAccess.getCardPageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3372:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3373:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3373:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3374:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage7070);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3390:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==26) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3390:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCardPage7085); 

                        	newLeafNode(otherlv_12, grammarAccess.getCardPageAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCardPage7097); 

                        	newLeafNode(otherlv_13, grammarAccess.getCardPageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3398:1: ( (lv_elements_14_0= ruleCardPageElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3399:1: (lv_elements_14_0= ruleCardPageElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3399:1: (lv_elements_14_0= ruleCardPageElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3400:3: lv_elements_14_0= ruleCardPageElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getElementsCardPageElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_ruleCardPage7118);
                    lv_elements_14_0=ruleCardPageElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_14_0, 
                            		"CardPageElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3416:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==19) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3416:4: otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCardPage7131); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCardPageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3420:1: ( (lv_elements_16_0= ruleCardPageElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3421:1: (lv_elements_16_0= ruleCardPageElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3421:1: (lv_elements_16_0= ruleCardPageElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3422:3: lv_elements_16_0= ruleCardPageElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCardPageAccess().getElementsCardPageElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_ruleCardPage7152);
                    	    lv_elements_16_0=ruleCardPageElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCardPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_16_0, 
                    	            		"CardPageElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCardPage7166); 

                        	newLeafNode(otherlv_17, grammarAccess.getCardPageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCardPage7180); 

                	newLeafNode(otherlv_18, grammarAccess.getCardPageAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardPage"


    // $ANTLR start "entryRuleMenuItem"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3454:1: entryRuleMenuItem returns [EObject current=null] : iv_ruleMenuItem= ruleMenuItem EOF ;
    public final EObject entryRuleMenuItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuItem = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3455:2: (iv_ruleMenuItem= ruleMenuItem EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3456:2: iv_ruleMenuItem= ruleMenuItem EOF
            {
             newCompositeNode(grammarAccess.getMenuItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenuItem_in_entryRuleMenuItem7216);
            iv_ruleMenuItem=ruleMenuItem();

            state._fsp--;

             current =iv_ruleMenuItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenuItem7226); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenuItem"


    // $ANTLR start "ruleMenuItem"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3463:1: ruleMenuItem returns [EObject current=null] : ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleMenuItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_colSpan_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_backgroundColor_9_0 = null;

        AntlrDatatypeRuleToken lv_backgroundImage_11_0 = null;

        AntlrDatatypeRuleToken lv_title_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3466:28: ( ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3467:1: ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3467:1: ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3467:2: () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3467:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuItemAccess().getMenuItemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMenuItem7272); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuItemAccess().getMenuItemKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3477:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3478:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3478:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3479:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuItemAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7293);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenuItem7305); 

                	newLeafNode(otherlv_3, grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3499:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==22) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3499:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMenuItem7318); 

                        	newLeafNode(otherlv_4, grammarAccess.getMenuItemAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3503:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3504:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3504:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3505:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMenuItem7339);
                    lv_colSpan_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
                    	        }
                           		set(
                           			current, 
                           			"colSpan",
                            		lv_colSpan_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3521:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==23) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3521:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMenuItem7354); 

                        	newLeafNode(otherlv_6, grammarAccess.getMenuItemAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3525:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3526:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3526:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3527:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7375);
                    lv_color_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
                    	        }
                           		set(
                           			current, 
                           			"color",
                            		lv_color_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3543:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==24) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3543:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMenuItem7390); 

                        	newLeafNode(otherlv_8, grammarAccess.getMenuItemAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3547:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3548:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3548:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3549:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7411);
                    lv_backgroundColor_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundColor",
                            		lv_backgroundColor_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3565:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==25) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3565:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMenuItem7426); 

                        	newLeafNode(otherlv_10, grammarAccess.getMenuItemAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3569:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3570:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3570:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3571:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7447);
                    lv_backgroundImage_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
                    	        }
                           		set(
                           			current, 
                           			"backgroundImage",
                            		lv_backgroundImage_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3587:4: (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==16) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3587:6: otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMenuItem7462); 

                        	newLeafNode(otherlv_12, grammarAccess.getMenuItemAccess().getTitleKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3591:1: ( (lv_title_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3592:1: (lv_title_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3592:1: (lv_title_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3593:3: lv_title_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getTitleEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7483);
                    lv_title_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuItemRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3609:4: (otherlv_14= 'section' ( ( ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==51) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3609:6: otherlv_14= 'section' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMenuItem7498); 

                        	newLeafNode(otherlv_14, grammarAccess.getMenuItemAccess().getSectionKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3613:1: ( ( ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3614:1: ( ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3614:1: ( ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3615:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMenuItemRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getSectionSectionCrossReference_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7521);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMenuItem7535); 

                	newLeafNode(otherlv_16, grammarAccess.getMenuItemAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenuItem"


    // $ANTLR start "ruleHeaderType"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3640:1: ruleHeaderType returns [Enumerator current=null] : ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) ) ;
    public final Enumerator ruleHeaderType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3642:28: ( ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:1: ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:1: ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) )
            int alt99=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt99=1;
                }
                break;
            case 53:
                {
                alt99=2;
                }
                break;
            case 54:
                {
                alt99=3;
                }
                break;
            case 55:
                {
                alt99=4;
                }
                break;
            case 56:
                {
                alt99=5;
                }
                break;
            case 57:
                {
                alt99=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:2: (enumLiteral_0= 'H1' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:2: (enumLiteral_0= 'H1' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:4: enumLiteral_0= 'H1'
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleHeaderType7585); 

                            current = grammarAccess.getHeaderTypeAccess().getH1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHeaderTypeAccess().getH1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:6: (enumLiteral_1= 'H2' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:6: (enumLiteral_1= 'H2' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:8: enumLiteral_1= 'H2'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleHeaderType7602); 

                            current = grammarAccess.getHeaderTypeAccess().getH2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHeaderTypeAccess().getH2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:6: (enumLiteral_2= 'H3' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:6: (enumLiteral_2= 'H3' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:8: enumLiteral_2= 'H3'
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleHeaderType7619); 

                            current = grammarAccess.getHeaderTypeAccess().getH3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHeaderTypeAccess().getH3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:6: (enumLiteral_3= 'H4' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:6: (enumLiteral_3= 'H4' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:8: enumLiteral_3= 'H4'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleHeaderType7636); 

                            current = grammarAccess.getHeaderTypeAccess().getH4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHeaderTypeAccess().getH4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3667:6: (enumLiteral_4= 'H5' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3667:6: (enumLiteral_4= 'H5' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3667:8: enumLiteral_4= 'H5'
                    {
                    enumLiteral_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleHeaderType7653); 

                            current = grammarAccess.getHeaderTypeAccess().getH5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getHeaderTypeAccess().getH5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3673:6: (enumLiteral_5= 'H6' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3673:6: (enumLiteral_5= 'H6' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3673:8: enumLiteral_5= 'H6'
                    {
                    enumLiteral_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleHeaderType7670); 

                            current = grammarAccess.getHeaderTypeAccess().getH6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getHeaderTypeAccess().getH6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderType"


    // $ANTLR start "ruleAnchorType"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3683:1: ruleAnchorType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) ) ;
    public final Enumerator ruleAnchorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3685:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3686:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3686:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) )
            int alt100=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt100=1;
                }
                break;
            case 59:
                {
                alt100=2;
                }
                break;
            case 60:
                {
                alt100=3;
                }
                break;
            case 61:
                {
                alt100=4;
                }
                break;
            case 62:
                {
                alt100=5;
                }
                break;
            case 63:
                {
                alt100=6;
                }
                break;
            case 64:
                {
                alt100=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3686:2: (enumLiteral_0= 'default' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3686:2: (enumLiteral_0= 'default' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3686:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAnchorType7715); 

                            current = grammarAccess.getAnchorTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3692:6: (enumLiteral_1= 'btn_default' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3692:6: (enumLiteral_1= 'btn_default' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3692:8: enumLiteral_1= 'btn_default'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAnchorType7732); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_defaultEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnchorTypeAccess().getBtn_defaultEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3698:6: (enumLiteral_2= 'btn_primary' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3698:6: (enumLiteral_2= 'btn_primary' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3698:8: enumLiteral_2= 'btn_primary'
                    {
                    enumLiteral_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleAnchorType7749); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_primaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnchorTypeAccess().getBtn_primaryEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3704:6: (enumLiteral_3= 'btn_success' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3704:6: (enumLiteral_3= 'btn_success' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3704:8: enumLiteral_3= 'btn_success'
                    {
                    enumLiteral_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAnchorType7766); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_successEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnchorTypeAccess().getBtn_successEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3710:6: (enumLiteral_4= 'btn_info' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3710:6: (enumLiteral_4= 'btn_info' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3710:8: enumLiteral_4= 'btn_info'
                    {
                    enumLiteral_4=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAnchorType7783); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_infoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnchorTypeAccess().getBtn_infoEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3716:6: (enumLiteral_5= 'btn_warning' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3716:6: (enumLiteral_5= 'btn_warning' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3716:8: enumLiteral_5= 'btn_warning'
                    {
                    enumLiteral_5=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleAnchorType7800); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_warningEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnchorTypeAccess().getBtn_warningEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3722:6: (enumLiteral_6= 'btn_danger' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3722:6: (enumLiteral_6= 'btn_danger' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3722:8: enumLiteral_6= 'btn_danger'
                    {
                    enumLiteral_6=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAnchorType7817); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_dangerEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAnchorTypeAccess().getBtn_dangerEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchorType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rulePage_in_ruleModel177 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSectionElement_in_entryRuleSectionElement227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSectionElement237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleSectionElement284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleSectionElement311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleSectionElement338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleSectionElement365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleSectionElement392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleSectionElement419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleSectionElement446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleSectionElement473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleSectionElement500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuElement_in_entryRuleMenuElement535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenuElement545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleMenuElement592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleMenuElement619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuItem_in_ruleMenuElement646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRowElement_in_entryRuleRowElement681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRowElement691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleRowElement738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleRowElement765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleRowElement792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleRowElement819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleRowElement846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleRowElement873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleRowElement900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleRowElement927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleRowElement954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_entryRuleCarouselElement989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselElement999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPage_in_ruleCarouselElement1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardElement_in_entryRuleCardElement1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardElement1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPage_in_ruleCardElement1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_entryRuleDivisionElement1169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivisionElement1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleDivisionElement1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleDivisionElement1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleDivisionElement1280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleDivisionElement1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleDivisionElement1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleDivisionElement1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleDivisionElement1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleDivisionElement1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleDivisionElement1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_entryRuleCarouselPageElement1477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselPageElement1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleCarouselPageElement1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleCarouselPageElement1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleCarouselPageElement1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleCarouselPageElement1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleCarouselPageElement1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_entryRuleCardPageElement1677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardPageElement1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleCardPageElement1734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleCardPageElement1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleCardPageElement1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleCardPageElement1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleCardPageElement1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage1877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePage1933 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePage1945 = new BitSet(new long[]{0x0000000000174000L});
        public static final BitSet FOLLOW_16_in_rulePage1958 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePage1979 = new BitSet(new long[]{0x0000000000164000L});
        public static final BitSet FOLLOW_17_in_rulePage1994 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePage2017 = new BitSet(new long[]{0x0000000000144000L});
        public static final BitSet FOLLOW_18_in_rulePage2032 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePage2044 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleSection_in_rulePage2065 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_rulePage2078 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleSection_in_rulePage2099 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_rulePage2113 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_rulePage2128 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleMenu_in_rulePage2149 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePage2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSection_in_entryRuleSection2322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSection2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSection2378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2399 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSection2411 = new BitSet(new long[]{0x0000000007C04000L});
        public static final BitSet FOLLOW_22_in_ruleSection2424 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSection2445 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_23_in_ruleSection2460 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2481 = new BitSet(new long[]{0x0000000007004000L});
        public static final BitSet FOLLOW_24_in_ruleSection2496 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2517 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_25_in_ruleSection2532 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2553 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleSection2568 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSection2580 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleSectionElement_in_ruleSection2601 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleSection2614 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleSectionElement_in_ruleSection2635 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleSection2649 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSection2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu2699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenu2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleMenu2755 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2776 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu2788 = new BitSet(new long[]{0x0000000013C04000L});
        public static final BitSet FOLLOW_22_in_ruleMenu2801 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMenu2822 = new BitSet(new long[]{0x0000000013804000L});
        public static final BitSet FOLLOW_23_in_ruleMenu2837 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2858 = new BitSet(new long[]{0x0000000013004000L});
        public static final BitSet FOLLOW_24_in_ruleMenu2873 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2894 = new BitSet(new long[]{0x0000000012004000L});
        public static final BitSet FOLLOW_25_in_ruleMenu2909 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2930 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleMenu2945 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu2957 = new BitSet(new long[]{0x0004002080000000L});
        public static final BitSet FOLLOW_ruleMenuElement_in_ruleMenu2978 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleMenu2991 = new BitSet(new long[]{0x0004002080000000L});
        public static final BitSet FOLLOW_ruleMenuElement_in_ruleMenu3012 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleMenu3026 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMenu3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEInt3127 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_entryRuleRow3189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRow3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRow3245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3266 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRow3278 = new BitSet(new long[]{0x0000000007C04000L});
        public static final BitSet FOLLOW_22_in_ruleRow3291 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRow3312 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_23_in_ruleRow3327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3348 = new BitSet(new long[]{0x0000000007004000L});
        public static final BitSet FOLLOW_24_in_ruleRow3363 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3384 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_25_in_ruleRow3399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3420 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleRow3435 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRow3447 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleRowElement_in_ruleRow3468 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleRow3481 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleRowElement_in_ruleRow3502 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleRow3516 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRow3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader3566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeader3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleHeader3622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3643 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHeader3655 = new BitSet(new long[]{0x0000000303C04000L});
        public static final BitSet FOLLOW_22_in_ruleHeader3668 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHeader3689 = new BitSet(new long[]{0x0000000303804000L});
        public static final BitSet FOLLOW_23_in_ruleHeader3704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3725 = new BitSet(new long[]{0x0000000303004000L});
        public static final BitSet FOLLOW_24_in_ruleHeader3740 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3761 = new BitSet(new long[]{0x0000000302004000L});
        public static final BitSet FOLLOW_25_in_ruleHeader3776 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3797 = new BitSet(new long[]{0x0000000300004000L});
        public static final BitSet FOLLOW_32_in_ruleHeader3812 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleHeaderType_in_ruleHeader3833 = new BitSet(new long[]{0x0000000200004000L});
        public static final BitSet FOLLOW_33_in_ruleHeader3848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3869 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleHeader3883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_entryRuleParagraf3919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParagraf3929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleParagraf3975 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf3996 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParagraf4008 = new BitSet(new long[]{0x0000000203C04000L});
        public static final BitSet FOLLOW_22_in_ruleParagraf4021 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParagraf4042 = new BitSet(new long[]{0x0000000203804000L});
        public static final BitSet FOLLOW_23_in_ruleParagraf4057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf4078 = new BitSet(new long[]{0x0000000203004000L});
        public static final BitSet FOLLOW_24_in_ruleParagraf4093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf4114 = new BitSet(new long[]{0x0000000202004000L});
        public static final BitSet FOLLOW_25_in_ruleParagraf4129 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf4150 = new BitSet(new long[]{0x0000000200004000L});
        public static final BitSet FOLLOW_33_in_ruleParagraf4165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf4186 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleParagraf4200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_entryRuleCarousel4236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarousel4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCarousel4292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4313 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarousel4325 = new BitSet(new long[]{0x0000001003C04000L});
        public static final BitSet FOLLOW_22_in_ruleCarousel4338 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCarousel4359 = new BitSet(new long[]{0x0000001003804000L});
        public static final BitSet FOLLOW_23_in_ruleCarousel4374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4395 = new BitSet(new long[]{0x0000001003004000L});
        public static final BitSet FOLLOW_24_in_ruleCarousel4410 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4431 = new BitSet(new long[]{0x0000001002004000L});
        public static final BitSet FOLLOW_25_in_ruleCarousel4446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4467 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_36_in_ruleCarousel4482 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarousel4494 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_ruleCarousel4515 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleCarousel4528 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_ruleCarousel4549 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleCarousel4563 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCarousel4577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_entryRuleImage4613 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImage4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleImage4669 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4690 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImage4702 = new BitSet(new long[]{0x000000C003C04000L});
        public static final BitSet FOLLOW_22_in_ruleImage4715 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleImage4736 = new BitSet(new long[]{0x000000C003804000L});
        public static final BitSet FOLLOW_23_in_ruleImage4751 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4772 = new BitSet(new long[]{0x000000C003004000L});
        public static final BitSet FOLLOW_24_in_ruleImage4787 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4808 = new BitSet(new long[]{0x000000C002004000L});
        public static final BitSet FOLLOW_25_in_ruleImage4823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4844 = new BitSet(new long[]{0x000000C000004000L});
        public static final BitSet FOLLOW_38_in_ruleImage4859 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4880 = new BitSet(new long[]{0x0000008000004000L});
        public static final BitSet FOLLOW_39_in_ruleImage4895 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4916 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleImage4930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_entryRuleCard4966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCard4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCard5022 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5043 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCard5055 = new BitSet(new long[]{0x0000020003C04000L});
        public static final BitSet FOLLOW_22_in_ruleCard5068 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCard5089 = new BitSet(new long[]{0x0000020003804000L});
        public static final BitSet FOLLOW_23_in_ruleCard5104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5125 = new BitSet(new long[]{0x0000020003004000L});
        public static final BitSet FOLLOW_24_in_ruleCard5140 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5161 = new BitSet(new long[]{0x0000020002004000L});
        public static final BitSet FOLLOW_25_in_ruleCard5176 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5197 = new BitSet(new long[]{0x0000020000004000L});
        public static final BitSet FOLLOW_41_in_ruleCard5212 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCard5224 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleCardElement_in_ruleCard5245 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleCard5258 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_ruleCardElement_in_ruleCard5279 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleCard5293 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCard5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor5343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnchor5353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnchor5399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5420 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnchor5432 = new BitSet(new long[]{0x0000080103C14000L});
        public static final BitSet FOLLOW_22_in_ruleAnchor5445 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAnchor5466 = new BitSet(new long[]{0x0000080103814000L});
        public static final BitSet FOLLOW_23_in_ruleAnchor5481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5502 = new BitSet(new long[]{0x0000080103014000L});
        public static final BitSet FOLLOW_24_in_ruleAnchor5517 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5538 = new BitSet(new long[]{0x0000080102014000L});
        public static final BitSet FOLLOW_25_in_ruleAnchor5553 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5574 = new BitSet(new long[]{0x0000080100014000L});
        public static final BitSet FOLLOW_16_in_ruleAnchor5589 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5610 = new BitSet(new long[]{0x0000080100004000L});
        public static final BitSet FOLLOW_43_in_ruleAnchor5625 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5646 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_32_in_ruleAnchor5661 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAnchorType_in_ruleAnchor5682 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnchor5696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision5732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivision5742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDivision5788 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5809 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDivision5821 = new BitSet(new long[]{0x0000000007C04000L});
        public static final BitSet FOLLOW_22_in_ruleDivision5834 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDivision5855 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_23_in_ruleDivision5870 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5891 = new BitSet(new long[]{0x0000000007004000L});
        public static final BitSet FOLLOW_24_in_ruleDivision5906 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5927 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_25_in_ruleDivision5942 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5963 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleDivision5978 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDivision5990 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_ruleDivision6011 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleDivision6024 = new BitSet(new long[]{0x0000352CC0000000L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_ruleDivision6045 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleDivision6059 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDivision6073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_entryRuleMap6109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMap6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMap6165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6186 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMap6198 = new BitSet(new long[]{0x0000C00003C04000L});
        public static final BitSet FOLLOW_22_in_ruleMap6211 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMap6232 = new BitSet(new long[]{0x0000C00003804000L});
        public static final BitSet FOLLOW_23_in_ruleMap6247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6268 = new BitSet(new long[]{0x0000C00003004000L});
        public static final BitSet FOLLOW_24_in_ruleMap6283 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6304 = new BitSet(new long[]{0x0000C00002004000L});
        public static final BitSet FOLLOW_25_in_ruleMap6319 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6340 = new BitSet(new long[]{0x0000C00000004000L});
        public static final BitSet FOLLOW_46_in_ruleMap6355 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6376 = new BitSet(new long[]{0x0000800000004000L});
        public static final BitSet FOLLOW_47_in_ruleMap6391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6412 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMap6426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPage_in_entryRuleCarouselPage6462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselPage6472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleCarouselPage6518 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6539 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarouselPage6551 = new BitSet(new long[]{0x0000000007C04000L});
        public static final BitSet FOLLOW_22_in_ruleCarouselPage6564 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCarouselPage6585 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_23_in_ruleCarouselPage6600 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6621 = new BitSet(new long[]{0x0000000007004000L});
        public static final BitSet FOLLOW_24_in_ruleCarouselPage6636 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6657 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_25_in_ruleCarouselPage6672 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6693 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleCarouselPage6708 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarouselPage6720 = new BitSet(new long[]{0x0000142480000000L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6741 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleCarouselPage6754 = new BitSet(new long[]{0x0000142480000000L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6775 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleCarouselPage6789 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCarouselPage6803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPage_in_entryRuleCardPage6839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardPage6849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCardPage6895 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6916 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCardPage6928 = new BitSet(new long[]{0x0000000007C04000L});
        public static final BitSet FOLLOW_22_in_ruleCardPage6941 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCardPage6962 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_23_in_ruleCardPage6977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6998 = new BitSet(new long[]{0x0000000007004000L});
        public static final BitSet FOLLOW_24_in_ruleCardPage7013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage7034 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_25_in_ruleCardPage7049 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage7070 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_ruleCardPage7085 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCardPage7097 = new BitSet(new long[]{0x0000142480000000L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_ruleCardPage7118 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleCardPage7131 = new BitSet(new long[]{0x0000142480000000L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_ruleCardPage7152 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleCardPage7166 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCardPage7180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuItem_in_entryRuleMenuItem7216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenuItem7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMenuItem7272 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7293 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenuItem7305 = new BitSet(new long[]{0x0008000003C14000L});
        public static final BitSet FOLLOW_22_in_ruleMenuItem7318 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMenuItem7339 = new BitSet(new long[]{0x0008000003814000L});
        public static final BitSet FOLLOW_23_in_ruleMenuItem7354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7375 = new BitSet(new long[]{0x0008000003014000L});
        public static final BitSet FOLLOW_24_in_ruleMenuItem7390 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7411 = new BitSet(new long[]{0x0008000002014000L});
        public static final BitSet FOLLOW_25_in_ruleMenuItem7426 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7447 = new BitSet(new long[]{0x0008000000014000L});
        public static final BitSet FOLLOW_16_in_ruleMenuItem7462 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7483 = new BitSet(new long[]{0x0008000000004000L});
        public static final BitSet FOLLOW_51_in_ruleMenuItem7498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7521 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMenuItem7535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleHeaderType7585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleHeaderType7602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleHeaderType7619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleHeaderType7636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleHeaderType7653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleHeaderType7670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleAnchorType7715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAnchorType7732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleAnchorType7749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAnchorType7766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAnchorType7783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleAnchorType7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleAnchorType7817 = new BitSet(new long[]{0x0000000000000002L});
    }


}