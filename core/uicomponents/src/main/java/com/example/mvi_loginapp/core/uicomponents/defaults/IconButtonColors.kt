package com.example.mvi_loginapp.core.uicomponents.defaults

import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import com.example.mvi_loginapp.ui.theme.AppTheme

object IconButtonColors {

    @Composable
    fun get(): IconButtonColors = IconButtonDefaults.iconButtonColors().copy(
        containerColor = AppTheme.colors.actionSurface,
    )
}
