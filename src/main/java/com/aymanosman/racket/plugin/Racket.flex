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

// =
CRLF=\R
WHITE_SPACE=[\ \n\r\t\f]

// =
any_char=.

// =
digit=[0-9]
digit2=[0-1]
digit8=[0-7]
digit10={digit}
digit16=[a-fA-F0-9]

langchar=[a-zA-Z0-9] | "+" | "-" | "_"

racket_whitespace={WHITE_SPACE} // TODO

line_comment=";"[^\R]*

unicode= "u" {digit16}{1,4}
        | "U" {digit16}{1,6}

character= "#\\" {any_char}
         | "#\\" {character_name}
         | "#\\" [0-3] {digit8} {digit8}
         | "#\\" {unicode}

character_name="space"
               | "newline"

//bad_char="#\\" | "#\\" {alphabetic}{2} | "#\\" [0-3] {digit8}
str=("#px" | "#rx")? "\"" ({string_element} | "\\" {unicode})* "\"" | {byte_str}
byte_str= ("#px" | "#rx")? "#\"" {byte_string_element}* "\""
string_element= [^\"\\] | {string_escape}
byte_string_element=[[\x00-\xFF]--\"\\] | {string_escape}
string_escape="\\\""
             | "\\\\"
             | "\\a"
             | "\\b"
             | "\\t"
             | "\\n"
             | "\\v"
             | "\\f"
             | "\\r"
             | "\\e"
             | "\\'"
             | "\\" {digit8}{1,3}
             | "\\x" {digit16}{1,3} // TODO why 3 and not 2?
             | "\\" \R
//bad_str=...

//script=...

//identifier_delims=[\",'`()\[\]{};]|{racket_whitespace}
identifier_chars=[^\",'`()\[\]{};\\|\ \n\r\t\f]
identifier_escapes=("\\" {any_char}) | ("|" ~"|")
identifier_start={identifier_escapes} | [^\",'`()\[\]{};\\|\ \n\r\t\f#] | "#%"
identifier={identifier_start} ({identifier_escapes} | {identifier_chars})*

keyword="#:" ({identifier_escapes}|{identifier_chars})*

list_prefix=""|"#hash"|"#hasheq"|"#hasheqv"|"#s"| "#" {digit10}*

line_comment=";".*

// =
DIGIT={digit}
DIGITS = {DIGIT}*
INTEGER_LITERAL = {DIGITS}


// =
langline=("#lang " | "#!") ({langchar} | ({langchar} ({langchar} | "/")* {langchar}))
constant="'" | "`" | "#'" | "#`" | "#&"
booleans=("#true"|"#false"|"#t"|"#f"|"#T"|"#F") [^\",'`()\[\]{};\\|\ \n\r\t\f]*
numbers={INTEGER_LITERAL}
sexp_comment="#;"
dot="."
unquote=","|",@"|"#,"|"#,@"

%state MAIN

%%

<YYINITIAL> {langline} { yybegin(MAIN); return RacketTypes.HASH_LANG; }

<MAIN> {
 {racket_whitespace}+ { return TokenType.WHITE_SPACE; }
 {booleans} {
          {
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
 {character} { return RacketTypes.CHARACTER; }
 {numbers} { return RacketTypes.NUMBER; }

 // keyword
 {str} { return RacketTypes.STRING; }
 {line_comment} { return RacketTypes.COMMENT; }
 {sexp_comment} { return RacketTypes.SEXP_COMMENT; }
 // #|
 // script


 {list_prefix} "(" { return RacketTypes.OPEN_PAREN; }
 ")" { return RacketTypes.CLOSE_PAREN; }
 {list_prefix} "[" { return RacketTypes.OPEN_SQUARE; }
 "]" { return RacketTypes.CLOSE_SQUARE; }

 {constant}  { return RacketTypes.CONSTANT; }
 {dot} { return RacketTypes.DOT; }
 {unquote} { return RacketTypes.UNQUOTE; }

 {identifier}  { return RacketTypes.IDENTIFIER; }
 // #<<

 {CRLF}({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }
// {WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }
// ({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }

}

[^] { return TokenType.BAD_CHARACTER; }
