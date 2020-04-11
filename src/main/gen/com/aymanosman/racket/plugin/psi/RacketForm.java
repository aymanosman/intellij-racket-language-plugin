// This is a generated file. Not intended for manual editing.
package com.aymanosman.racket.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RacketForm extends RacketNamedElement {

  @Nullable
  RacketDatum getDatum();

  @NotNull
  List<RacketItem> getItemList();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
