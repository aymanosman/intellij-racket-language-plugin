package com.aymanosman.racket.plugin.psi.impl;

import com.aymanosman.racket.plugin.psi.RacketElementFactory;
import com.aymanosman.racket.plugin.psi.RacketItem;
import com.aymanosman.racket.plugin.psi.RacketTypes;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;

public class RacketPsiImplUtil {
    public static String getKey(RacketItem element) {
        ASTNode keyNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(RacketItem element) {
        ASTNode valueNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(RacketItem element) {
        return element.getText();
    }

    public static PsiElement setName(RacketItem element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (identifierNode != null) {
            RacketItem item = RacketElementFactory.createForm(element.getProject(), newName);
            ASTNode newIdentifierNode = item.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(RacketItem element) {
        ASTNode identifierNode = element.getNode().findChildByType(RacketTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        } else {
            return null;
        }
    }
}
