package com.example.upandshare.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.ui.components.Button.SubjectButton
import com.example.upandshare.ui.components.ToolBar.BottomBar
import com.example.upandshare.ui.components.ToolBar.TopAppBar

@Composable
fun MapScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationText = "Map",
                onClick = {},
                )
                 },
        bottomBar = { BottomBar()},
        containerColor = Color.Black,
        contentColor = Color.White,
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize(1f)
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceAround,
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                SubjectButton(nameSub = "English", onClick = {})
                SubjectButton(nameSub = "English", onClick = {})
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceAround,
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                SubjectButton(nameSub = "English", onClick = {})
                SubjectButton(nameSub = "English", onClick = {})
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceAround,
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                SubjectButton(nameSub = "English", onClick = {})
                SubjectButton(nameSub = "English", onClick = {})
            }
        }
    }
}

@Preview
@Composable
fun MapScreenPreview() {
    MapScreen()
}