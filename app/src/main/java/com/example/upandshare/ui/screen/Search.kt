package com.example.upandshare.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.navigation.Screen
import com.example.upandshare.ui.uiComponents.ToolBar.BottomBar
import com.example.upandshare.ui.uiComponents.ToolBar.SearchBar
import com.example.upandshare.ui.uiComponents.ToolBar.TopBar

@Composable
fun SearchScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 40.dp)
                .weight(3f)
                .fillMaxWidth(1f)
        ) {
            TopBar(title = "Search", onClick = {navController.navigate(Screen.HOME.name)})
            Spacer(modifier = Modifier.weight(1f))
            SearchBar()
            Spacer(modifier = Modifier.weight(2f))
        }
        Column(
            modifier = Modifier.weight(5f)
        ) {
        }
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f),
                horizontalArrangement = Arrangement.Center
            ) {
                BottomBar(navController = navController)
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun SearchPreview() {
    SearchScreen(navController = rememberNavController())
}