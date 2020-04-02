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
    "\11\47\1\3\1\2\1\4\2\2\22\47\1\73\1\74\1\46\1\41\1\47\1\64\1\77\1\57\1\102"+
    "\1\103\1\47\1\35\1\100\1\35\1\60\1\75\1\61\1\33\2\43\4\34\2\32\1\65\1\36\4"+
    "\47\1\101\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\14\1\16\1\17\1\14\1"+
    "\20\1\21\1\22\1\14\1\37\1\24\1\25\1\26\1\27\1\30\1\31\2\14\1\104\1\42\1\105"+
    "\1\47\1\14\1\76\1\50\1\51\1\7\1\10\1\56\1\55\1\72\1\66\1\15\1\14\1\16\1\71"+
    "\1\14\1\53\1\21\1\44\1\70\1\23\1\67\1\52\1\40\1\54\1\30\1\45\2\14\1\62\1\63"+
    "\1\62\7\47\1\4\172\47\250\0\2\1\126\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\2\4\1\3\1\1"+
    "\1\4\1\5\3\2\1\6\1\7\1\2\1\10\1\11"+
    "\1\12\1\13\1\14\4\0\2\4\1\1\1\15\1\0"+
    "\1\1\1\0\1\16\3\0\1\17\4\0\1\20\1\10"+
    "\1\0\1\21\2\4\1\0\14\22\10\0\1\4\12\0"+
    "\1\22\2\0\1\22\1\0\1\5\2\0\1\4\3\0"+
    "\1\22\4\0\1\22\1\0\1\1\5\0\1\22\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[115];
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
    "\0\0\0\106\0\214\0\322\0\u0118\0\u015e\0\u01a4\0\u01ea"+
    "\0\u0230\0\u0276\0\u02bc\0\u0302\0\u0348\0\u038e\0\214\0\u015e"+
    "\0\u03d4\0\u041a\0\214\0\214\0\214\0\214\0\u0460\0\u04a6"+
    "\0\u0348\0\u03d4\0\u04ec\0\u0532\0\u0578\0\u05be\0\u0604\0\u064a"+
    "\0\u0690\0\214\0\u06d6\0\u071c\0\u0762\0\u07a8\0\u07ee\0\u0834"+
    "\0\u038e\0\u087a\0\214\0\214\0\u08c0\0\u0906\0\u094c\0\u0992"+
    "\0\u09d8\0\214\0\u0a1e\0\u0a64\0\u0aaa\0\u0af0\0\u0b36\0\u0b7c"+
    "\0\u0bc2\0\u0c08\0\u0c4e\0\u0c94\0\u0cda\0\u0d20\0\u0d66\0\u0dac"+
    "\0\u0df2\0\u0e38\0\u0e7e\0\u0ec4\0\u0906\0\u0f0a\0\u0f50\0\u0f96"+
    "\0\u0fdc\0\u1022\0\u1068\0\u10ae\0\u10f4\0\u113a\0\u1180\0\u11c6"+
    "\0\u120c\0\u0bc2\0\u1252\0\u1298\0\u12de\0\214\0\u1324\0\u136a"+
    "\0\u13b0\0\u13f6\0\u143c\0\u1482\0\u14c8\0\u150e\0\u1554\0\u159a"+
    "\0\u15e0\0\u1626\0\u166c\0\u015e\0\u16b2\0\u16f8\0\u173e\0\u1784"+
    "\0\u17ca\0\u1810\0\u1856\0\u0b7c\0\u189c\0\u18e2\0\u1928\0\u196e"+
    "\0\u19b4\0\u19fa\0\u1a40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[115];
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
    "\2\3\2\4\35\3\1\5\31\3\1\4\12\3\1\6"+
    "\1\7\1\10\1\4\1\7\25\6\3\11\1\12\1\13"+
    "\2\6\1\14\1\15\1\11\2\6\1\16\10\6\1\17"+
    "\1\20\1\11\1\3\1\21\7\6\1\4\2\6\1\17"+
    "\1\6\1\22\1\6\1\23\1\24\1\25\1\26\110\0"+
    "\2\4\67\0\1\4\103\0\1\27\2\0\1\30\11\0"+
    "\2\6\2\0\32\6\1\0\3\6\1\31\3\6\1\0"+
    "\10\6\1\0\2\6\1\0\1\32\7\6\1\0\2\6"+
    "\1\0\1\6\1\0\1\6\4\0\1\6\1\7\2\10"+
    "\1\7\31\6\1\0\3\6\1\31\3\6\1\0\10\6"+
    "\1\0\2\6\1\0\1\32\7\6\1\10\2\6\1\0"+
    "\1\6\1\0\1\6\5\0\4\10\66\0\1\10\12\0"+
    "\2\6\2\0\26\6\3\11\1\6\1\0\3\6\1\31"+
    "\1\11\2\6\1\0\10\6\1\0\1\6\1\11\1\0"+
    "\1\32\7\6\1\0\2\6\1\0\1\6\1\0\1\6"+
    "\4\0\2\6\2\0\11\6\1\33\2\6\1\34\15\6"+
    "\1\0\3\6\1\31\3\6\1\0\4\6\1\34\3\6"+
    "\1\0\2\6\1\0\1\32\7\6\1\0\2\6\1\0"+
    "\1\6\1\0\1\6\4\0\1\13\2\0\1\13\1\0"+
    "\101\13\6\0\1\35\3\0\1\36\10\0\1\37\1\0"+
    "\1\36\3\0\1\40\3\41\1\0\1\42\3\0\1\43"+
    "\1\41\1\37\1\40\1\44\2\0\1\35\1\36\2\0"+
    "\1\36\1\0\1\17\1\0\1\41\1\0\1\45\1\6"+
    "\1\46\1\47\1\50\6\0\2\17\1\22\1\0\1\23"+
    "\1\0\1\25\1\0\1\6\2\0\1\6\1\0\101\6"+
    "\42\51\1\52\3\51\1\53\37\51\63\32\1\6\22\32"+
    "\101\0\1\54\54\0\1\55\42\0\31\56\1\0\2\56"+
    "\2\0\3\56\2\0\7\56\2\0\1\56\4\0\5\56"+
    "\13\0\2\6\2\0\14\6\1\57\15\6\1\0\3\6"+
    "\1\31\3\6\1\0\4\6\1\57\3\6\1\0\2\6"+
    "\1\0\1\32\7\6\1\0\2\6\1\0\1\6\1\0"+
    "\1\6\4\0\2\6\2\0\1\6\1\60\30\6\1\0"+
    "\3\6\1\31\3\6\1\0\1\6\1\60\6\6\1\0"+
    "\2\6\1\0\1\32\7\6\1\0\2\6\1\0\1\6"+
    "\1\0\1\6\37\0\1\35\25\0\1\35\24\0\2\36"+
    "\2\0\32\36\1\0\3\36\1\0\3\36\1\0\10\36"+
    "\1\0\2\36\2\0\7\36\1\0\2\36\1\0\1\36"+
    "\1\0\1\36\51\0\1\61\45\0\6\40\17\0\3\40"+
    "\6\0\1\40\4\0\2\40\3\0\2\40\2\0\1\40"+
    "\56\0\3\41\6\0\1\41\15\0\1\41\20\0\1\23"+
    "\1\0\1\25\1\0\1\62\2\0\1\62\1\0\1\62"+
    "\1\63\10\62\1\64\1\65\1\62\1\66\1\67\1\70"+
    "\1\71\1\72\1\73\3\62\1\74\3\62\1\67\1\75"+
    "\2\62\1\74\1\66\4\62\1\63\1\71\1\65\1\73"+
    "\4\62\1\74\5\62\1\70\1\62\1\64\14\62\2\0"+
    "\40\44\1\76\3\44\1\53\37\44\63\45\1\77\22\45"+
    "\2\46\2\0\32\46\1\0\3\46\1\100\3\46\1\0"+
    "\10\46\1\0\2\46\1\0\1\101\7\46\1\0\2\46"+
    "\1\0\1\46\1\0\1\46\54\0\1\102\137\0\1\23"+
    "\1\0\1\25\2\0\2\51\1\0\1\51\16\0\1\51"+
    "\2\0\1\103\4\0\2\51\3\0\1\103\1\0\2\51"+
    "\1\0\1\103\1\51\1\0\10\51\1\0\1\51\77\0"+
    "\1\104\37\0\31\56\1\0\2\56\2\0\3\56\2\0"+
    "\7\56\2\0\1\56\4\0\5\56\2\0\1\105\10\0"+
    "\2\6\2\0\6\6\1\106\23\6\1\0\3\6\1\31"+
    "\3\6\1\0\6\6\1\106\1\6\1\0\2\6\1\0"+
    "\1\32\7\6\1\0\2\6\1\0\1\6\1\0\1\6"+
    "\4\0\2\6\2\0\14\6\1\106\15\6\1\0\3\6"+
    "\1\31\3\6\1\0\4\6\1\106\3\6\1\0\2\6"+
    "\1\0\1\32\7\6\1\0\2\6\1\0\1\6\1\0"+
    "\1\6\45\0\1\107\4\0\1\51\44\0\1\110\42\0"+
    "\1\110\52\0\1\111\101\0\1\112\14\0\1\113\11\0"+
    "\1\113\15\0\1\112\34\0\1\114\42\0\1\114\46\0"+
    "\1\115\14\0\1\116\11\0\1\116\15\0\1\115\51\0"+
    "\1\117\21\0\1\117\46\0\1\120\42\0\1\120\42\0"+
    "\6\121\17\0\3\121\6\0\1\121\4\0\2\121\3\0"+
    "\2\121\2\0\1\121\51\0\1\122\24\0\1\122\66\0"+
    "\2\123\6\0\1\123\15\0\1\123\31\0\6\124\17\0"+
    "\3\124\6\0\1\124\4\0\2\124\3\0\2\124\2\0"+
    "\1\124\25\0\2\44\1\0\1\44\16\0\1\44\7\0"+
    "\2\44\5\0\2\44\1\0\1\125\1\44\1\0\10\44"+
    "\1\0\1\44\24\0\41\45\1\126\21\45\1\77\22\45"+
    "\1\46\2\0\1\46\1\0\101\46\63\101\1\46\22\101"+
    "\67\0\1\127\23\0\6\51\17\0\3\51\6\0\1\51"+
    "\4\0\2\51\3\0\2\51\2\0\1\51\116\0\1\130"+
    "\13\0\2\6\2\0\32\6\1\0\3\6\1\31\3\6"+
    "\1\0\10\6\1\0\1\131\1\6\1\0\1\32\7\6"+
    "\1\0\2\6\1\0\1\6\1\0\1\6\52\0\1\44"+
    "\46\0\1\132\116\0\1\133\32\0\1\133\62\0\1\134"+
    "\74\0\1\135\51\0\1\135\27\0\1\136\56\0\1\136"+
    "\40\0\1\137\24\0\1\137\41\0\1\140\42\0\1\140"+
    "\41\0\1\141\42\0\1\141\43\0\1\62\42\0\1\62"+
    "\41\0\6\75\17\0\3\75\6\0\1\75\4\0\2\75"+
    "\3\0\2\75\2\0\1\75\57\0\2\62\6\0\1\62"+
    "\15\0\1\62\31\0\6\142\17\0\3\142\6\0\1\142"+
    "\4\0\2\142\3\0\2\142\2\0\1\142\31\0\6\44"+
    "\17\0\3\44\6\0\1\44\4\0\2\44\3\0\2\44"+
    "\2\0\1\44\112\0\1\143\112\0\1\30\12\0\2\6"+
    "\2\0\32\6\1\0\3\6\1\31\3\6\1\0\6\6"+
    "\1\144\1\6\1\0\1\6\1\144\1\0\1\32\7\6"+
    "\1\0\2\6\1\0\1\6\1\0\1\6\22\0\1\145"+
    "\100\0\1\146\44\0\1\146\46\0\1\147\51\0\1\147"+
    "\33\0\1\62\51\0\1\62\25\0\1\62\44\0\1\62"+
    "\55\0\1\150\11\0\1\150\66\0\1\151\73\0\1\136"+
    "\103\0\6\152\17\0\3\152\6\0\1\152\4\0\2\152"+
    "\3\0\2\152\2\0\1\152\102\0\1\153\23\0\1\23"+
    "\1\0\1\25\25\0\1\154\42\0\1\154\30\0\1\155"+
    "\42\0\1\155\45\0\1\156\113\0\1\157\13\0\1\157"+
    "\74\0\1\160\11\0\1\160\52\0\6\62\17\0\3\62"+
    "\6\0\1\62\4\0\2\62\3\0\2\62\2\0\1\62"+
    "\114\0\1\161\26\0\1\162\44\0\1\162\47\0\1\136"+
    "\32\0\1\136\52\0\1\62\32\0\1\62\57\0\1\62"+
    "\24\0\1\62\107\0\1\50\25\0\1\23\1\0\1\25"+
    "\12\0\1\163\44\0\1\163\37\0\1\62\75\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6790];
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
    "\4\1\1\0\1\1\1\0\1\11\3\0\1\1\4\0"+
    "\2\11\1\0\3\1\1\0\1\11\13\1\10\0\1\1"+
    "\12\0\1\1\2\0\1\1\1\0\1\11\2\0\1\1"+
    "\3\0\1\1\4\0\1\1\1\0\1\1\5\0\1\1"+
    "\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[115];
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
