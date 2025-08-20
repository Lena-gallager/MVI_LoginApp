package com.example.mvi_loginapp.core.uicomponents.components.section

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.core.uicomponents.data.SocialMediaType
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

@Composable
fun SocialMediaSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SocialMediaItem(type = SocialMediaType.FACEBOOK)
        SocialMediaItem(type = SocialMediaType.GOOGLE)
        SocialMediaItem(type = SocialMediaType.APPLE)
    }
}

@Composable
private fun SocialMediaItem(
    modifier: Modifier = Modifier,
    type: SocialMediaType,
) {
    Surface(
        modifier = modifier
            .size(44.dp)
            .border(width = 1.dp, shape = CircleShape, color = Color.LightGray),
        shape = CircleShape,
        color = AppTheme.colors.surface,
        contentColor = Color.Unspecified,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = {}),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                painter = rememberVectorPainter(type.icon),
                contentDescription = null,
            )
        }
    }
}

@Preview
@Composable
private fun LoginSocialMediaSectionPreview() {
    SocialMediaSection()
}
