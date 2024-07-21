package com.example.upandshare.ui.uiComponents.ToolBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun TopBar(title: String, onClick:() -> Unit) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(1f)
        ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            IconButton(onClick = onClick, modifier = Modifier.padding(start = 30.dp)) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.back),
                    contentDescription = null
                )
            }
        }
        Text(text = title, style = Typography.titleMedium)
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun Preview() {
    TopBar("User", onClick = {})
}