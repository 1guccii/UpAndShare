package com.example.upandshare.ui.uiComponents.Button


import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.upandshare.R

@Composable
fun DarkModeToggle() {
    var isDarkTheme by remember { mutableStateOf(false) }
    IconToggleButton(checked = isDarkTheme, onCheckedChange = {isDarkTheme = !isDarkTheme}) {
        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.home_icon), contentDescription = null)
    }
}
@Preview
@Composable
fun DarkModeTogglePreview() {
    DarkModeToggle()
}