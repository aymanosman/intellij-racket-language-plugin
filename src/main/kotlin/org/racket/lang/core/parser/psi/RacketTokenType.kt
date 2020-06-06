package org.racket.lang.core.parser.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.racket.lang.core.parser.RacketLanguage

class RacketTokenType(@NonNls debugName: String) : IElementType(debugName, RacketLanguage) {
    override fun toString(): String {
        return "RacketTokenType." + super.toString()
    }
}
