// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.racket.lang.core.psi.*;

import java.util.List;

public class RacketFormImpl extends RacketElementImpl implements RacketForm {

  public RacketFormImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitForm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RacketDatum getDatum() {
    return PsiTreeUtil.getChildOfType(this, RacketDatum.class);
  }

  @Override
  @NotNull
  public List<RacketItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketItem.class);
  }

}
