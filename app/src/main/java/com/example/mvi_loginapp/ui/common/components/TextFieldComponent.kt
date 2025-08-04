package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun TextFieldComponent(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String?,
    leadingIconVector: ImageVector,
) {
    TextField(
        modifier = Modifier.fillMaxWidth(),
        onValueChange = onValueChange,
        value = value,
        singleLine = true,
        shape = RoundedCornerShape(24.dp),
        label = {
            if (labelText != null) {
                Text(text = labelText)
            }
        },
        leadingIcon = {
            Icon(
                painter = rememberVectorPainter(leadingIconVector),
                contentDescription = null,
            )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            cursorColor = AppTheme.colors.onActionSurface,
            focusedLabelColor = AppTheme.colors.onActionSurface,
            focusedContainerColor = AppTheme.colors.actionSurface,
            unfocusedContainerColor = AppTheme.colors.actionSurface,
        )
    )
}
