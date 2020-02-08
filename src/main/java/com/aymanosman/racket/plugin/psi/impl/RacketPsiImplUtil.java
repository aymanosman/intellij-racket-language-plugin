package com.aymanosman.racket.plugin.psi.impl;

import com.aymanosman.racket.plugin.psi.RacketForm;
import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.lang.ASTNode;

public class RacketPsiImplUtil {
    public static String getKey(RacketForm element) {
        ASTNode keyNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(RacketForm element) {
        ASTNode valueNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
