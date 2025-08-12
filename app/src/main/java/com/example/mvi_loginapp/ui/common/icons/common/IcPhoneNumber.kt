package com.example.mvi_loginapp.ui.common.icons.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CommonIconPack.IcPhoneNumber: ImageVector
    get() {
        if (_icPhoneNumber != null) return _icPhoneNumber!!

        _icPhoneNumber = Builder(
            name = "IcPhoneNumber",
            defaultWidth = 20.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF757575)),
                strokeLineWidth = 1.25f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(11.25f, 1.667f)
                horizontalLineTo(8.75f)
                curveTo(6.786f, 1.667f, 5.804f, 1.667f, 5.194f, 2.277f)
                curveTo(4.583f, 2.887f, 4.583f, 3.869f, 4.583f, 5.833f)
                verticalLineTo(14.167f)
                curveTo(4.583f, 16.131f, 4.583f, 17.113f, 5.194f, 17.723f)
                curveTo(5.804f, 18.333f, 6.786f, 18.333f, 8.75f, 18.333f)
                horizontalLineTo(11.25f)
                curveTo(13.214f, 18.333f, 14.196f, 18.333f, 14.807f, 17.723f)
                curveTo(15.417f, 17.113f, 15.417f, 16.131f, 15.417f, 14.167f)
                verticalLineTo(5.833f)
                curveTo(15.417f, 3.869f, 15.417f, 2.887f, 14.807f, 2.277f)
                curveTo(14.196f, 1.667f, 13.214f, 1.667f, 11.25f, 1.667f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF757575)),
                strokeLineWidth = 1.25f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(11.667f, 1.667f)
                horizontalLineTo(8.333f)
                lineTo(8.75f, 2.5f)
                horizontalLineTo(11.25f)
                lineTo(11.667f, 1.667f)
                close()
            }
        }.build()

        return _icPhoneNumber!!
    }

private var _icPhoneNumber: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = CommonIconPack.IcPhoneNumber, contentDescription = "")
    }
}
