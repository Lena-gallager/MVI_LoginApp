package com.example.mvi_loginapp.ui.common

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mvi_loginapp.ui.common.myiconpack.IcApple
import com.example.mvi_loginapp.ui.common.myiconpack.IcFacebook
import com.example.mvi_loginapp.ui.common.myiconpack.IcGoogle
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(IcApple, IcFacebook, IcGoogle)
    return __AllIcons!!
  }
