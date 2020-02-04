package com.aymanosman.racket.plugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class RacketColorSettingsPage implements ColorSettingsPage {
    public static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifier", RacketSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Comment", RacketSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("String", RacketSyntaxHighlighter.STRING),
            new AttributesDescriptor("Constant", RacketSyntaxHighlighter.CONSTANT), // TODO this is confusing QUOTE?
            new AttributesDescriptor("Number", RacketSyntaxHighlighter.NUMBER),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return RacketIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new RacketSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "#lang racket/base\n" +
                ";; This is a comment\n" +
                "()\n"+
                "(define a-thing (list 42 \"hello world\" 'fixme))";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Racket";
    }
}
