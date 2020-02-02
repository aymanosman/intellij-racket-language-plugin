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
WHITE_SPACE=[\ \n\t\f]
//FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=(";")[^\r\n]*
LPAREN="("
RPAREN=")"
//IDENTIFIER_CHARACTER=[^'\ \n\t\f\\\(\)]
IDENTIFIER_CHARACTER=[a-zA-Z0-9+-._/?!]*
// Identifier = [:jletter:] [:jletterdigit:]*
// DecIntegerLiteral = 0 | [1-9][0-9]*
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state STRING
%state WAITING_VALUE

%%

/* keywords */

<YYINITIAL> "#lang " { return RacketTypes.HASH_LANG; }

<YYINITIAL> {IDENTIFIER_CHARACTER}+  { return RacketTypes.IDENTIFIER; }

// <YYINITIAL> "define" { return RacketTypes.KEYWORD; }

// "#;" SEXP_COMMENT

<YYINITIAL> {END_OF_LINE_COMMENT} { return RacketTypes.COMMENT; }

//<YYINITIAL> {KEY_CHARACTER}+                        { return RacketTypes.KEY; }

//<YYINITIAL> {SEPARATOR}                                     { return RacketTypes.SEPARATOR; }

<YYINITIAL> {LPAREN}                                  {  return RacketTypes.LPAREN; }
<YYINITIAL> {IDENTIFIER_CHARACTER}+  {  return RacketTypes.IDENTIFIER; }
<YYINITIAL> {RPAREN}                                    { return RacketTypes.RPAREN; }

<YYINITIAL> {CRLF}({CRLF}|{WHITE_SPACE})+               { return TokenType.WHITE_SPACE; }

<YYINITIAL> {WHITE_SPACE}+                              { return TokenType.WHITE_SPACE; }

//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { return RacketTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
