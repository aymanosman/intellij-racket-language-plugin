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
IDENTIFIER_CHARACTER=[a-z]
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state WAITING_VALUE

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return RacketTypes.COMMENT; }

//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return RacketTypes.KEY; }

//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return RacketTypes.SEPARATOR; }

<YYINITIAL> {LPAREN}                                        { yybegin(WAITING_VALUE); return RacketTypes.LPAREN; }
<WAITING_VALUE> {IDENTIFIER_CHARACTER}+                             { yybegin(WAITING_VALUE); return RacketTypes.IDENTIFIER; }
<WAITING_VALUE> {RPAREN}                                    { yybegin(YYINITIAL); return RacketTypes.RPAREN; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return RacketTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
