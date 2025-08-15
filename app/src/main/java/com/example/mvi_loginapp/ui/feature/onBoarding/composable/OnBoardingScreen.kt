package com.example.mvi_loginapp.ui.feature.onBoarding.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvi_loginapp.ui.feature.onBoarding.composable.components.OnBoardingFooter
import com.example.mvi_loginapp.ui.feature.onBoarding.composable.components.OnBoardingItem
import com.example.mvi_loginapp.ui.feature.onBoarding.composable.components.PagerDotIndicators
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingEvent
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingState
import com.example.mvi_loginapp.ui.feature.onBoarding.data.OnBoardingStates

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    states: List<OnBoardingState>,
    onEventSent: (OnBoardingEvent) -> Unit,
) {
    val pagerState = rememberPagerState(pageCount = { states.size })

    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HorizontalPager(
                state = pagerState,
            ) { page ->
                OnBoardingItem(
                    modifier = Modifier,
                    state = states[page],
                )
            }
            PagerDotIndicators(
                pagerState = pagerState,
            )
        }
        OnBoardingFooter(
            pagerState = pagerState,
            onEventSent = onEventSent,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen(
        states = OnBoardingStates,
        onEventSent = {}
    )
}
