package com.example.mvi_loginapp.core.uicomponents.components.dialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvi_loginapp.core.uicomponents.components.button.TextButtonComponent

@Composable
fun DialogOneButton(
    modifier: Modifier = Modifier,
    title: String,
    description: String? = null,
    buttonText: String,
    onConfirmClick: () -> Unit,
    onDismiss: () -> Unit,
) {
    AlertDialog(
        modifier = modifier,
        title = {
            Text(text = title)
        },
        text = {
            if (description != null) Text(text = description) else null
        },
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButtonComponent(
                text = buttonText,
                onClick = onConfirmClick,
            )
        },
    )
}

@Preview
@Composable
private fun DialogOneButtonPreview() {
    DialogOneButton(
        title = "Title",
        description = "Some useful description",
        buttonText = "Confirm that you're gay",
        onConfirmClick = {},
        onDismiss = {},
    )
}
