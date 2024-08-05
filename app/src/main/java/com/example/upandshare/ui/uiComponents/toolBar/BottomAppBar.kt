package com.example.upandshare.ui.uiComponents.toolBar

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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.R
import com.example.upandshare.navigation.Screen
import com.example.upandshare.viewModels.BottomBarViewModel


@Composable
fun BottomBar(navController: NavController, viewModel: BottomBarViewModel = viewModel()) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .width(270.dp)
            .height(48.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
    ) {
        IconButton(onClick = {
            viewModel.selectedButton = 1
            navController.navigate(Screen.HOME.name) {
                launchSingleTop = true
            }
        }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.home_icon),
                contentDescription = "",
                tint = if (viewModel.selectedButton == 1) Color.Blue else Color.Black
            )
        }
        IconButton(onClick = {
            viewModel.selectedButton = 2
            navController.navigate(Screen.UPLOAD.name) {
                launchSingleTop = true
            }
        }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.add),
                contentDescription = "",
                tint = if (viewModel.selectedButton == 2) Color.Blue else Color.Black

            )
        }
        IconButton(onClick = {
            viewModel.selectedButton = 3
            navController.navigate(Screen.FOLDER.name) {
                launchSingleTop = true
            }
        }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.file),
                contentDescription = "",
                tint = if (viewModel.selectedButton == 3) Color.Blue else Color.Black
            )
        }
        IconButton(onClick = {
            viewModel.selectedButton = 4
            navController.navigate(Screen.PROFILE.name){
                launchSingleTop = true
            } }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.profile),
                contentDescription = "",
                tint = if (viewModel.selectedButton == 4) Color.Blue else Color.Black
            )
        }
    }
}

@Preview
@Composable
fun BottomAppBarPreview() {
    BottomBar(navController = rememberNavController())

}