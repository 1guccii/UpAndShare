package com.example.upandshare.ui.components.Button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.upandshare.R

@Composable
fun DownloadedButton(onClick: () ->Unit, iconButton1: Int,iconButton2:Int,iconButton3:Int,iconButton4:Int) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .width(160.dp)
            .height(130.dp)
        ) {
        Box {
            ConstraintLayout {
                val (icon1, icon2, icon3, icon4) = createRefs()
                Icon(
                    painter = painterResource(id = iconButton1),
                    contentDescription = "Fluent Math Icon",
                    modifier = Modifier.constrainAs(icon1) {
                        top.linkTo(parent.top, margin = 36.dp)
                        start.linkTo(parent.start, margin = 14.dp)
                        end.linkTo(parent.end, margin = 112.dp)
                        bottom.linkTo(parent.bottom, margin = 60.dp)
                    }
                )
                Icon(
                    painter = painterResource(id = iconButton2),
                    contentDescription = "Fluent Math Icon",
                    modifier = Modifier.constrainAs(icon2) {
                        start.linkTo(parent.start, margin = 63.dp)
                        end.linkTo(parent.end, margin = 65.dp)
                        top.linkTo(parent.top, margin = 4.dp)
                        bottom.linkTo(parent.bottom, margin = 94.dp)
                    }
                )
                Icon(
                    painter = painterResource(id = iconButton3),
                    contentDescription = "Fluent Math Icon",
                    modifier = Modifier.constrainAs(icon3) {
                        start.linkTo(parent.start, margin = 118.dp)
                        end.linkTo(parent.end, margin = 10.dp)
                        top.linkTo(parent.top, margin = 33.dp)
                        bottom.linkTo(parent.bottom, margin = 65.dp)
                    }
                )
                Icon(
                    painter = painterResource(id = iconButton4),
                    contentDescription = "Fluent Math Icon",
                    modifier = Modifier.constrainAs(icon4) {
                        start.linkTo(parent.start, margin = 62.dp)
                        end.linkTo(parent.end, margin = 64.dp)
                        top.linkTo(parent.top, margin = 44.dp)
                        bottom.linkTo(parent.bottom, margin = 52.dp)
                    }
                )
            }
            Text(
                text = "Giai tich",
                modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 16.dp)
            )
        }
    }
}

@Preview
@Composable
fun DownloadedButtonPreview() {
    DownloadedButton(
        onClick = {},
        iconButton1 = R.drawable.hugeicons_math,
        iconButton2 = R.drawable.fluent_math_formula,
        iconButton3 = R.drawable.hugeicons_board_math,
        iconButton4 = R.drawable.tabler_math_max
    )
}