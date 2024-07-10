package com.example.upandshare.ui.components.ToolBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R

@Composable
fun BottomBar() {
    BottomAppBar {
        Box(
            contentAlignment = Alignment.Center,
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.weight(1/3f)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Home Icon"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ri_search_line),
                            contentDescription = "Search Icon"
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1/3f))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.weight(1/3f)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.folder),
                            contentDescription = "Folder Icon"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.profile_bold),
                            contentDescription = "Profile Icon"
                        )
                    }
                }
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(color = Color.Black, shape = CircleShape)
                    .size(56.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.upload),
                    contentDescription = "Upload Icon",
                    tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar()

}