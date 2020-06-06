package org.racket.lang.core.parser.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.racket.lang.core.parser.RacketLanguage

class RacketElementType(@NonNls debugName: String) : IElementType(debugName, RacketLanguage)
