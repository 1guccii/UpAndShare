package com.example.upandshare.ui.sc

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
import com.example.upandshare.ui.uiComponents.Feature
import com.example.upandshare.ui.uiComponents.toolBar.BottomBar
import com.example.upandshare.ui.uiComponents.toolBar.TopAppBar

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(2f)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .weight(2f)
            ) {
                TopAppBar(title = "Profile")
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(6f)
        ) {
            Feature()

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
fun ProFileScreenPreview() {
    ProfileScreen(navController = rememberNavController())
}