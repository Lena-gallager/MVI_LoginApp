package com.example.mvi_loginapp.feature.splashscreen.impl.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.mvi_loginapp.feature.splashscreen.impl.R

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        val splashAnimation by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash_animation))
        LottieAnimation(
            composition = splashAnimation,
            modifier = Modifier.fillMaxSize(),
            iterations = LottieConstants.IterateForever,
            reverseOnRepeat = true,
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
        )
    }
}
