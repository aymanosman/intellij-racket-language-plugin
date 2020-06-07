package org.racket.lang.core.stubs

import com.intellij.psi.stubs.*
import com.intellij.psi.tree.IElementType
import org.racket.lang.core.psi.RacketElementType
//import org.racket.lang.core.psi.RacketHashLangLine

fun factory(name: String): IElementType /* RacketStubElementType<*, *> */ = when (name) {
//    "HASH_LANG" -> RacketHashLangLineStub.Type
    "HASH_LANG_LINE" -> RacketElementType("HASH_LANG_LINE")
    else -> RacketElementType("HASH_LANG_LINE")
}

//class RacketHashLangLineStub(
//        parent: StubElement<*>?,
//        elementType: IStubElementType<*, *>
//) : StubBase<RacketHashLangLine>(parent, elementType) {
//
//    object Type : RacketStubElementType<RacketHashLangLineStub, RacketHashLangLine>("HASH_LANG") {
//        override fun createPsi(stub: RacketHashLangLineStub): RacketHashLangLine {
//            TODO("Not yet implemented")
//        }
//
//        override fun serialize(stub: RacketHashLangLineStub, dataStream: StubOutputStream) {
//            TODO("Not yet implemented")
//        }
//
//        override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): RacketHashLangLineStub {
//            TODO("Not yet implemented")
//        }
//
//        override fun createStub(psi: RacketHashLangLine, parentStub: StubElement<*>?): RacketHashLangLineStub {
//            TODO("Not yet implemented")
//        }
//    }
//}
