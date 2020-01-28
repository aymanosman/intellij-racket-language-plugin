// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aymanosman.racket.plugin.psi.impl.*;

public interface RacketTypes {

  IElementType ATOM = new RacketElementType("ATOM");
  IElementType FORM = new RacketElementType("FORM");
  IElementType ITEM = new RacketElementType("ITEM");
  IElementType LANG_LINE = new RacketElementType("LANG_LINE");

  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType HASH_LANG = new RacketTokenType("HASH_LANG");
  IElementType IDENTIFIER = new RacketTokenType("IDENTIFIER");
  IElementType KEYWORD = new RacketTokenType("KEYWORD");
  IElementType LPAREN = new RacketTokenType("LPAREN");
  IElementType RPAREN = new RacketTokenType("RPAREN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new RacketAtomImpl(node);
      }
      else if (type == FORM) {
        return new RacketFormImpl(node);
      }
      else if (type == ITEM) {
        return new RacketItemImpl(node);
      }
      else if (type == LANG_LINE) {
        return new RacketLangLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
