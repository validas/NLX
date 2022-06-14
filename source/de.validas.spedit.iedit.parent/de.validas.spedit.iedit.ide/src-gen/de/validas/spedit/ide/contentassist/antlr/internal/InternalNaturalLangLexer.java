package de.validas.spedit.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNaturalLangLexer extends Lexer {
    public static final int RULE_EXP=53;
    public static final int RULE_SMILEY=33;
    public static final int RULE_EXBR_CL=42;
    public static final int RULE_TABLE_LINE=38;
    public static final int RULE_GT=56;
    public static final int RULE_IGNORED=48;
    public static final int RULE_TRIPLE_DOT=34;
    public static final int RULE_CURRENCY=45;
    public static final int RULE_ID_ALL=22;
    public static final int RULE_UNDERSCORE=62;
    public static final int RULE_SPACE=8;
    public static final int RULE_PERCENT=30;
    public static final int RULE_ARROW=32;
    public static final int RULE_SEPARATORS=26;
    public static final int RULE_KM=37;
    public static final int RULE_SHORTCUTS=47;
    public static final int RULE_BR_O=40;
    public static final int RULE_BACKSLASH=61;
    public static final int RULE_ID=16;
    public static final int RULE_DOUBLE_DOT=21;
    public static final int RULE_EQUAL=55;
    public static final int RULE_ID_C=17;
    public static final int RULE_EXBRC_CL=44;
    public static final int RULE_COLON=28;
    public static final int RULE_INTERJ=51;
    public static final int RULE_SLASH=25;
    public static final int RULE_CURL=24;
    public static final int RULE_SEPARATORS_IT=27;
    public static final int RULE_MULTI=9;
    public static final int RULE_KOMMA=36;
    public static final int RULE_INT=5;
    public static final int RULE_FULL_STOP_IM=12;
    public static final int RULE_PARAGR=29;
    public static final int RULE_EXBR_O=41;
    public static final int RULE_BR_CL=35;
    public static final int RULE_FULL_STOP_NL=15;
    public static final int RULE_ALPHA=19;
    public static final int RULE_ALPHA_NUMERIC_C=63;
    public static final int RULE_END=7;
    public static final int RULE_IT_ID=20;
    public static final int RULE_HORIZ_SEP=39;
    public static final int RULE_NEWLINE=6;
    public static final int RULE_STRING=46;
    public static final int RULE_EXBRC_O=43;
    public static final int RULE_OPERATORS=31;
    public static final int RULE_AT=50;
    public static final int RULE_AND=52;
    public static final int RULE_HASH=4;
    public static final int RULE_DASH=10;
    public static final int RULE_PLUS=54;
    public static final int RULE_DOT=13;
    public static final int EOF=-1;
    public static final int RULE_HEX_NUMBER=23;
    public static final int RULE_WS=58;
    public static final int RULE_DECORATIONS=64;
    public static final int RULE_SM=57;
    public static final int RULE_ALL_ALPHA=18;
    public static final int RULE_ALPHA_NUMERIC=60;
    public static final int RULE_URL_PROTOCOL=49;
    public static final int RULE_FS=14;
    public static final int RULE_ANY_OTHER=65;
    public static final int RULE_ALPHA_CAPITAL=59;
    public static final int RULE_MINUS=11;

    // delegates
    // delegators

    public InternalNaturalLangLexer() {;} 
    public InternalNaturalLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNaturalLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNaturalLang.g"; }

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13699:12: ( ':' )
            // InternalNaturalLang.g:13699:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13701:10: ( '.' )
            // InternalNaturalLang.g:13701:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            int _type = RULE_FS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13703:9: ( ( RULE_DOT | ';' | RULE_INTERJ | RULE_COLON ) )
            // InternalNaturalLang.g:13703:11: ( RULE_DOT | ';' | RULE_INTERJ | RULE_COLON )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='.'||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_INTERJ"
    public final void mRULE_INTERJ() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13705:22: ( ( '?' | '!' ) )
            // InternalNaturalLang.g:13705:24: ( '?' | '!' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERJ"

    // $ANTLR start "RULE_KM"
    public final void mRULE_KM() throws RecognitionException {
        try {
            int _type = RULE_KM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13707:9: ( ',' )
            // InternalNaturalLang.g:13707:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KM"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13709:12: ( ( ' ' | '\\t' )+ )
            // InternalNaturalLang.g:13709:14: ( ' ' | '\\t' )+
            {
            // InternalNaturalLang.g:13709:14: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNaturalLang.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13711:14: ( ( '\\r' )? '\\n' )
            // InternalNaturalLang.g:13711:16: ( '\\r' )? '\\n'
            {
            // InternalNaturalLang.g:13711:16: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNaturalLang.g:13711:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_CURL"
    public final void mRULE_CURL() throws RecognitionException {
        try {
            int _type = RULE_CURL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13713:11: ( '~' )
            // InternalNaturalLang.g:13713:13: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURL"

    // $ANTLR start "RULE_OPERATORS"
    public final void mRULE_OPERATORS() throws RecognitionException {
        try {
            int _type = RULE_OPERATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13715:16: ( ( RULE_AND ( RULE_AND )? | RULE_EXP | RULE_PLUS | RULE_CURL | RULE_EQUAL ( RULE_EQUAL )? | RULE_INTERJ RULE_EQUAL | RULE_GT RULE_EQUAL | RULE_SM RULE_EQUAL | RULE_GT RULE_GT | RULE_SM RULE_SM ) )
            // InternalNaturalLang.g:13715:18: ( RULE_AND ( RULE_AND )? | RULE_EXP | RULE_PLUS | RULE_CURL | RULE_EQUAL ( RULE_EQUAL )? | RULE_INTERJ RULE_EQUAL | RULE_GT RULE_EQUAL | RULE_SM RULE_EQUAL | RULE_GT RULE_GT | RULE_SM RULE_SM )
            {
            // InternalNaturalLang.g:13715:18: ( RULE_AND ( RULE_AND )? | RULE_EXP | RULE_PLUS | RULE_CURL | RULE_EQUAL ( RULE_EQUAL )? | RULE_INTERJ RULE_EQUAL | RULE_GT RULE_EQUAL | RULE_SM RULE_EQUAL | RULE_GT RULE_GT | RULE_SM RULE_SM )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalNaturalLang.g:13715:19: RULE_AND ( RULE_AND )?
                    {
                    mRULE_AND(); 
                    // InternalNaturalLang.g:13715:28: ( RULE_AND )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='&') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalNaturalLang.g:13715:28: RULE_AND
                            {
                            mRULE_AND(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13715:38: RULE_EXP
                    {
                    mRULE_EXP(); 

                    }
                    break;
                case 3 :
                    // InternalNaturalLang.g:13715:47: RULE_PLUS
                    {
                    mRULE_PLUS(); 

                    }
                    break;
                case 4 :
                    // InternalNaturalLang.g:13715:57: RULE_CURL
                    {
                    mRULE_CURL(); 

                    }
                    break;
                case 5 :
                    // InternalNaturalLang.g:13715:67: RULE_EQUAL ( RULE_EQUAL )?
                    {
                    mRULE_EQUAL(); 
                    // InternalNaturalLang.g:13715:78: ( RULE_EQUAL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='=') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalNaturalLang.g:13715:78: RULE_EQUAL
                            {
                            mRULE_EQUAL(); 

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalNaturalLang.g:13715:90: RULE_INTERJ RULE_EQUAL
                    {
                    mRULE_INTERJ(); 
                    mRULE_EQUAL(); 

                    }
                    break;
                case 7 :
                    // InternalNaturalLang.g:13715:113: RULE_GT RULE_EQUAL
                    {
                    mRULE_GT(); 
                    mRULE_EQUAL(); 

                    }
                    break;
                case 8 :
                    // InternalNaturalLang.g:13715:132: RULE_SM RULE_EQUAL
                    {
                    mRULE_SM(); 
                    mRULE_EQUAL(); 

                    }
                    break;
                case 9 :
                    // InternalNaturalLang.g:13715:151: RULE_GT RULE_GT
                    {
                    mRULE_GT(); 
                    mRULE_GT(); 

                    }
                    break;
                case 10 :
                    // InternalNaturalLang.g:13715:167: RULE_SM RULE_SM
                    {
                    mRULE_SM(); 
                    mRULE_SM(); 

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
    // $ANTLR end "RULE_OPERATORS"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13717:18: ( ( RULE_NEWLINE | RULE_SPACE ) )
            // InternalNaturalLang.g:13717:20: ( RULE_NEWLINE | RULE_SPACE )
            {
            // InternalNaturalLang.g:13717:20: ( RULE_NEWLINE | RULE_SPACE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\t'||LA6_0==' ') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNaturalLang.g:13717:21: RULE_NEWLINE
                    {
                    mRULE_NEWLINE(); 

                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13717:34: RULE_SPACE
                    {
                    mRULE_SPACE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13719:12: ( ( ( RULE_MINUS )* RULE_GT | RULE_SM ( RULE_MINUS )* ) )
            // InternalNaturalLang.g:13719:14: ( ( RULE_MINUS )* RULE_GT | RULE_SM ( RULE_MINUS )* )
            {
            // InternalNaturalLang.g:13719:14: ( ( RULE_MINUS )* RULE_GT | RULE_SM ( RULE_MINUS )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-'||LA9_0=='>') ) {
                alt9=1;
            }
            else if ( (LA9_0=='<') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNaturalLang.g:13719:15: ( RULE_MINUS )* RULE_GT
                    {
                    // InternalNaturalLang.g:13719:15: ( RULE_MINUS )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13719:15: RULE_MINUS
                    	    {
                    	    mRULE_MINUS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    mRULE_GT(); 

                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13719:35: RULE_SM ( RULE_MINUS )*
                    {
                    mRULE_SM(); 
                    // InternalNaturalLang.g:13719:43: ( RULE_MINUS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='-') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13719:43: RULE_MINUS
                    	    {
                    	    mRULE_MINUS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_FULL_STOP_IM"
    public final void mRULE_FULL_STOP_IM() throws RecognitionException {
        try {
            int _type = RULE_FULL_STOP_IM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13721:19: ( RULE_FS RULE_SPACE )
            // InternalNaturalLang.g:13721:21: RULE_FS RULE_SPACE
            {
            mRULE_FS(); 
            mRULE_SPACE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FULL_STOP_IM"

    // $ANTLR start "RULE_FULL_STOP_NL"
    public final void mRULE_FULL_STOP_NL() throws RecognitionException {
        try {
            int _type = RULE_FULL_STOP_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13723:19: ( RULE_FS ( RULE_SPACE )? RULE_NEWLINE )
            // InternalNaturalLang.g:13723:21: RULE_FS ( RULE_SPACE )? RULE_NEWLINE
            {
            mRULE_FS(); 
            // InternalNaturalLang.g:13723:29: ( RULE_SPACE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\t'||LA10_0==' ') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNaturalLang.g:13723:29: RULE_SPACE
                    {
                    mRULE_SPACE(); 

                    }
                    break;

            }

            mRULE_NEWLINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FULL_STOP_NL"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13725:10: ( EOF )
            // InternalNaturalLang.g:13725:12: EOF
            {
            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_KOMMA"
    public final void mRULE_KOMMA() throws RecognitionException {
        try {
            int _type = RULE_KOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13727:12: ( RULE_KM RULE_WS )
            // InternalNaturalLang.g:13727:14: RULE_KM RULE_WS
            {
            mRULE_KM(); 
            mRULE_WS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KOMMA"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13729:12: ( ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' ) )
            // InternalNaturalLang.g:13729:14: ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_ALL_ALPHA"
    public final void mRULE_ALL_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALL_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13731:16: ( ( RULE_ALPHA_CAPITAL | RULE_ALPHA ) )
            // InternalNaturalLang.g:13731:18: ( RULE_ALPHA_CAPITAL | RULE_ALPHA )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALL_ALPHA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13733:9: ( RULE_ALL_ALPHA ( RULE_ALPHA )+ )
            // InternalNaturalLang.g:13733:11: RULE_ALL_ALPHA ( RULE_ALPHA )+
            {
            mRULE_ALL_ALPHA(); 
            // InternalNaturalLang.g:13733:26: ( RULE_ALPHA )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='a' && LA11_0<='z')||(LA11_0>='\u00DF' && LA11_0<='\u00FC')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNaturalLang.g:13733:26: RULE_ALPHA
            	    {
            	    mRULE_ALPHA(); 

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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ID_C"
    public final void mRULE_ID_C() throws RecognitionException {
        try {
            int _type = RULE_ID_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13735:11: ( RULE_ALPHA_CAPITAL ( RULE_ALPHA_CAPITAL )+ )
            // InternalNaturalLang.g:13735:13: RULE_ALPHA_CAPITAL ( RULE_ALPHA_CAPITAL )+
            {
            mRULE_ALPHA_CAPITAL(); 
            // InternalNaturalLang.g:13735:32: ( RULE_ALPHA_CAPITAL )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='\u00C0' && LA12_0<='\u00DC')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNaturalLang.g:13735:32: RULE_ALPHA_CAPITAL
            	    {
            	    mRULE_ALPHA_CAPITAL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_C"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13737:9: ( '@' )
            // InternalNaturalLang.g:13737:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_HEX_NUMBER"
    public final void mRULE_HEX_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_HEX_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13739:17: ( '0x' ( '0' .. '9' | 'A' .. 'F' )+ )
            // InternalNaturalLang.g:13739:19: '0x' ( '0' .. '9' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalNaturalLang.g:13739:24: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='F')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNaturalLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_NUMBER"

    // $ANTLR start "RULE_ALPHA_CAPITAL"
    public final void mRULE_ALPHA_CAPITAL() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13741:29: ( ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' ) )
            // InternalNaturalLang.g:13741:31: ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA_CAPITAL"

    // $ANTLR start "RULE_ALPHA_NUMERIC"
    public final void mRULE_ALPHA_NUMERIC() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13743:29: ( ( RULE_ALPHA | '0' .. '9' ) )
            // InternalNaturalLang.g:13743:31: ( RULE_ALPHA | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA_NUMERIC"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13745:12: ( '-' )
            // InternalNaturalLang.g:13745:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13747:14: ( '%' )
            // InternalNaturalLang.g:13747:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13749:21: ( '=' )
            // InternalNaturalLang.g:13749:23: '='
            {
            match('='); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13751:19: ( '^' )
            // InternalNaturalLang.g:13751:21: '^'
            {
            match('^'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13753:19: ( '&' )
            // InternalNaturalLang.g:13753:21: '&'
            {
            match('&'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_SEPARATORS"
    public final void mRULE_SEPARATORS() throws RecognitionException {
        try {
            int _type = RULE_SEPARATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13755:17: ( ( '\\'' | '\\u2019' | '\\u00B4' | RULE_BACKSLASH ) )
            // InternalNaturalLang.g:13755:19: ( '\\'' | '\\u2019' | '\\u00B4' | RULE_BACKSLASH )
            {
            if ( input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='\u00B4'||input.LA(1)=='\u2019' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATORS"

    // $ANTLR start "RULE_SEPARATORS_IT"
    public final void mRULE_SEPARATORS_IT() throws RecognitionException {
        try {
            int _type = RULE_SEPARATORS_IT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13757:20: ( ( RULE_UNDERSCORE | RULE_COLON ) )
            // InternalNaturalLang.g:13757:22: ( RULE_UNDERSCORE | RULE_COLON )
            {
            if ( input.LA(1)==':'||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATORS_IT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13759:10: ( ( '0' .. '9' )+ )
            // InternalNaturalLang.g:13759:12: ( '0' .. '9' )+
            {
            // InternalNaturalLang.g:13759:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalNaturalLang.g:13759:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13761:26: ( '_' )
            // InternalNaturalLang.g:13761:28: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_BR_O"
    public final void mRULE_BR_O() throws RecognitionException {
        try {
            int _type = RULE_BR_O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13763:11: ( '(' )
            // InternalNaturalLang.g:13763:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BR_O"

    // $ANTLR start "RULE_EXBR_O"
    public final void mRULE_EXBR_O() throws RecognitionException {
        try {
            int _type = RULE_EXBR_O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13765:13: ( '[' )
            // InternalNaturalLang.g:13765:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXBR_O"

    // $ANTLR start "RULE_EXBRC_O"
    public final void mRULE_EXBRC_O() throws RecognitionException {
        try {
            int _type = RULE_EXBRC_O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13767:14: ( '{' )
            // InternalNaturalLang.g:13767:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXBRC_O"

    // $ANTLR start "RULE_BR_CL"
    public final void mRULE_BR_CL() throws RecognitionException {
        try {
            int _type = RULE_BR_CL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13769:12: ( ')' )
            // InternalNaturalLang.g:13769:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BR_CL"

    // $ANTLR start "RULE_EXBR_CL"
    public final void mRULE_EXBR_CL() throws RecognitionException {
        try {
            int _type = RULE_EXBR_CL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13771:14: ( ']' )
            // InternalNaturalLang.g:13771:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXBR_CL"

    // $ANTLR start "RULE_EXBRC_CL"
    public final void mRULE_EXBRC_CL() throws RecognitionException {
        try {
            int _type = RULE_EXBRC_CL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13773:15: ( '}' )
            // InternalNaturalLang.g:13773:17: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXBRC_CL"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13775:18: ( '>' )
            // InternalNaturalLang.g:13775:20: '>'
            {
            match('>'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_SM"
    public final void mRULE_SM() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13777:18: ( '<' )
            // InternalNaturalLang.g:13777:20: '<'
            {
            match('<'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SM"

    // $ANTLR start "RULE_IT_ID"
    public final void mRULE_IT_ID() throws RecognitionException {
        try {
            int _type = RULE_IT_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13779:12: ( ( RULE_ALPHA | RULE_ALPHA_CAPITAL ) ( RULE_ALPHA_NUMERIC_C )+ )
            // InternalNaturalLang.g:13779:14: ( RULE_ALPHA | RULE_ALPHA_CAPITAL ) ( RULE_ALPHA_NUMERIC_C )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNaturalLang.g:13779:46: ( RULE_ALPHA_NUMERIC_C )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')||(LA15_0>='\u00C0' && LA15_0<='\u00DC')||(LA15_0>='\u00DF' && LA15_0<='\u00FC')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalNaturalLang.g:13779:46: RULE_ALPHA_NUMERIC_C
            	    {
            	    mRULE_ALPHA_NUMERIC_C(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IT_ID"

    // $ANTLR start "RULE_DOUBLE_DOT"
    public final void mRULE_DOUBLE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13781:17: ( RULE_DOT RULE_DOT )
            // InternalNaturalLang.g:13781:19: RULE_DOT RULE_DOT
            {
            mRULE_DOT(); 
            mRULE_DOT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_DOT"

    // $ANTLR start "RULE_TRIPLE_DOT"
    public final void mRULE_TRIPLE_DOT() throws RecognitionException {
        try {
            int _type = RULE_TRIPLE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13783:17: ( RULE_DOT RULE_DOT RULE_DOT )
            // InternalNaturalLang.g:13783:19: RULE_DOT RULE_DOT RULE_DOT
            {
            mRULE_DOT(); 
            mRULE_DOT(); 
            mRULE_DOT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRIPLE_DOT"

    // $ANTLR start "RULE_DECORATIONS"
    public final void mRULE_DECORATIONS() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13785:27: ( ( RULE_EQUAL RULE_EQUAL ( RULE_EQUAL )+ | RULE_MULTI RULE_MULTI ( RULE_MULTI )+ | RULE_HASH ( RULE_HASH )+ | RULE_DOT RULE_DOT RULE_DOT ( RULE_DOT )+ | RULE_MINUS ( RULE_MINUS )+ ) )
            // InternalNaturalLang.g:13785:29: ( RULE_EQUAL RULE_EQUAL ( RULE_EQUAL )+ | RULE_MULTI RULE_MULTI ( RULE_MULTI )+ | RULE_HASH ( RULE_HASH )+ | RULE_DOT RULE_DOT RULE_DOT ( RULE_DOT )+ | RULE_MINUS ( RULE_MINUS )+ )
            {
            // InternalNaturalLang.g:13785:29: ( RULE_EQUAL RULE_EQUAL ( RULE_EQUAL )+ | RULE_MULTI RULE_MULTI ( RULE_MULTI )+ | RULE_HASH ( RULE_HASH )+ | RULE_DOT RULE_DOT RULE_DOT ( RULE_DOT )+ | RULE_MINUS ( RULE_MINUS )+ )
            int alt21=5;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt21=1;
                }
                break;
            case '*':
                {
                alt21=2;
                }
                break;
            case '#':
                {
                alt21=3;
                }
                break;
            case '.':
                {
                alt21=4;
                }
                break;
            case '-':
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalNaturalLang.g:13785:30: RULE_EQUAL RULE_EQUAL ( RULE_EQUAL )+
                    {
                    mRULE_EQUAL(); 
                    mRULE_EQUAL(); 
                    // InternalNaturalLang.g:13785:52: ( RULE_EQUAL )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='=') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13785:52: RULE_EQUAL
                    	    {
                    	    mRULE_EQUAL(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13785:64: RULE_MULTI RULE_MULTI ( RULE_MULTI )+
                    {
                    mRULE_MULTI(); 
                    mRULE_MULTI(); 
                    // InternalNaturalLang.g:13785:86: ( RULE_MULTI )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='*') ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13785:86: RULE_MULTI
                    	    {
                    	    mRULE_MULTI(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalNaturalLang.g:13785:98: RULE_HASH ( RULE_HASH )+
                    {
                    mRULE_HASH(); 
                    // InternalNaturalLang.g:13785:108: ( RULE_HASH )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='#') ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13785:108: RULE_HASH
                    	    {
                    	    mRULE_HASH(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalNaturalLang.g:13785:119: RULE_DOT RULE_DOT RULE_DOT ( RULE_DOT )+
                    {
                    mRULE_DOT(); 
                    mRULE_DOT(); 
                    mRULE_DOT(); 
                    // InternalNaturalLang.g:13785:146: ( RULE_DOT )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='.') ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13785:146: RULE_DOT
                    	    {
                    	    mRULE_DOT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // InternalNaturalLang.g:13785:156: RULE_MINUS ( RULE_MINUS )+
                    {
                    mRULE_MINUS(); 
                    // InternalNaturalLang.g:13785:167: ( RULE_MINUS )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='-') ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13785:167: RULE_MINUS
                    	    {
                    	    mRULE_MINUS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECORATIONS"

    // $ANTLR start "RULE_IGNORED"
    public final void mRULE_IGNORED() throws RecognitionException {
        try {
            int _type = RULE_IGNORED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13787:14: ( RULE_DECORATIONS )
            // InternalNaturalLang.g:13787:16: RULE_DECORATIONS
            {
            mRULE_DECORATIONS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IGNORED"

    // $ANTLR start "RULE_SMILEY"
    public final void mRULE_SMILEY() throws RecognitionException {
        try {
            int _type = RULE_SMILEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13789:13: ( ( ':)' | ':-)' | ';)' | ';-)' | ':D' | ':(' | ':-(' | '\\u00A9' | '\\u00AE' ) )
            // InternalNaturalLang.g:13789:15: ( ':)' | ':-)' | ';)' | ';-)' | ':D' | ':(' | ':-(' | '\\u00A9' | '\\u00AE' )
            {
            // InternalNaturalLang.g:13789:15: ( ':)' | ':-)' | ';)' | ';-)' | ':D' | ':(' | ':-(' | '\\u00A9' | '\\u00AE' )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalNaturalLang.g:13789:16: ':)'
                    {
                    match(":)"); 


                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13789:21: ':-)'
                    {
                    match(":-)"); 


                    }
                    break;
                case 3 :
                    // InternalNaturalLang.g:13789:27: ';)'
                    {
                    match(";)"); 


                    }
                    break;
                case 4 :
                    // InternalNaturalLang.g:13789:32: ';-)'
                    {
                    match(";-)"); 


                    }
                    break;
                case 5 :
                    // InternalNaturalLang.g:13789:38: ':D'
                    {
                    match(":D"); 


                    }
                    break;
                case 6 :
                    // InternalNaturalLang.g:13789:43: ':('
                    {
                    match(":("); 


                    }
                    break;
                case 7 :
                    // InternalNaturalLang.g:13789:48: ':-('
                    {
                    match(":-("); 


                    }
                    break;
                case 8 :
                    // InternalNaturalLang.g:13789:54: '\\u00A9'
                    {
                    match('\u00A9'); 

                    }
                    break;
                case 9 :
                    // InternalNaturalLang.g:13789:63: '\\u00AE'
                    {
                    match('\u00AE'); 

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
    // $ANTLR end "RULE_SMILEY"

    // $ANTLR start "RULE_URL_PROTOCOL"
    public final void mRULE_URL_PROTOCOL() throws RecognitionException {
        try {
            int _type = RULE_URL_PROTOCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13791:19: ( ( 'http' ( 's' )? '://' | 'ftp://' | 'ssh://' | 'svn://' ) )
            // InternalNaturalLang.g:13791:21: ( 'http' ( 's' )? '://' | 'ftp://' | 'ssh://' | 'svn://' )
            {
            // InternalNaturalLang.g:13791:21: ( 'http' ( 's' )? '://' | 'ftp://' | 'ssh://' | 'svn://' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 'h':
                {
                alt24=1;
                }
                break;
            case 'f':
                {
                alt24=2;
                }
                break;
            case 's':
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3=='s') ) {
                    alt24=3;
                }
                else if ( (LA24_3=='v') ) {
                    alt24=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalNaturalLang.g:13791:22: 'http' ( 's' )? '://'
                    {
                    match("http"); 

                    // InternalNaturalLang.g:13791:29: ( 's' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='s') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalNaturalLang.g:13791:29: 's'
                            {
                            match('s'); 

                            }
                            break;

                    }

                    match("://"); 


                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13791:40: 'ftp://'
                    {
                    match("ftp://"); 


                    }
                    break;
                case 3 :
                    // InternalNaturalLang.g:13791:49: 'ssh://'
                    {
                    match("ssh://"); 


                    }
                    break;
                case 4 :
                    // InternalNaturalLang.g:13791:58: 'svn://'
                    {
                    match("svn://"); 


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
    // $ANTLR end "RULE_URL_PROTOCOL"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13793:11: ( '#' )
            // InternalNaturalLang.g:13793:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_PARAGR"
    public final void mRULE_PARAGR() throws RecognitionException {
        try {
            int _type = RULE_PARAGR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13795:13: ( '\\u00A7' )
            // InternalNaturalLang.g:13795:15: '\\u00A7'
            {
            match('\u00A7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAGR"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13797:20: ( '+' )
            // InternalNaturalLang.g:13797:22: '+'
            {
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MULTI"
    public final void mRULE_MULTI() throws RecognitionException {
        try {
            int _type = RULE_MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13799:12: ( '*' )
            // InternalNaturalLang.g:13799:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTI"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13801:11: ( ( '\\u2013' | '\\u2014' ) )
            // InternalNaturalLang.g:13801:13: ( '\\u2013' | '\\u2014' )
            {
            if ( (input.LA(1)>='\u2013' && input.LA(1)<='\u2014') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_HORIZ_SEP"
    public final void mRULE_HORIZ_SEP() throws RecognitionException {
        try {
            int _type = RULE_HORIZ_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13803:16: ( '|' )
            // InternalNaturalLang.g:13803:18: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HORIZ_SEP"

    // $ANTLR start "RULE_BACKSLASH"
    public final void mRULE_BACKSLASH() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13805:25: ( '\\\\' )
            // InternalNaturalLang.g:13805:27: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKSLASH"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13807:12: ( '/' )
            // InternalNaturalLang.g:13807:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_CURRENCY"
    public final void mRULE_CURRENCY() throws RecognitionException {
        try {
            int _type = RULE_CURRENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13809:15: ( ( '$' | '\\u20AC' ) )
            // InternalNaturalLang.g:13809:17: ( '$' | '\\u20AC' )
            {
            if ( input.LA(1)=='$'||input.LA(1)=='\u20AC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURRENCY"

    // $ANTLR start "RULE_ALPHA_NUMERIC_C"
    public final void mRULE_ALPHA_NUMERIC_C() throws RecognitionException {
        try {
            // InternalNaturalLang.g:13811:31: ( ( RULE_ALPHA_CAPITAL | RULE_ALPHA_NUMERIC ) )
            // InternalNaturalLang.g:13811:33: ( RULE_ALPHA_CAPITAL | RULE_ALPHA_NUMERIC )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA_NUMERIC_C"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13813:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\u201C' ( options {greedy=false; } : . )* '\\u201D' ) )
            // InternalNaturalLang.g:13813:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\u201C' ( options {greedy=false; } : . )* '\\u201D' )
            {
            // InternalNaturalLang.g:13813:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\u201C' ( options {greedy=false; } : . )* '\\u201D' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\"') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\u201C') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalNaturalLang.g:13813:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNaturalLang.g:13813:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13813:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNaturalLang.g:13813:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop25;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13813:48: '\\u201C' ( options {greedy=false; } : . )* '\\u201D'
                    {
                    match('\u201C'); 
                    // InternalNaturalLang.g:13813:57: ( options {greedy=false; } : . )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\u201D') ) {
                            alt26=2;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='\u201C')||(LA26_0>='\u201E' && LA26_0<='\uFFFF')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalNaturalLang.g:13813:85: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('\u201D'); 

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

    // $ANTLR start "RULE_TABLE_LINE"
    public final void mRULE_TABLE_LINE() throws RecognitionException {
        try {
            int _type = RULE_TABLE_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13815:17: ( RULE_PLUS ( RULE_MINUS )+ ( RULE_PLUS ( RULE_MINUS )+ )* RULE_PLUS )
            // InternalNaturalLang.g:13815:19: RULE_PLUS ( RULE_MINUS )+ ( RULE_PLUS ( RULE_MINUS )+ )* RULE_PLUS
            {
            mRULE_PLUS(); 
            // InternalNaturalLang.g:13815:29: ( RULE_MINUS )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='-') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalNaturalLang.g:13815:29: RULE_MINUS
            	    {
            	    mRULE_MINUS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalNaturalLang.g:13815:41: ( RULE_PLUS ( RULE_MINUS )+ )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='+') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='-') ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalNaturalLang.g:13815:42: RULE_PLUS ( RULE_MINUS )+
            	    {
            	    mRULE_PLUS(); 
            	    // InternalNaturalLang.g:13815:52: ( RULE_MINUS )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0=='-') ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalNaturalLang.g:13815:52: RULE_MINUS
            	    	    {
            	    	    mRULE_MINUS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            mRULE_PLUS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABLE_LINE"

    // $ANTLR start "RULE_ID_ALL"
    public final void mRULE_ID_ALL() throws RecognitionException {
        try {
            int _type = RULE_ID_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13817:13: ( RULE_ALPHA_NUMERIC_C ( RULE_ALPHA_NUMERIC_C )+ )
            // InternalNaturalLang.g:13817:15: RULE_ALPHA_NUMERIC_C ( RULE_ALPHA_NUMERIC_C )+
            {
            mRULE_ALPHA_NUMERIC_C(); 
            // InternalNaturalLang.g:13817:36: ( RULE_ALPHA_NUMERIC_C )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='Z')||(LA31_0>='a' && LA31_0<='z')||(LA31_0>='\u00C0' && LA31_0<='\u00DC')||(LA31_0>='\u00DF' && LA31_0<='\u00FC')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalNaturalLang.g:13817:36: RULE_ALPHA_NUMERIC_C
            	    {
            	    mRULE_ALPHA_NUMERIC_C(); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_ALL"

    // $ANTLR start "RULE_SHORTCUTS"
    public final void mRULE_SHORTCUTS() throws RecognitionException {
        try {
            int _type = RULE_SHORTCUTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13819:16: ( ( 'etc.' | 'asf.' | 'bzw.' | 'bspw.' | 'Evtl.' | 'evtl.' | 'Inc.' | 'inc.' | 'Bspw.' | 'Bzw.' | 'Dr.' | 'Prof.' | 'Ing.' | 'med.' ) )
            // InternalNaturalLang.g:13819:18: ( 'etc.' | 'asf.' | 'bzw.' | 'bspw.' | 'Evtl.' | 'evtl.' | 'Inc.' | 'inc.' | 'Bspw.' | 'Bzw.' | 'Dr.' | 'Prof.' | 'Ing.' | 'med.' )
            {
            // InternalNaturalLang.g:13819:18: ( 'etc.' | 'asf.' | 'bzw.' | 'bspw.' | 'Evtl.' | 'evtl.' | 'Inc.' | 'inc.' | 'Bspw.' | 'Bzw.' | 'Dr.' | 'Prof.' | 'Ing.' | 'med.' )
            int alt32=14;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalNaturalLang.g:13819:19: 'etc.'
                    {
                    match("etc."); 


                    }
                    break;
                case 2 :
                    // InternalNaturalLang.g:13819:26: 'asf.'
                    {
                    match("asf."); 


                    }
                    break;
                case 3 :
                    // InternalNaturalLang.g:13819:33: 'bzw.'
                    {
                    match("bzw."); 


                    }
                    break;
                case 4 :
                    // InternalNaturalLang.g:13819:40: 'bspw.'
                    {
                    match("bspw."); 


                    }
                    break;
                case 5 :
                    // InternalNaturalLang.g:13819:48: 'Evtl.'
                    {
                    match("Evtl."); 


                    }
                    break;
                case 6 :
                    // InternalNaturalLang.g:13819:56: 'evtl.'
                    {
                    match("evtl."); 


                    }
                    break;
                case 7 :
                    // InternalNaturalLang.g:13819:64: 'Inc.'
                    {
                    match("Inc."); 


                    }
                    break;
                case 8 :
                    // InternalNaturalLang.g:13819:71: 'inc.'
                    {
                    match("inc."); 


                    }
                    break;
                case 9 :
                    // InternalNaturalLang.g:13819:78: 'Bspw.'
                    {
                    match("Bspw."); 


                    }
                    break;
                case 10 :
                    // InternalNaturalLang.g:13819:86: 'Bzw.'
                    {
                    match("Bzw."); 


                    }
                    break;
                case 11 :
                    // InternalNaturalLang.g:13819:93: 'Dr.'
                    {
                    match("Dr."); 


                    }
                    break;
                case 12 :
                    // InternalNaturalLang.g:13819:99: 'Prof.'
                    {
                    match("Prof."); 


                    }
                    break;
                case 13 :
                    // InternalNaturalLang.g:13819:107: 'Ing.'
                    {
                    match("Ing."); 


                    }
                    break;
                case 14 :
                    // InternalNaturalLang.g:13819:114: 'med.'
                    {
                    match("med."); 


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
    // $ANTLR end "RULE_SHORTCUTS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNaturalLang.g:13821:16: ( . )
            // InternalNaturalLang.g:13821:18: .
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
        // InternalNaturalLang.g:1:8: ( RULE_COLON | RULE_DOT | RULE_FS | RULE_KM | RULE_SPACE | RULE_NEWLINE | RULE_CURL | RULE_OPERATORS | RULE_ARROW | RULE_FULL_STOP_IM | RULE_FULL_STOP_NL | RULE_END | RULE_KOMMA | RULE_ALPHA | RULE_ALL_ALPHA | RULE_ID | RULE_ID_C | RULE_AT | RULE_HEX_NUMBER | RULE_MINUS | RULE_PERCENT | RULE_SEPARATORS | RULE_SEPARATORS_IT | RULE_INT | RULE_BR_O | RULE_EXBR_O | RULE_EXBRC_O | RULE_BR_CL | RULE_EXBR_CL | RULE_EXBRC_CL | RULE_IT_ID | RULE_DOUBLE_DOT | RULE_TRIPLE_DOT | RULE_IGNORED | RULE_SMILEY | RULE_URL_PROTOCOL | RULE_HASH | RULE_PARAGR | RULE_MULTI | RULE_DASH | RULE_HORIZ_SEP | RULE_SLASH | RULE_CURRENCY | RULE_STRING | RULE_TABLE_LINE | RULE_ID_ALL | RULE_SHORTCUTS | RULE_ANY_OTHER )
        int alt33=48;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // InternalNaturalLang.g:1:10: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 2 :
                // InternalNaturalLang.g:1:21: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 3 :
                // InternalNaturalLang.g:1:30: RULE_FS
                {
                mRULE_FS(); 

                }
                break;
            case 4 :
                // InternalNaturalLang.g:1:38: RULE_KM
                {
                mRULE_KM(); 

                }
                break;
            case 5 :
                // InternalNaturalLang.g:1:46: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 6 :
                // InternalNaturalLang.g:1:57: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 7 :
                // InternalNaturalLang.g:1:70: RULE_CURL
                {
                mRULE_CURL(); 

                }
                break;
            case 8 :
                // InternalNaturalLang.g:1:80: RULE_OPERATORS
                {
                mRULE_OPERATORS(); 

                }
                break;
            case 9 :
                // InternalNaturalLang.g:1:95: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 10 :
                // InternalNaturalLang.g:1:106: RULE_FULL_STOP_IM
                {
                mRULE_FULL_STOP_IM(); 

                }
                break;
            case 11 :
                // InternalNaturalLang.g:1:124: RULE_FULL_STOP_NL
                {
                mRULE_FULL_STOP_NL(); 

                }
                break;
            case 12 :
                // InternalNaturalLang.g:1:142: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 13 :
                // InternalNaturalLang.g:1:151: RULE_KOMMA
                {
                mRULE_KOMMA(); 

                }
                break;
            case 14 :
                // InternalNaturalLang.g:1:162: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 15 :
                // InternalNaturalLang.g:1:173: RULE_ALL_ALPHA
                {
                mRULE_ALL_ALPHA(); 

                }
                break;
            case 16 :
                // InternalNaturalLang.g:1:188: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalNaturalLang.g:1:196: RULE_ID_C
                {
                mRULE_ID_C(); 

                }
                break;
            case 18 :
                // InternalNaturalLang.g:1:206: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 19 :
                // InternalNaturalLang.g:1:214: RULE_HEX_NUMBER
                {
                mRULE_HEX_NUMBER(); 

                }
                break;
            case 20 :
                // InternalNaturalLang.g:1:230: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 21 :
                // InternalNaturalLang.g:1:241: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 22 :
                // InternalNaturalLang.g:1:254: RULE_SEPARATORS
                {
                mRULE_SEPARATORS(); 

                }
                break;
            case 23 :
                // InternalNaturalLang.g:1:270: RULE_SEPARATORS_IT
                {
                mRULE_SEPARATORS_IT(); 

                }
                break;
            case 24 :
                // InternalNaturalLang.g:1:289: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalNaturalLang.g:1:298: RULE_BR_O
                {
                mRULE_BR_O(); 

                }
                break;
            case 26 :
                // InternalNaturalLang.g:1:308: RULE_EXBR_O
                {
                mRULE_EXBR_O(); 

                }
                break;
            case 27 :
                // InternalNaturalLang.g:1:320: RULE_EXBRC_O
                {
                mRULE_EXBRC_O(); 

                }
                break;
            case 28 :
                // InternalNaturalLang.g:1:333: RULE_BR_CL
                {
                mRULE_BR_CL(); 

                }
                break;
            case 29 :
                // InternalNaturalLang.g:1:344: RULE_EXBR_CL
                {
                mRULE_EXBR_CL(); 

                }
                break;
            case 30 :
                // InternalNaturalLang.g:1:357: RULE_EXBRC_CL
                {
                mRULE_EXBRC_CL(); 

                }
                break;
            case 31 :
                // InternalNaturalLang.g:1:371: RULE_IT_ID
                {
                mRULE_IT_ID(); 

                }
                break;
            case 32 :
                // InternalNaturalLang.g:1:382: RULE_DOUBLE_DOT
                {
                mRULE_DOUBLE_DOT(); 

                }
                break;
            case 33 :
                // InternalNaturalLang.g:1:398: RULE_TRIPLE_DOT
                {
                mRULE_TRIPLE_DOT(); 

                }
                break;
            case 34 :
                // InternalNaturalLang.g:1:414: RULE_IGNORED
                {
                mRULE_IGNORED(); 

                }
                break;
            case 35 :
                // InternalNaturalLang.g:1:427: RULE_SMILEY
                {
                mRULE_SMILEY(); 

                }
                break;
            case 36 :
                // InternalNaturalLang.g:1:439: RULE_URL_PROTOCOL
                {
                mRULE_URL_PROTOCOL(); 

                }
                break;
            case 37 :
                // InternalNaturalLang.g:1:457: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 38 :
                // InternalNaturalLang.g:1:467: RULE_PARAGR
                {
                mRULE_PARAGR(); 

                }
                break;
            case 39 :
                // InternalNaturalLang.g:1:479: RULE_MULTI
                {
                mRULE_MULTI(); 

                }
                break;
            case 40 :
                // InternalNaturalLang.g:1:490: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 41 :
                // InternalNaturalLang.g:1:500: RULE_HORIZ_SEP
                {
                mRULE_HORIZ_SEP(); 

                }
                break;
            case 42 :
                // InternalNaturalLang.g:1:515: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 43 :
                // InternalNaturalLang.g:1:526: RULE_CURRENCY
                {
                mRULE_CURRENCY(); 

                }
                break;
            case 44 :
                // InternalNaturalLang.g:1:540: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalNaturalLang.g:1:552: RULE_TABLE_LINE
                {
                mRULE_TABLE_LINE(); 

                }
                break;
            case 46 :
                // InternalNaturalLang.g:1:568: RULE_ID_ALL
                {
                mRULE_ID_ALL(); 

                }
                break;
            case 47 :
                // InternalNaturalLang.g:1:580: RULE_SHORTCUTS
                {
                mRULE_SHORTCUTS(); 

                }
                break;
            case 48 :
                // InternalNaturalLang.g:1:595: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\41\6\uffff\1\75\1\74\4\uffff";
    static final String DFA5_maxS =
        "\1\176\6\uffff\1\76\1\75\4\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\1\11\1\12\1\10";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\6\4\uffff\1\1\4\uffff\1\3\20\uffff\1\10\1\5\1\7\1\6\36\uffff\1\2\37\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\12",
            "\1\13\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    static class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "13715:18: ( RULE_AND ( RULE_AND )? | RULE_EXP | RULE_PLUS | RULE_CURL | RULE_EQUAL ( RULE_EQUAL )? | RULE_INTERJ RULE_EQUAL | RULE_GT RULE_EQUAL | RULE_SM RULE_EQUAL | RULE_GT RULE_GT | RULE_SM RULE_SM )";
        }
    }
    static final String DFA22_eotS =
        "\15\uffff";
    static final String DFA22_eofS =
        "\15\uffff";
    static final String DFA22_minS =
        "\1\72\1\50\1\51\3\uffff\1\50\6\uffff";
    static final String DFA22_maxS =
        "\1\u00ae\1\104\1\55\3\uffff\1\51\6\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\10\1\11\1\1\1\uffff\1\5\1\6\1\3\1\4\1\2\1\7";
    static final String DFA22_specialS =
        "\15\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\2\155\uffff\1\3\4\uffff\1\4",
            "\1\10\1\5\3\uffff\1\6\26\uffff\1\7",
            "\1\11\3\uffff\1\12",
            "",
            "",
            "",
            "\1\14\1\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "13789:15: ( ':)' | ':-)' | ';)' | ';-)' | ':D' | ':(' | ':-(' | '\\u00A9' | '\\u00AE' )";
        }
    }
    static final String DFA32_eotS =
        "\24\uffff";
    static final String DFA32_eofS =
        "\24\uffff";
    static final String DFA32_minS =
        "\1\102\1\164\1\uffff\1\163\1\uffff\1\156\1\uffff\1\163\7\uffff\1\143\4\uffff";
    static final String DFA32_maxS =
        "\1\155\1\166\1\uffff\1\172\1\uffff\1\156\1\uffff\1\172\7\uffff\1\147\4\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\uffff\1\10\1\uffff\1\13\1\14\1\16\1\1\1\6\1\3\1\4\1\uffff\1\11\1\12\1\7\1\15";
    static final String DFA32_specialS =
        "\24\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\7\1\uffff\1\10\1\4\3\uffff\1\5\6\uffff\1\11\20\uffff\1\2\1\3\2\uffff\1\1\3\uffff\1\6\3\uffff\1\12",
            "\1\13\1\uffff\1\14",
            "",
            "\1\16\6\uffff\1\15",
            "",
            "\1\17",
            "",
            "\1\20\6\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\3\uffff\1\23",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "13819:18: ( 'etc.' | 'asf.' | 'bzw.' | 'bspw.' | 'Evtl.' | 'evtl.' | 'Inc.' | 'inc.' | 'Bspw.' | 'Bzw.' | 'Dr.' | 'Prof.' | 'Ing.' | 'med.' )";
        }
    }
    static final String DFA33_eotS =
        "\1\21\1\72\1\75\1\77\1\101\1\uffff\1\70\4\uffff\2\100\1\77\2\110\1\111\1\uffff\1\114\1\120\1\uffff\1\124\3\uffff\1\124\6\uffff\1\140\1\142\2\uffff\3\114\5\uffff\2\70\3\114\2\120\1\114\3\120\1\114\3\uffff\1\170\2\uffff\1\171\10\uffff\1\100\2\uffff\1\141\1\174\1\uffff\1\174\1\175\1\174\1\uffff\1\177\1\uffff\1\126\1\uffff\1\124\15\uffff\5\174\6\uffff\12\174\2\uffff\1\u0091\1\174\2\uffff\1\174\1\uffff\1\u0094\16\174\1\uffff\1\174\1\uffff\2\174\2\uffff\5\174";
    static final String DFA33_eofS =
        "\u009b\uffff";
    static final String DFA33_minS =
        "\1\0\4\11\1\uffff\1\12\4\uffff\1\55\1\75\1\11\1\75\1\74\1\55\1\uffff\2\60\1\uffff\1\60\3\uffff\1\60\6\uffff\1\52\1\43\2\uffff\3\60\5\uffff\2\0\12\60\3\uffff\1\11\2\uffff\1\56\10\uffff\1\75\2\uffff\1\55\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\15\uffff\5\60\6\uffff\10\60\1\56\1\60\2\uffff\1\56\1\60\2\uffff\1\60\1\uffff\4\60\1\56\1\60\2\56\1\60\3\56\1\60\2\56\1\uffff\1\60\1\uffff\1\60\1\56\2\uffff\4\56\1\60";
    static final String DFA33_maxS =
        "\1\uffff\1\104\1\56\1\75\1\40\1\uffff\1\12\4\uffff\1\55\1\75\1\55\1\76\1\75\1\76\1\uffff\2\u00fc\1\uffff\1\u00fc\3\uffff\1\u00fc\6\uffff\1\52\1\43\2\uffff\3\u00fc\5\uffff\2\uffff\12\u00fc\3\uffff\1\40\2\uffff\1\56\10\uffff\1\75\2\uffff\1\76\1\u00fc\1\uffff\3\u00fc\1\uffff\1\u00fc\1\uffff\1\106\1\uffff\1\u00fc\15\uffff\5\u00fc\6\uffff\12\u00fc\2\uffff\1\56\1\u00fc\2\uffff\1\u00fc\1\uffff\17\u00fc\1\uffff\1\u00fc\1\uffff\2\u00fc\2\uffff\5\u00fc";
    static final String DFA33_acceptS =
        "\5\uffff\1\5\1\uffff\1\6\1\7\2\10\6\uffff\1\14\2\uffff\1\22\1\uffff\1\25\1\26\1\27\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\2\43\3\uffff\1\46\1\50\1\51\1\52\1\53\14\uffff\1\60\1\43\1\1\1\uffff\1\13\1\2\1\uffff\1\3\1\10\1\4\1\15\1\5\1\6\1\7\1\55\1\uffff\1\11\1\24\2\uffff\1\16\3\uffff\1\17\1\uffff\1\22\1\uffff\1\30\1\uffff\1\56\1\25\1\26\1\27\1\31\1\32\1\33\1\34\1\35\1\36\1\47\1\42\1\45\5\uffff\1\46\1\50\1\51\1\52\1\53\1\54\12\uffff\1\12\1\40\2\uffff\1\20\1\37\1\uffff\1\21\17\uffff\1\57\1\uffff\1\41\2\uffff\1\23\1\44\5\uffff";
    static final String DFA33_specialS =
        "\1\1\53\uffff\1\0\1\2\155\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\70\1\5\1\7\2\70\1\6\22\70\1\5\1\3\1\54\1\41\1\53\1\26\1\11\1\27\1\32\1\35\1\40\1\13\1\4\1\20\1\2\1\52\1\25\11\31\1\1\1\15\1\17\1\14\1\16\1\3\1\24\1\66\1\62\1\66\1\64\1\23\3\66\1\61\6\66\1\65\12\66\1\33\1\27\1\36\1\12\1\30\1\70\1\56\1\57\2\67\1\46\1\44\1\67\1\22\1\60\3\67\1\63\5\67\1\45\7\67\1\34\1\51\1\37\1\10\50\70\1\47\1\70\1\42\4\70\1\43\5\70\1\27\13\70\35\66\2\70\36\67\u1f16\70\2\50\4\70\1\27\2\70\1\55\u008f\70\1\53\udf53\70",
            "\1\73\1\74\2\uffff\1\74\22\uffff\1\73\7\uffff\2\71\3\uffff\1\71\26\uffff\1\71",
            "\1\73\1\74\2\uffff\1\74\22\uffff\1\73\15\uffff\1\76",
            "\1\73\1\74\2\uffff\1\74\22\uffff\1\73\34\uffff\1\100",
            "\2\102\2\uffff\1\102\22\uffff\1\102",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\73\1\74\2\uffff\1\74\22\uffff\1\73\10\uffff\1\71\3\uffff\1\71",
            "\2\100",
            "\2\100",
            "\1\112\20\uffff\1\110",
            "",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\113\6\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\25\115\1\117\4\115\105\uffff\35\121\2\uffff\36\115",
            "",
            "\12\125\7\uffff\32\126\6\uffff\27\126\1\123\2\126\105\uffff\35\126\2\uffff\36\126",
            "",
            "",
            "",
            "\12\125\7\uffff\32\126\6\uffff\32\126\105\uffff\35\126\2\uffff\36\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\141",
            "",
            "",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\143\6\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\22\115\1\144\2\115\1\145\4\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\146\1\115\1\147\4\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "",
            "",
            "",
            "\0\155",
            "\0\155",
            "\12\116\7\uffff\32\116\6\uffff\22\115\1\156\7\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\22\115\1\160\6\115\1\157\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\15\115\1\161\14\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\15\115\1\162\14\115\105\uffff\35\121\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\22\115\1\163\6\115\1\164\105\uffff\35\121\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\4\115\1\165\25\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\21\115\1\166\10\115\105\uffff\35\121\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\21\115\1\167\10\115\105\uffff\35\121\2\uffff\36\115",
            "\12\116\7\uffff\32\121\6\uffff\32\115\105\uffff\35\121\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "",
            "\1\73\1\74\2\uffff\1\74\22\uffff\1\73",
            "",
            "",
            "\1\172",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "\1\112\20\uffff\1\110",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\173\6\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\32\116\105\uffff\35\116\2\uffff\36\116",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\176\6\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "\12\116\7\uffff\32\121\6\uffff\32\116\105\uffff\35\121\2\uffff\36\116",
            "",
            "\12\u0080\7\uffff\6\u0080",
            "",
            "\12\125\7\uffff\32\126\6\uffff\32\126\105\uffff\35\126\2\uffff\36\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\116\7\uffff\32\116\6\uffff\17\115\1\u0081\12\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\7\115\1\u0082\22\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\15\115\1\u0083\14\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\2\115\1\u0084\27\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\23\115\1\u0085\6\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\116\7\uffff\32\116\6\uffff\5\115\1\u0086\24\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\26\115\1\u0087\3\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\17\115\1\u0088\12\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\2\115\1\u0089\27\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\2\115\1\u008a\3\115\1\u008b\23\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\17\115\1\u008c\12\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\26\115\1\u008d\3\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\3\115\1\u008e\26\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\16\115\1\u0090\13\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "\1\141",
            "\12\116\7\uffff\32\116\6\uffff\17\115\1\u0092\12\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "\12\116\7\uffff\32\116\6\uffff\13\115\1\u0093\16\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "\12\u0080\7\uffff\6\u0080\24\126\6\uffff\32\126\105\uffff\35\126\2\uffff\36\126",
            "\12\116\1\u0095\6\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\1\u0095\6\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\1\u0095\6\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\13\115\1\u0096\16\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\26\115\1\u0097\3\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\7\uffff\32\116\6\uffff\26\115\1\u0098\3\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "\12\116\7\uffff\32\116\6\uffff\5\115\1\u0099\24\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "\12\116\1\u0095\6\uffff\32\116\6\uffff\22\115\1\u009a\7\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "",
            "",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\1\u008f\1\uffff\12\116\7\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115",
            "\12\116\1\u0095\6\uffff\32\116\6\uffff\32\115\105\uffff\35\116\2\uffff\36\115"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_COLON | RULE_DOT | RULE_FS | RULE_KM | RULE_SPACE | RULE_NEWLINE | RULE_CURL | RULE_OPERATORS | RULE_ARROW | RULE_FULL_STOP_IM | RULE_FULL_STOP_NL | RULE_END | RULE_KOMMA | RULE_ALPHA | RULE_ALL_ALPHA | RULE_ID | RULE_ID_C | RULE_AT | RULE_HEX_NUMBER | RULE_MINUS | RULE_PERCENT | RULE_SEPARATORS | RULE_SEPARATORS_IT | RULE_INT | RULE_BR_O | RULE_EXBR_O | RULE_EXBRC_O | RULE_BR_CL | RULE_EXBR_CL | RULE_EXBRC_CL | RULE_IT_ID | RULE_DOUBLE_DOT | RULE_TRIPLE_DOT | RULE_IGNORED | RULE_SMILEY | RULE_URL_PROTOCOL | RULE_HASH | RULE_PARAGR | RULE_MULTI | RULE_DASH | RULE_HORIZ_SEP | RULE_SLASH | RULE_CURRENCY | RULE_STRING | RULE_TABLE_LINE | RULE_ID_ALL | RULE_SHORTCUTS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_44 = input.LA(1);

                        s = -1;
                        if ( ((LA33_44>='\u0000' && LA33_44<='\uFFFF')) ) {s = 109;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_0 = input.LA(1);

                        s = -1;
                        if ( (LA33_0==':') ) {s = 1;}

                        else if ( (LA33_0=='.') ) {s = 2;}

                        else if ( (LA33_0=='!'||LA33_0=='?') ) {s = 3;}

                        else if ( (LA33_0==',') ) {s = 4;}

                        else if ( (LA33_0=='\t'||LA33_0==' ') ) {s = 5;}

                        else if ( (LA33_0=='\r') ) {s = 6;}

                        else if ( (LA33_0=='\n') ) {s = 7;}

                        else if ( (LA33_0=='~') ) {s = 8;}

                        else if ( (LA33_0=='&') ) {s = 9;}

                        else if ( (LA33_0=='^') ) {s = 10;}

                        else if ( (LA33_0=='+') ) {s = 11;}

                        else if ( (LA33_0=='=') ) {s = 12;}

                        else if ( (LA33_0==';') ) {s = 13;}

                        else if ( (LA33_0=='>') ) {s = 14;}

                        else if ( (LA33_0=='<') ) {s = 15;}

                        else if ( (LA33_0=='-') ) {s = 16;}

                        else if ( (LA33_0=='h') ) {s = 18;}

                        else if ( (LA33_0=='E') ) {s = 19;}

                        else if ( (LA33_0=='@') ) {s = 20;}

                        else if ( (LA33_0=='0') ) {s = 21;}

                        else if ( (LA33_0=='%') ) {s = 22;}

                        else if ( (LA33_0=='\''||LA33_0=='\\'||LA33_0=='\u00B4'||LA33_0=='\u2019') ) {s = 23;}

                        else if ( (LA33_0=='_') ) {s = 24;}

                        else if ( ((LA33_0>='1' && LA33_0<='9')) ) {s = 25;}

                        else if ( (LA33_0=='(') ) {s = 26;}

                        else if ( (LA33_0=='[') ) {s = 27;}

                        else if ( (LA33_0=='{') ) {s = 28;}

                        else if ( (LA33_0==')') ) {s = 29;}

                        else if ( (LA33_0==']') ) {s = 30;}

                        else if ( (LA33_0=='}') ) {s = 31;}

                        else if ( (LA33_0=='*') ) {s = 32;}

                        else if ( (LA33_0=='#') ) {s = 33;}

                        else if ( (LA33_0=='\u00A9') ) {s = 34;}

                        else if ( (LA33_0=='\u00AE') ) {s = 35;}

                        else if ( (LA33_0=='f') ) {s = 36;}

                        else if ( (LA33_0=='s') ) {s = 37;}

                        else if ( (LA33_0=='e') ) {s = 38;}

                        else if ( (LA33_0=='\u00A7') ) {s = 39;}

                        else if ( ((LA33_0>='\u2013' && LA33_0<='\u2014')) ) {s = 40;}

                        else if ( (LA33_0=='|') ) {s = 41;}

                        else if ( (LA33_0=='/') ) {s = 42;}

                        else if ( (LA33_0=='$'||LA33_0=='\u20AC') ) {s = 43;}

                        else if ( (LA33_0=='\"') ) {s = 44;}

                        else if ( (LA33_0=='\u201C') ) {s = 45;}

                        else if ( (LA33_0=='a') ) {s = 46;}

                        else if ( (LA33_0=='b') ) {s = 47;}

                        else if ( (LA33_0=='i') ) {s = 48;}

                        else if ( (LA33_0=='I') ) {s = 49;}

                        else if ( (LA33_0=='B') ) {s = 50;}

                        else if ( (LA33_0=='m') ) {s = 51;}

                        else if ( (LA33_0=='D') ) {s = 52;}

                        else if ( (LA33_0=='P') ) {s = 53;}

                        else if ( (LA33_0=='A'||LA33_0=='C'||(LA33_0>='F' && LA33_0<='H')||(LA33_0>='J' && LA33_0<='O')||(LA33_0>='Q' && LA33_0<='Z')||(LA33_0>='\u00C0' && LA33_0<='\u00DC')) ) {s = 54;}

                        else if ( ((LA33_0>='c' && LA33_0<='d')||LA33_0=='g'||(LA33_0>='j' && LA33_0<='l')||(LA33_0>='n' && LA33_0<='r')||(LA33_0>='t' && LA33_0<='z')||(LA33_0>='\u00DF' && LA33_0<='\u00FC')) ) {s = 55;}

                        else if ( ((LA33_0>='\u0000' && LA33_0<='\b')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\u001F')||LA33_0=='`'||(LA33_0>='\u007F' && LA33_0<='\u00A6')||LA33_0=='\u00A8'||(LA33_0>='\u00AA' && LA33_0<='\u00AD')||(LA33_0>='\u00AF' && LA33_0<='\u00B3')||(LA33_0>='\u00B5' && LA33_0<='\u00BF')||(LA33_0>='\u00DD' && LA33_0<='\u00DE')||(LA33_0>='\u00FD' && LA33_0<='\u2012')||(LA33_0>='\u2015' && LA33_0<='\u2018')||(LA33_0>='\u201A' && LA33_0<='\u201B')||(LA33_0>='\u201D' && LA33_0<='\u20AB')||(LA33_0>='\u20AD' && LA33_0<='\uFFFF')) ) {s = 56;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_45 = input.LA(1);

                        s = -1;
                        if ( ((LA33_45>='\u0000' && LA33_45<='\uFFFF')) ) {s = 109;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}