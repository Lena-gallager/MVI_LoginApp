package com.example.mvi_loginapp.core.uicomponents.icons.socialMedia

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val SocialMediaIconPack.IcGoogle: ImageVector
    get() {
        if (_icGoogle != null) return _icGoogle!!
        _icGoogle = Builder(
            name = "IcGoogle",
            defaultWidth = 15.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 15.0f,
            viewportHeight = 16.0f,
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF007BFF)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(7.5f, 6.671f)
                    verticalLineTo(9.501f)
                    horizontalLineTo(11.433f)
                    curveTo(11.26f, 10.411f, 10.742f, 11.182f, 9.965f, 11.7f)
                    lineTo(12.336f, 13.54f)
                    curveTo(13.718f, 12.265f, 14.515f, 10.392f, 14.515f, 8.166f)
                    curveTo(14.515f, 7.648f, 14.469f, 7.15f, 14.382f, 6.671f)
                    lineTo(7.5f, 6.671f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF34A853)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(3.404f, 9.391f)
                    lineTo(2.87f, 9.8f)
                    lineTo(0.976f, 11.275f)
                    curveTo(2.179f, 13.66f, 4.643f, 15.308f, 7.5f, 15.308f)
                    curveTo(9.473f, 15.308f, 11.127f, 14.657f, 12.336f, 13.54f)
                    lineTo(9.964f, 11.7f)
                    curveTo(9.313f, 12.139f, 8.483f, 12.405f, 7.5f, 12.405f)
                    curveTo(5.6f, 12.405f, 3.985f, 11.122f, 3.407f, 9.395f)
                    lineTo(3.404f, 9.391f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFBBC05)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(0.976f, 4.725f)
                    curveTo(0.478f, 5.708f, 0.192f, 6.817f, 0.192f, 8.0f)
                    curveTo(0.192f, 9.182f, 0.478f, 10.292f, 0.976f, 11.275f)
                    curveTo(0.976f, 11.282f, 3.408f, 9.388f, 3.408f, 9.388f)
                    curveTo(3.262f, 8.95f, 3.175f, 8.485f, 3.175f, 8.0f)
                    curveTo(3.175f, 7.515f, 3.262f, 7.05f, 3.408f, 6.611f)
                    lineTo(0.976f, 4.725f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFEA4335)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(7.5f, 3.602f)
                    curveTo(8.576f, 3.602f, 9.533f, 3.974f, 10.297f, 4.692f)
                    lineTo(12.389f, 2.599f)
                    curveTo(11.12f, 1.416f, 9.473f, 0.692f, 7.5f, 0.692f)
                    curveTo(4.643f, 0.692f, 2.179f, 2.333f, 0.976f, 4.725f)
                    lineTo(3.408f, 6.611f)
                    curveTo(3.986f, 4.884f, 5.6f, 3.602f, 7.5f, 3.602f)
                    close()
                }
            }
        }.build()

        return _icGoogle!!
    }

private var _icGoogle: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialMediaIconPack.IcGoogle, contentDescription = "")
    }
}
