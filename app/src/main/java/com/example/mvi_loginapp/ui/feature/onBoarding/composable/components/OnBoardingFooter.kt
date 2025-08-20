package com.example.mvi_loginapp.ui.feature.onBoarding.composable.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.TextButtonComponent
import com.example.mvi_loginapp.ui.common.defaults.DefaultButtonColors
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingEvent
import kotlinx.coroutines.launch

@Composable
fun BoxScope.OnBoardingFooter(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    onEventSent: (OnBoardingEvent) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()

    Row(
        modifier = modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 32.dp, vertical = 16.dp)
            .align(Alignment.BottomCenter),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        if (pagerState.currentPage == pagerState.pageCount - 1) {
            TextButtonComponent(
                modifier = Modifier.fillMaxWidth(),
                text = "Get started!",
                onClick = { coroutineScope.launch { onEventSent(OnBoardingEvent.OnFinishClicked) } },
            )
        } else {
            TextButtonComponent(
                modifier = Modifier.weight(1f),
                text = "Skip",
                //todo use OnBoardingEvent.OnSkipClicked will be better or worth?
                // if we will use vm to control page scrolls than there is no need to pass list of all possible onBoardingState's (witch sound cool)
                // but see HorizontalPager and u will understand why we cant do this through vm (or its im stupid)
                //TODO READ ABOUT VIEWPAGER IN COMPOSE WITH MVI (im not sure u'll find smth usefull but at least ask deepSeek about this idk)
                onClick = { coroutineScope.launch { pagerState.animateScrollToPage(pagerState.pageCount-1) } },
                buttonColors = DefaultButtonColors.getNonActionColors(),
            )
            TextButtonComponent(
                modifier = Modifier.weight(1f),
                text = "Next",
                onClick = { coroutineScope.launch { pagerState.animateScrollToPage(pagerState.currentPage+1) } },
            )
        }
    }
}
