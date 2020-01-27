package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class RacketSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey LPAREN =
            TextAttributesKey.createTextAttributesKey("RACKET_LPAREN", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey RPAREN =
            TextAttributesKey.createTextAttributesKey("RACKET_RPAREN", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey("RACKET_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey[] LPAREN_KEYS = new TextAttributesKey[]{LPAREN};
    public static final TextAttributesKey[] RPAREN_KEYS = new TextAttributesKey[]{RPAREN};
    public static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new RacketLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(RacketTypes.LPAREN)) {
            return LPAREN_KEYS;
        } else if (tokenType.equals(RacketTypes.RPAREN)) {
            return RPAREN_KEYS;
        } else if (tokenType.equals(RacketTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
