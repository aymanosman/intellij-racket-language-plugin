/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.aymanosman.racket.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Racket.flex</tt>
 */
class RacketLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MAIN = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1672 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\76\2\1\3\277\2");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\45\1\3\1\2\1\4\2\2\22\45\1\71\1\72\1\44\1\40\1\45\1\62\1\75\1\55\1\100"+
    "\1\101\1\45\1\34\1\76\1\34\1\56\1\73\1\57\3\32\4\33\2\31\1\63\1\35\4\45\1"+
    "\77\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\14\1\16\1\17\1\14\1\20\1\21"+
    "\1\22\1\14\1\36\1\24\1\25\1\26\1\27\1\30\3\14\1\102\1\41\1\103\1\45\1\14\1"+
    "\74\1\46\1\47\1\7\1\10\1\54\1\53\1\70\1\64\1\15\1\14\1\16\1\67\1\14\1\51\1"+
    "\21\1\42\1\66\1\23\1\65\1\50\1\37\1\52\1\30\1\43\2\14\1\60\1\61\1\60\7\45"+
    "\1\4\172\45\250\0\2\1\126\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\2\4\1\3\1\1"+
    "\1\4\1\5\3\2\1\6\1\7\1\2\1\10\1\11"+
    "\1\12\1\13\1\14\4\0\2\4\1\15\2\0\1\16"+
    "\2\0\1\17\4\0\1\20\1\10\1\0\1\21\2\4"+
    "\1\0\14\22\7\0\1\4\12\0\1\22\2\0\1\22"+
    "\3\0\1\4\3\0\1\22\4\0\1\22\1\0\1\1"+
    "\5\0\1\22\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\u0198\0\u01dc"+
    "\0\u0220\0\u0264\0\u02a8\0\u02ec\0\u0330\0\u0374\0\210\0\u0154"+
    "\0\u03b8\0\u03fc\0\210\0\210\0\210\0\210\0\u0440\0\u0484"+
    "\0\u0330\0\u03b8\0\u04c8\0\u050c\0\u0550\0\u0594\0\u05d8\0\210"+
    "\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0374\0\u0770\0\210"+
    "\0\210\0\u07b4\0\u07f8\0\u083c\0\u0880\0\u08c4\0\210\0\u0908"+
    "\0\u094c\0\u0990\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\u0ae4\0\u0b28"+
    "\0\u0b6c\0\u0bb0\0\u0bf4\0\u0c38\0\u0c7c\0\u0cc0\0\u0d04\0\u0d48"+
    "\0\u07f8\0\u0d8c\0\u0dd0\0\u0e14\0\u0e58\0\u0e9c\0\u0ee0\0\u0f24"+
    "\0\u0f68\0\u0fac\0\u0ff0\0\u1034\0\u1078\0\u0aa0\0\u10bc\0\u1100"+
    "\0\u1144\0\u1188\0\u11cc\0\u1210\0\u1254\0\u1298\0\u12dc\0\u1320"+
    "\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474\0\u14b8\0\u0154\0\u14fc"+
    "\0\u1540\0\u1584\0\u15c8\0\u160c\0\u1650\0\u1694\0\u0a5c\0\u16d8"+
    "\0\u171c\0\u1760\0\u17a4\0\u17e8\0\u182c\0\u1870";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\3\2\4\34\3\1\5\30\3\1\4\12\3\1\6"+
    "\1\7\1\10\1\4\1\7\24\6\3\11\1\12\1\13"+
    "\2\6\1\14\1\15\2\6\1\16\10\6\1\17\1\20"+
    "\1\11\1\3\1\21\7\6\1\4\2\6\1\17\1\6"+
    "\1\22\1\6\1\23\1\24\1\25\1\26\106\0\2\4"+
    "\65\0\1\4\101\0\1\27\2\0\1\30\11\0\2\6"+
    "\2\0\31\6\1\0\3\6\1\31\2\6\1\0\10\6"+
    "\1\0\2\6\1\0\1\32\7\6\1\0\2\6\1\0"+
    "\1\6\1\0\1\6\4\0\1\6\1\7\2\10\1\7"+
    "\30\6\1\0\3\6\1\31\2\6\1\0\10\6\1\0"+
    "\2\6\1\0\1\32\7\6\1\10\2\6\1\0\1\6"+
    "\1\0\1\6\5\0\4\10\64\0\1\10\12\0\2\6"+
    "\2\0\25\6\3\11\1\6\1\0\3\6\1\31\2\6"+
    "\1\0\10\6\1\0\1\6\1\11\1\0\1\32\7\6"+
    "\1\0\2\6\1\0\1\6\1\0\1\6\4\0\2\6"+
    "\2\0\11\6\1\33\2\6\1\34\14\6\1\0\3\6"+
    "\1\31\2\6\1\0\4\6\1\34\3\6\1\0\2\6"+
    "\1\0\1\32\7\6\1\0\2\6\1\0\1\6\1\0"+
    "\1\6\4\0\1\13\2\0\1\13\1\0\77\13\12\0"+
    "\1\35\10\0\1\36\1\0\1\35\3\0\3\37\1\0"+
    "\1\40\3\0\1\41\1\36\1\0\1\42\3\0\1\35"+
    "\2\0\1\35\1\0\1\17\1\0\1\37\2\0\1\6"+
    "\1\43\1\44\1\45\6\0\2\17\1\22\1\0\1\23"+
    "\1\0\1\25\1\0\1\6\2\0\1\6\1\0\77\6"+
    "\41\46\1\47\2\46\1\50\37\46\61\32\1\6\22\32"+
    "\77\0\1\51\52\0\1\52\42\0\30\53\1\0\2\53"+
    "\2\0\2\53\2\0\7\53\2\0\1\53\4\0\5\53"+
    "\13\0\2\6\2\0\14\6\1\54\14\6\1\0\3\6"+
    "\1\31\2\6\1\0\4\6\1\54\3\6\1\0\2\6"+
    "\1\0\1\32\7\6\1\0\2\6\1\0\1\6\1\0"+
    "\1\6\4\0\2\6\2\0\1\6\1\55\27\6\1\0"+
    "\3\6\1\31\2\6\1\0\1\6\1\55\6\6\1\0"+
    "\2\6\1\0\1\32\7\6\1\0\2\6\1\0\1\6"+
    "\1\0\1\6\4\0\2\35\2\0\31\35\1\0\3\35"+
    "\1\0\2\35\1\0\10\35\1\0\2\35\2\0\7\35"+
    "\1\0\2\35\1\0\1\35\1\0\1\35\47\0\1\56"+
    "\71\0\3\37\23\0\1\37\20\0\1\23\1\0\1\25"+
    "\1\0\1\57\2\0\1\57\1\0\1\57\1\60\10\57"+
    "\1\61\1\62\1\57\1\63\1\64\1\65\1\66\1\67"+
    "\1\70\2\57\1\71\3\57\1\64\1\72\2\57\1\63"+
    "\4\57\1\60\1\66\1\62\1\70\4\57\1\71\5\57"+
    "\1\65\1\57\1\61\14\57\2\0\37\42\1\73\2\42"+
    "\1\50\37\42\2\43\2\0\31\43\1\0\3\43\1\74"+
    "\2\43\1\0\10\43\1\0\2\43\1\0\1\75\7\43"+
    "\1\0\2\43\1\0\1\43\1\0\1\43\52\0\1\76"+
    "\135\0\1\23\1\0\1\25\2\0\2\46\1\0\1\46"+
    "\16\0\1\46\2\0\1\77\3\0\2\46\3\0\1\77"+
    "\1\0\1\46\1\0\1\77\1\46\1\0\10\46\1\0"+
    "\1\46\75\0\1\100\37\0\30\53\1\0\2\53\2\0"+
    "\2\53\2\0\7\53\2\0\1\53\4\0\5\53\2\0"+
    "\1\101\10\0\2\6\2\0\6\6\1\102\22\6\1\0"+
    "\3\6\1\31\2\6\1\0\6\6\1\102\1\6\1\0"+
    "\2\6\1\0\1\32\7\6\1\0\2\6\1\0\1\6"+
    "\1\0\1\6\4\0\2\6\2\0\14\6\1\102\14\6"+
    "\1\0\3\6\1\31\2\6\1\0\4\6\1\102\3\6"+
    "\1\0\2\6\1\0\1\32\7\6\1\0\2\6\1\0"+
    "\1\6\1\0\1\6\44\0\1\103\3\0\1\46\44\0"+
    "\1\104\40\0\1\104\52\0\1\105\77\0\1\106\14\0"+
    "\1\107\10\0\1\107\14\0\1\106\34\0\1\110\40\0"+
    "\1\110\46\0\1\111\14\0\1\112\10\0\1\112\14\0"+
    "\1\111\51\0\1\113\17\0\1\113\46\0\1\114\40\0"+
    "\1\114\42\0\6\115\16\0\3\115\12\0\2\115\3\0"+
    "\2\115\2\0\1\115\51\0\1\116\22\0\1\116\65\0"+
    "\2\117\23\0\1\117\31\0\6\120\16\0\3\120\12\0"+
    "\2\120\3\0\2\120\2\0\1\120\25\0\2\42\1\0"+
    "\1\42\16\0\1\42\6\0\2\42\5\0\1\42\1\0"+
    "\1\121\1\42\1\0\10\42\1\0\1\42\24\0\1\43"+
    "\2\0\1\43\1\0\77\43\61\75\1\43\22\75\65\0"+
    "\1\122\23\0\6\46\16\0\3\46\12\0\2\46\3\0"+
    "\2\46\2\0\1\46\114\0\1\123\13\0\2\6\2\0"+
    "\31\6\1\0\3\6\1\31\2\6\1\0\10\6\1\0"+
    "\1\124\1\6\1\0\1\32\7\6\1\0\2\6\1\0"+
    "\1\6\1\0\1\6\50\0\1\42\46\0\1\125\114\0"+
    "\1\126\30\0\1\126\62\0\1\127\72\0\1\130\47\0"+
    "\1\130\27\0\1\131\54\0\1\131\40\0\1\132\22\0"+
    "\1\132\41\0\1\133\40\0\1\133\41\0\1\134\40\0"+
    "\1\134\43\0\1\57\40\0\1\57\41\0\6\72\16\0"+
    "\3\72\12\0\2\72\3\0\2\72\2\0\1\72\56\0"+
    "\2\57\23\0\1\57\31\0\6\135\16\0\3\135\12\0"+
    "\2\135\3\0\2\135\2\0\1\135\31\0\6\42\16\0"+
    "\3\42\12\0\2\42\3\0\2\42\2\0\1\42\110\0"+
    "\1\136\110\0\1\30\12\0\2\6\2\0\31\6\1\0"+
    "\3\6\1\31\2\6\1\0\6\6\1\137\1\6\1\0"+
    "\1\6\1\137\1\0\1\32\7\6\1\0\2\6\1\0"+
    "\1\6\1\0\1\6\22\0\1\140\76\0\1\141\42\0"+
    "\1\141\46\0\1\142\47\0\1\142\33\0\1\57\47\0"+
    "\1\57\25\0\1\57\42\0\1\57\55\0\1\143\10\0"+
    "\1\143\65\0\1\144\71\0\1\131\101\0\6\145\16\0"+
    "\3\145\12\0\2\145\3\0\2\145\2\0\1\145\100\0"+
    "\1\146\23\0\1\23\1\0\1\25\25\0\1\147\40\0"+
    "\1\147\30\0\1\150\40\0\1\150\45\0\1\151\111\0"+
    "\1\152\12\0\1\152\73\0\1\153\10\0\1\153\51\0"+
    "\6\57\16\0\3\57\12\0\2\57\3\0\2\57\2\0"+
    "\1\57\112\0\1\154\26\0\1\155\42\0\1\155\47\0"+
    "\1\131\30\0\1\131\52\0\1\57\30\0\1\57\57\0"+
    "\1\57\22\0\1\57\105\0\1\45\25\0\1\23\1\0"+
    "\1\25\12\0\1\156\42\0\1\156\37\0\1\57\73\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6324];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\13\1\1\11\3\1\4\11\4\0"+
    "\3\1\2\0\1\11\2\0\1\1\4\0\2\11\1\0"+
    "\3\1\1\0\1\11\13\1\7\0\1\1\12\0\1\1"+
    "\2\0\1\1\3\0\1\1\3\0\1\1\4\0\1\1"+
    "\1\0\1\1\5\0\1\1\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RacketLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return RacketTypes.NUMBER;
            } 
            // fall through
          case 19: break;
          case 2: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 20: break;
          case 3: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 21: break;
          case 4: 
            { return RacketTypes.IDENTIFIER;
            } 
            // fall through
          case 22: break;
          case 5: 
            { return RacketTypes.COMMENT;
            } 
            // fall through
          case 23: break;
          case 6: 
            { return RacketTypes.CONSTANT;
            } 
            // fall through
          case 24: break;
          case 7: 
            { return RacketTypes.DOT;
            } 
            // fall through
          case 25: break;
          case 8: 
            { return RacketTypes.UNQUOTE;
            } 
            // fall through
          case 26: break;
          case 9: 
            { return RacketTypes.OPEN_PAREN;
            } 
            // fall through
          case 27: break;
          case 10: 
            { return RacketTypes.CLOSE_PAREN;
            } 
            // fall through
          case 28: break;
          case 11: 
            { return RacketTypes.OPEN_SQUARE;
            } 
            // fall through
          case 29: break;
          case 12: 
            { return RacketTypes.CLOSE_SQUARE;
            } 
            // fall through
          case 30: break;
          case 13: 
            { {
              String xs = yytext().toString();
              if (xs.equals("#true")
                  || xs.equals("#false")
                  || xs.equals("#t")
                  || xs.equals("#f")
                  || xs.equals("#T")
                  || xs.equals("#F")) {
                  return RacketTypes.BOOLEAN;
              } else {
                  return TokenType.ERROR_ELEMENT;
              }
          }
            } 
            // fall through
          case 31: break;
          case 14: 
            { return RacketTypes.SEXP_COMMENT;
            } 
            // fall through
          case 32: break;
          case 15: 
            { return RacketTypes.KEYWORD;
            } 
            // fall through
          case 33: break;
          case 16: 
            { return RacketTypes.STRING;
            } 
            // fall through
          case 34: break;
          case 17: 
            { yybegin(MAIN); return RacketTypes.HASH_LANG;
            } 
            // fall through
          case 35: break;
          case 18: 
            { return RacketTypes.CHARACTER;
            } 
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
