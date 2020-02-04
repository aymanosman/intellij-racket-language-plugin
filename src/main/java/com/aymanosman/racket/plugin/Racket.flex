package com.aymanosman.racket.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.psi.TokenType;

%%

%class RacketLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\r\t\f]
racket_whitespace={WHITE_SPACE} // TODO

//any_char=.
//identifier_delims=[\",'`()\[\]{};] | {racket_whitespace}
//identifier_chars=!({identifier_delims} | "\\" | "|")
//identifier_escapes=("\\" {any_char}) | ("|" ~"|")
//identifier_start={identifier_escapes} | !({identifier_delims} | "\\" | "|" | "#") | "#%"
//identifier={identifier_start} ({identifier_escapes} {identifier_chars})*

//any_char=.
////identifier_delims=[\",'`()\[\]{};] | {racket_whitespace}
//identifier_chars=[^\",'`()\[\]{};\\|\ \n\r\t\f]
//identifier_escapes="\\" {any_char} | "|" ~"|"
//identifier_start={identifier_escapes} | [^\",'`()\[\]{};\\|\ \n\r\t\f#] | "#%"
//identifier={identifier_start} ({identifier_escapes} {identifier_chars})*

//    [digit (:/ "0" "9")]
//   [digit2 (:/ "0" "1")]
//   [digit8 (:/ "0" "7")]
//   [digit10 digit]
//   [digit16 (:/ "af" "AF" "09")]
digit=[0-9]
digit10={digit}

//   [list-prefix (:or "" "#hash" "#hasheq" "#hasheqv" "#s" (:: "#" (:* digit10)))])
list_prefix=""|"#hash"|"#hasheq"|"#hasheqv"|"#s"| "#" {digit10}*

identifier_chars=[^\",'`()\[\]{};\\|\ \n\r\t\f]
identifier_start=[^\",'`()\[\]{};\\|\ \n\r\t\f#]
identifier={identifier_start} {identifier_chars}*

langchar=[a-zA-Z0-9] | "+" | "-" | "_"
langline=("#lang " | "#!") ({langchar} | ({langchar} ({langchar} | "/")* {langchar}))

line_comment=";".*

%state MAIN

%%

<YYINITIAL> {langline} { yybegin(MAIN); return RacketTypes.HASH_LANG; }

<MAIN> {
 {racket_whitespace}+ { return TokenType.WHITE_SPACE; }
 {identifier}  { return RacketTypes.IDENTIFIER; }
 {line_comment} { return RacketTypes.COMMENT; }
 {list_prefix} "(" { return RacketTypes.OPEN_PAREN; }
      ")"          { return RacketTypes.CLOSE_PAREN; }
 {list_prefix} "[" { return RacketTypes.OPEN_SQUARE; }
  "]" { return RacketTypes.CLOSE_SQUARE; }

      // [(:or "'" "`" "#'" "#`" "#&")
              //      (ret lexeme 'constant #f start-pos end-pos 'continue)]
  "'" | "`" | "#'" | "#`" | "#&"  { return RacketTypes.CONSTANT; }

 {CRLF}({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }
// {WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }
// ({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }

}

[^] { return TokenType.BAD_CHARACTER; }
