package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketAtom;
import com.aymanosman.racket.plugin.psi.RacketFile;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RacketUtil {
    public static List<RacketAtom> findProperties(Project project, String key) {
        List<RacketAtom> result = null;
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope((project)));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile racketFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (racketFile != null) {
                RacketAtom[] properties = PsiTreeUtil.getChildrenOfType(racketFile, RacketAtom.class);
                if (properties != null) {
                    for (RacketAtom property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<RacketAtom>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<RacketAtom>emptyList();
    }

    public static List<RacketAtom> findProperties(Project project) {
        List<RacketAtom> result = new ArrayList<RacketAtom>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile simpleFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                RacketAtom[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, RacketAtom.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}


