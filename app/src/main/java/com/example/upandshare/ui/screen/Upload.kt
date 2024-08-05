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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography
import com.example.upandshare.ui.uiComponents.toolBar.BottomBar
import com.example.upandshare.ui.uiComponents.toolBar.TopAppBar

@Composable
fun UploadScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 40.dp)
                .weight(2f)
                .fillMaxWidth(1f)
        ) {
            TopAppBar(title = "Upload")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(6f)
                .fillMaxWidth(1f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .width(300.dp)
                    .height(150.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.upload_3),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "Upload Image",
                        style = Typography.titleMedium,
                        modifier = Modifier.alpha(0.5f)
                    )
                }
            }
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth(1f)
        ) {
            BottomBar(navController = navController)
        }
    }

}

@Preview
@Composable
fun UploadScreenPreview() {
    UploadScreen(navController = rememberNavController())
}