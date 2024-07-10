package com.example.upandshare.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R
import com.example.upandshare.ui.components.Button.DownloadedButton
import com.example.upandshare.ui.components.Button.SubjectButton
import com.example.upandshare.ui.components.ToolBar.BottomBar
import com.example.upandshare.ui.theme.Typography

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Text(text = "Subject Map",
            style = Typography.titleLarge,
            modifier = Modifier.padding(start = 36.dp, top = 56.dp, bottom = 36.dp)
        )
                 },
        bottomBar = {BottomBar()},
        containerColor = Color.Black
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).padding(16.dp)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 20.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.extend),
                    contentDescription = "Extend Icon",
                    tint = Color.Unspecified)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
            SubjectButton(nameSub = "English", onClick = {})
            SubjectButton(nameSub = "English", onClick = {})
            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Recent Downloaded", style = Typography.bodyMedium.copy(Color.White))
            Spacer(modifier = Modifier.height(16.dp))
            DownloadedButton(
                onClick = { /*TODO*/ },
                iconButton1 = R.drawable.hugeicons_math,
                iconButton2 = R.drawable.tabler_math_max,
                iconButton3 = R.drawable.hugeicons_board_math,
                iconButton4 = R.drawable.fluent_math_formula
            )
        }
    }
}
@Preview
@Composable
fun HomeScreenPreview_1() {
    HomeScreen()
}