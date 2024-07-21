package com.example.upandshare.ui.uiComponents.Button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun Information(name: String,gmail:String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(300.dp)
            .height(90.dp)
            .background(color = Color(0xFFF7FFD7), shape = RoundedCornerShape(10.dp))
    ) {
        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth(1f)
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp).clip(shape = CircleShape)
                )
            }
            Column {
                Text(text = name, style = Typography.bodySmall.copy(fontSize = 16.sp))
                Text(text = gmail, style = Typography.labelMedium, modifier = Modifier.alpha(0.5f))
            }
        }
    }
}

@Preview
@Composable
fun InformationPreview() {
    Information(name = "Hoang Manh", gmail = "jandyz.dev@gmail.com")
}