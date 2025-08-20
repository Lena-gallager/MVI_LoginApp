package com.example.mvi_loginapp.core.uicomponents.components.appBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.core.uicomponents.defaults.BaseTopAppBarColors
import com.example.mvi_loginapp.core.uicomponents.defaults.IconButtonColors
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseTopAppBar(
    modifier: Modifier = Modifier,
    isBackButtonVisible: Boolean = true,
    onBackClicked: () -> Unit = {},
    title: String? = null,
) {
    TopAppBar(
        modifier = modifier
            .background(Color.White),
        title = {},
        navigationIcon = {
            if (isBackButtonVisible) {
                BackButton(
                    onClick = onBackClicked,
                )
            } else null
        },
        colors = BaseTopAppBarColors.get(),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BackButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    IconButton(
        modifier = modifier
            .size(44.dp),
        onClick = onClick,
        colors = IconButtonColors.get(),
    ) {
        Icon(
            painter = rememberVectorPainter(Icons.AutoMirrored.Filled.KeyboardArrowLeft),
            contentDescription = null,
            tint = AppTheme.colors.onActionSurface,
            modifier = Modifier.size(24.dp),
        )
    }
}

@Preview
@Composable
private fun TopAppBarPreview() {
    BaseTopAppBar(
        onBackClicked = {},
    )
}
