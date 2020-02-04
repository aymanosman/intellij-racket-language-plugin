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
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\1\2\2\22\0\1\45\1\46\1\31\1\14\1\0\1\41\1\51\1\36\1\54\1\55"+
    "\1\0\1\10\1\37\1\10\1\0\1\47\4\5\4\6\2\4\1\0\1\11\5\0\5\7\1\53\15\10\1\52"+
    "\1\13\5\10\1\56\1\15\1\57\1\0\1\10\1\50\1\20\1\32\1\21\1\7\1\22\1\35\1\44"+
    "\1\42\1\26\2\10\1\25\1\10\1\23\1\10\1\17\1\43\1\30\1\16\1\33\1\12\1\34\1\24"+
    "\1\27\2\10\1\37\1\40\1\37\7\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\2\4\1\1\1\5\3\2"+
    "\1\6\1\2\1\7\1\10\1\11\1\12\10\0\1\6"+
    "\3\0\1\13\1\0\1\14\6\15\6\0\2\15\4\0"+
    "\1\15\3\0\1\15\5\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[62];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\140\0\u0270\0\140"+
    "\0\140\0\140\0\140\0\u02a0\0\u02d0\0\u0210\0\u0270\0\u0300"+
    "\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0240\0\u0420\0\140"+
    "\0\u0450\0\u0480\0\140\0\u04b0\0\u04e0\0\u0510\0\u0540\0\u0570"+
    "\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0480\0\u0660\0\u0690\0\u06c0"+
    "\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[62];
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
    "\14\3\1\4\43\3\1\5\1\6\1\7\1\10\3\11"+
    "\2\5\1\12\2\5\1\13\1\14\13\5\1\15\4\5"+
    "\1\16\1\3\1\17\4\5\1\10\2\5\1\16\3\5"+
    "\1\20\1\21\1\22\1\23\105\0\1\24\20\0\1\25"+
    "\11\0\2\5\2\0\5\5\1\0\3\5\1\26\13\5"+
    "\1\0\4\5\2\0\1\27\4\5\1\0\2\5\1\0"+
    "\3\5\4\0\1\5\1\6\2\7\5\5\1\0\3\5"+
    "\1\26\13\5\1\0\4\5\2\0\1\27\4\5\1\7"+
    "\2\5\1\0\3\5\5\0\3\7\41\0\1\7\14\0"+
    "\2\10\41\0\1\10\12\0\2\5\2\0\3\11\2\5"+
    "\1\0\3\5\1\26\13\5\1\0\4\5\2\0\1\27"+
    "\4\5\1\0\2\5\1\0\3\5\4\0\1\12\2\0"+
    "\55\12\4\0\3\30\6\0\1\31\1\32\1\33\10\0"+
    "\1\33\2\0\1\34\1\0\1\34\1\16\2\0\1\5"+
    "\1\35\5\0\2\16\2\34\1\20\1\0\1\22\1\0"+
    "\1\5\2\0\55\5\15\36\1\37\13\36\1\40\26\36"+
    "\40\27\1\5\17\27\20\0\1\41\43\0\5\42\1\0"+
    "\2\42\2\0\13\42\1\0\4\42\4\0\3\42\5\0"+
    "\2\42\10\0\3\30\45\0\1\20\1\0\1\22\1\0"+
    "\1\43\2\0\2\43\1\44\4\43\1\45\1\46\2\43"+
    "\1\47\4\43\1\50\34\43\54\0\1\20\1\0\1\22"+
    "\30\0\1\51\30\0\2\34\2\0\5\34\1\0\3\34"+
    "\1\0\13\34\1\0\4\34\3\0\4\34\1\0\2\34"+
    "\1\0\3\34\24\0\1\52\51\0\2\53\1\0\1\36"+
    "\2\0\1\36\1\0\2\36\4\0\7\36\44\0\1\54"+
    "\40\0\5\42\1\0\2\42\2\0\13\42\1\0\4\42"+
    "\4\0\3\42\2\0\1\55\2\0\2\42\11\0\2\56"+
    "\55\0\4\57\10\0\3\57\7\0\1\57\2\0\1\57"+
    "\15\0\1\57\10\0\4\60\10\0\3\60\7\0\1\60"+
    "\2\0\1\60\15\0\1\60\23\0\1\61\62\0\1\62"+
    "\66\0\1\36\44\0\1\63\45\0\4\36\10\0\3\36"+
    "\7\0\1\36\2\0\1\36\15\0\1\36\50\0\1\64"+
    "\20\0\2\43\55\0\4\65\10\0\3\65\7\0\1\65"+
    "\2\0\1\65\15\0\1\65\10\0\4\45\10\0\3\45"+
    "\7\0\1\45\2\0\1\45\15\0\1\45\24\0\1\66"+
    "\63\0\1\67\75\0\1\70\62\0\1\25\16\0\4\71"+
    "\10\0\3\71\7\0\1\71\2\0\1\71\15\0\1\71"+
    "\25\0\1\72\63\0\1\73\54\0\1\74\31\0\1\20"+
    "\1\0\1\22\5\0\4\43\10\0\3\43\7\0\1\43"+
    "\2\0\1\43\15\0\1\43\26\0\1\43\63\0\1\75"+
    "\74\0\1\76\37\0\1\72\70\0\1\32\17\0\1\20"+
    "\1\0\1\22\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2448];
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
    "\1\0\1\1\1\11\12\1\1\11\1\1\4\11\10\0"+
    "\1\1\3\0\1\11\1\0\1\1\1\11\5\1\6\0"+
    "\2\1\4\0\1\1\3\0\1\1\5\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[62];
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
          case 14: break;
          case 2: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 15: break;
          case 3: 
            { return RacketTypes.IDENTIFIER;
            } 
            // fall through
          case 16: break;
          case 4: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 17: break;
          case 5: 
            { return RacketTypes.COMMENT;
            } 
            // fall through
          case 18: break;
          case 6: 
            { return RacketTypes.CONSTANT;
            } 
            // fall through
          case 19: break;
          case 7: 
            { return RacketTypes.OPEN_PAREN;
            } 
            // fall through
          case 20: break;
          case 8: 
            { return RacketTypes.CLOSE_PAREN;
            } 
            // fall through
          case 21: break;
          case 9: 
            { return RacketTypes.OPEN_SQUARE;
            } 
            // fall through
          case 22: break;
          case 10: 
            { return RacketTypes.CLOSE_SQUARE;
            } 
            // fall through
          case 23: break;
          case 11: 
            { return RacketTypes.STRING;
            } 
            // fall through
          case 24: break;
          case 12: 
            { yybegin(MAIN); return RacketTypes.HASH_LANG;
            } 
            // fall through
          case 25: break;
          case 13: 
            { return RacketTypes.CHARACTER;
            } 
            // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
