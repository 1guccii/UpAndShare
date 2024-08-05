package com.example.upandshare.ui.uiComponents.toolBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.upandshare.ui.theme.Typography

@Composable
fun TopAppBar(title: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(1f)
        ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = title, style = Typography.titleMedium)
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun Preview() {
    TopAppBar("User")
}