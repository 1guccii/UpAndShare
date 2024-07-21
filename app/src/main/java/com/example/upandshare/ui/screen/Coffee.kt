package com.example.upandshare.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.R
import com.example.upandshare.navigation.Screen
import com.example.upandshare.ui.theme.Typography
import com.example.upandshare.ui.uiComponents.ToolBar.BottomBar
import com.example.upandshare.ui.uiComponents.ToolBar.TopBar


@Composable
fun CoffeeScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFF6F5F5))
            .fillMaxSize(1f)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 40.dp)
                .weight(2f)
        ) {
            TopBar(title = "Coffee", onClick = {navController.navigate(Screen.HOME.name)})
        }
        Column(
            modifier = Modifier.weight(6f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bank),
                contentDescription = null,
                modifier = Modifier
                    .width(180.dp)
                    .height(210.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(350.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFD600), shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Text(
                    text = "One cup of your coffee will help me a lot.",
                    style = Typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            BottomBar(navController = navController)
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun CoffeePreview() {
    CoffeeScreen(navController = rememberNavController())
}