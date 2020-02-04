package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class RacketSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey OPEN_PAREN =
            TextAttributesKey.createTextAttributesKey("RACKET_OPEN_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey CLOSE_PAREN =
            TextAttributesKey.createTextAttributesKey("RACKET_CLOSE_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey IDENTIFIER =
            TextAttributesKey.createTextAttributesKey("RACKET_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("RACKET_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CONSTANT =
            TextAttributesKey.createTextAttributesKey("RACKET_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey("RACKET_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey[] OPEN_PAREN_KEYS = new TextAttributesKey[]{OPEN_PAREN};
    public static final TextAttributesKey[] CLOSE_PAREN_KEYS = new TextAttributesKey[]{CLOSE_PAREN};
    public static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    public static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    public static final TextAttributesKey[] CONSTANT_KEYS = new TextAttributesKey[]{CONSTANT};
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
        if (tokenType.equals(RacketTypes.OPEN_PAREN)) {
            return OPEN_PAREN_KEYS;
        } else if (tokenType.equals(RacketTypes.CLOSE_PAREN)) {
            return CLOSE_PAREN_KEYS;
        } else if (tokenType.equals(RacketTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(RacketTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(RacketTypes.CONSTANT)) {
            return CONSTANT_KEYS;
       } else if (tokenType.equals(RacketTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
