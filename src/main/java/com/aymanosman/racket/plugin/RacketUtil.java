package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketForm;
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
    public static List<RacketForm> findProperties(Project project, String key) {
        List<RacketForm> result = null;
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope((project)));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile racketFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (racketFile != null) {
                RacketForm[] properties = PsiTreeUtil.getChildrenOfType(racketFile, RacketForm.class);
                if (properties != null) {
                    for (RacketForm property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.emptyList();
    }

    public static List<RacketForm> findProperties(Project project) {
        List<RacketForm> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile simpleFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                RacketForm[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, RacketForm.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}


