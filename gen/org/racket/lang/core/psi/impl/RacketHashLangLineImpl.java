// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.racket.lang.core.psi.RacketElementImpl;
import org.racket.lang.core.psi.RacketHashLangLine;
import org.racket.lang.core.psi.RacketVisitor;
import org.racket.lang.core.stubs.RacketHashLangLineStub;

public class RacketHashLangLineImpl extends RacketElementImpl implements RacketHashLangLine {

  public RacketHashLangLineImpl(ASTNode node) {
    super(node);
  }

  public RacketHashLangLineImpl(RacketHashLangLineStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitHashLangLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor) visitor);
    else super.accept(visitor);
  }

}
