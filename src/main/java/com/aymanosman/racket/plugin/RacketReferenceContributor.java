package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketNamedElement;
import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class RacketReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(RacketNamedElement.class), new PsiReferenceProvider() {
            @NotNull
            @Override
            public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                         @NotNull ProcessingContext
                                                                 context) {

                return getPsiReferences(element);
            }
        });
    }

    @NotNull
    private PsiReference[] getPsiReferences(@NotNull PsiElement element) {
        return new PsiReference[]{
                new RacketReference(element, new TextRange(0, element.getTextLength()))};
    }

//    @NotNull
//    private PsiReference[] getPsiReferences(@NotNull PsiElement element) {
//        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
//        String value = literalExpression.getValue() instanceof String ?
//                (String) literalExpression.getValue() : null;
//        if (value != null && value.startsWith("simple" + ":")) {
//            return new PsiReference[]{
//                    new RacketReference(element, new TextRange(8, value.length() + 1))};
//        }
//        return PsiReference.EMPTY_ARRAY;
//    }
}
