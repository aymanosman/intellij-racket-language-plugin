package com.aymanosman.racket.plugin;

import com.aymanosman.racket.plugin.psi.RacketItem;
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
    public static List<RacketItem> findItems(Project project, String ident) {
        List<RacketItem> result = null;
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope((project)));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile racketFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (racketFile != null) {
                RacketItem[] forms = PsiTreeUtil.getChildrenOfType(racketFile, RacketItem.class);
                if (forms != null) {
                    for (RacketItem form : forms) {
                        if (ident.equals(form.getText())) { // TODO was getKey
                            if (result == null) {
                                result = new ArrayList<>();
                            }
                            result.add(form);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.emptyList();
    }

    public static List<RacketItem> findItems(Project project) {
        List<RacketItem> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(RacketFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            RacketFile simpleFile = (RacketFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                RacketItem[] forms = PsiTreeUtil.getChildrenOfType(simpleFile, RacketItem.class);
                if (forms != null) {
                    Collections.addAll(result, forms);
                }
            }
        }
        return result;
    }
}


