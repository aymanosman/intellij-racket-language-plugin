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

identifier_chars=[^\",'`()\[\]{};\\|\ \n\r\t\f]
identifier_start=[^\",'`()\[\]{};\\|\ \n\r\t\f#]
identifier={identifier_start} ({identifier_chars})*

langchar=[a-zA-Z0-9] | "+" | "-" | "_"
langline=("#lang " | "#!") ({langchar} | ({langchar} ({langchar} | "/")* {langchar}))

%state MAIN

%%

<YYINITIAL> {langline} { yybegin(MAIN); return RacketTypes.HASH_LANG; }

<MAIN> {racket_whitespace}+ { return TokenType.WHITE_SPACE; }
<MAIN> {identifier}  { return RacketTypes.IDENTIFIER; }
//<MAIN> {END_OF_LINE_COMMENT} { return RacketTypes.COMMENT; }
//<MAIN> {LPAREN} {  return RacketTypes.LPAREN; }
//<MAIN> {RPAREN} { return RacketTypes.RPAREN; }
<MAIN> {CRLF}({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }
//<MAIN> {WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }
//<MAIN> ({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }

[^] { return TokenType.BAD_CHARACTER; }
