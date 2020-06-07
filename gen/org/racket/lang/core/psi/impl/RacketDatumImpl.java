// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.racket.lang.core.psi.RacketDatum;
import org.racket.lang.core.psi.RacketElementImpl;
import org.racket.lang.core.psi.RacketForm;
import org.racket.lang.core.psi.RacketVisitor;

public class RacketDatumImpl extends RacketElementImpl implements RacketDatum {

  public RacketDatumImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitDatum(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RacketForm getForm() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, RacketForm.class));
  }

}
