package com.example.mvi_loginapp.core.uicomponents.icons.common

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//todo есть ли способо задавать иконки лушим способом
// (хотя быизбавиться от "Receiver parameter is never used" и "Object or top-level property name '_icEmail' should not start with an underscore")
val CommonIconPack.IcEmail: ImageVector
    get() {
        if (_icEmail != null) return _icEmail!!

        _icEmail = Builder(
            name = "IcEmail",
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
                moveTo(5.833f, 7.083f)
                lineTo(8.285f, 8.533f)
                curveTo(9.714f, 9.378f, 10.286f, 9.378f, 11.715f, 8.533f)
                lineTo(14.167f, 7.083f)
            }
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF757575)),
                strokeLineWidth = 1.25f,
                strokeLineCap = Butt, strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1.68f, 11.23f)
                curveTo(1.734f, 13.784f, 1.762f, 15.062f, 2.704f, 16.008f)
                curveTo(3.647f, 16.954f, 4.959f, 16.987f, 7.582f, 17.053f)
                curveTo(9.199f, 17.094f, 10.801f, 17.094f, 12.418f, 17.053f)
                curveTo(15.041f, 16.987f, 16.353f, 16.954f, 17.296f, 16.008f)
                curveTo(18.239f, 15.062f, 18.266f, 13.784f, 18.32f, 11.23f)
                curveTo(18.338f, 10.408f, 18.338f, 9.592f, 18.32f, 8.77f)
                curveTo(18.266f, 6.216f, 18.239f, 4.938f, 17.296f, 3.992f)
                curveTo(16.353f, 3.046f, 15.041f, 3.013f, 12.418f, 2.947f)
                curveTo(10.801f, 2.907f, 9.199f, 2.907f, 7.582f, 2.947f)
                curveTo(4.959f, 3.013f, 3.647f, 3.046f, 2.704f, 3.992f)
                curveTo(1.762f, 4.938f, 1.734f, 6.216f, 1.68f, 8.77f)
                curveTo(1.662f, 9.592f, 1.662f, 10.408f, 1.68f, 11.23f)
                close()
            }
        }.build()

        return _icEmail!!
    }

private var _icEmail: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = CommonIconPack.IcEmail, contentDescription = "")
    }
}
