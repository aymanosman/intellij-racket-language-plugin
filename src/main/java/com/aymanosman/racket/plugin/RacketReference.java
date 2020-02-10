package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketItem;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class RacketReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String identifier;

    public RacketReference(@NotNull PsiElement element,
                           TextRange textRange) {
        super(element, textRange);
        identifier = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<RacketItem> items = RacketUtil.findItems(project, identifier);
        List<ResolveResult> results = new ArrayList<>();
        for (RacketItem item : items) {
            results.add(new PsiElementResolveResult(item));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        List<RacketItem> items = RacketUtil.findItems(project);
        List<LookupElement> variants = new ArrayList<>();
        for (final RacketItem item : items) {
            if (item.getForm() != null && item.getForm() != null && item.getForm().getKey().length() > 0) {
                variants.add(LookupElementBuilder.create(item)
                .withIcon(RacketIcons.FILE)
                .withTypeText(item.getContainingFile().getName()));
            }
        }
        return variants.toArray();
    }
}
