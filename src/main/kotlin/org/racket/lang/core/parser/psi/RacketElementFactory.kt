package org.racket.lang.core.parser.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import org.racket.lang.core.parser.RacketFileType
import org.racket.lang.core.psi.RacketForm

object RacketElementFactory {
    fun createForm(project: Project?, name: String?): RacketForm {
        val file = createFile(project, name)
        return file.firstChild as RacketForm
    }

    fun createFile(project: Project?, text: String?): RacketFile {
        val name = "dummy.rkt"
        return PsiFileFactory.getInstance(project)
                .createFileFromText(name, RacketFileType.INSTANCE, text!!) as RacketFile
    }
}
