package com.example.upandshare.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.upandshare.ui.uiComponents.button.DownloadButton
import com.example.upandshare.ui.uiComponents.toolBar.BottomBar
import com.example.upandshare.ui.uiComponents.toolBar.TopAppBar
import com.example.upandshare.viewModels.FolderScreenViewModel

@Composable
fun FolderScreen(
    navController: NavController,
    viewmodel: FolderScreenViewModel = FolderScreenViewModel(LocalContext.current)
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .weight(2f)
            ) {
                TopAppBar(title = "Folder")
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(7f)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(30.dp),
                modifier = Modifier.fillMaxHeight(1f)
            ) {
                DownloadButton(subject = "Giải tích", university = "Phenikaa", onClick = {viewmodel.downloadImage("Giải tích/giai_tich_3_(0).jpg")})
                DownloadButton(subject = "Ngôn ngữ C", university = "Phenikaa", onClick = {viewmodel.downloadImage("Ngôn ngữ C/ngon_ngu_C_29(1).jpg")})
                DownloadButton(subject = "Toán rời rạc", university = "Phenikaa", onClick = {viewmodel.downloadImage("Toán rời rạc/toan_roi_rac_06(1).jpg")})
                DownloadButton(subject = "Vật lý", university = "Phenikaa", onClick = {viewmodel.downloadImage("Vật lý/vat_ly1_160(1).jpg")})
            }
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