package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RacketAnnotator implements Annotator {
    static private final Set<String> KEYWORDS = new HashSet<>(Arrays.asList("define"));

    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof LeafPsiElement) {
            LeafPsiElement leafPsiElement = (LeafPsiElement) element;
            if (leafPsiElement.getElementType() == RacketTypes.IDENTIFIER) {
                String value = leafPsiElement.getText();
                if (KEYWORDS.contains(value)) {
                    Annotation annotation = holder.createInfoAnnotation(element, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.KEYWORD);
                }
            }
        }
    }
}
