// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aymanosman.racket.plugin.psi.RacketTypes.*;
import com.aymanosman.racket.plugin.psi.*;

public class RacketFormImpl extends RacketNamedElementImpl implements RacketForm {

  public RacketFormImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitForm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RacketDatum getDatum() {
    return findChildByClass(RacketDatum.class);
  }

  @Override
  @NotNull
  public List<RacketItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketItem.class);
  }

}
