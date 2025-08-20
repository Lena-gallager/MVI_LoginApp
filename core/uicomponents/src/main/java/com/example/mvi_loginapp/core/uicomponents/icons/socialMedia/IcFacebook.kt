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

val SocialMediaIconPack.IcFacebook: ImageVector
    get() {
        if (_icFacebook != null) return _icFacebook!!
        _icFacebook = Builder(
            name = "IcFacebook",
            defaultWidth = 15.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 15.0f,
            viewportHeight = 16.0f,
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF0866FF)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(14.808f, 8.0f)
                    curveTo(14.808f, 3.964f, 11.536f, 0.692f, 7.5f, 0.692f)
                    curveTo(3.464f, 0.692f, 0.192f, 3.964f, 0.192f, 8.0f)
                    curveTo(0.192f, 11.427f, 2.552f, 14.303f, 5.735f, 15.092f)
                    verticalLineTo(10.233f)
                    horizontalLineTo(4.228f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(5.735f)
                    verticalLineTo(7.038f)
                    curveTo(5.735f, 4.55f, 6.86f, 3.398f, 9.302f, 3.398f)
                    curveTo(9.765f, 3.398f, 10.564f, 3.488f, 10.891f, 3.579f)
                    verticalLineTo(5.603f)
                    curveTo(10.719f, 5.585f, 10.419f, 5.576f, 10.047f, 5.576f)
                    curveTo(8.849f, 5.576f, 8.386f, 6.03f, 8.386f, 7.21f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(10.773f)
                    lineTo(10.363f, 10.233f)
                    horizontalLineTo(8.386f)
                    verticalLineTo(15.254f)
                    curveTo(12.004f, 14.817f, 14.808f, 11.736f, 14.808f, 8.0f)
                    horizontalLineTo(14.808f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFffffff)),
                    stroke = null,
                    fillAlpha = 0.9f,
                    strokeAlpha = 0.9f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(10.362f, 10.233f)
                    lineTo(10.772f, 8.0f)
                    horizontalLineTo(8.385f)
                    verticalLineTo(7.21f)
                    curveTo(8.385f, 6.03f, 8.848f, 5.576f, 10.047f, 5.576f)
                    curveTo(10.419f, 5.576f, 10.718f, 5.585f, 10.891f, 5.603f)
                    verticalLineTo(3.579f)
                    curveTo(10.564f, 3.488f, 9.765f, 3.398f, 9.302f, 3.398f)
                    curveTo(6.86f, 3.398f, 5.734f, 4.55f, 5.734f, 7.038f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(4.228f)
                    verticalLineTo(10.233f)
                    horizontalLineTo(5.734f)
                    verticalLineTo(15.092f)
                    curveTo(6.3f, 15.233f, 6.891f, 15.308f, 7.5f, 15.308f)
                    curveTo(7.799f, 15.308f, 8.095f, 15.289f, 8.385f, 15.254f)
                    verticalLineTo(10.233f)
                    horizontalLineTo(10.362f)
                    horizontalLineTo(10.362f)
                    close()
                }
            }
        }.build()

        return _icFacebook!!
    }

private var _icFacebook: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialMediaIconPack.IcFacebook, contentDescription = "")
    }
}
