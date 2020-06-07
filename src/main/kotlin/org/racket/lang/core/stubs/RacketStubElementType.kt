package org.racket.lang.core.stubs

import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.IndexSink
import com.intellij.psi.stubs.StubElement
import com.intellij.psi.tree.IStubFileElementType
import org.racket.lang.core.RacketLanguage
import org.racket.lang.core.psi.RacketElement

abstract class RacketStubElementType<T : StubElement<*>, P : RacketElement>(
        debugName: String
) : IStubElementType<T, P>(debugName, RacketLanguage) {
    final override fun getExternalId(): String =
            "racket.${super.toString()}"

    override fun indexStub(stub: T, sink: IndexSink) {}

    protected fun createStubIfParentIsStub(node: ASTNode): Boolean {
        val parent = node.treeParent
        val parentType = parent.elementType
        return (parentType is IStubElementType<*, *> && parentType.shouldCreateStub(parent)) ||
                parentType is IStubFileElementType<*>
    }
}
