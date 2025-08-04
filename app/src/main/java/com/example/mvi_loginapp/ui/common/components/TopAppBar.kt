package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun TopAppBar(
    modifier: Modifier = Modifier,
    onBackClicked: () -> Unit,
) {
    Row(
        modifier = modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        BackButton(
            onClick = onBackClicked,
        )
    }
}

@Composable
private fun BackButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Surface(
        modifier = modifier
            .size(44.dp)
            .clickable(onClick = onClick),
        shape = CircleShape,
        color = AppTheme.colors.actionSurface,
        contentColor = AppTheme.colors.secondarySurface,
    ) {
        Box(
            modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = rememberVectorPainter(Icons.AutoMirrored.Filled.KeyboardArrowLeft),
                contentDescription = null,
                tint = AppTheme.colors.onActionSurface,
                modifier = Modifier.size(24.dp),
            )
        }
    }
}

@Preview
@Composable
private fun TopAppBarPreview() {
    TopAppBar(
        onBackClicked = {},
    )
}
