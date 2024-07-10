package com.example.upandshare.ui.components.Button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.ui.theme.Typography

@Composable
fun SubjectButton(nameSub: String,onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .width(160.dp)
            .height(186.dp)
            .background(Color(0xFF99EF83), shape = RoundedCornerShape(10.dp)),
        ) {
        Column(
            modifier = Modifier
                .fillMaxSize(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
        Text(text = nameSub, style = Typography.displayMedium)
        }
    }
}

@Preview
@Composable
fun Preview() {
    SubjectButton(nameSub = "English", onClick = {})
}