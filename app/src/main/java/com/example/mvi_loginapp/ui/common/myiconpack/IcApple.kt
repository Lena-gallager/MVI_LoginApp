package com.example.mvi_loginapp.ui.common.myiconpack

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
import com.example.mvi_loginapp.ui.common.MyIconPack
import kotlin.Unit

public val MyIconPack.IcApple: ImageVector
    get() {
        if (_icApple != null) {
            return _icApple!!
        }
        _icApple = Builder(name = "IcApple", defaultWidth = 15.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 15.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.9f,
                        strokeAlpha = 0.9f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.463f, 12.082f)
                    curveTo(13.242f, 12.593f, 12.98f, 13.063f, 12.677f, 13.495f)
                    curveTo(12.264f, 14.084f, 11.926f, 14.492f, 11.665f, 14.718f)
                    curveTo(11.261f, 15.09f, 10.828f, 15.28f, 10.364f, 15.291f)
                    curveTo(10.031f, 15.291f, 9.63f, 15.196f, 9.162f, 15.004f)
                    curveTo(8.694f, 14.813f, 8.263f, 14.718f, 7.869f, 14.718f)
                    curveTo(7.456f, 14.718f, 7.012f, 14.813f, 6.538f, 15.004f)
                    curveTo(6.064f, 15.196f, 5.681f, 15.297f, 5.389f, 15.307f)
                    curveTo(4.944f, 15.325f, 4.501f, 15.13f, 4.059f, 14.718f)
                    curveTo(3.776f, 14.472f, 3.423f, 14.05f, 3.0f, 13.452f)
                    curveTo(2.546f, 12.813f, 2.173f, 12.072f, 1.88f, 11.228f)
                    curveTo(1.567f, 10.316f, 1.41f, 9.433f, 1.41f, 8.578f)
                    curveTo(1.41f, 7.598f, 1.622f, 6.753f, 2.046f, 6.045f)
                    curveTo(2.379f, 5.477f, 2.822f, 5.028f, 3.377f, 4.699f)
                    curveTo(3.932f, 4.37f, 4.531f, 4.202f, 5.177f, 4.191f)
                    curveTo(5.53f, 4.191f, 5.993f, 4.3f, 6.569f, 4.515f)
                    curveTo(7.142f, 4.73f, 7.511f, 4.84f, 7.673f, 4.84f)
                    curveTo(7.793f, 4.84f, 8.203f, 4.712f, 8.897f, 4.457f)
                    curveTo(9.553f, 4.221f, 10.107f, 4.123f, 10.561f, 4.162f)
                    curveTo(11.79f, 4.261f, 12.714f, 4.746f, 13.329f, 5.619f)
                    curveTo(12.229f, 6.285f, 11.685f, 7.219f, 11.696f, 8.416f)
                    curveTo(11.706f, 9.348f, 12.044f, 10.125f, 12.709f, 10.741f)
                    curveTo(13.01f, 11.027f, 13.347f, 11.248f, 13.721f, 11.405f)
                    curveTo(13.64f, 11.64f, 13.554f, 11.866f, 13.463f, 12.082f)
                    verticalLineTo(12.082f)
                    close()
                    moveTo(10.643f, 0.985f)
                    curveTo(10.643f, 1.716f, 10.376f, 2.398f, 9.844f, 3.03f)
                    curveTo(9.201f, 3.781f, 8.424f, 4.215f, 7.582f, 4.146f)
                    curveTo(7.571f, 4.059f, 7.565f, 3.966f, 7.565f, 3.869f)
                    curveTo(7.565f, 3.168f, 7.87f, 2.417f, 8.413f, 1.803f)
                    curveTo(8.684f, 1.492f, 9.028f, 1.233f, 9.446f, 1.027f)
                    curveTo(9.863f, 0.824f, 10.257f, 0.712f, 10.628f, 0.692f)
                    curveTo(10.638f, 0.79f, 10.643f, 0.888f, 10.643f, 0.985f)
                    verticalLineTo(0.985f)
                    close()
                }
            }
        }
        .build()
        return _icApple!!
    }

private var _icApple: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcApple, contentDescription = "")
    }
}
