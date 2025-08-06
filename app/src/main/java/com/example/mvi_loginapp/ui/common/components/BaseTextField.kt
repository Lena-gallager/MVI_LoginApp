package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.defaults.TextFieldColors

@Composable
fun BaseTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String?,
    leadingIconVector: ImageVector,
) {
    TextField(
        modifier = modifier.fillMaxWidth(),
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
        colors = TextFieldColors.get(),
    )
}
