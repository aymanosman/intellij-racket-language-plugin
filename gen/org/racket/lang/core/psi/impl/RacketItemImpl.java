// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.racket.lang.core.psi.RacketElementImpl;
import org.racket.lang.core.psi.RacketForm;
import org.racket.lang.core.psi.RacketItem;
import org.racket.lang.core.psi.RacketVisitor;

public class RacketItemImpl extends RacketElementImpl implements RacketItem {

  public RacketItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RacketForm getForm() {
    return PsiTreeUtil.getChildOfType(this, RacketForm.class);
  }

}
