package org.yazgel.aphrodit.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAphroditLexer extends Lexer {
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

    public InternalAphroditLexer() {;} 
    public InternalAphroditLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAphroditLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:11:7: ( 'Page' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:11:9: 'Page'
            {
            match("Page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:12:7: ( '{' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:13:7: ( 'title' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:13:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:14:7: ( 'introSection' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:14:9: 'introSection'
            {
            match("introSection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:15:7: ( 'sections' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:15:9: 'sections'
            {
            match("sections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:16:7: ( ',' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:17:7: ( '}' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:18:7: ( 'menu' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:18:9: 'menu'
            {
            match("menu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:19:7: ( 'Section' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:19:9: 'Section'
            {
            match("Section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:20:7: ( 'colSpan' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:20:9: 'colSpan'
            {
            match("colSpan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:21:7: ( 'color' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:21:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:22:7: ( 'backgroundColor' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:22:9: 'backgroundColor'
            {
            match("backgroundColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:23:7: ( 'backgroundImage' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:23:9: 'backgroundImage'
            {
            match("backgroundImage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:24:7: ( 'elements' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:24:9: 'elements'
            {
            match("elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:25:7: ( 'Menu' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:25:9: 'Menu'
            {
            match("Menu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:26:7: ( 'items' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:26:9: 'items'
            {
            match("items"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:27:7: ( '-' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:28:7: ( 'Row' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:28:9: 'Row'
            {
            match("Row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:29:7: ( 'Header' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:29:9: 'Header'
            {
            match("Header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:30:7: ( 'type' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:30:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:31:7: ( 'content' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:31:9: 'content'
            {
            match("content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:32:7: ( 'Paragraf' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:32:9: 'Paragraf'
            {
            match("Paragraf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:33:7: ( 'Carousel' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:33:9: 'Carousel'
            {
            match("Carousel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:34:7: ( 'carouselPages' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:34:9: 'carouselPages'
            {
            match("carouselPages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:35:7: ( 'Image' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:35:9: 'Image'
            {
            match("Image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:36:7: ( 'src' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:36:9: 'src'
            {
            match("src"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:37:7: ( 'borderRadius' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:37:9: 'borderRadius'
            {
            match("borderRadius"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:38:7: ( 'Card' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:38:9: 'Card'
            {
            match("Card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:39:7: ( 'pages' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:39:9: 'pages'
            {
            match("pages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:40:7: ( 'Anchor' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:40:9: 'Anchor'
            {
            match("Anchor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:41:7: ( 'link' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:41:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:42:7: ( 'Division' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:42:9: 'Division'
            {
            match("Division"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:43:7: ( 'Map' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:43:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:44:7: ( 'x' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:44:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:45:7: ( 'y' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:45:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:46:7: ( 'CarouselPage' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:46:9: 'CarouselPage'
            {
            match("CarouselPage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:47:7: ( 'CardPage' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:47:9: 'CardPage'
            {
            match("CardPage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:48:7: ( 'MenuItem' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:48:9: 'MenuItem'
            {
            match("MenuItem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:49:7: ( 'section' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:49:9: 'section'
            {
            match("section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:50:7: ( 'H1' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:50:9: 'H1'
            {
            match("H1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:51:7: ( 'H2' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:51:9: 'H2'
            {
            match("H2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:52:7: ( 'H3' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:52:9: 'H3'
            {
            match("H3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:53:7: ( 'H4' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:53:9: 'H4'
            {
            match("H4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:54:7: ( 'H5' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:54:9: 'H5'
            {
            match("H5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:55:7: ( 'H6' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:55:9: 'H6'
            {
            match("H6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:56:7: ( 'default' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:56:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:57:7: ( 'btn_default' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:57:9: 'btn_default'
            {
            match("btn_default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:58:7: ( 'btn_primary' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:58:9: 'btn_primary'
            {
            match("btn_primary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:59:7: ( 'btn_success' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:59:9: 'btn_success'
            {
            match("btn_success"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:60:7: ( 'btn_info' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:60:9: 'btn_info'
            {
            match("btn_info"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:61:7: ( 'btn_warning' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:61:9: 'btn_warning'
            {
            match("btn_warning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:62:7: ( 'btn_danger' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:62:9: 'btn_danger'
            {
            match("btn_danger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3670:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3670:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3670:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3670:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3670:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3672:10: ( ( '0' .. '9' )+ )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3672:12: ( '0' .. '9' )+
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3672:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3672:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3674:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3676:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3676:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3676:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3676:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:41: ( '\\r' )? '\\n'
                    {
                    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3678:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3680:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3680:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3680:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3682:16: ( . )
            // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:3682:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:322: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:330: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:339: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:351: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:367: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:383: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // ../org.yazgel.aphrodit.xtext/src-gen/org/yazgel/aphrodit/xtext/parser/antlr/internal/InternalAphrodit.g:1:391: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\43\1\uffff\3\43\2\uffff\6\43\1\uffff\10\43\1\106\1\107"+
        "\1\43\1\41\2\uffff\3\41\2\uffff\1\43\2\uffff\6\43\2\uffff\12\43"+
        "\1\uffff\2\43\1\143\1\144\1\145\1\146\1\147\1\150\6\43\2\uffff\1"+
        "\43\5\uffff\7\43\1\167\12\43\1\u0083\1\u0084\1\43\6\uffff\7\43\1"+
        "\u008e\2\43\1\u0091\3\43\1\uffff\1\u0095\11\43\1\u00a4\2\uffff\2"+
        "\43\1\u00a8\3\43\1\u00ac\2\43\1\uffff\1\43\1\u00b0\1\uffff\1\43"+
        "\1\u00b2\1\43\1\uffff\2\43\1\u00b6\13\43\1\uffff\3\43\1\uffff\1"+
        "\u00c6\1\u00c7\1\43\1\uffff\3\43\1\uffff\1\43\1\uffff\3\43\1\uffff"+
        "\14\43\1\u00dc\2\43\2\uffff\1\u00df\4\43\1\u00e5\1\u00e6\1\u00e7"+
        "\1\u00e8\13\43\1\uffff\2\43\1\uffff\1\43\1\u00f7\1\u00f8\1\43\1"+
        "\u00fa\4\uffff\7\43\1\u0102\1\43\1\u0104\1\u0105\1\u0107\1\u0108"+
        "\1\u0109\2\uffff\1\43\1\uffff\7\43\1\uffff\1\43\2\uffff\1\43\3\uffff"+
        "\5\43\1\u011a\11\43\1\u0124\1\uffff\1\u0125\1\u0126\1\u0127\1\43"+
        "\1\u0129\3\43\1\u012d\4\uffff\1\u012e\1\uffff\1\u012f\2\43\3\uffff"+
        "\2\43\1\u0134\1\u0135\2\uffff";
    static final String DFA12_eofS =
        "\u0136\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\uffff\1\151\1\156\1\145\2\uffff\2\145\2\141\1\154"+
        "\1\141\1\uffff\1\157\1\61\1\141\1\155\1\141\1\156\2\151\2\60\1\145"+
        "\1\101\2\uffff\2\0\1\52\2\uffff\1\147\2\uffff\1\164\1\160\1\164"+
        "\1\145\2\143\2\uffff\1\156\1\143\1\154\1\162\1\143\1\162\1\156\1"+
        "\145\1\156\1\160\1\uffff\1\167\1\141\6\60\1\162\1\141\1\147\1\143"+
        "\1\156\1\166\2\uffff\1\146\5\uffff\1\145\1\141\1\154\1\145\1\162"+
        "\1\155\1\164\1\60\1\165\1\164\1\123\1\164\1\157\1\153\1\144\1\137"+
        "\1\155\1\165\2\60\1\144\6\uffff\1\144\1\147\1\145\1\150\1\153\1"+
        "\151\1\141\1\60\1\147\1\145\1\60\1\157\1\163\1\151\1\uffff\1\60"+
        "\1\151\1\160\1\162\1\145\1\165\1\147\1\145\1\144\1\145\1\60\2\uffff"+
        "\1\145\1\165\1\60\1\145\1\163\1\157\1\60\1\163\1\165\1\uffff\1\162"+
        "\1\60\1\uffff\1\123\1\60\1\157\1\uffff\1\157\1\141\1\60\1\156\1"+
        "\163\2\162\1\141\1\162\1\165\1\156\1\141\1\156\1\164\1\uffff\1\162"+
        "\1\163\1\141\1\uffff\2\60\1\162\1\uffff\1\151\1\154\1\141\1\uffff"+
        "\1\145\1\uffff\3\156\1\uffff\1\164\1\145\1\157\1\122\1\146\1\156"+
        "\1\151\1\143\1\146\1\162\1\164\1\145\1\60\1\145\1\147\2\uffff\1"+
        "\60\1\157\1\164\1\146\1\143\4\60\1\154\1\165\2\141\1\147\1\155\1"+
        "\143\1\157\1\156\1\163\1\155\1\uffff\1\154\1\145\1\uffff\1\156\2"+
        "\60\1\164\1\60\4\uffff\1\120\1\156\1\144\1\165\1\145\1\141\1\145"+
        "\1\60\1\151\5\60\2\uffff\1\151\1\uffff\1\141\1\144\1\151\1\154\2"+
        "\162\1\163\1\uffff\1\156\2\uffff\1\141\3\uffff\1\157\1\147\1\103"+
        "\1\165\1\164\1\60\1\171\1\163\2\147\1\156\1\145\1\157\1\155\1\163"+
        "\1\60\1\uffff\3\60\1\145\1\60\1\163\1\154\1\141\1\60\4\uffff\1\60"+
        "\1\uffff\1\60\1\157\1\147\3\uffff\1\162\1\145\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\uffff\1\171\1\164\1\162\2\uffff\2\145\1\157\1"+
        "\164\1\154\1\145\1\uffff\1\157\1\145\1\141\1\155\1\141\1\156\2\151"+
        "\2\172\1\145\1\172\2\uffff\2\uffff\1\57\2\uffff\1\162\2\uffff\1"+
        "\164\1\160\1\164\1\145\2\143\2\uffff\1\156\1\143\1\156\1\162\1\143"+
        "\1\162\1\156\1\145\1\156\1\160\1\uffff\1\167\1\141\6\172\1\162\1"+
        "\141\1\147\1\143\1\156\1\166\2\uffff\1\146\5\uffff\1\145\1\141\1"+
        "\154\1\145\1\162\1\155\1\164\1\172\1\165\1\164\1\157\1\164\1\157"+
        "\1\153\1\144\1\137\1\155\1\165\2\172\1\144\6\uffff\1\157\1\147\1"+
        "\145\1\150\1\153\1\151\1\141\1\172\1\147\1\145\1\172\1\157\1\163"+
        "\1\151\1\uffff\1\172\1\151\1\160\1\162\1\145\1\165\1\147\1\145\1"+
        "\167\1\145\1\172\2\uffff\1\145\1\165\1\172\1\145\1\163\1\157\1\172"+
        "\1\163\1\165\1\uffff\1\162\1\172\1\uffff\1\123\1\172\1\157\1\uffff"+
        "\1\157\1\141\1\172\1\156\1\163\2\162\1\145\1\162\1\165\1\156\1\141"+
        "\1\156\1\164\1\uffff\1\162\1\163\1\141\1\uffff\2\172\1\162\1\uffff"+
        "\1\151\1\154\1\141\1\uffff\1\145\1\uffff\3\156\1\uffff\1\164\1\145"+
        "\1\157\1\122\1\146\1\156\1\151\1\143\1\146\1\162\1\164\1\145\1\172"+
        "\1\145\1\147\2\uffff\1\172\1\157\1\164\1\146\1\143\4\172\1\154\1"+
        "\165\2\141\1\147\1\155\1\143\1\157\1\156\1\163\1\155\1\uffff\1\154"+
        "\1\145\1\uffff\1\156\2\172\1\164\1\172\4\uffff\1\120\1\156\1\144"+
        "\1\165\1\145\1\141\1\145\1\172\1\151\5\172\2\uffff\1\151\1\uffff"+
        "\1\141\1\144\1\151\1\154\2\162\1\163\1\uffff\1\156\2\uffff\1\141"+
        "\3\uffff\1\157\1\147\1\111\1\165\1\164\1\172\1\171\1\163\2\147\1"+
        "\156\1\145\1\157\1\155\1\163\1\172\1\uffff\3\172\1\145\1\172\1\163"+
        "\1\154\1\141\1\172\4\uffff\1\172\1\uffff\1\172\1\157\1\147\3\uffff"+
        "\1\162\1\145\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\6\uffff\1\21\14\uffff\1\65\1\66\3"+
        "\uffff\1\72\1\73\1\uffff\1\65\1\2\6\uffff\1\6\1\7\12\uffff\1\21"+
        "\16\uffff\1\42\1\43\1\uffff\1\66\1\67\1\70\1\71\1\72\25\uffff\1"+
        "\50\1\51\1\52\1\53\1\54\1\55\16\uffff\1\32\13\uffff\1\41\1\22\11"+
        "\uffff\1\1\2\uffff\1\24\3\uffff\1\10\16\uffff\1\17\3\uffff\1\34"+
        "\3\uffff\1\37\3\uffff\1\3\1\uffff\1\20\3\uffff\1\13\17\uffff\1\31"+
        "\1\35\24\uffff\1\23\2\uffff\1\36\5\uffff\1\47\1\11\1\12\1\25\16"+
        "\uffff\1\56\1\26\1\uffff\1\5\7\uffff\1\62\1\uffff\1\16\1\46\1\uffff"+
        "\1\27\1\45\1\40\20\uffff\1\64\11\uffff\1\57\1\60\1\61\1\63\1\uffff"+
        "\1\4\3\uffff\1\33\1\44\1\30\4\uffff\1\14\1\15";
    static final String DFA12_specialS =
        "\1\2\34\uffff\1\0\1\1\u0117\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\4\41\1"+
            "\6\1\16\1\41\1\37\12\34\7\41\1\24\1\33\1\21\1\26\3\33\1\20\1"+
            "\22\3\33\1\15\2\33\1\1\1\33\1\17\1\11\7\33\3\41\1\32\1\33\1"+
            "\41\1\33\1\13\1\12\1\31\1\14\3\33\1\4\2\33\1\25\1\10\2\33\1"+
            "\23\2\33\1\5\1\3\3\33\1\27\1\30\1\33\1\2\1\41\1\7\uff82\41",
            "\1\42",
            "",
            "\1\45\17\uffff\1\46",
            "\1\47\5\uffff\1\50",
            "\1\51\14\uffff\1\52",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\60\15\uffff\1\57",
            "\1\61\15\uffff\1\62\4\uffff\1\63",
            "\1\64",
            "\1\66\3\uffff\1\65",
            "",
            "\1\70",
            "\1\72\1\73\1\74\1\75\1\76\1\77\56\uffff\1\71",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\110",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\112",
            "\0\112",
            "\1\113\4\uffff\1\114",
            "",
            "",
            "\1\116\12\uffff\1\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130\1\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\157",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\170",
            "\1\171",
            "\1\172\33\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0085",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087\12\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008f",
            "\1\u0090",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\4\uffff\1\u00a0\6\uffff\1\u009e\2\uffff\1\u009f\3"+
            "\uffff\1\u00a1",
            "\1\u00a2",
            "\12\43\7\uffff\10\43\1\u00a3\21\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\12\43\7\uffff\17\43\1\u00a7\12\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\3\uffff\1\u00bb",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00dd",
            "\1\u00de",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00e4\7"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00f9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0103",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\17\43\1\u0106\12\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "",
            "",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116\5\uffff\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0128",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "",
            "\1\u0132",
            "\1\u0133",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 74;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 74;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='i') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='m') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='c') ) {s = 10;}

                        else if ( (LA12_0=='b') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='M') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='R') ) {s = 15;}

                        else if ( (LA12_0=='H') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='I') ) {s = 18;}

                        else if ( (LA12_0=='p') ) {s = 19;}

                        else if ( (LA12_0=='A') ) {s = 20;}

                        else if ( (LA12_0=='l') ) {s = 21;}

                        else if ( (LA12_0=='D') ) {s = 22;}

                        else if ( (LA12_0=='x') ) {s = 23;}

                        else if ( (LA12_0=='y') ) {s = 24;}

                        else if ( (LA12_0=='d') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( (LA12_0=='B'||(LA12_0>='E' && LA12_0<='G')||(LA12_0>='J' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='w')||LA12_0=='z') ) {s = 27;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}