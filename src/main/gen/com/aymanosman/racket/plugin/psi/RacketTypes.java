// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aymanosman.racket.plugin.psi.impl.*;

public interface RacketTypes {

  IElementType ATOM = new RacketElementType("ATOM");
  IElementType DATUM = new RacketElementType("DATUM");
  IElementType FORM = new RacketElementType("FORM");
  IElementType ITEM = new RacketElementType("ITEM");

  IElementType CLOSE_PAREN = new RacketTokenType("CLOSE_PAREN");
  IElementType CLOSE_SQUARE = new RacketTokenType("CLOSE_SQUARE");
  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CONSTANT = new RacketTokenType("CONSTANT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType HASH_LANG = new RacketTokenType("HASH_LANG");
  IElementType IDENTIFIER = new RacketTokenType("IDENTIFIER");
  IElementType OPEN_PAREN = new RacketTokenType("OPEN_PAREN");
  IElementType OPEN_SQUARE = new RacketTokenType("OPEN_SQUARE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new RacketAtomImpl(node);
      }
      else if (type == DATUM) {
        return new RacketDatumImpl(node);
      }
      else if (type == FORM) {
        return new RacketFormImpl(node);
      }
      else if (type == ITEM) {
        return new RacketItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
