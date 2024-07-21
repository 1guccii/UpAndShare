package com.example.upandshare.ui.uiComponents.ToolBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.R
import com.example.upandshare.navigation.Screen


@Composable
fun BottomBar(navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .width(270.dp)
            .height(48.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
    ) {
        IconButton(onClick = { navController.navigate(Screen.HOME.name) }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.home_icon),
                contentDescription = ""
            )
        }
        IconButton(onClick = { navController.navigate(Screen.UPLOAD.name) }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.add),
                contentDescription = ""
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.file),
                contentDescription = ""
            )
        }
        IconButton(onClick = { navController.navigate(Screen.PROFILE.name) }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.profile),
                contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun BottomAppBarPreview() {
    BottomBar(navController = rememberNavController())
}