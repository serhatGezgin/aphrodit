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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'title'", "'introSection'", "'sections'", "','", "'}'", "'menu'", "'Section'", "'colSpan'", "'color'", "'backgroundColor'", "'backgroundImage'", "'elements'", "'Menu'", "'items'", "'-'", "'Row'", "'Header'", "'type'", "'content'", "'Paragraf'", "'Carousel'", "'carouselPages'", "'Image'", "'src'", "'borderRadius'", "'Card'", "'pages'", "'Anchor'", "'link'", "'Division'", "'Map'", "'x'", "'y'", "'CarouselPage'", "'CardPage'", "'MenuItem'", "'section'", "'H1'", "'H2'", "'H3'", "'H4'", "'H5'", "'H6'", "'default'", "'btn_default'", "'btn_primary'", "'btn_success'", "'btn_info'", "'btn_warning'", "'btn_danger'"
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
    public static final int T__20=20;
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
        	return "Page";	
       	}
       	
       	@Override
       	protected AphroditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePage"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:68:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:69:2: (iv_rulePage= rulePage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:70:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage75);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage85); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:77:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:80:28: ( ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:1: ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:1: ( () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:2: () otherlv_1= 'Page' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'introSection' ( ( ruleEString ) ) )? (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )? (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )? otherlv_15= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:81:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPageAccess().getPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePage131); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePage143); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:95:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:95:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePage156); 

                        	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTitleKeyword_3_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:99:1: ( (lv_title_4_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:100:1: (lv_title_4_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:100:1: (lv_title_4_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:101:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePage177);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:117:4: (otherlv_5= 'introSection' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:117:6: otherlv_5= 'introSection' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePage192); 

                        	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getIntroSectionKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:121:1: ( ( ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:122:1: ( ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:122:1: ( ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:123:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getIntroSectionSectionCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePage215);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:136:4: (otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:136:6: otherlv_7= 'sections' otherlv_8= '{' ( (lv_sections_9_0= ruleSection ) ) (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePage230); 

                        	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getSectionsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePage242); 

                        	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:144:1: ( (lv_sections_9_0= ruleSection ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:145:1: (lv_sections_9_0= ruleSection )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:145:1: (lv_sections_9_0= ruleSection )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:146:3: lv_sections_9_0= ruleSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getSectionsSectionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSection_in_rulePage263);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:162:2: (otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:162:4: otherlv_10= ',' ( (lv_sections_11_0= ruleSection ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePage276); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:166:1: ( (lv_sections_11_0= ruleSection ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:167:1: (lv_sections_11_0= ruleSection )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:167:1: (lv_sections_11_0= ruleSection )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:168:3: lv_sections_11_0= ruleSection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageAccess().getSectionsSectionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSection_in_rulePage297);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage311); 

                        	newLeafNode(otherlv_12, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:188:3: (otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:188:5: otherlv_13= 'menu' ( (lv_menu_14_0= ruleMenu ) )
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePage326); 

                        	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getMenuKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:192:1: ( (lv_menu_14_0= ruleMenu ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:193:1: (lv_menu_14_0= ruleMenu )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:193:1: (lv_menu_14_0= ruleMenu )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:194:3: lv_menu_14_0= ruleMenu
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getMenuMenuParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenu_in_rulePage347);
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

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage361); 

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


    // $ANTLR start "entryRuleSectionElement"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:222:1: entryRuleSectionElement returns [EObject current=null] : iv_ruleSectionElement= ruleSectionElement EOF ;
    public final EObject entryRuleSectionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:223:2: (iv_ruleSectionElement= ruleSectionElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:224:2: iv_ruleSectionElement= ruleSectionElement EOF
            {
             newCompositeNode(grammarAccess.getSectionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_entryRuleSectionElement397);
            iv_ruleSectionElement=ruleSectionElement();

            state._fsp--;

             current =iv_ruleSectionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSectionElement407); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:231:1: ruleSectionElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:234:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:235:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:235:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            case 38:
                {
                alt6=6;
                }
                break;
            case 40:
                {
                alt6=7;
                }
                break;
            case 42:
                {
                alt6=8;
                }
                break;
            case 43:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:236:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleSectionElement454);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:246:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleSectionElement481);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:256:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleSectionElement508);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:266:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleSectionElement535);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:276:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleSectionElement562);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:286:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleSectionElement589);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:296:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleSectionElement616);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:306:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleSectionElement643);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:316:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleSectionElement670);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:332:1: entryRuleMenuElement returns [EObject current=null] : iv_ruleMenuElement= ruleMenuElement EOF ;
    public final EObject entryRuleMenuElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:333:2: (iv_ruleMenuElement= ruleMenuElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:334:2: iv_ruleMenuElement= ruleMenuElement EOF
            {
             newCompositeNode(grammarAccess.getMenuElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_entryRuleMenuElement705);
            iv_ruleMenuElement=ruleMenuElement();

            state._fsp--;

             current =iv_ruleMenuElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenuElement715); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:341:1: ruleMenuElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem ) ;
    public final EObject ruleMenuElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Image_1 = null;

        EObject this_MenuItem_2 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:344:28: ( (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:345:1: (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:345:1: (this_Header_0= ruleHeader | this_Image_1= ruleImage | this_MenuItem_2= ruleMenuItem )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:346:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleMenuElement762);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:356:5: this_Image_1= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getImageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleMenuElement789);
                    this_Image_1=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:366:5: this_MenuItem_2= ruleMenuItem
                    {
                     
                            newCompositeNode(grammarAccess.getMenuElementAccess().getMenuItemParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMenuItem_in_ruleMenuElement816);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:382:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:383:2: (iv_ruleRowElement= ruleRowElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:384:2: iv_ruleRowElement= ruleRowElement EOF
            {
             newCompositeNode(grammarAccess.getRowElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_entryRuleRowElement851);
            iv_ruleRowElement=ruleRowElement();

            state._fsp--;

             current =iv_ruleRowElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRowElement861); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:391:1: ruleRowElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:394:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:395:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:395:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 40:
                {
                alt8=7;
                }
                break;
            case 42:
                {
                alt8=8;
                }
                break;
            case 43:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:396:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleRowElement908);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:406:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleRowElement935);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:416:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleRowElement962);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:426:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleRowElement989);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:436:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleRowElement1016);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:446:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleRowElement1043);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:456:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleRowElement1070);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:466:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleRowElement1097);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:476:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getRowElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleRowElement1124);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:492:1: entryRuleCarouselElement returns [EObject current=null] : iv_ruleCarouselElement= ruleCarouselElement EOF ;
    public final EObject entryRuleCarouselElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:493:2: (iv_ruleCarouselElement= ruleCarouselElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:494:2: iv_ruleCarouselElement= ruleCarouselElement EOF
            {
             newCompositeNode(grammarAccess.getCarouselElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_entryRuleCarouselElement1159);
            iv_ruleCarouselElement=ruleCarouselElement();

            state._fsp--;

             current =iv_ruleCarouselElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselElement1169); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:501:1: ruleCarouselElement returns [EObject current=null] : this_CarouselPage_0= ruleCarouselPage ;
    public final EObject ruleCarouselElement() throws RecognitionException {
        EObject current = null;

        EObject this_CarouselPage_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:504:28: (this_CarouselPage_0= ruleCarouselPage )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:506:5: this_CarouselPage_0= ruleCarouselPage
            {
             
                    newCompositeNode(grammarAccess.getCarouselElementAccess().getCarouselPageParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPage_in_ruleCarouselElement1215);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:522:1: entryRuleCardElement returns [EObject current=null] : iv_ruleCardElement= ruleCardElement EOF ;
    public final EObject entryRuleCardElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:523:2: (iv_ruleCardElement= ruleCardElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:524:2: iv_ruleCardElement= ruleCardElement EOF
            {
             newCompositeNode(grammarAccess.getCardElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_entryRuleCardElement1249);
            iv_ruleCardElement=ruleCardElement();

            state._fsp--;

             current =iv_ruleCardElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardElement1259); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:531:1: ruleCardElement returns [EObject current=null] : this_CardPage_0= ruleCardPage ;
    public final EObject ruleCardElement() throws RecognitionException {
        EObject current = null;

        EObject this_CardPage_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:534:28: (this_CardPage_0= ruleCardPage )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:536:5: this_CardPage_0= ruleCardPage
            {
             
                    newCompositeNode(grammarAccess.getCardElementAccess().getCardPageParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCardPage_in_ruleCardElement1305);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:552:1: entryRuleDivisionElement returns [EObject current=null] : iv_ruleDivisionElement= ruleDivisionElement EOF ;
    public final EObject entryRuleDivisionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:553:2: (iv_ruleDivisionElement= ruleDivisionElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:554:2: iv_ruleDivisionElement= ruleDivisionElement EOF
            {
             newCompositeNode(grammarAccess.getDivisionElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_entryRuleDivisionElement1339);
            iv_ruleDivisionElement=ruleDivisionElement();

            state._fsp--;

             current =iv_ruleDivisionElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivisionElement1349); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:561:1: ruleDivisionElement returns [EObject current=null] : (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:564:28: ( (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:565:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:565:1: (this_Row_0= ruleRow | this_Header_1= ruleHeader | this_Paragraf_2= ruleParagraf | this_Carousel_3= ruleCarousel | this_Image_4= ruleImage | this_Card_5= ruleCard | this_Anchor_6= ruleAnchor | this_Division_7= ruleDivision | this_Map_8= ruleMap )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            case 38:
                {
                alt9=6;
                }
                break;
            case 40:
                {
                alt9=7;
                }
                break;
            case 42:
                {
                alt9=8;
                }
                break;
            case 43:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:566:5: this_Row_0= ruleRow
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getRowParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRow_in_ruleDivisionElement1396);
                    this_Row_0=ruleRow();

                    state._fsp--;

                     
                            current = this_Row_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:576:5: this_Header_1= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getHeaderParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleDivisionElement1423);
                    this_Header_1=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:586:5: this_Paragraf_2= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getParagrafParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleDivisionElement1450);
                    this_Paragraf_2=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:596:5: this_Carousel_3= ruleCarousel
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getCarouselParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_ruleDivisionElement1477);
                    this_Carousel_3=ruleCarousel();

                    state._fsp--;

                     
                            current = this_Carousel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:606:5: this_Image_4= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getImageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleDivisionElement1504);
                    this_Image_4=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:616:5: this_Card_5= ruleCard
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getCardParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCard_in_ruleDivisionElement1531);
                    this_Card_5=ruleCard();

                    state._fsp--;

                     
                            current = this_Card_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:626:5: this_Anchor_6= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getAnchorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleDivisionElement1558);
                    this_Anchor_6=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:636:5: this_Division_7= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getDivisionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleDivisionElement1585);
                    this_Division_7=ruleDivision();

                    state._fsp--;

                     
                            current = this_Division_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:646:5: this_Map_8= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getDivisionElementAccess().getMapParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMap_in_ruleDivisionElement1612);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:662:1: entryRuleCarouselPageElement returns [EObject current=null] : iv_ruleCarouselPageElement= ruleCarouselPageElement EOF ;
    public final EObject entryRuleCarouselPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselPageElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:663:2: (iv_ruleCarouselPageElement= ruleCarouselPageElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:664:2: iv_ruleCarouselPageElement= ruleCarouselPageElement EOF
            {
             newCompositeNode(grammarAccess.getCarouselPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_entryRuleCarouselPageElement1647);
            iv_ruleCarouselPageElement=ruleCarouselPageElement();

            state._fsp--;

             current =iv_ruleCarouselPageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselPageElement1657); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:671:1: ruleCarouselPageElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) ;
    public final EObject ruleCarouselPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Paragraf_1 = null;

        EObject this_Image_2 = null;

        EObject this_Anchor_3 = null;

        EObject this_Division_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:674:28: ( (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:675:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:675:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case 42:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:676:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleCarouselPageElement1704);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:686:5: this_Paragraf_1= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getParagrafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleCarouselPageElement1731);
                    this_Paragraf_1=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:696:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleCarouselPageElement1758);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:706:5: this_Anchor_3= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getAnchorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleCarouselPageElement1785);
                    this_Anchor_3=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:716:5: this_Division_4= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getCarouselPageElementAccess().getDivisionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleCarouselPageElement1812);
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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:732:1: entryRuleCardPageElement returns [EObject current=null] : iv_ruleCardPageElement= ruleCardPageElement EOF ;
    public final EObject entryRuleCardPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardPageElement = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:733:2: (iv_ruleCardPageElement= ruleCardPageElement EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:734:2: iv_ruleCardPageElement= ruleCardPageElement EOF
            {
             newCompositeNode(grammarAccess.getCardPageElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_entryRuleCardPageElement1847);
            iv_ruleCardPageElement=ruleCardPageElement();

            state._fsp--;

             current =iv_ruleCardPageElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardPageElement1857); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:741:1: ruleCardPageElement returns [EObject current=null] : (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) ;
    public final EObject ruleCardPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Header_0 = null;

        EObject this_Paragraf_1 = null;

        EObject this_Image_2 = null;

        EObject this_Anchor_3 = null;

        EObject this_Division_4 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:744:28: ( (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:745:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:745:1: (this_Header_0= ruleHeader | this_Paragraf_1= ruleParagraf | this_Image_2= ruleImage | this_Anchor_3= ruleAnchor | this_Division_4= ruleDivision )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            case 42:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:746:5: this_Header_0= ruleHeader
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getHeaderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeader_in_ruleCardPageElement1904);
                    this_Header_0=ruleHeader();

                    state._fsp--;

                     
                            current = this_Header_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:756:5: this_Paragraf_1= ruleParagraf
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getParagrafParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_ruleCardPageElement1931);
                    this_Paragraf_1=ruleParagraf();

                    state._fsp--;

                     
                            current = this_Paragraf_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:766:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleCardPageElement1958);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:776:5: this_Anchor_3= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getAnchorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_ruleCardPageElement1985);
                    this_Anchor_3=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:786:5: this_Division_4= ruleDivision
                    {
                     
                            newCompositeNode(grammarAccess.getCardPageElementAccess().getDivisionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDivision_in_ruleCardPageElement2012);
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


    // $ANTLR start "entryRuleEString"
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:802:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:803:2: (iv_ruleEString= ruleEString EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:804:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2048);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2059); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:811:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:814:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:815:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:815:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:815:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2099); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:823:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2125); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:838:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:839:2: (iv_ruleSection= ruleSection EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:840:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSection_in_entryRuleSection2170);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSection2180); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:847:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:850:28: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:851:1: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:851:1: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:851:2: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:851:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:852:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSectionAccess().getSectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSection2226); 

                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:861:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:862:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:862:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:863:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2247);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSection2259); 

                	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:883:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:883:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSection2272); 

                        	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:887:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:888:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:888:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:889:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSection2293);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:905:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:905:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSection2308); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:909:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:910:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:910:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:911:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2329);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:927:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:927:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSection2344); 

                        	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:931:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:932:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:932:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:933:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2365);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:949:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:949:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSection2380); 

                        	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:953:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:954:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:954:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:955:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSection2401);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:971:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:971:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleSectionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSection2416); 

                        	newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSection2428); 

                        	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:979:1: ( (lv_elements_14_0= ruleSectionElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:980:1: (lv_elements_14_0= ruleSectionElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:980:1: (lv_elements_14_0= ruleSectionElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:981:3: lv_elements_14_0= ruleSectionElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getElementsSectionElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_ruleSection2449);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:997:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:997:4: otherlv_15= ',' ( (lv_elements_16_0= ruleSectionElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSection2462); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1001:1: ( (lv_elements_16_0= ruleSectionElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1002:1: (lv_elements_16_0= ruleSectionElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1002:1: (lv_elements_16_0= ruleSectionElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1003:3: lv_elements_16_0= ruleSectionElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getElementsSectionElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSectionElement_in_ruleSection2483);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSection2497); 

                        	newLeafNode(otherlv_17, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSection2511); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1035:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1036:2: (iv_ruleMenu= ruleMenu EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1037:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenu_in_entryRuleMenu2547);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenu2557); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1044:1: ruleMenu returns [EObject current=null] : ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1047:28: ( ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1048:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1048:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1048:2: () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1048:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1049:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuAccess().getMenuAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMenu2603); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getMenuKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1058:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1059:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1059:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1060:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2624);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu2636); 

                	newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1080:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1080:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMenu2649); 

                        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1084:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1085:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1085:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1086:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMenu2670);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1102:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1102:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMenu2685); 

                        	newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1106:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1107:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1107:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1108:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2706);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1124:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1124:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMenu2721); 

                        	newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1128:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1129:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1129:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1130:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2742);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1146:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1146:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMenu2757); 

                        	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1150:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1151:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1151:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1152:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu2778);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1168:4: (otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1168:6: otherlv_12= 'items' otherlv_13= '{' ( (lv_items_14_0= ruleMenuElement ) ) (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMenu2793); 

                        	newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getItemsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu2805); 

                        	newLeafNode(otherlv_13, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1176:1: ( (lv_items_14_0= ruleMenuElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1177:1: (lv_items_14_0= ruleMenuElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1177:1: (lv_items_14_0= ruleMenuElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1178:3: lv_items_14_0= ruleMenuElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsMenuElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_ruleMenu2826);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1194:2: (otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1194:4: otherlv_15= ',' ( (lv_items_16_0= ruleMenuElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMenu2839); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMenuAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1198:1: ( (lv_items_16_0= ruleMenuElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1199:1: (lv_items_16_0= ruleMenuElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1199:1: (lv_items_16_0= ruleMenuElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1200:3: lv_items_16_0= ruleMenuElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMenuAccess().getItemsMenuElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMenuElement_in_ruleMenu2860);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMenu2874); 

                        	newLeafNode(otherlv_17, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMenu2888); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1232:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1233:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1234:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2925);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2936); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1241:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1244:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1245:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1245:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1245:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1245:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1246:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEInt2975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2992); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1266:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1267:2: (iv_ruleRow= ruleRow EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1268:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRow_in_entryRuleRow3037);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRow3047); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1275:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1278:28: ( ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1279:1: ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1279:1: ( () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1279:2: () otherlv_1= 'Row' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1279:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRowAccess().getRowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRow3093); 

                	newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1289:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1290:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1290:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1291:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRowAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3114);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRow3126); 

                	newLeafNode(otherlv_3, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1311:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1311:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRow3139); 

                        	newLeafNode(otherlv_4, grammarAccess.getRowAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1315:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1316:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1316:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1317:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRow3160);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1333:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1333:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRow3175); 

                        	newLeafNode(otherlv_6, grammarAccess.getRowAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1337:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1338:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1338:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1339:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3196);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1355:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1355:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRow3211); 

                        	newLeafNode(otherlv_8, grammarAccess.getRowAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1359:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1360:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1360:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1361:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3232);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1377:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1377:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRow3247); 

                        	newLeafNode(otherlv_10, grammarAccess.getRowAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1381:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1382:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1382:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1383:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRow3268);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1399:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1399:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleRowElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRow3283); 

                        	newLeafNode(otherlv_12, grammarAccess.getRowAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRow3295); 

                        	newLeafNode(otherlv_13, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1407:1: ( (lv_elements_14_0= ruleRowElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1408:1: (lv_elements_14_0= ruleRowElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1408:1: (lv_elements_14_0= ruleRowElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1409:3: lv_elements_14_0= ruleRowElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_ruleRow3316);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1425:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1425:4: otherlv_15= ',' ( (lv_elements_16_0= ruleRowElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRow3329); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getRowAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1429:1: ( (lv_elements_16_0= ruleRowElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1430:1: (lv_elements_16_0= ruleRowElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1430:1: (lv_elements_16_0= ruleRowElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1431:3: lv_elements_16_0= ruleRowElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRowElement_in_ruleRow3350);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRow3364); 

                        	newLeafNode(otherlv_17, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRow3378); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1463:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1464:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1465:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeader_in_entryRuleHeader3414);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeader3424); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1472:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1475:28: ( ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1476:1: ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1476:1: ( () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1476:2: () otherlv_1= 'Header' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )? (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1476:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1477:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHeaderAccess().getHeaderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleHeader3470); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1486:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1487:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1487:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1488:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHeaderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3491);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHeader3503); 

                	newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1508:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1508:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleHeader3516); 

                        	newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1512:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1513:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1513:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1514:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleHeader3537);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1530:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1530:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleHeader3552); 

                        	newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1534:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1535:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1535:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1536:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3573);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1552:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1552:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleHeader3588); 

                        	newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1556:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1557:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1557:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1558:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3609);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1574:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1574:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleHeader3624); 

                        	newLeafNode(otherlv_10, grammarAccess.getHeaderAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1578:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1579:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1579:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1580:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3645);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1596:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1596:6: otherlv_12= 'type' ( (lv_type_13_0= ruleHeaderType ) )
                    {
                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleHeader3660); 

                        	newLeafNode(otherlv_12, grammarAccess.getHeaderAccess().getTypeKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1600:1: ( (lv_type_13_0= ruleHeaderType ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1601:1: (lv_type_13_0= ruleHeaderType )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1601:1: (lv_type_13_0= ruleHeaderType )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1602:3: lv_type_13_0= ruleHeaderType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getTypeHeaderTypeEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleHeaderType_in_ruleHeader3681);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1618:4: (otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1618:6: otherlv_14= 'content' ( (lv_content_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleHeader3696); 

                        	newLeafNode(otherlv_14, grammarAccess.getHeaderAccess().getContentKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1622:1: ( (lv_content_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1623:1: (lv_content_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1623:1: (lv_content_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1624:3: lv_content_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderAccess().getContentEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeader3717);
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

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHeader3731); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1652:1: entryRuleParagraf returns [EObject current=null] : iv_ruleParagraf= ruleParagraf EOF ;
    public final EObject entryRuleParagraf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraf = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1653:2: (iv_ruleParagraf= ruleParagraf EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1654:2: iv_ruleParagraf= ruleParagraf EOF
            {
             newCompositeNode(grammarAccess.getParagrafRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParagraf_in_entryRuleParagraf3767);
            iv_ruleParagraf=ruleParagraf();

            state._fsp--;

             current =iv_ruleParagraf; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParagraf3777); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1661:1: ruleParagraf returns [EObject current=null] : ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1664:28: ( ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1665:1: ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1665:1: ( () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1665:2: () otherlv_1= 'Paragraf' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )? otherlv_14= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1665:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1666:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParagrafAccess().getParagrafAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleParagraf3823); 

                	newLeafNode(otherlv_1, grammarAccess.getParagrafAccess().getParagrafKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1675:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1676:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1676:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1677:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParagrafAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf3844);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParagraf3856); 

                	newLeafNode(otherlv_3, grammarAccess.getParagrafAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1697:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1697:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParagraf3869); 

                        	newLeafNode(otherlv_4, grammarAccess.getParagrafAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1701:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1702:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1702:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1703:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleParagraf3890);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1719:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1719:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParagraf3905); 

                        	newLeafNode(otherlv_6, grammarAccess.getParagrafAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1723:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1724:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1724:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1725:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf3926);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1741:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1741:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParagraf3941); 

                        	newLeafNode(otherlv_8, grammarAccess.getParagrafAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1745:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1746:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1746:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1747:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf3962);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1763:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1763:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParagraf3977); 

                        	newLeafNode(otherlv_10, grammarAccess.getParagrafAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1767:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1768:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1768:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1769:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf3998);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1785:4: (otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1785:6: otherlv_12= 'content' ( (lv_content_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleParagraf4013); 

                        	newLeafNode(otherlv_12, grammarAccess.getParagrafAccess().getContentKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1789:1: ( (lv_content_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1790:1: (lv_content_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1790:1: (lv_content_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1791:3: lv_content_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParagrafAccess().getContentEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraf4034);
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

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParagraf4048); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1819:1: entryRuleCarousel returns [EObject current=null] : iv_ruleCarousel= ruleCarousel EOF ;
    public final EObject entryRuleCarousel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarousel = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1820:2: (iv_ruleCarousel= ruleCarousel EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1821:2: iv_ruleCarousel= ruleCarousel EOF
            {
             newCompositeNode(grammarAccess.getCarouselRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarousel_in_entryRuleCarousel4084);
            iv_ruleCarousel=ruleCarousel();

            state._fsp--;

             current =iv_ruleCarousel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarousel4094); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1828:1: ruleCarousel returns [EObject current=null] : ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1831:28: ( ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1832:1: ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1832:1: ( () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1832:2: () otherlv_1= 'Carousel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1832:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1833:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarouselAccess().getCarouselAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCarousel4140); 

                	newLeafNode(otherlv_1, grammarAccess.getCarouselAccess().getCarouselKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1842:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1843:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1843:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1844:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarouselAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4161);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarousel4173); 

                	newLeafNode(otherlv_3, grammarAccess.getCarouselAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1864:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1864:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCarousel4186); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarouselAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1868:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1869:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1869:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1870:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCarousel4207);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1886:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1886:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarousel4222); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarouselAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1890:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1891:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1891:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1892:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4243);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1908:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1908:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarousel4258); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarouselAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1912:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1913:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1913:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1914:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4279);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1930:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1930:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarousel4294); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarouselAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1934:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1935:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1935:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1936:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarousel4315);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1952:4: (otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1952:6: otherlv_12= 'carouselPages' otherlv_13= '{' ( (lv_carouselPages_14_0= ruleCarouselElement ) ) (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCarousel4330); 

                        	newLeafNode(otherlv_12, grammarAccess.getCarouselAccess().getCarouselPagesKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarousel4342); 

                        	newLeafNode(otherlv_13, grammarAccess.getCarouselAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1960:1: ( (lv_carouselPages_14_0= ruleCarouselElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1961:1: (lv_carouselPages_14_0= ruleCarouselElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1961:1: (lv_carouselPages_14_0= ruleCarouselElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1962:3: lv_carouselPages_14_0= ruleCarouselElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselAccess().getCarouselPagesCarouselElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_ruleCarousel4363);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1978:2: (otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==16) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1978:4: otherlv_15= ',' ( (lv_carouselPages_16_0= ruleCarouselElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCarousel4376); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCarouselAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1982:1: ( (lv_carouselPages_16_0= ruleCarouselElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1983:1: (lv_carouselPages_16_0= ruleCarouselElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1983:1: (lv_carouselPages_16_0= ruleCarouselElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1984:3: lv_carouselPages_16_0= ruleCarouselElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarouselAccess().getCarouselPagesCarouselElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarouselElement_in_ruleCarousel4397);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarousel4411); 

                        	newLeafNode(otherlv_17, grammarAccess.getCarouselAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarousel4425); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2016:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2017:2: (iv_ruleImage= ruleImage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2018:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImage_in_entryRuleImage4461);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImage4471); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2025:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2028:28: ( ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2029:1: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2029:1: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2029:2: () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )? (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2029:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2030:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageAccess().getImageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleImage4517); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2039:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2040:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2040:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2041:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4538);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImage4550); 

                	newLeafNode(otherlv_3, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2061:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2061:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleImage4563); 

                        	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2065:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2066:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2066:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2067:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleImage4584);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2083:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2083:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleImage4599); 

                        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2087:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2088:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2088:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2089:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4620);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2105:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==22) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2105:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleImage4635); 

                        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2109:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2110:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2110:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2111:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4656);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2127:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==23) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2127:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleImage4671); 

                        	newLeafNode(otherlv_10, grammarAccess.getImageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2131:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2132:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2132:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2133:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4692);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2149:4: (otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2149:6: otherlv_12= 'src' ( (lv_src_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleImage4707); 

                        	newLeafNode(otherlv_12, grammarAccess.getImageAccess().getSrcKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2153:1: ( (lv_src_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2154:1: (lv_src_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2154:1: (lv_src_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2155:3: lv_src_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getSrcEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4728);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2171:4: (otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2171:6: otherlv_14= 'borderRadius' ( (lv_borderRadius_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleImage4743); 

                        	newLeafNode(otherlv_14, grammarAccess.getImageAccess().getBorderRadiusKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2175:1: ( (lv_borderRadius_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2176:1: (lv_borderRadius_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2176:1: (lv_borderRadius_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2177:3: lv_borderRadius_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getBorderRadiusEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4764);
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

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImage4778); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2205:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2206:2: (iv_ruleCard= ruleCard EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2207:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCard_in_entryRuleCard4814);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCard4824); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2214:1: ruleCard returns [EObject current=null] : ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2217:28: ( ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2218:1: ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2218:1: ( () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2218:2: () otherlv_1= 'Card' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2218:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2219:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCardAccess().getCardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCard4870); 

                	newLeafNode(otherlv_1, grammarAccess.getCardAccess().getCardKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2228:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2229:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2229:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2230:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard4891);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCard4903); 

                	newLeafNode(otherlv_3, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2250:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2250:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCard4916); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2254:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2255:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2255:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2256:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCard4937);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2272:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2272:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCard4952); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2276:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2277:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2277:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2278:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard4973);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2294:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==22) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2294:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCard4988); 

                        	newLeafNode(otherlv_8, grammarAccess.getCardAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2298:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2299:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2299:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2300:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5009);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2316:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==23) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2316:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCard5024); 

                        	newLeafNode(otherlv_10, grammarAccess.getCardAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2320:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2321:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2321:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2322:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCard5045);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2338:4: (otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==39) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2338:6: otherlv_12= 'pages' otherlv_13= '{' ( (lv_pages_14_0= ruleCardElement ) ) (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCard5060); 

                        	newLeafNode(otherlv_12, grammarAccess.getCardAccess().getPagesKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCard5072); 

                        	newLeafNode(otherlv_13, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2346:1: ( (lv_pages_14_0= ruleCardElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2347:1: (lv_pages_14_0= ruleCardElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2347:1: (lv_pages_14_0= ruleCardElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2348:3: lv_pages_14_0= ruleCardElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardAccess().getPagesCardElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_ruleCard5093);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2364:2: (otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==16) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2364:4: otherlv_15= ',' ( (lv_pages_16_0= ruleCardElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCard5106); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCardAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2368:1: ( (lv_pages_16_0= ruleCardElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2369:1: (lv_pages_16_0= ruleCardElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2369:1: (lv_pages_16_0= ruleCardElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2370:3: lv_pages_16_0= ruleCardElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCardAccess().getPagesCardElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCardElement_in_ruleCard5127);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCard5141); 

                        	newLeafNode(otherlv_17, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCard5155); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2402:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2403:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2404:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnchor_in_entryRuleAnchor5191);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnchor5201); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2411:1: ruleAnchor returns [EObject current=null] : ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2414:28: ( ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2415:1: ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2415:1: ( () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2415:2: () otherlv_1= 'Anchor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )? (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2415:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2416:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnchorAccess().getAnchorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnchor5247); 

                	newLeafNode(otherlv_1, grammarAccess.getAnchorAccess().getAnchorKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2425:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2426:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2426:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2427:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnchorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5268);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnchor5280); 

                	newLeafNode(otherlv_3, grammarAccess.getAnchorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2447:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==20) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2447:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnchor5293); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnchorAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2451:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2452:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2452:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2453:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAnchor5314);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2469:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2469:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnchor5329); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnchorAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2473:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2474:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2474:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2475:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5350);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2491:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2491:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnchor5365); 

                        	newLeafNode(otherlv_8, grammarAccess.getAnchorAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2495:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2496:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2496:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2497:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5386);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2513:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==23) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2513:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnchor5401); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnchorAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2517:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2518:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2518:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2519:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5422);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2535:4: (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==13) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2535:6: otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnchor5437); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnchorAccess().getTitleKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2539:1: ( (lv_title_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2540:1: (lv_title_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2540:1: (lv_title_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2541:3: lv_title_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getTitleEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5458);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2557:4: (otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==41) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2557:6: otherlv_14= 'link' ( (lv_link_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnchor5473); 

                        	newLeafNode(otherlv_14, grammarAccess.getAnchorAccess().getLinkKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2561:1: ( (lv_link_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2562:1: (lv_link_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2562:1: (lv_link_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2563:3: lv_link_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getLinkEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnchor5494);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2579:4: (otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2579:6: otherlv_16= 'type' ( (lv_type_17_0= ruleAnchorType ) )
                    {
                    otherlv_16=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnchor5509); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnchorAccess().getTypeKeyword_10_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2583:1: ( (lv_type_17_0= ruleAnchorType ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2584:1: (lv_type_17_0= ruleAnchorType )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2584:1: (lv_type_17_0= ruleAnchorType )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2585:3: lv_type_17_0= ruleAnchorType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnchorAccess().getTypeAnchorTypeEnumRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnchorType_in_ruleAnchor5530);
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

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnchor5544); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2613:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2614:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2615:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDivision_in_entryRuleDivision5580);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivision5590); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2622:1: ruleDivision returns [EObject current=null] : ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2625:28: ( ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2626:1: ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2626:1: ( () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2626:2: () otherlv_1= 'Division' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2626:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2627:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDivisionAccess().getDivisionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDivision5636); 

                	newLeafNode(otherlv_1, grammarAccess.getDivisionAccess().getDivisionKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2636:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2637:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2637:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2638:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDivisionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5657);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDivision5669); 

                	newLeafNode(otherlv_3, grammarAccess.getDivisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2658:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==20) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2658:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDivision5682); 

                        	newLeafNode(otherlv_4, grammarAccess.getDivisionAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2662:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2663:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2663:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2664:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDivision5703);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2680:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==21) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2680:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDivision5718); 

                        	newLeafNode(otherlv_6, grammarAccess.getDivisionAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2684:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2685:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2685:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2686:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5739);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2702:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==22) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2702:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDivision5754); 

                        	newLeafNode(otherlv_8, grammarAccess.getDivisionAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2706:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2707:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2707:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2708:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5775);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2724:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==23) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2724:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDivision5790); 

                        	newLeafNode(otherlv_10, grammarAccess.getDivisionAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2728:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2729:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2729:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2730:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDivision5811);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2746:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2746:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleDivisionElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDivision5826); 

                        	newLeafNode(otherlv_12, grammarAccess.getDivisionAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDivision5838); 

                        	newLeafNode(otherlv_13, grammarAccess.getDivisionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2754:1: ( (lv_elements_14_0= ruleDivisionElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2755:1: (lv_elements_14_0= ruleDivisionElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2755:1: (lv_elements_14_0= ruleDivisionElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2756:3: lv_elements_14_0= ruleDivisionElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionAccess().getElementsDivisionElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_ruleDivision5859);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2772:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==16) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2772:4: otherlv_15= ',' ( (lv_elements_16_0= ruleDivisionElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDivision5872); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDivisionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2776:1: ( (lv_elements_16_0= ruleDivisionElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2777:1: (lv_elements_16_0= ruleDivisionElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2777:1: (lv_elements_16_0= ruleDivisionElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2778:3: lv_elements_16_0= ruleDivisionElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDivisionAccess().getElementsDivisionElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDivisionElement_in_ruleDivision5893);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDivision5907); 

                        	newLeafNode(otherlv_17, grammarAccess.getDivisionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDivision5921); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2810:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2811:2: (iv_ruleMap= ruleMap EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2812:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMap_in_entryRuleMap5957);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMap5967); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2819:1: ruleMap returns [EObject current=null] : ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2822:28: ( ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2823:1: ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2823:1: ( () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2823:2: () otherlv_1= 'Map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )? (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2823:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2824:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMapAccess().getMapAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMap6013); 

                	newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2833:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2834:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2834:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2835:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMapAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6034);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMap6046); 

                	newLeafNode(otherlv_3, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2855:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==20) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2855:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMap6059); 

                        	newLeafNode(otherlv_4, grammarAccess.getMapAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2859:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2860:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2860:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2861:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMap6080);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2877:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==21) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2877:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMap6095); 

                        	newLeafNode(otherlv_6, grammarAccess.getMapAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2881:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2882:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2882:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2883:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6116);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2899:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==22) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2899:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMap6131); 

                        	newLeafNode(otherlv_8, grammarAccess.getMapAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2903:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2904:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2904:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2905:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6152);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2921:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==23) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2921:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMap6167); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2925:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2926:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2926:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2927:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6188);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2943:4: (otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==44) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2943:6: otherlv_12= 'x' ( (lv_x_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMap6203); 

                        	newLeafNode(otherlv_12, grammarAccess.getMapAccess().getXKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2947:1: ( (lv_x_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2948:1: (lv_x_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2948:1: (lv_x_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2949:3: lv_x_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getXEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6224);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2965:4: (otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==45) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2965:6: otherlv_14= 'y' ( (lv_y_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMap6239); 

                        	newLeafNode(otherlv_14, grammarAccess.getMapAccess().getYKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2969:1: ( (lv_y_15_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2970:1: (lv_y_15_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2970:1: (lv_y_15_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2971:3: lv_y_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getYEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMap6260);
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

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMap6274); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:2999:1: entryRuleCarouselPage returns [EObject current=null] : iv_ruleCarouselPage= ruleCarouselPage EOF ;
    public final EObject entryRuleCarouselPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarouselPage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3000:2: (iv_ruleCarouselPage= ruleCarouselPage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3001:2: iv_ruleCarouselPage= ruleCarouselPage EOF
            {
             newCompositeNode(grammarAccess.getCarouselPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarouselPage_in_entryRuleCarouselPage6310);
            iv_ruleCarouselPage=ruleCarouselPage();

            state._fsp--;

             current =iv_ruleCarouselPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarouselPage6320); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3008:1: ruleCarouselPage returns [EObject current=null] : ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3011:28: ( ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3012:1: ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3012:1: ( () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3012:2: () otherlv_1= 'CarouselPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3012:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarouselPageAccess().getCarouselPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCarouselPage6366); 

                	newLeafNode(otherlv_1, grammarAccess.getCarouselPageAccess().getCarouselPageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3022:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3023:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3023:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3024:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarouselPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6387);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarouselPage6399); 

                	newLeafNode(otherlv_3, grammarAccess.getCarouselPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3044:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==20) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3044:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCarouselPage6412); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarouselPageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3048:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3049:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3049:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3050:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCarouselPage6433);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3066:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==21) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3066:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarouselPage6448); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarouselPageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3070:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3071:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3071:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3072:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6469);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3088:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==22) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3088:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarouselPage6484); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarouselPageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3092:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3093:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3093:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3094:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6505);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3110:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==23) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3110:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarouselPage6520); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarouselPageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3114:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3115:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3115:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3116:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarouselPage6541);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3132:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==24) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3132:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCarouselPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCarouselPage6556); 

                        	newLeafNode(otherlv_12, grammarAccess.getCarouselPageAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCarouselPage6568); 

                        	newLeafNode(otherlv_13, grammarAccess.getCarouselPageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3140:1: ( (lv_elements_14_0= ruleCarouselPageElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3141:1: (lv_elements_14_0= ruleCarouselPageElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3141:1: (lv_elements_14_0= ruleCarouselPageElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3142:3: lv_elements_14_0= ruleCarouselPageElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getElementsCarouselPageElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6589);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3158:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==16) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3158:4: otherlv_15= ',' ( (lv_elements_16_0= ruleCarouselPageElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCarouselPage6602); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCarouselPageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3162:1: ( (lv_elements_16_0= ruleCarouselPageElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3163:1: (lv_elements_16_0= ruleCarouselPageElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3163:1: (lv_elements_16_0= ruleCarouselPageElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3164:3: lv_elements_16_0= ruleCarouselPageElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarouselPageAccess().getElementsCarouselPageElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6623);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarouselPage6637); 

                        	newLeafNode(otherlv_17, grammarAccess.getCarouselPageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarouselPage6651); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3196:1: entryRuleCardPage returns [EObject current=null] : iv_ruleCardPage= ruleCardPage EOF ;
    public final EObject entryRuleCardPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardPage = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3197:2: (iv_ruleCardPage= ruleCardPage EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3198:2: iv_ruleCardPage= ruleCardPage EOF
            {
             newCompositeNode(grammarAccess.getCardPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardPage_in_entryRuleCardPage6687);
            iv_ruleCardPage=ruleCardPage();

            state._fsp--;

             current =iv_ruleCardPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardPage6697); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3205:1: ruleCardPage returns [EObject current=null] : ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3208:28: ( ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3209:1: ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3209:1: ( () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3209:2: () otherlv_1= 'CardPage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3209:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3210:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCardPageAccess().getCardPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleCardPage6743); 

                	newLeafNode(otherlv_1, grammarAccess.getCardPageAccess().getCardPageKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3219:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3220:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3220:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3221:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6764);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCardPage6776); 

                	newLeafNode(otherlv_3, grammarAccess.getCardPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3241:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==20) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3241:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCardPage6789); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardPageAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3245:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3246:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3246:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3247:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCardPage6810);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3263:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==21) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3263:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCardPage6825); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardPageAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3267:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3268:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3268:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3269:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6846);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3285:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==22) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3285:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCardPage6861); 

                        	newLeafNode(otherlv_8, grammarAccess.getCardPageAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3289:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3290:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3290:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3291:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6882);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3307:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==23) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3307:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCardPage6897); 

                        	newLeafNode(otherlv_10, grammarAccess.getCardPageAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3311:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3312:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3312:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3313:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardPage6918);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3329:4: (otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==24) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3329:6: otherlv_12= 'elements' otherlv_13= '{' ( (lv_elements_14_0= ruleCardPageElement ) ) (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCardPage6933); 

                        	newLeafNode(otherlv_12, grammarAccess.getCardPageAccess().getElementsKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCardPage6945); 

                        	newLeafNode(otherlv_13, grammarAccess.getCardPageAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3337:1: ( (lv_elements_14_0= ruleCardPageElement ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3338:1: (lv_elements_14_0= ruleCardPageElement )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3338:1: (lv_elements_14_0= ruleCardPageElement )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3339:3: lv_elements_14_0= ruleCardPageElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardPageAccess().getElementsCardPageElementParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_ruleCardPage6966);
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

                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3355:2: (otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==16) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3355:4: otherlv_15= ',' ( (lv_elements_16_0= ruleCardPageElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCardPage6979); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCardPageAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3359:1: ( (lv_elements_16_0= ruleCardPageElement ) )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3360:1: (lv_elements_16_0= ruleCardPageElement )
                    	    {
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3360:1: (lv_elements_16_0= ruleCardPageElement )
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3361:3: lv_elements_16_0= ruleCardPageElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCardPageAccess().getElementsCardPageElementParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCardPageElement_in_ruleCardPage7000);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCardPage7014); 

                        	newLeafNode(otherlv_17, grammarAccess.getCardPageAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCardPage7028); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3393:1: entryRuleMenuItem returns [EObject current=null] : iv_ruleMenuItem= ruleMenuItem EOF ;
    public final EObject entryRuleMenuItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuItem = null;


        try {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3394:2: (iv_ruleMenuItem= ruleMenuItem EOF )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3395:2: iv_ruleMenuItem= ruleMenuItem EOF
            {
             newCompositeNode(grammarAccess.getMenuItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenuItem_in_entryRuleMenuItem7064);
            iv_ruleMenuItem=ruleMenuItem();

            state._fsp--;

             current =iv_ruleMenuItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenuItem7074); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3402:1: ruleMenuItem returns [EObject current=null] : ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3405:28: ( ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3406:1: ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3406:1: ( () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3406:2: () otherlv_1= 'MenuItem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )? (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )? (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )? (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )? (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )? (otherlv_14= 'section' ( ( ruleEString ) ) )? otherlv_16= '}'
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3406:2: ()
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3407:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuItemAccess().getMenuItemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMenuItem7120); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuItemAccess().getMenuItemKeyword_1());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3416:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3417:1: (lv_name_2_0= ruleEString )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3417:1: (lv_name_2_0= ruleEString )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3418:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuItemAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7141);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenuItem7153); 

                	newLeafNode(otherlv_3, grammarAccess.getMenuItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3438:1: (otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==20) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3438:3: otherlv_4= 'colSpan' ( (lv_colSpan_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMenuItem7166); 

                        	newLeafNode(otherlv_4, grammarAccess.getMenuItemAccess().getColSpanKeyword_4_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3442:1: ( (lv_colSpan_5_0= ruleEInt ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3443:1: (lv_colSpan_5_0= ruleEInt )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3443:1: (lv_colSpan_5_0= ruleEInt )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3444:3: lv_colSpan_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getColSpanEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMenuItem7187);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3460:4: (otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==21) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3460:6: otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMenuItem7202); 

                        	newLeafNode(otherlv_6, grammarAccess.getMenuItemAccess().getColorKeyword_5_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3464:1: ( (lv_color_7_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3465:1: (lv_color_7_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3465:1: (lv_color_7_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3466:3: lv_color_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getColorEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7223);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3482:4: (otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==22) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3482:6: otherlv_8= 'backgroundColor' ( (lv_backgroundColor_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMenuItem7238); 

                        	newLeafNode(otherlv_8, grammarAccess.getMenuItemAccess().getBackgroundColorKeyword_6_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3486:1: ( (lv_backgroundColor_9_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3487:1: (lv_backgroundColor_9_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3487:1: (lv_backgroundColor_9_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3488:3: lv_backgroundColor_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getBackgroundColorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7259);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3504:4: (otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==23) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3504:6: otherlv_10= 'backgroundImage' ( (lv_backgroundImage_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMenuItem7274); 

                        	newLeafNode(otherlv_10, grammarAccess.getMenuItemAccess().getBackgroundImageKeyword_7_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3508:1: ( (lv_backgroundImage_11_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3509:1: (lv_backgroundImage_11_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3509:1: (lv_backgroundImage_11_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3510:3: lv_backgroundImage_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getBackgroundImageEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7295);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3526:4: (otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==13) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3526:6: otherlv_12= 'title' ( (lv_title_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMenuItem7310); 

                        	newLeafNode(otherlv_12, grammarAccess.getMenuItemAccess().getTitleKeyword_8_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3530:1: ( (lv_title_13_0= ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3531:1: (lv_title_13_0= ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3531:1: (lv_title_13_0= ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3532:3: lv_title_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getTitleEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7331);
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

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3548:4: (otherlv_14= 'section' ( ( ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==49) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3548:6: otherlv_14= 'section' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMenuItem7346); 

                        	newLeafNode(otherlv_14, grammarAccess.getMenuItemAccess().getSectionKeyword_9_0());
                        
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3552:1: ( ( ruleEString ) )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3553:1: ( ruleEString )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3553:1: ( ruleEString )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3554:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMenuItemRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMenuItemAccess().getSectionSectionCrossReference_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenuItem7369);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMenuItem7383); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3579:1: ruleHeaderType returns [Enumerator current=null] : ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3581:28: ( ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3582:1: ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3582:1: ( (enumLiteral_0= 'H1' ) | (enumLiteral_1= 'H2' ) | (enumLiteral_2= 'H3' ) | (enumLiteral_3= 'H4' ) | (enumLiteral_4= 'H5' ) | (enumLiteral_5= 'H6' ) )
            int alt98=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt98=1;
                }
                break;
            case 51:
                {
                alt98=2;
                }
                break;
            case 52:
                {
                alt98=3;
                }
                break;
            case 53:
                {
                alt98=4;
                }
                break;
            case 54:
                {
                alt98=5;
                }
                break;
            case 55:
                {
                alt98=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3582:2: (enumLiteral_0= 'H1' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3582:2: (enumLiteral_0= 'H1' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3582:4: enumLiteral_0= 'H1'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleHeaderType7433); 

                            current = grammarAccess.getHeaderTypeAccess().getH1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHeaderTypeAccess().getH1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3588:6: (enumLiteral_1= 'H2' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3588:6: (enumLiteral_1= 'H2' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3588:8: enumLiteral_1= 'H2'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleHeaderType7450); 

                            current = grammarAccess.getHeaderTypeAccess().getH2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHeaderTypeAccess().getH2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3594:6: (enumLiteral_2= 'H3' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3594:6: (enumLiteral_2= 'H3' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3594:8: enumLiteral_2= 'H3'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleHeaderType7467); 

                            current = grammarAccess.getHeaderTypeAccess().getH3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHeaderTypeAccess().getH3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3600:6: (enumLiteral_3= 'H4' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3600:6: (enumLiteral_3= 'H4' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3600:8: enumLiteral_3= 'H4'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleHeaderType7484); 

                            current = grammarAccess.getHeaderTypeAccess().getH4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHeaderTypeAccess().getH4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3606:6: (enumLiteral_4= 'H5' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3606:6: (enumLiteral_4= 'H5' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3606:8: enumLiteral_4= 'H5'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleHeaderType7501); 

                            current = grammarAccess.getHeaderTypeAccess().getH5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getHeaderTypeAccess().getH5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3612:6: (enumLiteral_5= 'H6' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3612:6: (enumLiteral_5= 'H6' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3612:8: enumLiteral_5= 'H6'
                    {
                    enumLiteral_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleHeaderType7518); 

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
    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3622:1: ruleAnchorType returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) ) ;
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
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3624:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3625:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3625:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'btn_default' ) | (enumLiteral_2= 'btn_primary' ) | (enumLiteral_3= 'btn_success' ) | (enumLiteral_4= 'btn_info' ) | (enumLiteral_5= 'btn_warning' ) | (enumLiteral_6= 'btn_danger' ) )
            int alt99=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt99=1;
                }
                break;
            case 57:
                {
                alt99=2;
                }
                break;
            case 58:
                {
                alt99=3;
                }
                break;
            case 59:
                {
                alt99=4;
                }
                break;
            case 60:
                {
                alt99=5;
                }
                break;
            case 61:
                {
                alt99=6;
                }
                break;
            case 62:
                {
                alt99=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3625:2: (enumLiteral_0= 'default' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3625:2: (enumLiteral_0= 'default' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3625:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAnchorType7563); 

                            current = grammarAccess.getAnchorTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnchorTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3631:6: (enumLiteral_1= 'btn_default' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3631:6: (enumLiteral_1= 'btn_default' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3631:8: enumLiteral_1= 'btn_default'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleAnchorType7580); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_defaultEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnchorTypeAccess().getBtn_defaultEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3637:6: (enumLiteral_2= 'btn_primary' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3637:6: (enumLiteral_2= 'btn_primary' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3637:8: enumLiteral_2= 'btn_primary'
                    {
                    enumLiteral_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAnchorType7597); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_primaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnchorTypeAccess().getBtn_primaryEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:6: (enumLiteral_3= 'btn_success' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:6: (enumLiteral_3= 'btn_success' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3643:8: enumLiteral_3= 'btn_success'
                    {
                    enumLiteral_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAnchorType7614); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_successEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnchorTypeAccess().getBtn_successEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:6: (enumLiteral_4= 'btn_info' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:6: (enumLiteral_4= 'btn_info' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3649:8: enumLiteral_4= 'btn_info'
                    {
                    enumLiteral_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleAnchorType7631); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_infoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAnchorTypeAccess().getBtn_infoEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:6: (enumLiteral_5= 'btn_warning' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:6: (enumLiteral_5= 'btn_warning' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3655:8: enumLiteral_5= 'btn_warning'
                    {
                    enumLiteral_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAnchorType7648); 

                            current = grammarAccess.getAnchorTypeAccess().getBtn_warningEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAnchorTypeAccess().getBtn_warningEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:6: (enumLiteral_6= 'btn_danger' )
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:6: (enumLiteral_6= 'btn_danger' )
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3661:8: enumLiteral_6= 'btn_danger'
                    {
                    enumLiteral_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAnchorType7665); 

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
        public static final BitSet FOLLOW_rulePage_in_entryRulePage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePage131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePage143 = new BitSet(new long[]{0x000000000006E000L});
        public static final BitSet FOLLOW_13_in_rulePage156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePage177 = new BitSet(new long[]{0x000000000006C000L});
        public static final BitSet FOLLOW_14_in_rulePage192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePage215 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_15_in_rulePage230 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePage242 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleSection_in_rulePage263 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_rulePage276 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleSection_in_rulePage297 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_rulePage311 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_rulePage326 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleMenu_in_rulePage347 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePage361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSectionElement_in_entryRuleSectionElement397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSectionElement407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleSectionElement454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleSectionElement481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleSectionElement508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleSectionElement535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleSectionElement562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleSectionElement589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleSectionElement616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleSectionElement643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleSectionElement670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuElement_in_entryRuleMenuElement705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenuElement715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleMenuElement762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleMenuElement789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuItem_in_ruleMenuElement816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRowElement_in_entryRuleRowElement851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRowElement861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleRowElement908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleRowElement935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleRowElement962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleRowElement989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleRowElement1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleRowElement1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleRowElement1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleRowElement1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleRowElement1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_entryRuleCarouselElement1159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselElement1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPage_in_ruleCarouselElement1215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardElement_in_entryRuleCardElement1249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardElement1259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPage_in_ruleCardElement1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_entryRuleDivisionElement1339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivisionElement1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_ruleDivisionElement1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleDivisionElement1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleDivisionElement1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_ruleDivisionElement1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleDivisionElement1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_ruleDivisionElement1531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleDivisionElement1558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleDivisionElement1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_ruleDivisionElement1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_entryRuleCarouselPageElement1647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselPageElement1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleCarouselPageElement1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleCarouselPageElement1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleCarouselPageElement1758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleCarouselPageElement1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleCarouselPageElement1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_entryRuleCardPageElement1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardPageElement1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_ruleCardPageElement1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_ruleCardPageElement1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleCardPageElement1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_ruleCardPageElement1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_ruleCardPageElement2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSection_in_entryRuleSection2170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSection2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSection2226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2247 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSection2259 = new BitSet(new long[]{0x0000000001F20000L});
        public static final BitSet FOLLOW_20_in_ruleSection2272 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSection2293 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_21_in_ruleSection2308 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2329 = new BitSet(new long[]{0x0000000001C20000L});
        public static final BitSet FOLLOW_22_in_ruleSection2344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2365 = new BitSet(new long[]{0x0000000001820000L});
        public static final BitSet FOLLOW_23_in_ruleSection2380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSection2401 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleSection2416 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSection2428 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleSectionElement_in_ruleSection2449 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSection2462 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleSectionElement_in_ruleSection2483 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSection2497 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSection2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu2547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenu2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleMenu2603 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2624 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu2636 = new BitSet(new long[]{0x0000000004F20000L});
        public static final BitSet FOLLOW_20_in_ruleMenu2649 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMenu2670 = new BitSet(new long[]{0x0000000004E20000L});
        public static final BitSet FOLLOW_21_in_ruleMenu2685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2706 = new BitSet(new long[]{0x0000000004C20000L});
        public static final BitSet FOLLOW_22_in_ruleMenu2721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2742 = new BitSet(new long[]{0x0000000004820000L});
        public static final BitSet FOLLOW_23_in_ruleMenu2757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu2778 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleMenu2793 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu2805 = new BitSet(new long[]{0x0001000820000000L});
        public static final BitSet FOLLOW_ruleMenuElement_in_ruleMenu2826 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleMenu2839 = new BitSet(new long[]{0x0001000820000000L});
        public static final BitSet FOLLOW_ruleMenuElement_in_ruleMenu2860 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleMenu2874 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMenu2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEInt2975 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRow_in_entryRuleRow3037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRow3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleRow3093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3114 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRow3126 = new BitSet(new long[]{0x0000000001F20000L});
        public static final BitSet FOLLOW_20_in_ruleRow3139 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRow3160 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_21_in_ruleRow3175 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3196 = new BitSet(new long[]{0x0000000001C20000L});
        public static final BitSet FOLLOW_22_in_ruleRow3211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3232 = new BitSet(new long[]{0x0000000001820000L});
        public static final BitSet FOLLOW_23_in_ruleRow3247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRow3268 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleRow3283 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRow3295 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleRowElement_in_ruleRow3316 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleRow3329 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleRowElement_in_ruleRow3350 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleRow3364 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRow3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader3414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeader3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleHeader3470 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHeader3503 = new BitSet(new long[]{0x00000000C0F20000L});
        public static final BitSet FOLLOW_20_in_ruleHeader3516 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleHeader3537 = new BitSet(new long[]{0x00000000C0E20000L});
        public static final BitSet FOLLOW_21_in_ruleHeader3552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3573 = new BitSet(new long[]{0x00000000C0C20000L});
        public static final BitSet FOLLOW_22_in_ruleHeader3588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3609 = new BitSet(new long[]{0x00000000C0820000L});
        public static final BitSet FOLLOW_23_in_ruleHeader3624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3645 = new BitSet(new long[]{0x00000000C0020000L});
        public static final BitSet FOLLOW_30_in_ruleHeader3660 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleHeaderType_in_ruleHeader3681 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleHeader3696 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeader3717 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleHeader3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraf_in_entryRuleParagraf3767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParagraf3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleParagraf3823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf3844 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParagraf3856 = new BitSet(new long[]{0x0000000080F20000L});
        public static final BitSet FOLLOW_20_in_ruleParagraf3869 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleParagraf3890 = new BitSet(new long[]{0x0000000080E20000L});
        public static final BitSet FOLLOW_21_in_ruleParagraf3905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf3926 = new BitSet(new long[]{0x0000000080C20000L});
        public static final BitSet FOLLOW_22_in_ruleParagraf3941 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf3962 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_23_in_ruleParagraf3977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf3998 = new BitSet(new long[]{0x0000000080020000L});
        public static final BitSet FOLLOW_31_in_ruleParagraf4013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraf4034 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleParagraf4048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarousel_in_entryRuleCarousel4084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarousel4094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCarousel4140 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4161 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarousel4173 = new BitSet(new long[]{0x0000000400F20000L});
        public static final BitSet FOLLOW_20_in_ruleCarousel4186 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCarousel4207 = new BitSet(new long[]{0x0000000400E20000L});
        public static final BitSet FOLLOW_21_in_ruleCarousel4222 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4243 = new BitSet(new long[]{0x0000000400C20000L});
        public static final BitSet FOLLOW_22_in_ruleCarousel4258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4279 = new BitSet(new long[]{0x0000000400820000L});
        public static final BitSet FOLLOW_23_in_ruleCarousel4294 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarousel4315 = new BitSet(new long[]{0x0000000400020000L});
        public static final BitSet FOLLOW_34_in_ruleCarousel4330 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarousel4342 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_ruleCarousel4363 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleCarousel4376 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleCarouselElement_in_ruleCarousel4397 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleCarousel4411 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCarousel4425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_entryRuleImage4461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImage4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleImage4517 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImage4550 = new BitSet(new long[]{0x0000003000F20000L});
        public static final BitSet FOLLOW_20_in_ruleImage4563 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleImage4584 = new BitSet(new long[]{0x0000003000E20000L});
        public static final BitSet FOLLOW_21_in_ruleImage4599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4620 = new BitSet(new long[]{0x0000003000C20000L});
        public static final BitSet FOLLOW_22_in_ruleImage4635 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4656 = new BitSet(new long[]{0x0000003000820000L});
        public static final BitSet FOLLOW_23_in_ruleImage4671 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4692 = new BitSet(new long[]{0x0000003000020000L});
        public static final BitSet FOLLOW_36_in_ruleImage4707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4728 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_37_in_ruleImage4743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4764 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleImage4778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCard_in_entryRuleCard4814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCard4824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCard4870 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard4891 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCard4903 = new BitSet(new long[]{0x0000008000F20000L});
        public static final BitSet FOLLOW_20_in_ruleCard4916 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCard4937 = new BitSet(new long[]{0x0000008000E20000L});
        public static final BitSet FOLLOW_21_in_ruleCard4952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard4973 = new BitSet(new long[]{0x0000008000C20000L});
        public static final BitSet FOLLOW_22_in_ruleCard4988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5009 = new BitSet(new long[]{0x0000008000820000L});
        public static final BitSet FOLLOW_23_in_ruleCard5024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCard5045 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleCard5060 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCard5072 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleCardElement_in_ruleCard5093 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleCard5106 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleCardElement_in_ruleCard5127 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleCard5141 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCard5155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor5191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnchor5201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAnchor5247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5268 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnchor5280 = new BitSet(new long[]{0x0000020040F22000L});
        public static final BitSet FOLLOW_20_in_ruleAnchor5293 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAnchor5314 = new BitSet(new long[]{0x0000020040E22000L});
        public static final BitSet FOLLOW_21_in_ruleAnchor5329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5350 = new BitSet(new long[]{0x0000020040C22000L});
        public static final BitSet FOLLOW_22_in_ruleAnchor5365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5386 = new BitSet(new long[]{0x0000020040822000L});
        public static final BitSet FOLLOW_23_in_ruleAnchor5401 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5422 = new BitSet(new long[]{0x0000020040022000L});
        public static final BitSet FOLLOW_13_in_ruleAnchor5437 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5458 = new BitSet(new long[]{0x0000020040020000L});
        public static final BitSet FOLLOW_41_in_ruleAnchor5473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnchor5494 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleAnchor5509 = new BitSet(new long[]{0x7F00000000000000L});
        public static final BitSet FOLLOW_ruleAnchorType_in_ruleAnchor5530 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnchor5544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision5580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivision5590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDivision5636 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5657 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDivision5669 = new BitSet(new long[]{0x0000000001F20000L});
        public static final BitSet FOLLOW_20_in_ruleDivision5682 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDivision5703 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_21_in_ruleDivision5718 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5739 = new BitSet(new long[]{0x0000000001C20000L});
        public static final BitSet FOLLOW_22_in_ruleDivision5754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5775 = new BitSet(new long[]{0x0000000001820000L});
        public static final BitSet FOLLOW_23_in_ruleDivision5790 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDivision5811 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleDivision5826 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDivision5838 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_ruleDivision5859 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleDivision5872 = new BitSet(new long[]{0x00000D4B30000000L});
        public static final BitSet FOLLOW_ruleDivisionElement_in_ruleDivision5893 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleDivision5907 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDivision5921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMap_in_entryRuleMap5957 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMap5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMap6013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6034 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMap6046 = new BitSet(new long[]{0x0000300000F20000L});
        public static final BitSet FOLLOW_20_in_ruleMap6059 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMap6080 = new BitSet(new long[]{0x0000300000E20000L});
        public static final BitSet FOLLOW_21_in_ruleMap6095 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6116 = new BitSet(new long[]{0x0000300000C20000L});
        public static final BitSet FOLLOW_22_in_ruleMap6131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6152 = new BitSet(new long[]{0x0000300000820000L});
        public static final BitSet FOLLOW_23_in_ruleMap6167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6188 = new BitSet(new long[]{0x0000300000020000L});
        public static final BitSet FOLLOW_44_in_ruleMap6203 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6224 = new BitSet(new long[]{0x0000200000020000L});
        public static final BitSet FOLLOW_45_in_ruleMap6239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMap6260 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMap6274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarouselPage_in_entryRuleCarouselPage6310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarouselPage6320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCarouselPage6366 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarouselPage6399 = new BitSet(new long[]{0x0000000001F20000L});
        public static final BitSet FOLLOW_20_in_ruleCarouselPage6412 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCarouselPage6433 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_21_in_ruleCarouselPage6448 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6469 = new BitSet(new long[]{0x0000000001C20000L});
        public static final BitSet FOLLOW_22_in_ruleCarouselPage6484 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6505 = new BitSet(new long[]{0x0000000001820000L});
        public static final BitSet FOLLOW_23_in_ruleCarouselPage6520 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarouselPage6541 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleCarouselPage6556 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCarouselPage6568 = new BitSet(new long[]{0x0000050920000000L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6589 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleCarouselPage6602 = new BitSet(new long[]{0x0000050920000000L});
        public static final BitSet FOLLOW_ruleCarouselPageElement_in_ruleCarouselPage6623 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleCarouselPage6637 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCarouselPage6651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardPage_in_entryRuleCardPage6687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardPage6697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleCardPage6743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6764 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCardPage6776 = new BitSet(new long[]{0x0000000001F20000L});
        public static final BitSet FOLLOW_20_in_ruleCardPage6789 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCardPage6810 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_21_in_ruleCardPage6825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6846 = new BitSet(new long[]{0x0000000001C20000L});
        public static final BitSet FOLLOW_22_in_ruleCardPage6861 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6882 = new BitSet(new long[]{0x0000000001820000L});
        public static final BitSet FOLLOW_23_in_ruleCardPage6897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardPage6918 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleCardPage6933 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCardPage6945 = new BitSet(new long[]{0x0000050920000000L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_ruleCardPage6966 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleCardPage6979 = new BitSet(new long[]{0x0000050920000000L});
        public static final BitSet FOLLOW_ruleCardPageElement_in_ruleCardPage7000 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleCardPage7014 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCardPage7028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuItem_in_entryRuleMenuItem7064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenuItem7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMenuItem7120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7141 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenuItem7153 = new BitSet(new long[]{0x0002000000F22000L});
        public static final BitSet FOLLOW_20_in_ruleMenuItem7166 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMenuItem7187 = new BitSet(new long[]{0x0002000000E22000L});
        public static final BitSet FOLLOW_21_in_ruleMenuItem7202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7223 = new BitSet(new long[]{0x0002000000C22000L});
        public static final BitSet FOLLOW_22_in_ruleMenuItem7238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7259 = new BitSet(new long[]{0x0002000000822000L});
        public static final BitSet FOLLOW_23_in_ruleMenuItem7274 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7295 = new BitSet(new long[]{0x0002000000022000L});
        public static final BitSet FOLLOW_13_in_ruleMenuItem7310 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7331 = new BitSet(new long[]{0x0002000000020000L});
        public static final BitSet FOLLOW_49_in_ruleMenuItem7346 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenuItem7369 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMenuItem7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleHeaderType7433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleHeaderType7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleHeaderType7467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleHeaderType7484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleHeaderType7501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleHeaderType7518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAnchorType7563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleAnchorType7580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleAnchorType7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAnchorType7614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleAnchorType7631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAnchorType7648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAnchorType7665 = new BitSet(new long[]{0x0000000000000002L});
    }


}