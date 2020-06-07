package org.racket.lang.core.stubs

import com.intellij.psi.stubs.*
import org.racket.lang.core.psi.RacketHashLangLine

fun factory(name: String): RacketStubElementType<*, *> = when (name) {
    "HASH_LANG" -> RacketHashLangLineStub.Type
}

class RacketHashLangLineStub(
        parent: StubElement<*>?,
        elementType: IStubElementType<*, *>
) : StubBase<RacketHashLangLine>(parent, elementType),
        RacketNamedStub {

    object Type : RacketStubElementType<RacketHashLangLineStub, RacketHashLangLine>("HASH_LANG") {
        override fun createPsi(stub: RacketHashLangLineStub): RacketHashLangLine {
            TODO("Not yet implemented")
        }

        override fun serialize(stub: RacketHashLangLineStub, dataStream: StubOutputStream) {
            TODO("Not yet implemented")
        }

        override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): RacketHashLangLineStub {
            TODO("Not yet implemented")
        }

        override fun createStub(psi: RacketHashLangLine, parentStub: StubElement<*>?): RacketHashLangLineStub {
            TODO("Not yet implemented")
        }

    }

}
