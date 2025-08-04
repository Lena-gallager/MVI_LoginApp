package com.example.mvi_loginapp.ui.feature.login.composable.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.MyIconPack
import com.example.mvi_loginapp.ui.common.components.LoginSocialMediaSection
import com.example.mvi_loginapp.ui.common.myiconpack.IcApple
import com.example.mvi_loginapp.ui.common.myiconpack.IcFacebook
import com.example.mvi_loginapp.ui.common.myiconpack.IcGoogle
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun LoginFooter(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            onClick = {},
            colors = ButtonColors(
                containerColor = AppTheme.colors.secondarySurface,
                contentColor = AppTheme.colors.onSecondarySurface,
                disabledContentColor = Color.DarkGray,
                disabledContainerColor = Color.White,
            )
        ) {
            Text(
                text = "Login",
                style = AppTheme.typography.titleMedium,
            )
        }
        Text(
            text = "Or Continue with",
            style = AppTheme.typography.label,
            textAlign = TextAlign.Center,
            color = AppTheme.colors.onBackground,
        )
        LoginSocialMediaSection()
        Row {
            Text(
                text = "Don't have an account?",
                color = AppTheme.colors.onBackground,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                modifier = Modifier
                    .clickable(onClick = {}),
                text = "Sign-up",
                color = AppTheme.colors.onActionSurface,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview
@Composable
private fun LoginFooterPreview() {
    LoginFooter()
}
