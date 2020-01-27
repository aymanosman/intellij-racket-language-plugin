// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.aymanosman.racket.plugin.psi.RacketTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RacketParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return RacketFile(b, l + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER | KEYWORD
  public static boolean Atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atom")) return false;
    if (!nextTokenIs(b, "<atom>", IDENTIFIER, KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN IDENTIFIER* RPAREN
  public static boolean Form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Form_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FORM, r);
    return r;
  }

  // IDENTIFIER*
  private static boolean Form_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFIER)) break;
      if (!empty_element_parsed_guard_(b, "Form_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Form | COMMENT | CRLF
  static boolean Item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_")) return false;
    boolean r;
    r = Form(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // Item_*
  static boolean RacketFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RacketFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RacketFile", c)) break;
    }
    return true;
  }

}
