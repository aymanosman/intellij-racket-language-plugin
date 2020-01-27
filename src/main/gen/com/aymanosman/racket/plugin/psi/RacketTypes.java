// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aymanosman.racket.plugin.psi.impl.*;

public interface RacketTypes {

  IElementType FORM = new RacketElementType("FORM");

  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType LPAREN = new RacketTokenType("LPAREN");
  IElementType RPAREN = new RacketTokenType("RPAREN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == FORM) {
        return new RacketFormImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
