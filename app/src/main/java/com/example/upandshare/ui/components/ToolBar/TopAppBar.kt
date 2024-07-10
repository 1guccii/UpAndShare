package com.example.upandshare.ui.components.ToolBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun TopAppBar(
    navigationText:String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.padding(start = 36.dp, top = 46.dp, end = 36.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ion_arrow_back_sharp),
            contentDescription = "IconButton",
            tint = Color.Unspecified)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = navigationText, style = Typography.displayMedium.copy(Color.White))
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBar(navigationText = "Map", onClick = {})
}
