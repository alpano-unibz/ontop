// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g 2013-08-28 11:37:22

package it.unibz.krdb.obda.parser;

import it.unibz.krdb.obda.model.CQIE;
import it.unibz.krdb.obda.model.Function;
import it.unibz.krdb.obda.model.Term;
import it.unibz.krdb.obda.model.OBDADataFactory;
import it.unibz.krdb.obda.model.OBDALibConstants;
import it.unibz.krdb.obda.model.Predicate;
import it.unibz.krdb.obda.model.URIConstant;
import it.unibz.krdb.obda.model.ValueConstant;
import it.unibz.krdb.obda.model.Variable;
import it.unibz.krdb.obda.model.Predicate.COL_TYPE;
import it.unibz.krdb.obda.model.impl.OBDADataFactoryImpl;
import it.unibz.krdb.obda.model.impl.OBDAVocabulary;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import com.hp.hpl.jena.iri.IRI;
import com.hp.hpl.jena.iri.IRIFactory;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TurtleOBDAParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PERIOD", "WS", "AT", "BASE", "PREFIX", "SEMI", "COMMA", "STRING_WITH_BRACKET", "PREFIXED_NAME", "BLANK", "STRING_WITH_CURLY_BRACKET", "LPAREN", "RPAREN", "REFERENCE", "STRING_WITH_QUOTE_DOUBLE", "BLANK_PREFIX", "STRING_URI", "NAMESPACE", "COLON", "VARNAME", "TRUE", "FALSE", "INTEGER", "DOUBLE", "DECIMAL", "INTEGER_POSITIVE", "DOUBLE_POSITIVE", "DECIMAL_POSITIVE", "INTEGER_NEGATIVE", "DOUBLE_NEGATIVE", "DECIMAL_NEGATIVE", "LTSIGN", "RTSIGN", "LSQ_BRACKET", "RSQ_BRACKET", "LCR_BRACKET", "RCR_BRACKET", "QUESTION", "DOLLAR", "QUOTE_DOUBLE", "QUOTE_SINGLE", "APOSTROPHE", "UNDERSCORE", "MINUS", "ASTERISK", "AMPERSAND", "EXCLAMATION", "HASH", "PERCENT", "PLUS", "EQUALS", "LESS", "GREATER", "SLASH", "DOUBLE_SLASH", "BACKSLASH", "TILDE", "CARET", "ALPHA", "DIGIT", "ALPHANUM", "CHAR", "ECHAR", "SCHEMA", "URI_PATH", "ID_START", "ID_CORE", "ID", "NAME_START_CHAR", "NAME_CHAR", "NCNAME", "NCNAME_EXT", "STRING_WITH_QUOTE", "'a'"
    };
    public static final int DOLLAR=42;
    public static final int PREFIX=8;
    public static final int DOUBLE_SLASH=58;
    public static final int NAME_CHAR=73;
    public static final int NCNAME_EXT=75;
    public static final int STRING_WITH_QUOTE=76;
    public static final int PREFIXED_NAME=12;
    public static final int CHAR=65;
    public static final int URI_PATH=68;
    public static final int EQUALS=54;
    public static final int ID=71;
    public static final int EOF=-1;
    public static final int ASTERISK=48;
    public static final int LPAREN=15;
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
    public static final int BLANK=13;
    public static final int INTEGER_NEGATIVE=32;
    public static final int ID_CORE=70;
    public static final int QUOTE_DOUBLE=43;
    public static final int HASH=51;
    public static final int AMPERSAND=49;
    public static final int REFERENCE=17;
    public static final int UNDERSCORE=46;
    public static final int MINUS=47;
    public static final int LSQ_BRACKET=37;
    public static final int SEMI=9;
    public static final int TRUE=24;
    public static final int ALPHANUM=64;
    public static final int ECHAR=66;
    public static final int ALPHA=62;
    public static final int NAMESPACE=21;
    public static final int RTSIGN=36;
    public static final int COLON=22;
    public static final int NCNAME=74;
    public static final int LTSIGN=35;
    public static final int SCHEMA=67;
    public static final int WS=5;
    public static final int QUESTION=41;
    public static final int DECIMAL=28;
    public static final int STRING_WITH_BRACKET=11;
    public static final int DECIMAL_NEGATIVE=34;
    public static final int INTEGER_POSITIVE=29;
    public static final int QUOTE_SINGLE=44;
    public static final int RCR_BRACKET=40;
    public static final int DOUBLE_NEGATIVE=33;
    public static final int FALSE=25;
    public static final int ID_START=69;
    public static final int BACKSLASH=59;
    public static final int T__77=77;
    public static final int STRING_WITH_QUOTE_DOUBLE=18;

    // delegates
    // delegators


        public TurtleOBDAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TurtleOBDAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TurtleOBDAParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g"; }


    /** Map of directives */
    private HashMap<String, String> directives = new HashMap<String, String>();

    /** The current subject term */
    private Term subject;

    /** All variables */
    private Set<Term> variableSet = new HashSet<Term>();

    /** A factory to construct the predicates and terms */
    private static final OBDADataFactory dfac = OBDADataFactoryImpl.getInstance();

    private static IRIFactory iriFactory = IRIFactory.iriImplementation();

    private String error = "";

    public String getError() {
       return error;
    }

    protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
       throw new MismatchedTokenException(ttype, input);
    }

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
    }
        
    public Object recoverFromMismatchedTokenrecoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
       throw new RecognitionException(input);
    }

    private String removeBrackets(String text) {
       return text.substring(1, text.length()-1);
    }

    private Term construct(String text) {
       Term toReturn = null;
       final String PLACEHOLDER = "{}"; 
       List<Term> terms = new LinkedList<Term>();
       List<FormatString> tokens = parse(text);
       int size = tokens.size();
       if (size == 1) {
          FormatString token = tokens.get(0);
          if (token instanceof FixedString) {
             toReturn = dfac.getConstantURI(token.toString());
          } else if (token instanceof ColumnString) {
             ValueConstant uriTemplate = dfac.getConstantLiteral(PLACEHOLDER); // a single URI template
             Variable column = dfac.getVariable(token.toString());
             terms.add(0, uriTemplate);
             terms.add(column);
             toReturn = dfac.getFunction(dfac.getUriTemplatePredicate(terms.size()), terms);
          }
       } else {
          StringBuilder sb = new StringBuilder();
          for(FormatString token : tokens) {
             if (token instanceof FixedString) { // if part of URI template
                sb.append(token.toString());
             } else if (token instanceof ColumnString) {
                sb.append(PLACEHOLDER);
                Variable column = dfac.getVariable(token.toString());
                terms.add(column);
             }
          }
          ValueConstant uriTemplate = dfac.getConstantLiteral(sb.toString()); // complete URI template
          terms.add(0, uriTemplate);
          toReturn = dfac.getFunction(dfac.getUriTemplatePredicate(terms.size()), terms);
       }
       return toReturn;
    }

    // Column placeholder pattern
    private static final String formatSpecifier = "\\{([\\w.]+)?\\}";
    private static Pattern chPattern = Pattern.compile(formatSpecifier);

    private List<FormatString> parse(String text) {
       List<FormatString> toReturn = new ArrayList<FormatString>();
       Matcher m = chPattern.matcher(text);
       int i = 0;
       while (i < text.length()) {
          if (m.find(i)) {
             if (m.start() != i) {
                toReturn.add(new FixedString(text.substring(i, m.start())));
             }
             String value = m.group(1);
             toReturn.add(new ColumnString(value));
             i = m.end();
          }
          else {
             toReturn.add(new FixedString(text.substring(i)));
             break;
          }
       }
       return toReturn;
    }

    private interface FormatString {
       int index();
       String toString();
    }

    private class FixedString implements FormatString {
       private String s;
       FixedString(String s) { this.s = s; }
       @Override public int index() { return -1; }  // flag code for fixed string
       @Override public String toString() { return s; }
    }

    private class ColumnString implements FormatString {
       private String s;
       ColumnString(String s) { this.s = s; }
       @Override public int index() { return 0; }  // flag code for column string
       @Override public String toString() { return s; }
    }



    // $ANTLR start "parse"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:245:1: parse returns [CQIE value] : ( directiveStatement )* t1= triplesStatement (t2= triplesStatement )* EOF ;
    public final CQIE parse() throws RecognitionException {
        CQIE value = null;

        List<Function> t1 = null;

        List<Function> t2 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:246:3: ( ( directiveStatement )* t1= triplesStatement (t2= triplesStatement )* EOF )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:246:5: ( directiveStatement )* t1= triplesStatement (t2= triplesStatement )* EOF
            {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:246:5: ( directiveStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:246:5: directiveStatement
            	    {
            	    pushFollow(FOLLOW_directiveStatement_in_parse51);
            	    directiveStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_triplesStatement_in_parse60);
            t1=triplesStatement();

            state._fsp--;


                  int arity = variableSet.size();
                  List<Term> distinguishVariables = new ArrayList<Term>(variableSet);
                  Function head = dfac.getFunction(dfac.getPredicate(OBDALibConstants.QUERY_HEAD, arity), distinguishVariables);
                  
                  // Create a new rule
                  List<Function> triples = t1;
                  value = dfac.getCQIE(head, triples);
                
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:256:5: (t2= triplesStatement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=STRING_WITH_BRACKET && LA2_0<=PREFIXED_NAME)||LA2_0==STRING_WITH_CURLY_BRACKET) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:256:6: t2= triplesStatement
            	    {
            	    pushFollow(FOLLOW_triplesStatement_in_parse71);
            	    t2=triplesStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_parse75); 

                  List<Function> additionalTriples = t2;
                  if (additionalTriples != null) {
                    // If there are additional triple statements then just add to the existing body
                    List<Function> existingBody = value.getBody();
                    existingBody.addAll(additionalTriples);
                  }
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "parse"


    // $ANTLR start "directiveStatement"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:266:1: directiveStatement : directive PERIOD ;
    public final void directiveStatement() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:267:3: ( directive PERIOD )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:267:5: directive PERIOD
            {
            pushFollow(FOLLOW_directive_in_directiveStatement90);
            directive();

            state._fsp--;

            match(input,PERIOD,FOLLOW_PERIOD_in_directiveStatement92); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "directiveStatement"


    // $ANTLR start "triplesStatement"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:270:1: triplesStatement returns [List<Function> value] : triples ( WS )* PERIOD ;
    public final List<Function> triplesStatement() throws RecognitionException {
        List<Function> value = null;

        List<Function> triples1 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:271:3: ( triples ( WS )* PERIOD )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:271:5: triples ( WS )* PERIOD
            {
            pushFollow(FOLLOW_triples_in_triplesStatement109);
            triples1=triples();

            state._fsp--;

            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:271:13: ( WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:271:13: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_triplesStatement111); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,PERIOD,FOLLOW_PERIOD_in_triplesStatement114); 
             value = triples1; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "triplesStatement"


    // $ANTLR start "directive"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:274:1: directive : ( base | prefixID );
    public final void directive() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:275:3: ( base | prefixID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==AT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==BASE) ) {
                    alt4=1;
                }
                else if ( (LA4_1==PREFIX) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:275:5: base
                    {
                    pushFollow(FOLLOW_base_in_directive129);
                    base();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:276:5: prefixID
                    {
                    pushFollow(FOLLOW_prefixID_in_directive135);
                    prefixID();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "directive"


    // $ANTLR start "base"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:279:1: base : AT BASE uriref ;
    public final void base() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:280:3: ( AT BASE uriref )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:280:5: AT BASE uriref
            {
            match(input,AT,FOLLOW_AT_in_base148); 
            match(input,BASE,FOLLOW_BASE_in_base150); 
            pushFollow(FOLLOW_uriref_in_base152);
            uriref();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "base"


    // $ANTLR start "prefixID"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:283:1: prefixID : AT PREFIX ( namespace | defaultNamespace ) uriref ;
    public final void prefixID() throws RecognitionException {
        TurtleOBDAParser.namespace_return namespace2 = null;

        TurtleOBDAParser.defaultNamespace_return defaultNamespace3 = null;

        String uriref4 = null;



          String prefix = "";

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:287:3: ( AT PREFIX ( namespace | defaultNamespace ) uriref )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:287:5: AT PREFIX ( namespace | defaultNamespace ) uriref
            {
            match(input,AT,FOLLOW_AT_in_prefixID170); 
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixID172); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:287:15: ( namespace | defaultNamespace )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAMESPACE) ) {
                alt5=1;
            }
            else if ( (LA5_0==COLON) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:287:16: namespace
                    {
                    pushFollow(FOLLOW_namespace_in_prefixID175);
                    namespace2=namespace();

                    state._fsp--;

                     prefix = (namespace2!=null?input.toString(namespace2.start,namespace2.stop):null); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:287:58: defaultNamespace
                    {
                    pushFollow(FOLLOW_defaultNamespace_in_prefixID181);
                    defaultNamespace3=defaultNamespace();

                    state._fsp--;

                     prefix = (defaultNamespace3!=null?input.toString(defaultNamespace3.start,defaultNamespace3.stop):null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_uriref_in_prefixID186);
            uriref4=uriref();

            state._fsp--;


                  String uriref = uriref4;
                  directives.put(prefix.substring(0, prefix.length()-1), uriref); // remove the end colon
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prefixID"


    // $ANTLR start "triples"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:293:1: triples returns [List<Function> value] : subject predicateObjectList ;
    public final List<Function> triples() throws RecognitionException {
        List<Function> value = null;

        Term subject5 = null;

        List<Function> predicateObjectList6 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:294:3: ( subject predicateObjectList )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:294:5: subject predicateObjectList
            {
            pushFollow(FOLLOW_subject_in_triples205);
            subject5=subject();

            state._fsp--;

             subject = subject5; 
            pushFollow(FOLLOW_predicateObjectList_in_triples209);
            predicateObjectList6=predicateObjectList();

            state._fsp--;


                  value = predicateObjectList6;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "triples"


    // $ANTLR start "predicateObjectList"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:299:1: predicateObjectList returns [List<Function> value] : v1= verb l1= objectList ( SEMI v2= verb l2= objectList )* ;
    public final List<Function> predicateObjectList() throws RecognitionException {
        List<Function> value = null;

        String v1 = null;

        List<Term> l1 = null;

        String v2 = null;

        List<Term> l2 = null;



           value = new LinkedList<Function>();

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:303:3: (v1= verb l1= objectList ( SEMI v2= verb l2= objectList )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:303:5: v1= verb l1= objectList ( SEMI v2= verb l2= objectList )*
            {
            pushFollow(FOLLOW_verb_in_predicateObjectList235);
            v1=verb();

            state._fsp--;

            pushFollow(FOLLOW_objectList_in_predicateObjectList241);
            l1=objectList();

            state._fsp--;


                  for (Term object : l1) {
                    Function atom = null;
                    String p = v1.toString();
                    if (p.equals(OBDAVocabulary.RDF_TYPE)) {
                      if (object instanceof  URIConstant) {
                        URIConstant c = (URIConstant) object;  // it has to be a URI constant
                      	Predicate predicate = dfac.getClassPredicate(c.getURI());
                      	atom = dfac.getFunction(predicate, subject);
                      } else if (object instanceof  Variable){
                        Predicate triplepredicate = dfac.getPredicate("triple", 3); // the data type cannot be determined here!
                        Term rdftype = dfac.getConstantURI(p);
                        Predicate uriPredicate = dfac.getPredicate(OBDAVocabulary.QUEST_URI, 1);
                        Term uriOfObject = dfac.getFunction(uriPredicate, object);
                        atom = dfac.getFunction(triplepredicate, subject, rdftype,  uriOfObject);
                        // TODO:
                        //System.err.println("some warning of using varible in danger")
                      } else if (object instanceof Function){
                        Predicate triplepredicate = dfac.getPredicate("triple", 3); // the data type cannot be determined here!
                        Term rdftype = dfac.getConstantURI(p);
                        atom = dfac.getFunction(triplepredicate, subject, rdftype,   object);          	
                      } else {
                        throw new IllegalStateException();
                      }

                    } else {
                      Predicate predicate = dfac.getPredicate(v1, 2); // the data type cannot be determined here!
                      atom = dfac.getFunction(predicate, subject, object);
                    }
                    value.add(atom);
                  }
                
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:335:5: ( SEMI v2= verb l2= objectList )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==SEMI) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:335:6: SEMI v2= verb l2= objectList
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_predicateObjectList250); 
            	    pushFollow(FOLLOW_verb_in_predicateObjectList254);
            	    v2=verb();

            	    state._fsp--;

            	    pushFollow(FOLLOW_objectList_in_predicateObjectList258);
            	    l2=objectList();

            	    state._fsp--;


            	          for (Term object : l2) {
            	            Function atom = null;
            	            String p = v2.toString();
            	            if (p.equals(OBDAVocabulary.RDF_TYPE)) {
            	              if (object instanceof  URIConstant) {
            	                URIConstant c = (URIConstant) object;  // it has to be a URI constant
            	                Predicate predicate = dfac.getClassPredicate(c.getURI());
            	                atom = dfac.getFunction(predicate, subject);
            	              } else if (object instanceof  Variable){
            	                Predicate triplepredicate = dfac.getPredicate("triple", 3); // the data type cannot be determined here!
            	                Term rdftype = dfac.getConstantURI(p);
            	                Predicate uriPredicate = dfac.getPredicate(OBDAVocabulary.QUEST_URI, 1);
            	                Term uriOfObject = dfac.getFunction(uriPredicate, object);
            	                atom = dfac.getFunction(triplepredicate, subject, rdftype,  uriOfObject);
            	                // TODO:
            	                //System.err.println("some warning of using varible in danger")
            	              } else if (object instanceof Function){
            	                Predicate triplepredicate = dfac.getPredicate("triple", 3); // the data type cannot be determined here!
            	                Term rdftype = dfac.getConstantURI(p);
            	                atom = dfac.getFunction(triplepredicate, subject, rdftype,   object);           
            	              }
            	            } else {
            	              Predicate predicate = dfac.getPredicate(v2, 2); // the data type cannot be determined here!
            	              atom = dfac.getFunction(predicate, subject, object);
            	            }
            	            value.add(atom);
            	          }
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "predicateObjectList"


    // $ANTLR start "verb"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:366:1: verb returns [String value] : ( predicate | 'a' );
    public final String verb() throws RecognitionException {
        String value = null;

        String predicate7 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:367:3: ( predicate | 'a' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=STRING_WITH_BRACKET && LA7_0<=PREFIXED_NAME)) ) {
                alt7=1;
            }
            else if ( (LA7_0==77) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:367:5: predicate
                    {
                    pushFollow(FOLLOW_predicate_in_verb281);
                    predicate7=predicate();

                    state._fsp--;

                     value = predicate7; 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:368:5: 'a'
                    {
                    match(input,77,FOLLOW_77_in_verb289); 
                     value = OBDAVocabulary.RDF_TYPE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "verb"


    // $ANTLR start "objectList"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:371:1: objectList returns [List<Term> value] : o1= object ( COMMA o2= object )* ;
    public final List<Term> objectList() throws RecognitionException {
        List<Term> value = null;

        Term o1 = null;

        Term o2 = null;



          value = new ArrayList<Term>();

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:375:3: (o1= object ( COMMA o2= object )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:375:5: o1= object ( COMMA o2= object )*
            {
            pushFollow(FOLLOW_object_in_objectList315);
            o1=object();

            state._fsp--;

             value.add(o1); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:375:42: ( COMMA o2= object )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:375:43: COMMA o2= object
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_objectList320); 
            	    pushFollow(FOLLOW_object_in_objectList324);
            	    o2=object();

            	    state._fsp--;

            	     value.add(o2); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "objectList"


    // $ANTLR start "subject"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:378:1: subject returns [Term value] : ( resource | variable );
    public final Term subject() throws RecognitionException {
        Term value = null;

        Term resource8 = null;

        Variable variable9 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:379:3: ( resource | variable )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=STRING_WITH_BRACKET && LA9_0<=PREFIXED_NAME)) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING_WITH_CURLY_BRACKET) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:379:5: resource
                    {
                    pushFollow(FOLLOW_resource_in_subject346);
                    resource8=resource();

                    state._fsp--;

                     value = resource8; 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:380:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_subject354);
                    variable9=variable();

                    state._fsp--;

                     value = variable9; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "subject"


    // $ANTLR start "predicate"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:384:1: predicate returns [String value] : resource ;
    public final String predicate() throws RecognitionException {
        String value = null;

        Term resource10 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:385:3: ( resource )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:385:5: resource
            {
            pushFollow(FOLLOW_resource_in_predicate374);
            resource10=resource();

            state._fsp--;

             
                  Term nl = resource10;
                  if (nl instanceof URIConstant) {
                    URIConstant c = (URIConstant) nl;
                    value = c.getValue();
                  } else {
                    throw new RuntimeException("Unsupported predicate syntax: " + nl.toString());
                  }
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "predicate"


    // $ANTLR start "object"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:396:1: object returns [Term value] : ( resource | literal | typedLiteral | variable );
    public final Term object() throws RecognitionException {
        Term value = null;

        Term resource11 = null;

        Term literal12 = null;

        Function typedLiteral13 = null;

        Variable variable14 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:397:3: ( resource | literal | typedLiteral | variable )
            int alt10=4;
            switch ( input.LA(1) ) {
            case STRING_WITH_BRACKET:
            case PREFIXED_NAME:
                {
                alt10=1;
                }
                break;
            case STRING_WITH_QUOTE_DOUBLE:
            case TRUE:
            case FALSE:
            case INTEGER:
            case DOUBLE:
            case DECIMAL:
            case INTEGER_POSITIVE:
            case DOUBLE_POSITIVE:
            case DECIMAL_POSITIVE:
            case INTEGER_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case DECIMAL_NEGATIVE:
                {
                alt10=2;
                }
                break;
            case STRING_WITH_CURLY_BRACKET:
                {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3>=PERIOD && LA10_3<=WS)||(LA10_3>=SEMI && LA10_3<=COMMA)) ) {
                    alt10=4;
                }
                else if ( (LA10_3==AT||LA10_3==REFERENCE) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:397:5: resource
                    {
                    pushFollow(FOLLOW_resource_in_object393);
                    resource11=resource();

                    state._fsp--;

                     value = resource11; 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:398:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_object401);
                    literal12=literal();

                    state._fsp--;

                     value = literal12; 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:399:5: typedLiteral
                    {
                    pushFollow(FOLLOW_typedLiteral_in_object410);
                    typedLiteral13=typedLiteral();

                    state._fsp--;

                     value = typedLiteral13; 

                    }
                    break;
                case 4 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:400:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_object418);
                    variable14=variable();

                    state._fsp--;

                     value = variable14; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "object"


    // $ANTLR start "resource"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:404:1: resource returns [Term value] : ( uriref | qname );
    public final Term resource() throws RecognitionException {
        Term value = null;

        String uriref15 = null;

        String qname16 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:405:3: ( uriref | qname )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==STRING_WITH_BRACKET) ) {
                alt11=1;
            }
            else if ( (LA11_0==PREFIXED_NAME) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:405:5: uriref
                    {
                    pushFollow(FOLLOW_uriref_in_resource438);
                    uriref15=uriref();

                    state._fsp--;

                     value = construct(uriref15); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:406:5: qname
                    {
                    pushFollow(FOLLOW_qname_in_resource446);
                    qname16=qname();

                    state._fsp--;

                     value = construct(qname16); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "resource"


    // $ANTLR start "uriref"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:409:1: uriref returns [String value] : STRING_WITH_BRACKET ;
    public final String uriref() throws RecognitionException {
        String value = null;

        Token STRING_WITH_BRACKET17=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:410:3: ( STRING_WITH_BRACKET )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:410:5: STRING_WITH_BRACKET
            {
            STRING_WITH_BRACKET17=(Token)match(input,STRING_WITH_BRACKET,FOLLOW_STRING_WITH_BRACKET_in_uriref465); 
             value = removeBrackets((STRING_WITH_BRACKET17!=null?STRING_WITH_BRACKET17.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "uriref"


    // $ANTLR start "qname"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:413:1: qname returns [String value] : PREFIXED_NAME ;
    public final String qname() throws RecognitionException {
        String value = null;

        Token PREFIXED_NAME18=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:414:3: ( PREFIXED_NAME )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:414:5: PREFIXED_NAME
            {
            PREFIXED_NAME18=(Token)match(input,PREFIXED_NAME,FOLLOW_PREFIXED_NAME_in_qname484); 

                  String[] tokens = (PREFIXED_NAME18!=null?PREFIXED_NAME18.getText():null).split(":", 2);
                  String uri = directives.get(tokens[0]);  // the first token is the prefix
                  value = uri + tokens[1];  // the second token is the local name
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "qname"


    // $ANTLR start "blank"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:421:1: blank : ( nodeID | BLANK );
    public final void blank() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:422:3: ( nodeID | BLANK )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BLANK_PREFIX) ) {
                alt12=1;
            }
            else if ( (LA12_0==BLANK) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:422:5: nodeID
                    {
                    pushFollow(FOLLOW_nodeID_in_blank499);
                    nodeID();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:423:5: BLANK
                    {
                    match(input,BLANK,FOLLOW_BLANK_in_blank505); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "blank"


    // $ANTLR start "variable"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:426:1: variable returns [Variable value] : STRING_WITH_CURLY_BRACKET ;
    public final Variable variable() throws RecognitionException {
        Variable value = null;

        Token STRING_WITH_CURLY_BRACKET19=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:427:3: ( STRING_WITH_CURLY_BRACKET )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:427:5: STRING_WITH_CURLY_BRACKET
            {
            STRING_WITH_CURLY_BRACKET19=(Token)match(input,STRING_WITH_CURLY_BRACKET,FOLLOW_STRING_WITH_CURLY_BRACKET_in_variable522); 

                  value = dfac.getVariable(removeBrackets((STRING_WITH_CURLY_BRACKET19!=null?STRING_WITH_CURLY_BRACKET19.getText():null)));
                  variableSet.add(value);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "variable"


    // $ANTLR start "function"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:433:1: function returns [Function value] : resource LPAREN terms RPAREN ;
    public final Function function() throws RecognitionException {
        Function value = null;

        Term resource20 = null;

        Vector<Term> terms21 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:434:3: ( resource LPAREN terms RPAREN )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:434:5: resource LPAREN terms RPAREN
            {
            pushFollow(FOLLOW_resource_in_function543);
            resource20=resource();

            state._fsp--;

            match(input,LPAREN,FOLLOW_LPAREN_in_function545); 
            pushFollow(FOLLOW_terms_in_function547);
            terms21=terms();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_function549); 

                  String functionName = resource20.toString();
                  int arity = terms21.size();
                  Predicate functionSymbol = dfac.getPredicate(functionName, arity);
                  value = dfac.getFunction(functionSymbol, terms21);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "function"


    // $ANTLR start "typedLiteral"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:442:1: typedLiteral returns [Function value] : ( variable AT language | variable REFERENCE resource );
    public final Function typedLiteral() throws RecognitionException {
        Function value = null;

        Variable variable22 = null;

        Term language23 = null;

        Variable variable24 = null;

        Term resource25 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:443:3: ( variable AT language | variable REFERENCE resource )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STRING_WITH_CURLY_BRACKET) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==REFERENCE) ) {
                    alt13=2;
                }
                else if ( (LA13_1==AT) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:443:5: variable AT language
                    {
                    pushFollow(FOLLOW_variable_in_typedLiteral568);
                    variable22=variable();

                    state._fsp--;

                    match(input,AT,FOLLOW_AT_in_typedLiteral570); 
                    pushFollow(FOLLOW_language_in_typedLiteral572);
                    language23=language();

                    state._fsp--;


                          Predicate functionSymbol = dfac.getDataTypePredicateLiteralLang();
                          Variable var = variable22;
                          Term lang = language23;   
                          value = dfac.getFunction(functionSymbol, var, lang);
                        

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:449:5: variable REFERENCE resource
                    {
                    pushFollow(FOLLOW_variable_in_typedLiteral580);
                    variable24=variable();

                    state._fsp--;

                    match(input,REFERENCE,FOLLOW_REFERENCE_in_typedLiteral582); 
                    pushFollow(FOLLOW_resource_in_typedLiteral584);
                    resource25=resource();

                    state._fsp--;


                          Variable var = variable24;
                          String functionName = resource25.toString();
                          Predicate functionSymbol = null;
                          if (functionName.equals(OBDAVocabulary.RDFS_LITERAL_URI)) {
                              functionSymbol = dfac.getDataTypePredicateLiteral();
                          } else if (functionName.equals(OBDAVocabulary.XSD_STRING_URI)) {
                              functionSymbol = dfac.getDataTypePredicateString();
                          } else if (functionName.equals(OBDAVocabulary.XSD_INTEGER_URI) || functionName.equals(OBDAVocabulary.XSD_INT_URI)) {
                              functionSymbol = dfac.getDataTypePredicateInteger();
                          } else if (functionName.equals(OBDAVocabulary.XSD_DECIMAL_URI)) {
                              functionSymbol = dfac.getDataTypePredicateDecimal();
                          } else if (functionName.equals(OBDAVocabulary.XSD_DOUBLE_URI)) {
                              functionSymbol = dfac.getDataTypePredicateDouble();
                          } else if (functionName.equals(OBDAVocabulary.XSD_DATETIME_URI)) {
                              functionSymbol = dfac.getDataTypePredicateDateTime();
                          } else if (functionName.equals(OBDAVocabulary.XSD_BOOLEAN_URI)) {
                              functionSymbol = dfac.getDataTypePredicateBoolean();
                          } else {
                              throw new RecognitionException();
                          }
                          value = dfac.getFunction(functionSymbol, var);
                         

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "typedLiteral"


    // $ANTLR start "language"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:474:1: language returns [Term value] : ( languageTag | variable );
    public final Term language() throws RecognitionException {
        Term value = null;

        TurtleOBDAParser.languageTag_return languageTag26 = null;

        Variable variable27 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:475:3: ( languageTag | variable )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VARNAME) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING_WITH_CURLY_BRACKET) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:475:5: languageTag
                    {
                    pushFollow(FOLLOW_languageTag_in_language603);
                    languageTag26=languageTag();

                    state._fsp--;


                        	value = dfac.getConstantLiteral((languageTag26!=null?input.toString(languageTag26.start,languageTag26.stop):null).toLowerCase(), COL_TYPE.STRING);
                        

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:478:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_language611);
                    variable27=variable();

                    state._fsp--;


                        	value = variable27;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "language"


    // $ANTLR start "terms"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:483:1: terms returns [Vector<Term> value] : t1= term ( COMMA t2= term )* ;
    public final Vector<Term> terms() throws RecognitionException {
        Vector<Term> value = null;

        Term t1 = null;

        Term t2 = null;



          value = new Vector<Term>();

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:487:3: (t1= term ( COMMA t2= term )* )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:487:5: t1= term ( COMMA t2= term )*
            {
            pushFollow(FOLLOW_term_in_terms637);
            t1=term();

            state._fsp--;

             value.add(t1); 
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:487:40: ( COMMA t2= term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:487:41: COMMA t2= term
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_terms642); 
            	    pushFollow(FOLLOW_term_in_terms646);
            	    t2=term();

            	    state._fsp--;

            	     value.add(t2); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "terms"


    // $ANTLR start "term"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:490:1: term returns [Term value] : ( function | variable | literal );
    public final Term term() throws RecognitionException {
        Term value = null;

        Function function28 = null;

        Variable variable29 = null;

        Term literal30 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:491:3: ( function | variable | literal )
            int alt16=3;
            switch ( input.LA(1) ) {
            case STRING_WITH_BRACKET:
            case PREFIXED_NAME:
                {
                alt16=1;
                }
                break;
            case STRING_WITH_CURLY_BRACKET:
                {
                alt16=2;
                }
                break;
            case STRING_WITH_QUOTE_DOUBLE:
            case TRUE:
            case FALSE:
            case INTEGER:
            case DOUBLE:
            case DECIMAL:
            case INTEGER_POSITIVE:
            case DOUBLE_POSITIVE:
            case DECIMAL_POSITIVE:
            case INTEGER_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case DECIMAL_NEGATIVE:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:491:5: function
                    {
                    pushFollow(FOLLOW_function_in_term667);
                    function28=function();

                    state._fsp--;

                     value = function28; 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:492:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_term675);
                    variable29=variable();

                    state._fsp--;

                     value = variable29; 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:493:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_term683);
                    literal30=literal();

                    state._fsp--;

                     value = literal30; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "term"


    // $ANTLR start "literal"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:496:1: literal returns [Term value] : ( stringLiteral ( AT language )? | dataTypeString | numericLiteral | booleanLiteral );
    public final Term literal() throws RecognitionException {
        Term value = null;

        ValueConstant stringLiteral31 = null;

        Term language32 = null;

        Term dataTypeString33 = null;

        ValueConstant numericLiteral34 = null;

        ValueConstant booleanLiteral35 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:497:3: ( stringLiteral ( AT language )? | dataTypeString | numericLiteral | booleanLiteral )
            int alt18=4;
            switch ( input.LA(1) ) {
            case STRING_WITH_QUOTE_DOUBLE:
                {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=PERIOD && LA18_1<=AT)||(LA18_1>=SEMI && LA18_1<=COMMA)||LA18_1==RPAREN) ) {
                    alt18=1;
                }
                else if ( (LA18_1==REFERENCE) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
            case DOUBLE:
            case DECIMAL:
            case INTEGER_POSITIVE:
            case DOUBLE_POSITIVE:
            case DECIMAL_POSITIVE:
            case INTEGER_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case DECIMAL_NEGATIVE:
                {
                alt18=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:497:5: stringLiteral ( AT language )?
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal702);
                    stringLiteral31=stringLiteral();

                    state._fsp--;

                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:497:19: ( AT language )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==AT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:497:20: AT language
                            {
                            match(input,AT,FOLLOW_AT_in_literal705); 
                            pushFollow(FOLLOW_language_in_literal707);
                            language32=language();

                            state._fsp--;


                            }
                            break;

                    }


                           ValueConstant constant = stringLiteral31;
                           Term lang = language32;
                           if (lang != null) {
                             value = dfac.getFunction(dfac.getDataTypePredicateLiteralLang(), constant, lang);
                           } else {
                           	 value = dfac.getFunction(dfac.getDataTypePredicateLiteral(), constant);
                           }
                        

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:506:5: dataTypeString
                    {
                    pushFollow(FOLLOW_dataTypeString_in_literal717);
                    dataTypeString33=dataTypeString();

                    state._fsp--;

                     value = dataTypeString33; 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:507:5: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal725);
                    numericLiteral34=numericLiteral();

                    state._fsp--;

                     value = numericLiteral34; 

                    }
                    break;
                case 4 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:508:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal733);
                    booleanLiteral35=booleanLiteral();

                    state._fsp--;

                     value = booleanLiteral35; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "literal"


    // $ANTLR start "stringLiteral"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:511:1: stringLiteral returns [ValueConstant value] : STRING_WITH_QUOTE_DOUBLE ;
    public final ValueConstant stringLiteral() throws RecognitionException {
        ValueConstant value = null;

        Token STRING_WITH_QUOTE_DOUBLE36=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:512:3: ( STRING_WITH_QUOTE_DOUBLE )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:512:5: STRING_WITH_QUOTE_DOUBLE
            {
            STRING_WITH_QUOTE_DOUBLE36=(Token)match(input,STRING_WITH_QUOTE_DOUBLE,FOLLOW_STRING_WITH_QUOTE_DOUBLE_in_stringLiteral752); 

                  String str = (STRING_WITH_QUOTE_DOUBLE36!=null?STRING_WITH_QUOTE_DOUBLE36.getText():null);
                  value = dfac.getConstantLiteral(str.substring(1, str.length()-1), COL_TYPE.LITERAL); // without the double quotes
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "stringLiteral"


    // $ANTLR start "dataTypeString"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:518:1: dataTypeString returns [Term value] : stringLiteral REFERENCE resource ;
    public final Term dataTypeString() throws RecognitionException {
        Term value = null;

        ValueConstant stringLiteral37 = null;

        Term resource38 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:519:3: ( stringLiteral REFERENCE resource )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:519:6: stringLiteral REFERENCE resource
            {
            pushFollow(FOLLOW_stringLiteral_in_dataTypeString772);
            stringLiteral37=stringLiteral();

            state._fsp--;

            match(input,REFERENCE,FOLLOW_REFERENCE_in_dataTypeString774); 
            pushFollow(FOLLOW_resource_in_dataTypeString776);
            resource38=resource();

            state._fsp--;


                  ValueConstant constant = stringLiteral37;
                  String functionName = resource38.toString();
                  Predicate functionSymbol = null;
                  if (functionName.equals(OBDAVocabulary.RDFS_LITERAL_URI)) {
                	functionSymbol = dfac.getDataTypePredicateLiteral();
                  } else if (functionName.equals(OBDAVocabulary.XSD_STRING_URI)) {
                	functionSymbol = dfac.getDataTypePredicateString();
                  } else if (functionName.equals(OBDAVocabulary.XSD_INTEGER_URI)) {
                 	functionSymbol = dfac.getDataTypePredicateInteger();
                  } else if (functionName.equals(OBDAVocabulary.XSD_DECIMAL_URI)) {
                	functionSymbol = dfac.getDataTypePredicateDecimal();
                  } else if (functionName.equals(OBDAVocabulary.XSD_DOUBLE_URI)) {
                	functionSymbol = dfac.getDataTypePredicateDouble();
                  } else if (functionName.equals(OBDAVocabulary.XSD_DATETIME_URI)) {
                	functionSymbol = dfac.getDataTypePredicateDateTime();
                  } else if (functionName.equals(OBDAVocabulary.XSD_BOOLEAN_URI)) {
                	functionSymbol = dfac.getDataTypePredicateBoolean();
                  } else {
                    throw new RuntimeException("Unknown datatype: " + functionName);
                  }
                  value = dfac.getFunction(functionSymbol, constant);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "dataTypeString"


    // $ANTLR start "numericLiteral"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:544:1: numericLiteral returns [ValueConstant value] : ( numericUnsigned | numericPositive | numericNegative );
    public final ValueConstant numericLiteral() throws RecognitionException {
        ValueConstant value = null;

        ValueConstant numericUnsigned39 = null;

        ValueConstant numericPositive40 = null;

        ValueConstant numericNegative41 = null;


        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:545:3: ( numericUnsigned | numericPositive | numericNegative )
            int alt19=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DOUBLE:
            case DECIMAL:
                {
                alt19=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DOUBLE_POSITIVE:
            case DECIMAL_POSITIVE:
                {
                alt19=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case DECIMAL_NEGATIVE:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:545:5: numericUnsigned
                    {
                    pushFollow(FOLLOW_numericUnsigned_in_numericLiteral795);
                    numericUnsigned39=numericUnsigned();

                    state._fsp--;

                     value = numericUnsigned39; 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:546:5: numericPositive
                    {
                    pushFollow(FOLLOW_numericPositive_in_numericLiteral803);
                    numericPositive40=numericPositive();

                    state._fsp--;

                     value = numericPositive40; 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:547:5: numericNegative
                    {
                    pushFollow(FOLLOW_numericNegative_in_numericLiteral811);
                    numericNegative41=numericNegative();

                    state._fsp--;

                     value = numericNegative41; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericLiteral"


    // $ANTLR start "nodeID"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:550:1: nodeID : BLANK_PREFIX name ;
    public final void nodeID() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:551:3: ( BLANK_PREFIX name )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:551:5: BLANK_PREFIX name
            {
            match(input,BLANK_PREFIX,FOLLOW_BLANK_PREFIX_in_nodeID826); 
            pushFollow(FOLLOW_name_in_nodeID828);
            name();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeID"


    // $ANTLR start "relativeURI"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:554:1: relativeURI : STRING_URI ;
    public final void relativeURI() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:555:3: ( STRING_URI )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:555:5: STRING_URI
            {
            match(input,STRING_URI,FOLLOW_STRING_URI_in_relativeURI842); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relativeURI"

    public static class namespace_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "namespace"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:558:1: namespace : NAMESPACE ;
    public final TurtleOBDAParser.namespace_return namespace() throws RecognitionException {
        TurtleOBDAParser.namespace_return retval = new TurtleOBDAParser.namespace_return();
        retval.start = input.LT(1);

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:559:3: ( NAMESPACE )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:559:5: NAMESPACE
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace855); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class defaultNamespace_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "defaultNamespace"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:562:1: defaultNamespace : COLON ;
    public final TurtleOBDAParser.defaultNamespace_return defaultNamespace() throws RecognitionException {
        TurtleOBDAParser.defaultNamespace_return retval = new TurtleOBDAParser.defaultNamespace_return();
        retval.start = input.LT(1);

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:563:3: ( COLON )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:563:5: COLON
            {
            match(input,COLON,FOLLOW_COLON_in_defaultNamespace870); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defaultNamespace"


    // $ANTLR start "name"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:566:1: name : VARNAME ;
    public final void name() throws RecognitionException {
        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:567:3: ( VARNAME )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:567:5: VARNAME
            {
            match(input,VARNAME,FOLLOW_VARNAME_in_name883); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "name"

    public static class languageTag_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "languageTag"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:570:1: languageTag : VARNAME ;
    public final TurtleOBDAParser.languageTag_return languageTag() throws RecognitionException {
        TurtleOBDAParser.languageTag_return retval = new TurtleOBDAParser.languageTag_return();
        retval.start = input.LT(1);

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:571:3: ( VARNAME )
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:571:5: VARNAME
            {
            match(input,VARNAME,FOLLOW_VARNAME_in_languageTag896); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "languageTag"


    // $ANTLR start "booleanLiteral"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:574:1: booleanLiteral returns [ValueConstant value] : ( TRUE | FALSE );
    public final ValueConstant booleanLiteral() throws RecognitionException {
        ValueConstant value = null;

        Token TRUE42=null;
        Token FALSE43=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:575:3: ( TRUE | FALSE )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TRUE) ) {
                alt20=1;
            }
            else if ( (LA20_0==FALSE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:575:5: TRUE
                    {
                    TRUE42=(Token)match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral913); 
                     value = dfac.getConstantLiteral((TRUE42!=null?TRUE42.getText():null), COL_TYPE.BOOLEAN); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:576:5: FALSE
                    {
                    FALSE43=(Token)match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral922); 
                     value = dfac.getConstantLiteral((FALSE43!=null?FALSE43.getText():null), COL_TYPE.BOOLEAN); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "numericUnsigned"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:579:1: numericUnsigned returns [ValueConstant value] : ( INTEGER | DOUBLE | DECIMAL );
    public final ValueConstant numericUnsigned() throws RecognitionException {
        ValueConstant value = null;

        Token INTEGER44=null;
        Token DOUBLE45=null;
        Token DECIMAL46=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:580:3: ( INTEGER | DOUBLE | DECIMAL )
            int alt21=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt21=1;
                }
                break;
            case DOUBLE:
                {
                alt21=2;
                }
                break;
            case DECIMAL:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:580:5: INTEGER
                    {
                    INTEGER44=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numericUnsigned941); 
                     value = dfac.getConstantLiteral((INTEGER44!=null?INTEGER44.getText():null), COL_TYPE.INTEGER); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:581:5: DOUBLE
                    {
                    DOUBLE45=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericUnsigned949); 
                     value = dfac.getConstantLiteral((DOUBLE45!=null?DOUBLE45.getText():null), COL_TYPE.DOUBLE); 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:582:5: DECIMAL
                    {
                    DECIMAL46=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericUnsigned958); 
                     value = dfac.getConstantLiteral((DECIMAL46!=null?DECIMAL46.getText():null), COL_TYPE.DECIMAL); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericUnsigned"


    // $ANTLR start "numericPositive"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:585:1: numericPositive returns [ValueConstant value] : ( INTEGER_POSITIVE | DOUBLE_POSITIVE | DECIMAL_POSITIVE );
    public final ValueConstant numericPositive() throws RecognitionException {
        ValueConstant value = null;

        Token INTEGER_POSITIVE47=null;
        Token DOUBLE_POSITIVE48=null;
        Token DECIMAL_POSITIVE49=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:586:3: ( INTEGER_POSITIVE | DOUBLE_POSITIVE | DECIMAL_POSITIVE )
            int alt22=3;
            switch ( input.LA(1) ) {
            case INTEGER_POSITIVE:
                {
                alt22=1;
                }
                break;
            case DOUBLE_POSITIVE:
                {
                alt22=2;
                }
                break;
            case DECIMAL_POSITIVE:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:586:5: INTEGER_POSITIVE
                    {
                    INTEGER_POSITIVE47=(Token)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericPositive977); 
                     value = dfac.getConstantLiteral((INTEGER_POSITIVE47!=null?INTEGER_POSITIVE47.getText():null), COL_TYPE.INTEGER); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:587:5: DOUBLE_POSITIVE
                    {
                    DOUBLE_POSITIVE48=(Token)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericPositive985); 
                     value = dfac.getConstantLiteral((DOUBLE_POSITIVE48!=null?DOUBLE_POSITIVE48.getText():null), COL_TYPE.DOUBLE); 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:588:5: DECIMAL_POSITIVE
                    {
                    DECIMAL_POSITIVE49=(Token)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericPositive994); 
                     value = dfac.getConstantLiteral((DECIMAL_POSITIVE49!=null?DECIMAL_POSITIVE49.getText():null), COL_TYPE.DECIMAL); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericPositive"


    // $ANTLR start "numericNegative"
    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:591:1: numericNegative returns [ValueConstant value] : ( INTEGER_NEGATIVE | DOUBLE_NEGATIVE | DECIMAL_NEGATIVE );
    public final ValueConstant numericNegative() throws RecognitionException {
        ValueConstant value = null;

        Token INTEGER_NEGATIVE50=null;
        Token DOUBLE_NEGATIVE51=null;
        Token DECIMAL_NEGATIVE52=null;

        try {
            // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:592:3: ( INTEGER_NEGATIVE | DOUBLE_NEGATIVE | DECIMAL_NEGATIVE )
            int alt23=3;
            switch ( input.LA(1) ) {
            case INTEGER_NEGATIVE:
                {
                alt23=1;
                }
                break;
            case DOUBLE_NEGATIVE:
                {
                alt23=2;
                }
                break;
            case DECIMAL_NEGATIVE:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:592:5: INTEGER_NEGATIVE
                    {
                    INTEGER_NEGATIVE50=(Token)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericNegative1013); 
                     value = dfac.getConstantLiteral((INTEGER_NEGATIVE50!=null?INTEGER_NEGATIVE50.getText():null), COL_TYPE.INTEGER); 

                    }
                    break;
                case 2 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:593:5: DOUBLE_NEGATIVE
                    {
                    DOUBLE_NEGATIVE51=(Token)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericNegative1021); 
                     value = dfac.getConstantLiteral((DOUBLE_NEGATIVE51!=null?DOUBLE_NEGATIVE51.getText():null), COL_TYPE.DOUBLE); 

                    }
                    break;
                case 3 :
                    // /Users/xiao/Projects/ontop/obdalib-core/src/main/java/it/unibz/krdb/obda/parser/TurtleOBDA.g:594:5: DECIMAL_NEGATIVE
                    {
                    DECIMAL_NEGATIVE52=(Token)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericNegative1030); 
                     value = dfac.getConstantLiteral((DECIMAL_NEGATIVE52!=null?DECIMAL_NEGATIVE52.getText():null), COL_TYPE.DECIMAL); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "numericNegative"

    // Delegated rules


 

    public static final BitSet FOLLOW_directiveStatement_in_parse51 = new BitSet(new long[]{0x0000000000005840L});
    public static final BitSet FOLLOW_triplesStatement_in_parse60 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_triplesStatement_in_parse71 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_EOF_in_parse75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directiveStatement90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PERIOD_in_directiveStatement92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triples_in_triplesStatement109 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WS_in_triplesStatement111 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_PERIOD_in_triplesStatement114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_in_directive129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixID_in_directive135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_base148 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BASE_in_base150 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_uriref_in_base152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_prefixID170 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PREFIX_in_prefixID172 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_namespace_in_prefixID175 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_defaultNamespace_in_prefixID181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_uriref_in_prefixID186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_triples205 = new BitSet(new long[]{0x0000000000001800L,0x0000000000002000L});
    public static final BitSet FOLLOW_predicateObjectList_in_triples209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_predicateObjectList235 = new BitSet(new long[]{0x00000007FF045800L});
    public static final BitSet FOLLOW_objectList_in_predicateObjectList241 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_SEMI_in_predicateObjectList250 = new BitSet(new long[]{0x0000000000001800L,0x0000000000002000L});
    public static final BitSet FOLLOW_verb_in_predicateObjectList254 = new BitSet(new long[]{0x00000007FF045800L});
    public static final BitSet FOLLOW_objectList_in_predicateObjectList258 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_predicate_in_verb281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_verb289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList315 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_objectList320 = new BitSet(new long[]{0x00000007FF045800L});
    public static final BitSet FOLLOW_object_in_objectList324 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_resource_in_subject346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_subject354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_predicate374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_object393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_object401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedLiteral_in_object410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_object418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uriref_in_resource438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qname_in_resource446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_WITH_BRACKET_in_uriref465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_NAME_in_qname484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeID_in_blank499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_blank505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_WITH_CURLY_BRACKET_in_variable522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resource_in_function543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function545 = new BitSet(new long[]{0x00000007FF045800L});
    public static final BitSet FOLLOW_terms_in_function547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_typedLiteral568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AT_in_typedLiteral570 = new BitSet(new long[]{0x0000000000805800L});
    public static final BitSet FOLLOW_language_in_typedLiteral572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_typedLiteral580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REFERENCE_in_typedLiteral582 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_resource_in_typedLiteral584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_languageTag_in_language603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_language611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_terms637 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_terms642 = new BitSet(new long[]{0x00000007FF045800L});
    public static final BitSet FOLLOW_term_in_terms646 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_function_in_term667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_term675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_term683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal702 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AT_in_literal705 = new BitSet(new long[]{0x0000000000805800L});
    public static final BitSet FOLLOW_language_in_literal707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypeString_in_literal717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_WITH_QUOTE_DOUBLE_in_stringLiteral752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_dataTypeString772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REFERENCE_in_dataTypeString774 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_resource_in_dataTypeString776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericUnsigned_in_numericLiteral795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericPositive_in_numericLiteral803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericNegative_in_numericLiteral811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_PREFIX_in_nodeID826 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_name_in_nodeID828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_URI_in_relativeURI842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_defaultNamespace870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_name883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_languageTag896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numericUnsigned941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_numericUnsigned949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_numericUnsigned958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericPositive977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericPositive985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericPositive994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericNegative1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericNegative1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericNegative1030 = new BitSet(new long[]{0x0000000000000002L});

}