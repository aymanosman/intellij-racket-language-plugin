// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi.impl;

import com.aymanosman.racket.plugin.psi.RacketDatum;
import com.aymanosman.racket.plugin.psi.RacketForm;
import com.aymanosman.racket.plugin.psi.RacketItem;
import com.aymanosman.racket.plugin.psi.RacketVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RacketFormImpl extends ASTWrapperPsiElement implements RacketForm {

    public RacketFormImpl(@NotNull ASTNode node) {
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
        return findChildByClass(RacketDatum.class);
    }

    @Override
    @NotNull
    public List<RacketItem> getItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketItem.class);
    }

}
