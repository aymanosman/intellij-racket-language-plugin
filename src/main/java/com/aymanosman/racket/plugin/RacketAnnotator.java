package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketForm;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralValue;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RacketAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof PsiLiteralValue) {
            PsiLiteralValue literalValue = (PsiLiteralValue) element;
            String value = literalValue.getValue() instanceof String ? (String) literalValue.getValue() : null;

            if (value != null && value.startsWith("simple" + ":")) {
                Project project = element.getProject();
                String key = value.substring(7);
                List<RacketForm> properties = RacketUtil.findProperties(project, key);
                if (properties.size() == 1) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 8,
                            element.getTextRange().getEndOffset() - 1);
                    Annotation annotation = holder.createInfoAnnotation(range, null);
                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
                } else if (properties.size() == 0) {
                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 8,
                            element.getTextRange().getEndOffset() - 1);

                    holder.createErrorAnnotation(range, "Unresolved property");
                }
            }

        }
    }
}
