package com.example.mvi_loginapp.feature.onboardingscreen.impl.composable.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

@Composable
internal fun PagerDotIndicators(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
) {
    Row(
        modifier = modifier.padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center,
    ) {
        repeat(pagerState.pageCount) { index ->
            val isSelected = pagerState.currentPage == index
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .width(if (isSelected) 18.dp else 8.dp)
                    .height(8.dp)
                    .background(
                        color = if (isSelected) AppTheme.colors.secondarySurface else Color.LightGray,
                        shape = CircleShape,
                    )
            )
        }
    }
}
