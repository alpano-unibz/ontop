// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g 2013-08-28 11:37:23

package it.unibz.krdb.obda.parser;

import java.util.List;
import java.util.Vector;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TurtleOBDALexer extends Lexer {
    public static final int DOLLAR=42;
    public static final int PREFIX=8;
    public static final int DOUBLE_SLASH=58;
    public static final int NAME_CHAR=73;
    public static final int NCNAME_EXT=75;
    public static final int PREFIXED_NAME=12;
    public static final int STRING_WITH_QUOTE=76;
    public static final int CHAR=65;
    public static final int EQUALS=54;
    public static final int URI_PATH=68;
    public static final int ID=71;
    public static final int EOF=-1;
    public static final int LPAREN=15;
    public static final int ASTERISK=48;
    public static final int VARNAME=23;
    public static final int AT=6;
    public static final int RPAREN=16;
    public static final int LCR_BRACKET=39;
    public static final int SLASH=57;
    public static final int GREATER=56;
    public static final int EXCLAMATION=50;
    public static final int STRING_WITH_CURLY_BRACKET=14;
    public static final int COMMA=10;
    public static final int CARET=61;
    public static final int DECIMAL_POSITIVE=31;
    public static final int TILDE=60;
    public static final int LESS=55;
    public static final int DOUBLE=27;
    public static final int BASE=7;
    public static final int PLUS=53;
    public static final int DIGIT=63;
    public static final int APOSTROPHE=45;
    public static final int RSQ_BRACKET=38;
    public static final int DOUBLE_POSITIVE=30;
    public static final int NAME_START_CHAR=72;
    public static final int INTEGER=26;
    public static final int STRING_URI=20;
    public static final int PERCENT=52;
    public static final int BLANK_PREFIX=19;
    public static final int PERIOD=4;
    public static final int INTEGER_NEGATIVE=32;
    public static final int BLANK=13;
    public static final int QUOTE_DOUBLE=43;
    public static final int ID_CORE=70;
    public static final int HASH=51;
    public static final int AMPERSAND=49;
    public static final int REFERENCE=17;
    public static final int UNDERSCORE=46;
    public static final int MINUS=47;
    public static final int LSQ_BRACKET=37;
    public static final int TRUE=24;
    public static final int SEMI=9;
    public static final int ALPHANUM=64;
    public static final int NAMESPACE=21;
    public static final int ALPHA=62;
    public static final int ECHAR=66;
    public static final int RTSIGN=36;
    public static final int COLON=22;
    public static final int NCNAME=74;
    public static final int LTSIGN=35;
    public static final int WS=5;
    public static final int SCHEMA=67;
    public static final int QUESTION=41;
    public static final int DECIMAL=28;
    public static final int DECIMAL_NEGATIVE=34;
    public static final int STRING_WITH_BRACKET=11;
    public static final int INTEGER_POSITIVE=29;
    public static final int QUOTE_SINGLE=44;
    public static final int RCR_BRACKET=40;
    public static final int DOUBLE_NEGATIVE=33;
    public static final int FALSE=25;
    public static final int ID_START=69;
    public static final int STRING_WITH_QUOTE_DOUBLE=18;
    public static final int T__77=77;
    public static final int BACKSLASH=59;

    private String error = "";
        
    public String getError() {
       return error;
    }

    @Override
    public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
       throw e;
    }

    @Override
    public void recover(IntStream input, RecognitionException re) {
       throw new RuntimeException(error);
    }
        
    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
       String hdr = getErrorHeader(e);
       String msg = getErrorMessage(e, tokenNames);
       emitErrorMessage("Syntax error: " + msg + " Location: " + hdr);
    }

    @Override
    public void emitErrorMessage(String msg) {
       error = msg;
       throw new RuntimeException(error);
    }
        
    @Override
    public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
       throw new RecognitionException(input);
    }


    // delegates
    // delegators

    public TurtleOBDALexer() {;} 
    public TurtleOBDALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TurtleOBDALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g"; }

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:45:7: ( 'a' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:45:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:601:5: ( ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:601:7: ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "BASE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:603:7: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:603:9: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
    // $ANTLR end "PREFIX"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:605:6: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:605:8: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:607:5: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:607:7: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "TRUE"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:609:10: ( '^^' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:609:16: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "LTSIGN"
    public final void mLTSIGN() throws RecognitionException {
        try {
            int _type = LTSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:610:7: ( '<\"' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:610:16: '<\"'
            {
            match("<\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTSIGN"

    // $ANTLR start "RTSIGN"
    public final void mRTSIGN() throws RecognitionException {
        try {
            int _type = RTSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:611:7: ( '\">' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:611:16: '\">'
            {
            match("\">"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RTSIGN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:612:5: ( ';' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:612:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:613:7: ( '.' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:613:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:614:6: ( ',' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:614:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LSQ_BRACKET"
    public final void mLSQ_BRACKET() throws RecognitionException {
        try {
            int _type = LSQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:615:12: ( '[' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:615:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSQ_BRACKET"

    // $ANTLR start "RSQ_BRACKET"
    public final void mRSQ_BRACKET() throws RecognitionException {
        try {
            int _type = RSQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:616:12: ( ']' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:616:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSQ_BRACKET"

    // $ANTLR start "LCR_BRACKET"
    public final void mLCR_BRACKET() throws RecognitionException {
        try {
            int _type = LCR_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:617:12: ( '{' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:617:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCR_BRACKET"

    // $ANTLR start "RCR_BRACKET"
    public final void mRCR_BRACKET() throws RecognitionException {
        try {
            int _type = RCR_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:618:12: ( '}' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:618:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCR_BRACKET"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:619:7: ( '(' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:619:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:620:7: ( ')' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:620:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:621:9: ( '?' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:621:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:622:7: ( '$' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:622:16: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "QUOTE_DOUBLE"
    public final void mQUOTE_DOUBLE() throws RecognitionException {
        try {
            int _type = QUOTE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:623:13: ( '\"' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:623:16: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_DOUBLE"

    // $ANTLR start "QUOTE_SINGLE"
    public final void mQUOTE_SINGLE() throws RecognitionException {
        try {
            int _type = QUOTE_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:624:13: ( '\\'' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:624:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE_SINGLE"

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            int _type = APOSTROPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:625:11: ( '`' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:625:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:626:11: ( '_' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:626:16: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:627:6: ( '-' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:627:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:628:9: ( '*' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:628:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:629:10: ( '&' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:629:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:630:3: ( '@' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:630:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "EXCLAMATION"
    public final void mEXCLAMATION() throws RecognitionException {
        try {
            int _type = EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:631:12: ( '!' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:631:16: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLAMATION"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:632:5: ( '#' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:632:16: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:633:8: ( '%' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:633:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:634:5: ( '+' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:634:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:635:7: ( '=' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:635:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:636:6: ( ':' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:636:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:637:5: ( '<' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:637:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:638:8: ( '>' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:638:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:639:6: ( '/' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:639:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "DOUBLE_SLASH"
    public final void mDOUBLE_SLASH() throws RecognitionException {
        try {
            int _type = DOUBLE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:640:13: ( '//' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:640:16: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_SLASH"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:641:10: ( '\\\\' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:641:16: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "BLANK"
    public final void mBLANK() throws RecognitionException {
        try {
            int _type = BLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:642:6: ( '[]' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:642:15: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK"

    // $ANTLR start "BLANK_PREFIX"
    public final void mBLANK_PREFIX() throws RecognitionException {
        try {
            int _type = BLANK_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:643:13: ( '_:' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:643:16: '_:'
            {
            match("_:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK_PREFIX"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:644:6: ( '~' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:644:16: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:645:6: ( '^' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:645:16: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:648:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ALPHA"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:653:3: ( '0' .. '9' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:653:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ALPHANUM"
    public final void mALPHANUM() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:657:3: ( ALPHA | DIGIT )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ALPHANUM"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:662:3: ( ALPHANUM | UNDERSCORE | MINUS | PERIOD )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "CHAR"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:669:3: ( ( DIGIT )+ )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:669:5: ( DIGIT )+
            {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:669:5: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:669:5: DIGIT
            	    {
            	    mDIGIT(); 

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
    // $ANTLR end "INTEGER"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:3: ( ( DIGIT )+ PERIOD ( DIGIT )* ( 'e' | 'E' ) ( '-' | '+' )? | PERIOD ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )? | ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )? )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:5: ( DIGIT )+ PERIOD ( DIGIT )* ( 'e' | 'E' ) ( '-' | '+' )?
                    {
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:5: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:5: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    mPERIOD(); 
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:19: ( DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:19: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:673:36: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:674:5: PERIOD ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )?
                    {
                    mPERIOD(); 
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:674:12: ( DIGIT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:674:12: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:674:29: ( '-' | '+' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:675:5: ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )?
                    {
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:675:5: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:675:5: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:675:22: ( '-' | '+' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:3: ( ( DIGIT )+ PERIOD ( DIGIT )+ | PERIOD ( DIGIT )+ )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='.') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:5: ( DIGIT )+ PERIOD ( DIGIT )+
                    {
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:5: ( DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:5: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    mPERIOD(); 
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:19: ( DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:679:19: DIGIT
                    	    {
                    	    mDIGIT(); 

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
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:680:5: PERIOD ( DIGIT )+
                    {
                    mPERIOD(); 
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:680:12: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:680:12: DIGIT
                    	    {
                    	    mDIGIT(); 

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
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:684:3: ( PLUS INTEGER )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:684:5: PLUS INTEGER
            {
            mPLUS(); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:688:3: ( MINUS INTEGER )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:688:5: MINUS INTEGER
            {
            mMINUS(); 
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:692:3: ( PLUS DOUBLE )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:692:5: PLUS DOUBLE
            {
            mPLUS(); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:696:3: ( MINUS DOUBLE )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:696:5: MINUS DOUBLE
            {
            mMINUS(); 
            mDOUBLE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:700:3: ( PLUS DECIMAL )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:700:5: PLUS DECIMAL
            {
            mPLUS(); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:704:3: ( MINUS DECIMAL )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:704:5: MINUS DECIMAL
            {
            mMINUS(); 
            mDECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:708:3: ( ALPHA ( CHAR )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:708:5: ALPHA ( CHAR )*
            {
            mALPHA(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:708:11: ( CHAR )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='-' && LA14_0<='.')||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:708:11: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:712:3: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:712:5: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
    // $ANTLR end "ECHAR"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:715:16: ( ALPHA ( ALPHANUM | PLUS | MINUS | PERIOD )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:715:18: ALPHA ( ALPHANUM | PLUS | MINUS | PERIOD )*
            {
            mALPHA(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:715:24: ( ALPHANUM | PLUS | MINUS | PERIOD )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='+'||(LA15_0>='-' && LA15_0<='.')||(LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
            	    {
            	    if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "URI_PATH"
    public final void mURI_PATH() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:717:18: ( ( ALPHANUM | UNDERSCORE | MINUS | COLON | PERIOD | HASH | QUESTION | SLASH ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:717:20: ( ALPHANUM | UNDERSCORE | MINUS | COLON | PERIOD | HASH | QUESTION | SLASH )
            {
            if ( input.LA(1)=='#'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "URI_PATH"

    // $ANTLR start "ID_START"
    public final void mID_START() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:719:18: ( ( ALPHA | UNDERSCORE ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:719:20: ( ALPHA | UNDERSCORE )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ID_START"

    // $ANTLR start "ID_CORE"
    public final void mID_CORE() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:721:17: ( ( ID_START | DIGIT ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:721:19: ( ID_START | DIGIT )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ID_CORE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:723:12: ( ID_START ( ID_CORE )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:723:14: ID_START ( ID_CORE )*
            {
            mID_START(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:723:23: ( ID_CORE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:723:24: ID_CORE
            	    {
            	    mID_CORE(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NAME_START_CHAR"
    public final void mNAME_START_CHAR() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:725:25: ( ( ALPHA | UNDERSCORE ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:725:27: ( ALPHA | UNDERSCORE )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "NAME_START_CHAR"

    // $ANTLR start "NAME_CHAR"
    public final void mNAME_CHAR() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:727:19: ( ( NAME_START_CHAR | DIGIT | UNDERSCORE | MINUS | PERIOD | HASH | QUESTION | SLASH | PERCENT | EQUALS | SEMI ) )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:727:21: ( NAME_START_CHAR | DIGIT | UNDERSCORE | MINUS | PERIOD | HASH | QUESTION | SLASH | PERCENT | EQUALS | SEMI )
            {
            if ( input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='-' && input.LA(1)<='9')||input.LA(1)==';'||input.LA(1)=='='||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "NAME_CHAR"

    // $ANTLR start "NCNAME"
    public final void mNCNAME() throws RecognitionException {
        try {
            int _type = NCNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:730:3: ( NAME_START_CHAR ( NAME_CHAR )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:730:5: NAME_START_CHAR ( NAME_CHAR )*
            {
            mNAME_START_CHAR(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:730:21: ( NAME_CHAR )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='#'||LA17_0=='%'||(LA17_0>='-' && LA17_0<='9')||LA17_0==';'||LA17_0=='='||LA17_0=='?'||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:730:22: NAME_CHAR
            	    {
            	    mNAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NCNAME"

    // $ANTLR start "NCNAME_EXT"
    public final void mNCNAME_EXT() throws RecognitionException {
        try {
            int _type = NCNAME_EXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:734:3: ( ( NAME_CHAR | LCR_BRACKET | RCR_BRACKET | HASH | SLASH )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:734:5: ( NAME_CHAR | LCR_BRACKET | RCR_BRACKET | HASH | SLASH )*
            {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:734:5: ( NAME_CHAR | LCR_BRACKET | RCR_BRACKET | HASH | SLASH )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='#'||LA18_0=='%'||(LA18_0>='-' && LA18_0<='9')||LA18_0==';'||LA18_0=='='||LA18_0=='?'||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='{')||LA18_0=='}') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='-' && input.LA(1)<='9')||input.LA(1)==';'||input.LA(1)=='='||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NCNAME_EXT"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:738:3: ( NAME_START_CHAR ( NAME_CHAR )* COLON )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:738:5: NAME_START_CHAR ( NAME_CHAR )* COLON
            {
            mNAME_START_CHAR(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:738:21: ( NAME_CHAR )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='#'||LA19_0=='%'||(LA19_0>='-' && LA19_0<='9')||LA19_0==';'||LA19_0=='='||LA19_0=='?'||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:738:22: NAME_CHAR
            	    {
            	    mNAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            mCOLON(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "PREFIXED_NAME"
    public final void mPREFIXED_NAME() throws RecognitionException {
        try {
            int _type = PREFIXED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:742:3: ( ( NCNAME )? COLON NCNAME_EXT )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:742:5: ( NCNAME )? COLON NCNAME_EXT
            {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:742:5: ( NCNAME )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:742:5: NCNAME
                    {
                    mNCNAME(); 

                    }
                    break;

            }

            mCOLON(); 
            mNCNAME_EXT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFIXED_NAME"

    // $ANTLR start "STRING_WITH_QUOTE"
    public final void mSTRING_WITH_QUOTE() throws RecognitionException {
        try {
            int _type = STRING_WITH_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:746:3: ( '\\'' ( options {greedy=false; } : ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:746:5: '\\'' ( options {greedy=false; } : ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:746:10: ( options {greedy=false; } : ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }
                else if ( (LA21_0=='\\') ) {
                    alt21=2;
                }
                else if ( (LA21_0=='\'') ) {
                    alt21=3;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:746:40: ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:746:87: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_WITH_QUOTE"

    // $ANTLR start "STRING_WITH_QUOTE_DOUBLE"
    public final void mSTRING_WITH_QUOTE_DOUBLE() throws RecognitionException {
        try {
            int _type = STRING_WITH_QUOTE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:750:3: ( '\"' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:750:5: '\"' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:750:10: ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }
                else if ( (LA22_0=='\\') ) {
                    alt22=2;
                }
                else if ( (LA22_0=='\"') ) {
                    alt22=3;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:750:40: ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:750:87: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_WITH_QUOTE_DOUBLE"

    // $ANTLR start "STRING_WITH_BRACKET"
    public final void mSTRING_WITH_BRACKET() throws RecognitionException {
        try {
            int _type = STRING_WITH_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:754:3: ( '<' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '>' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:754:5: '<' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '>'
            {
            match('<'); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:754:9: ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='>') ) {
                    alt23=3;
                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='=')||(LA23_0>='?' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }
                else if ( (LA23_0=='\\') ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:754:39: ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:754:86: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_WITH_BRACKET"

    // $ANTLR start "STRING_WITH_CURLY_BRACKET"
    public final void mSTRING_WITH_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = STRING_WITH_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:758:3: ( '{' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '}' )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:758:5: '{' ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '}'
            {
            match('{'); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:758:9: ( options {greedy=false; } : ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='}') ) {
                    alt24=3;
                }
                else if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='|')||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }
                else if ( (LA24_0=='\\') ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:758:39: ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:758:86: ECHAR
            	    {
            	    mECHAR(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_WITH_CURLY_BRACKET"

    // $ANTLR start "STRING_URI"
    public final void mSTRING_URI() throws RecognitionException {
        try {
            int _type = STRING_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:762:3: ( SCHEMA COLON DOUBLE_SLASH ( URI_PATH )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:762:5: SCHEMA COLON DOUBLE_SLASH ( URI_PATH )*
            {
            mSCHEMA(); 
            mCOLON(); 
            mDOUBLE_SLASH(); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:762:31: ( URI_PATH )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='#'||(LA25_0>='-' && LA25_0<=':')||LA25_0=='?'||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:762:32: URI_PATH
            	    {
            	    mURI_PATH(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_URI"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:3: ( ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+ )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:5: ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+
            {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:5: ( ' ' | '\\t' | ( '\\n' | '\\r' ( '\\n' ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt27=1;
                    }
                    break;
                case '\t':
                    {
                    alt27=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:6: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:10: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:15: ( '\\n' | '\\r' ( '\\n' ) )
            	    {
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:15: ( '\\n' | '\\r' ( '\\n' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0=='\n') ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0=='\r') ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:16: '\\n'
            	            {
            	            match('\n'); 

            	            }
            	            break;
            	        case 2 :
            	            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:21: '\\r' ( '\\n' )
            	            {
            	            match('\r'); 
            	            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:25: ( '\\n' )
            	            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:765:26: '\\n'
            	            {
            	            match('\n'); 

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:8: ( T__77 | BASE | PREFIX | FALSE | TRUE | REFERENCE | LTSIGN | RTSIGN | SEMI | PERIOD | COMMA | LSQ_BRACKET | RSQ_BRACKET | LCR_BRACKET | RCR_BRACKET | LPAREN | RPAREN | QUESTION | DOLLAR | QUOTE_DOUBLE | QUOTE_SINGLE | APOSTROPHE | UNDERSCORE | MINUS | ASTERISK | AMPERSAND | AT | EXCLAMATION | HASH | PERCENT | PLUS | EQUALS | COLON | LESS | GREATER | SLASH | DOUBLE_SLASH | BACKSLASH | BLANK | BLANK_PREFIX | TILDE | CARET | INTEGER | DOUBLE | DECIMAL | INTEGER_POSITIVE | INTEGER_NEGATIVE | DOUBLE_POSITIVE | DOUBLE_NEGATIVE | DECIMAL_POSITIVE | DECIMAL_NEGATIVE | VARNAME | NCNAME | NCNAME_EXT | NAMESPACE | PREFIXED_NAME | STRING_WITH_QUOTE | STRING_WITH_QUOTE_DOUBLE | STRING_WITH_BRACKET | STRING_WITH_CURLY_BRACKET | STRING_URI | WS )
        int alt28=62;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:10: T__77
                {
                mT__77(); 

                }
                break;
            case 2 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:16: BASE
                {
                mBASE(); 

                }
                break;
            case 3 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:21: PREFIX
                {
                mPREFIX(); 

                }
                break;
            case 4 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:28: FALSE
                {
                mFALSE(); 

                }
                break;
            case 5 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:34: TRUE
                {
                mTRUE(); 

                }
                break;
            case 6 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:39: REFERENCE
                {
                mREFERENCE(); 

                }
                break;
            case 7 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:49: LTSIGN
                {
                mLTSIGN(); 

                }
                break;
            case 8 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:56: RTSIGN
                {
                mRTSIGN(); 

                }
                break;
            case 9 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:63: SEMI
                {
                mSEMI(); 

                }
                break;
            case 10 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:68: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 11 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:75: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 12 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:81: LSQ_BRACKET
                {
                mLSQ_BRACKET(); 

                }
                break;
            case 13 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:93: RSQ_BRACKET
                {
                mRSQ_BRACKET(); 

                }
                break;
            case 14 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:105: LCR_BRACKET
                {
                mLCR_BRACKET(); 

                }
                break;
            case 15 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:117: RCR_BRACKET
                {
                mRCR_BRACKET(); 

                }
                break;
            case 16 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:129: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 17 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:136: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 18 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:143: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 19 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:152: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 20 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:159: QUOTE_DOUBLE
                {
                mQUOTE_DOUBLE(); 

                }
                break;
            case 21 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:172: QUOTE_SINGLE
                {
                mQUOTE_SINGLE(); 

                }
                break;
            case 22 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:185: APOSTROPHE
                {
                mAPOSTROPHE(); 

                }
                break;
            case 23 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:196: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 24 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:207: MINUS
                {
                mMINUS(); 

                }
                break;
            case 25 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:213: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 26 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:222: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 27 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:232: AT
                {
                mAT(); 

                }
                break;
            case 28 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:235: EXCLAMATION
                {
                mEXCLAMATION(); 

                }
                break;
            case 29 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:247: HASH
                {
                mHASH(); 

                }
                break;
            case 30 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:252: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 31 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:260: PLUS
                {
                mPLUS(); 

                }
                break;
            case 32 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:265: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 33 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:272: COLON
                {
                mCOLON(); 

                }
                break;
            case 34 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:278: LESS
                {
                mLESS(); 

                }
                break;
            case 35 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:283: GREATER
                {
                mGREATER(); 

                }
                break;
            case 36 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:291: SLASH
                {
                mSLASH(); 

                }
                break;
            case 37 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:297: DOUBLE_SLASH
                {
                mDOUBLE_SLASH(); 

                }
                break;
            case 38 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:310: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 39 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:320: BLANK
                {
                mBLANK(); 

                }
                break;
            case 40 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:326: BLANK_PREFIX
                {
                mBLANK_PREFIX(); 

                }
                break;
            case 41 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:339: TILDE
                {
                mTILDE(); 

                }
                break;
            case 42 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:345: CARET
                {
                mCARET(); 

                }
                break;
            case 43 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:351: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 44 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:359: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 45 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:366: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 46 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:374: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); 

                }
                break;
            case 47 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:391: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); 

                }
                break;
            case 48 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:408: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); 

                }
                break;
            case 49 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:424: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); 

                }
                break;
            case 50 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:440: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); 

                }
                break;
            case 51 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:457: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); 

                }
                break;
            case 52 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:474: VARNAME
                {
                mVARNAME(); 

                }
                break;
            case 53 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:482: NCNAME
                {
                mNCNAME(); 

                }
                break;
            case 54 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:489: NCNAME_EXT
                {
                mNCNAME_EXT(); 

                }
                break;
            case 55 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:500: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 56 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:510: PREFIXED_NAME
                {
                mPREFIXED_NAME(); 

                }
                break;
            case 57 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:524: STRING_WITH_QUOTE
                {
                mSTRING_WITH_QUOTE(); 

                }
                break;
            case 58 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:542: STRING_WITH_QUOTE_DOUBLE
                {
                mSTRING_WITH_QUOTE_DOUBLE(); 

                }
                break;
            case 59 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:567: STRING_WITH_BRACKET
                {
                mSTRING_WITH_BRACKET(); 

                }
                break;
            case 60 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:587: STRING_WITH_CURLY_BRACKET
                {
                mSTRING_WITH_CURLY_BRACKET(); 

                }
                break;
            case 61 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:613: STRING_URI
                {
                mSTRING_URI(); 

                }
                break;
            case 62 :
                // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:1:624: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "672:1: DOUBLE : ( ( DIGIT )+ PERIOD ( DIGIT )* ( 'e' | 'E' ) ( '-' | '+' )? | PERIOD ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )? | ( DIGIT )+ ( 'e' | 'E' ) ( '-' | '+' )? );";
        }
    }
    static final String DFA28_eotS =
        "\1\47\1\51\4\60\1\65\1\67\1\72\1\74\1\75\1\uffff\1\100\1\uffff\1"+
        "\104\1\105\2\uffff\1\106\1\uffff\1\110\1\uffff\1\112\1\113\4\uffff"+
        "\1\116\1\117\1\120\1\123\1\124\1\uffff\1\127\2\uffff\1\130\1\60"+
        "\3\uffff\1\60\1\133\1\60\1\uffff\1\135\1\60\1\uffff\3\60\5\uffff"+
        "\1\143\4\uffff\1\144\2\uffff\1\47\1\uffff\1\47\5\uffff\1\146\2\uffff"+
        "\1\147\1\47\3\uffff\1\153\4\uffff\1\157\2\uffff\1\47\1\163\1\uffff"+
        "\1\135\1\uffff\1\125\4\60\2\uffff\1\163\2\uffff\1\47\1\175\1\176"+
        "\3\uffff\1\u0081\1\uffff\1\144\2\163\1\uffff\1\125\1\u0084\2\60"+
        "\1\u0087\1\163\1\176\2\175\2\uffff\1\175\1\u0081\1\uffff\1\163\1"+
        "\125\1\uffff\1\60\1\u008b\1\uffff\2\175\1\u008c\2\uffff";
    static final String DFA28_eofS =
        "\u008d\uffff";
    static final String DFA28_minS =
        "\1\11\5\43\1\136\2\0\2\43\1\uffff\1\135\1\uffff\1\0\1\43\2\uffff"+
        "\1\43\1\uffff\1\0\1\uffff\2\43\4\uffff\2\43\1\56\2\43\1\uffff\1"+
        "\43\2\uffff\2\43\3\uffff\3\43\1\uffff\2\43\1\uffff\3\43\5\uffff"+
        "\1\0\4\uffff\1\43\2\uffff\1\0\1\uffff\1\0\5\uffff\1\43\2\uffff\1"+
        "\43\1\60\3\uffff\1\56\1\60\3\uffff\1\43\2\uffff\1\60\1\43\1\uffff"+
        "\1\43\1\uffff\1\57\4\43\2\uffff\1\43\2\uffff\1\60\2\43\1\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\3\43\1\uffff\11\43\2\uffff\1\43\1\60\1"+
        "\uffff\2\43\1\uffff\2\43\1\uffff\3\43\2\uffff";
    static final String DFA28_maxS =
        "\1\176\5\175\1\136\2\uffff\2\175\1\uffff\1\135\1\uffff\1\uffff\1"+
        "\175\2\uffff\1\175\1\uffff\1\uffff\1\uffff\2\175\4\uffff\2\175\1"+
        "\71\2\175\1\uffff\1\175\2\uffff\2\175\3\uffff\3\175\1\uffff\2\175"+
        "\1\uffff\3\175\5\uffff\1\uffff\4\uffff\1\175\2\uffff\1\uffff\1\uffff"+
        "\1\uffff\5\uffff\1\175\2\uffff\1\175\1\71\3\uffff\1\145\1\71\3\uffff"+
        "\1\175\2\uffff\1\145\1\175\1\uffff\1\175\1\uffff\1\57\4\175\2\uffff"+
        "\1\175\2\uffff\1\145\2\175\1\uffff\1\145\1\uffff\1\145\1\uffff\3"+
        "\175\1\uffff\1\172\10\175\2\uffff\1\175\1\145\1\uffff\1\175\1\172"+
        "\1\uffff\2\175\1\uffff\3\175\2\uffff";
    static final String DFA28_acceptS =
        "\13\uffff\1\13\1\uffff\1\15\2\uffff\1\20\1\21\1\uffff\1\23\1\uffff"+
        "\1\26\2\uffff\1\31\1\32\1\33\1\34\5\uffff\1\43\1\uffff\1\46\1\51"+
        "\2\uffff\1\66\1\76\1\1\3\uffff\1\75\2\uffff\1\64\3\uffff\1\6\1\52"+
        "\1\7\1\42\1\73\1\uffff\1\24\1\72\1\11\1\12\1\uffff\1\47\1\14\1\uffff"+
        "\1\74\1\uffff\1\16\1\17\1\22\1\71\1\25\1\uffff\1\27\1\30\2\uffff"+
        "\1\35\1\36\1\37\2\uffff\1\40\1\41\1\70\1\uffff\1\44\1\53\2\uffff"+
        "\1\65\1\uffff\1\67\5\uffff\1\10\1\55\1\uffff\1\50\1\57\3\uffff\1"+
        "\56\1\uffff\1\60\1\uffff\1\45\3\uffff\1\54\11\uffff\1\61\1\63\2"+
        "\uffff\1\62\2\uffff\1\2\2\uffff\1\5\3\uffff\1\4\1\3";
    static final String DFA28_specialS =
        "\7\uffff\1\2\1\1\5\uffff\1\0\5\uffff\1\3\44\uffff\1\6\7\uffff\1"+
        "\4\1\uffff\1\5\111\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\33\1\10\1\34\1\23\1\35\1"+
            "\31\1\24\1\20\1\21\1\30\1\36\1\13\1\27\1\12\1\42\12\45\1\40"+
            "\1\11\1\7\1\37\1\41\1\22\1\32\1\46\1\2\3\46\1\4\11\46\1\3\3"+
            "\46\1\5\6\46\1\14\1\43\1\15\1\6\1\26\1\25\1\1\1\2\3\46\1\4\11"+
            "\46\1\3\3\46\1\5\6\46\1\16\1\uffff\1\17\1\44",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\57\31\52\4\uffff\1"+
            "\54\1\uffff\1\57\31\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\21\52\1\61\10\52\4\uffff"+
            "\1\54\1\uffff\21\52\1\61\10\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\62\31\52\4\uffff\1"+
            "\54\1\uffff\1\62\31\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\21\52\1\63\10\52\4\uffff"+
            "\1\54\1\uffff\21\52\1\63\10\52\1\47\1\uffff\1\47",
            "\1\64",
            "\12\70\1\uffff\2\70\1\uffff\24\70\1\66\uffdd\70",
            "\12\73\1\uffff\2\73\1\uffff\60\73\1\71\uffc1\73",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\47\1\uffff\1\47\7\uffff\3\47\12\76\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "",
            "\1\77",
            "",
            "\12\102\1\uffff\2\102\1\uffff\24\102\1\uffff\1\103\1\102\1"+
            "\103\7\102\15\103\1\102\1\103\1\102\1\103\1\102\1\103\1\102"+
            "\32\103\4\102\1\103\1\102\33\103\1\102\1\101\uff82\102",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "",
            "\12\107\1\uffff\2\107\1\uffff\ufff2\107",
            "",
            "\1\53\1\uffff\1\53\7\uffff\15\53\1\111\1\53\1\uffff\1\53\1"+
            "\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32\53\1\47\1"+
            "\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\1\47\1\115\1\47\12\114\1\uffff\1"+
            "\47\1\uffff\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff"+
            "\33\47\1\uffff\1\47",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\122\1\uffff\12\121",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\125\1\uffff\1\125\7\uffff\15\125\1\uffff\1\125\1\uffff\1"+
            "\125\1\uffff\1\125\1\uffff\32\125\4\uffff\1\125\1\uffff\33\125"+
            "\1\uffff\1\125",
            "",
            "\1\47\1\uffff\1\47\7\uffff\2\47\1\126\12\47\1\uffff\1\47\1"+
            "\uffff\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff"+
            "\33\47\1\uffff\1\47",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\1\47\1\131\1\47\12\45\1\uffff\1"+
            "\47\1\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\132\25\47\4\uffff"+
            "\1\47\1\uffff\4\47\1\132\26\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "",
            "",
            "",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\7\uffff\15\53\1\134\1\53\1\uffff\1\53\1"+
            "\uffff\1\53\1\uffff\32\53\4\uffff\1\53\1\uffff\32\53\1\47\1"+
            "\uffff\1\47",
            "\1\53\1\uffff\1\53\7\uffff\2\54\1\53\12\54\1\134\1\53\1\uffff"+
            "\1\53\1\uffff\1\53\1\uffff\32\54\4\uffff\1\54\1\uffff\32\54"+
            "\1\47\1\uffff\1\47",
            "",
            "\1\125\1\uffff\1\125\7\uffff\2\125\1\136\12\125\1\uffff\1\125"+
            "\1\uffff\1\125\1\uffff\1\125\1\uffff\32\125\4\uffff\1\125\1"+
            "\uffff\33\125\1\uffff\1\125",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\22\52\1\137\7\52\4\uffff"+
            "\1\54\1\uffff\22\52\1\137\7\52\1\47\1\uffff\1\47",
            "",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\4\52\1\140\25\52\4\uffff"+
            "\1\54\1\uffff\4\52\1\140\25\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\13\52\1\141\16\52\4"+
            "\uffff\1\54\1\uffff\13\52\1\141\16\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\24\52\1\142\5\52\4\uffff"+
            "\1\54\1\uffff\24\52\1\142\5\52\1\47\1\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "\12\73\1\uffff\2\73\1\uffff\ufff2\73",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\3\47\12\76\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\4\47\1\145\25\47\4\uffff\1\47\1\uffff"+
            "\4\47\1\145\26\47\1\uffff\1\47",
            "",
            "",
            "\12\102\1\uffff\2\102\1\uffff\24\102\1\uffff\1\103\1\102\1"+
            "\103\7\102\15\103\1\102\1\103\1\102\1\103\1\102\1\103\1\102"+
            "\32\103\4\102\1\103\1\102\33\103\1\102\1\101\uff82\102",
            "",
            "\12\102\1\uffff\2\102\1\uffff\24\102\1\uffff\1\103\1\102\1"+
            "\103\7\102\15\103\1\102\1\103\1\102\1\103\1\102\1\103\1\102"+
            "\32\103\4\102\1\103\1\102\33\103\1\102\1\101\uff82\102",
            "",
            "",
            "",
            "",
            "",
            "\1\125\1\uffff\1\125\7\uffff\15\125\1\uffff\1\125\1\uffff\1"+
            "\125\1\uffff\1\125\1\uffff\32\125\4\uffff\1\125\1\uffff\33\125"+
            "\1\uffff\1\125",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\1\47\1\150\1\47\12\114\1\uffff\1"+
            "\47\1\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\151\25\47\4\uffff"+
            "\1\47\1\uffff\4\47\1\151\26\47\1\uffff\1\47",
            "\12\152",
            "",
            "",
            "",
            "\1\154\1\uffff\12\121\13\uffff\1\155\37\uffff\1\155",
            "\12\156",
            "",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "",
            "",
            "\12\160\13\uffff\1\161\37\uffff\1\161",
            "\1\47\1\uffff\1\47\7\uffff\1\162\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "",
            "\1\125\1\uffff\1\125\7\uffff\15\125\1\uffff\1\125\1\uffff\1"+
            "\125\1\uffff\1\125\1\uffff\32\125\4\uffff\1\125\1\uffff\33\125"+
            "\1\uffff\1\125",
            "",
            "\1\164",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\4\52\1\165\25\52\4\uffff"+
            "\1\54\1\uffff\4\52\1\165\25\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\5\52\1\166\24\52\4\uffff"+
            "\1\54\1\uffff\5\52\1\166\24\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\22\52\1\167\7\52\4\uffff"+
            "\1\54\1\uffff\22\52\1\167\7\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\4\52\1\170\25\52\4\uffff"+
            "\1\54\1\uffff\4\52\1\170\25\52\1\47\1\uffff\1\47",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\1\171\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "",
            "",
            "\12\172\13\uffff\1\173\37\uffff\1\173",
            "\1\47\1\uffff\1\47\7\uffff\1\174\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\3\47\12\152\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\4\47\1\177\25\47\4\uffff\1\47\1\uffff"+
            "\4\47\1\177\26\47\1\uffff\1\47",
            "",
            "\12\u0080\13\uffff\1\155\37\uffff\1\155",
            "",
            "\12\156\13\uffff\1\155\37\uffff\1\155",
            "",
            "\1\47\1\uffff\1\47\7\uffff\3\47\12\160\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\4\47\1\161\25\47\4\uffff\1\47\1\uffff"+
            "\4\47\1\161\26\47\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\1\u0082\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "",
            "\1\u0083\11\uffff\15\u0083\1\55\4\uffff\1\u0083\1\uffff\32"+
            "\u0083\4\uffff\1\u0083\1\uffff\32\u0083",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\10\52\1\u0085\21\52"+
            "\4\uffff\1\54\1\uffff\10\52\1\u0085\21\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\4\52\1\u0086\25\52\4"+
            "\uffff\1\54\1\uffff\4\52\1\u0086\25\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\47\1\uffff\1\47\7\uffff\3\47\12\172\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\4\47\1\173\25\47\4\uffff\1\47\1\uffff"+
            "\4\47\1\173\26\47\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\1\u0088\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "",
            "",
            "\1\47\1\uffff\1\47\7\uffff\1\u0089\14\47\1\uffff\1\47\1\uffff"+
            "\1\47\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47"+
            "\1\uffff\1\47",
            "\12\u0080\13\uffff\1\155\37\uffff\1\155",
            "",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\u0083\11\uffff\15\u0083\1\55\4\uffff\1\u0083\1\uffff\32"+
            "\u0083\4\uffff\1\u0083\1\uffff\32\u0083",
            "",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\27\52\1\u008a\2\52\4"+
            "\uffff\1\54\1\uffff\27\52\1\u008a\2\52\1\47\1\uffff\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\47\1\uffff\1\47\7\uffff\15\47\1\uffff\1\47\1\uffff\1\47"+
            "\1\uffff\1\47\1\uffff\32\47\4\uffff\1\47\1\uffff\33\47\1\uffff"+
            "\1\47",
            "\1\53\1\uffff\1\53\5\uffff\1\55\1\uffff\2\52\1\53\12\52\1\56"+
            "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\32\52\4\uffff\1\54\1"+
            "\uffff\32\52\1\47\1\uffff\1\47",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__77 | BASE | PREFIX | FALSE | TRUE | REFERENCE | LTSIGN | RTSIGN | SEMI | PERIOD | COMMA | LSQ_BRACKET | RSQ_BRACKET | LCR_BRACKET | RCR_BRACKET | LPAREN | RPAREN | QUESTION | DOLLAR | QUOTE_DOUBLE | QUOTE_SINGLE | APOSTROPHE | UNDERSCORE | MINUS | ASTERISK | AMPERSAND | AT | EXCLAMATION | HASH | PERCENT | PLUS | EQUALS | COLON | LESS | GREATER | SLASH | DOUBLE_SLASH | BACKSLASH | BLANK | BLANK_PREFIX | TILDE | CARET | INTEGER | DOUBLE | DECIMAL | INTEGER_POSITIVE | INTEGER_NEGATIVE | DOUBLE_POSITIVE | DOUBLE_NEGATIVE | DECIMAL_POSITIVE | DECIMAL_NEGATIVE | VARNAME | NCNAME | NCNAME_EXT | NAMESPACE | PREFIXED_NAME | STRING_WITH_QUOTE | STRING_WITH_QUOTE_DOUBLE | STRING_WITH_BRACKET | STRING_WITH_CURLY_BRACKET | STRING_URI | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_14 = input.LA(1);

                        s = -1;
                        if ( (LA28_14=='}') ) {s = 65;}

                        else if ( ((LA28_14>='\u0000' && LA28_14<='\t')||(LA28_14>='\u000B' && LA28_14<='\f')||(LA28_14>='\u000E' && LA28_14<='!')||LA28_14=='$'||(LA28_14>='&' && LA28_14<=',')||LA28_14==':'||LA28_14=='<'||LA28_14=='>'||LA28_14=='@'||(LA28_14>='[' && LA28_14<='^')||LA28_14=='`'||LA28_14=='|'||(LA28_14>='~' && LA28_14<='\uFFFF')) ) {s = 66;}

                        else if ( (LA28_14=='#'||LA28_14=='%'||(LA28_14>='-' && LA28_14<='9')||LA28_14==';'||LA28_14=='='||LA28_14=='?'||(LA28_14>='A' && LA28_14<='Z')||LA28_14=='_'||(LA28_14>='a' && LA28_14<='{')) ) {s = 67;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_8 = input.LA(1);

                        s = -1;
                        if ( (LA28_8=='>') ) {s = 57;}

                        else if ( ((LA28_8>='\u0000' && LA28_8<='\t')||(LA28_8>='\u000B' && LA28_8<='\f')||(LA28_8>='\u000E' && LA28_8<='=')||(LA28_8>='?' && LA28_8<='\uFFFF')) ) {s = 59;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_7 = input.LA(1);

                        s = -1;
                        if ( (LA28_7=='\"') ) {s = 54;}

                        else if ( ((LA28_7>='\u0000' && LA28_7<='\t')||(LA28_7>='\u000B' && LA28_7<='\f')||(LA28_7>='\u000E' && LA28_7<='!')||(LA28_7>='#' && LA28_7<='\uFFFF')) ) {s = 56;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_20 = input.LA(1);

                        s = -1;
                        if ( ((LA28_20>='\u0000' && LA28_20<='\t')||(LA28_20>='\u000B' && LA28_20<='\f')||(LA28_20>='\u000E' && LA28_20<='\uFFFF')) ) {s = 71;}

                        else s = 72;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_65 = input.LA(1);

                        s = -1;
                        if ( (LA28_65=='}') ) {s = 65;}

                        else if ( (LA28_65=='#'||LA28_65=='%'||(LA28_65>='-' && LA28_65<='9')||LA28_65==';'||LA28_65=='='||LA28_65=='?'||(LA28_65>='A' && LA28_65<='Z')||LA28_65=='_'||(LA28_65>='a' && LA28_65<='{')) ) {s = 67;}

                        else if ( ((LA28_65>='\u0000' && LA28_65<='\t')||(LA28_65>='\u000B' && LA28_65<='\f')||(LA28_65>='\u000E' && LA28_65<='!')||LA28_65=='$'||(LA28_65>='&' && LA28_65<=',')||LA28_65==':'||LA28_65=='<'||LA28_65=='>'||LA28_65=='@'||(LA28_65>='[' && LA28_65<='^')||LA28_65=='`'||LA28_65=='|'||(LA28_65>='~' && LA28_65<='\uFFFF')) ) {s = 66;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_67 = input.LA(1);

                        s = -1;
                        if ( (LA28_67=='}') ) {s = 65;}

                        else if ( (LA28_67=='#'||LA28_67=='%'||(LA28_67>='-' && LA28_67<='9')||LA28_67==';'||LA28_67=='='||LA28_67=='?'||(LA28_67>='A' && LA28_67<='Z')||LA28_67=='_'||(LA28_67>='a' && LA28_67<='{')) ) {s = 67;}

                        else if ( ((LA28_67>='\u0000' && LA28_67<='\t')||(LA28_67>='\u000B' && LA28_67<='\f')||(LA28_67>='\u000E' && LA28_67<='!')||LA28_67=='$'||(LA28_67>='&' && LA28_67<=',')||LA28_67==':'||LA28_67=='<'||LA28_67=='>'||LA28_67=='@'||(LA28_67>='[' && LA28_67<='^')||LA28_67=='`'||LA28_67=='|'||(LA28_67>='~' && LA28_67<='\uFFFF')) ) {s = 66;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_57 = input.LA(1);

                        s = -1;
                        if ( ((LA28_57>='\u0000' && LA28_57<='\t')||(LA28_57>='\u000B' && LA28_57<='\f')||(LA28_57>='\u000E' && LA28_57<='\uFFFF')) ) {s = 59;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}