package org.racket.lang.core.parser

import com.intellij.lexer.FlexAdapter
import org.racket.lang.core.lexer.RacketLexer
import java.io.Reader

class RacketLexerAdapter : FlexAdapter(RacketLexer(null as Reader?))
