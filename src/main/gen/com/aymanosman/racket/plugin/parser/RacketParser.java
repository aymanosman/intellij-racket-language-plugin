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
  // CONSTANT Form
  public static boolean Datum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datum")) return false;
    if (!nextTokenIs(b, CONSTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && Form(b, l + 1);
    exit_section_(b, m, DATUM, r);
    return r;
  }

  /* ********************************************************** */
  // Datum
  //        | IDENTIFIER
  //        | STRING
  //        | OPEN_PAREN Item* CLOSE_PAREN
  //        | OPEN_SQUARE Item* CLOSE_SQUARE
  public static boolean Form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORM, "<form>");
    r = Datum(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = Form_3(b, l + 1);
    if (!r) r = Form_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_PAREN Item* CLOSE_PAREN
  private static boolean Form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && Form_3_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // Item*
  private static boolean Form_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Form_3_1", c)) break;
    }
    return true;
  }

  // OPEN_SQUARE Item* CLOSE_SQUARE
  private static boolean Form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_SQUARE);
    r = r && Form_4_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_SQUARE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Item*
  private static boolean Form_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Form_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Form_4_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Form | COMMENT | CRLF
  public static boolean Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM, "<item>");
    r = Form(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HASH_LANG Item*
  static boolean RacketFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RacketFile")) return false;
    if (!nextTokenIs(b, HASH_LANG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH_LANG);
    r = r && RacketFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Item*
  private static boolean RacketFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RacketFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RacketFile_1", c)) break;
    }
    return true;
  }

}
