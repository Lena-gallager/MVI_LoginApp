package com.example.mvi_loginapp.core.uicomponents.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mvi_loginapp.core.uicomponents.R

private val MozillaFontFamily = FontFamily(
    Font(R.font.font_mozilla_headline_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.font_mozilla_headline_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.font_mozilla_headline_bold, FontWeight.Bold, FontStyle.Normal),
)

@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default,
    )
}

val extendedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleLarge = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleMedium = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleSmall = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
    ),
    bodySmall = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
    ),
    label = TextStyle(
        fontFamily = MozillaFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Light,
    ),
)
