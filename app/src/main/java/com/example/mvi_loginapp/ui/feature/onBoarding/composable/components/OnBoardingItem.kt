package com.example.mvi_loginapp.ui.feature.onBoarding.composable.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingState
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun OnBoardingItem(
    modifier: Modifier = Modifier,
    state: OnBoardingState,
) {
    Column(
        modifier = modifier
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(state.imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 200.dp, max = 300.dp),//todo
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = state.title,
            style = AppTheme.typography.headline,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = state.description,
            style = AppTheme.typography.body,
        )

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun OnBoardingItemPreview() {
    OnBoardingItem(
        state = OnBoardingState.DEFAULT,
    )
}
