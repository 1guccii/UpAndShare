package com.example.upandshare.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.ui.theme.Typography
import com.example.upandshare.ui.uiComponents.Button.Payment.DonateButton
import com.example.upandshare.ui.uiComponents.ToolBar.BottomBar
import com.example.upandshare.ui.uiComponents.ToolBar.SearchBar
import com.example.upandshare.ui.uiComponents.UserBox

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Text(
            text = "Good Morning",
            style = Typography.titleMedium,
            modifier = Modifier.padding(horizontal = 36.dp, vertical = 36.dp)
            )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            SearchBar()
        }
        Spacer(modifier = Modifier.height(70.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp),
            modifier = Modifier
                .fillMaxWidth(1f)
                .weight(8f)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                UserBox(num = 12, infor = "User")
                UserBox(num = 12, infor = "Upload")
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                UserBox(num = 12, infor = "Download")
                UserBox(num = 12, infor = "Share")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth(1f).weight(2f)
        ) {
            DonateButton()
        }
        Row(
            modifier = Modifier.fillMaxWidth(1f).weight(2f),
            horizontalArrangement = Arrangement.Center
        ) {
            BottomBar()
        }

    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}