// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RacketVisitor extends PsiElementVisitor {

  public void visitAtom(@NotNull RacketAtom o) {
    visitPsiElement(o);
  }

  public void visitForm(@NotNull RacketForm o) {
    visitPsiElement(o);
  }

  public void visitItem(@NotNull RacketItem o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
