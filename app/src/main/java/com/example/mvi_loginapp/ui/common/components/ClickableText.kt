package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun ClickableText(
    text: String,
    style: TextStyle = LocalTextStyle.current,
    color: Color = AppTheme.colors.onActionSurface,
    fontWeight: FontWeight = FontWeight.Bold,
    onClick: () -> Unit,
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = AppTheme.colors.background,
    ) {
        Text(
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(horizontal = 8.dp)
                .padding(vertical = 4.dp),
            text = text,
            style = style,
            color = color,
            fontWeight = fontWeight,
        )
    }
}
