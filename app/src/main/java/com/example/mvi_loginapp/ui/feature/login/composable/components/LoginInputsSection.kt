package com.example.mvi_loginapp.ui.feature.login.composable.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.MyIconPack
import com.example.mvi_loginapp.ui.common.components.TextFieldComponent
import com.example.mvi_loginapp.ui.common.myiconpack.IcEmail
import com.example.mvi_loginapp.ui.common.myiconpack.IcPassword
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun LoginInputsSection(
    modifier: Modifier = Modifier,
    emailValue: String,
    passwordValue: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onForgotPasswordClicked: () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        TextFieldComponent(
            value = emailValue,
            onValueChange = onEmailChange,
            labelText = "Enter your email",
            leadingIconVector = MyIconPack.IcEmail,
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextFieldComponent(
            value = passwordValue,
            onValueChange = onPasswordChange,
            labelText = "Enter your password",
            leadingIconVector = MyIconPack.IcPassword,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Forgot password?",
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onForgotPasswordClicked),
            textAlign = TextAlign.End,
            style = AppTheme.typography.titleSmall,
            color = AppTheme.colors.onActionSurface,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview
@Composable
private fun LoginInputsSectionPreview() {
    LoginInputsSection(
        emailValue = "",
        passwordValue = "",
        onEmailChange = {},
        onPasswordChange = {},
        onForgotPasswordClicked = {},
    )
}
