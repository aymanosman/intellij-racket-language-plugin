// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.racket.lang.core.psi.impl.RacketDatumImpl;
import org.racket.lang.core.psi.impl.RacketFormImpl;
import org.racket.lang.core.psi.impl.RacketHashLangLineImpl;
import org.racket.lang.core.psi.impl.RacketItemImpl;
import org.racket.lang.core.stubs.StubImplementationsKt;

public interface RacketTypes {

  IElementType DATUM = new RacketElementType("DATUM");
    IElementType FORM = new RacketElementType("FORM");
    IElementType HASH_LANG_LINE = StubImplementationsKt.factory("HASH_LANG_LINE");
    IElementType ITEM = new RacketElementType("ITEM");

  IElementType BOOLEAN = new RacketTokenType("BOOLEAN");
  IElementType CHARACTER = new RacketTokenType("CHARACTER");
  IElementType CLOSE_PAREN = new RacketTokenType("CLOSE_PAREN");
  IElementType CLOSE_SQUARE = new RacketTokenType("CLOSE_SQUARE");
  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CONSTANT = new RacketTokenType("CONSTANT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType DOT = new RacketTokenType("DOT");
  IElementType HASH_LANG = new RacketTokenType("HASH_LANG");
  IElementType IDENTIFIER = new RacketTokenType("IDENTIFIER");
  IElementType KEYWORD = new RacketTokenType("KEYWORD");
  IElementType NUMBER = new RacketTokenType("NUMBER");
  IElementType OPEN_PAREN = new RacketTokenType("OPEN_PAREN");
  IElementType OPEN_SQUARE = new RacketTokenType("OPEN_SQUARE");
  IElementType SEXP_COMMENT = new RacketTokenType("SEXP_COMMENT");
  IElementType STRING = new RacketTokenType("STRING");
  IElementType UNQUOTE = new RacketTokenType("UNQUOTE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DATUM) {
        return new RacketDatumImpl(node);
      }
      else if (type == FORM) {
          return new RacketFormImpl(node);
      } else if (type == HASH_LANG_LINE) {
          return new RacketHashLangLineImpl(node);
      } else if (type == ITEM) {
          return new RacketItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
