package com.example.upandshare.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.ui.uiComponents.toolBar.BottomBar

@Composable
fun BaselineLayout(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Column(
            modifier = Modifier.weight(2f)
        ) {

        }
        Column(
            modifier = Modifier.weight(6f)
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
fun HomePreview() {
    BaselineLayout(navController = rememberNavController())
}