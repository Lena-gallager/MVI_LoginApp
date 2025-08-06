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
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.MyIconPack
import kotlin.Unit

public val MyIconPack.IcPassword: ImageVector
    get() {
        if (_icPassword != null) {
            return _icPassword!!
        }
        _icPassword = Builder(name = "IcPassword", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF757575)),
                    strokeLineWidth = 1.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.167f, 12.5f)
                curveTo(4.167f, 9.278f, 6.778f, 6.667f, 10.0f, 6.667f)
                curveTo(13.222f, 6.667f, 15.833f, 9.278f, 15.833f, 12.5f)
                curveTo(15.833f, 15.722f, 13.222f, 18.333f, 10.0f, 18.333f)
                curveTo(6.778f, 18.333f, 4.167f, 15.722f, 4.167f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF757575)),
                    strokeLineWidth = 1.25f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 7.917f)
                verticalLineTo(5.417f)
                curveTo(13.75f, 3.346f, 12.071f, 1.667f, 10.0f, 1.667f)
                curveTo(7.929f, 1.667f, 6.25f, 3.346f, 6.25f, 5.417f)
                verticalLineTo(7.917f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF757575)),
                    strokeLineWidth = 1.66667f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.5f)
                horizontalLineTo(10.007f)
            }
        }
        .build()
        return _icPassword!!
    }

private var _icPassword: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcPassword, contentDescription = "")
    }
}
