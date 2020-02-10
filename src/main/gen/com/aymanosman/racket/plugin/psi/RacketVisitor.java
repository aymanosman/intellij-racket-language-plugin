// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RacketVisitor extends PsiElementVisitor {

  public void visitDatum(@NotNull RacketDatum o) {
    visitPsiElement(o);
  }

  public void visitForm(@NotNull RacketForm o) {
    visitNamedElement(o);
  }

  public void visitItem(@NotNull RacketItem o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull RacketNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
