package com.example.upandshare.ui.uiComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun UserBox(num:Int, infor: String, idIcon: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(140.dp)
            .height(180.dp)
            .background(color = androidx.compose.ui.graphics.Color.White, shape = RoundedCornerShape(10.dp))
    ) {
        Icon(imageVector = ImageVector.vectorResource(id = idIcon), contentDescription = null)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = num.toString(), style = Typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = infor , style = Typography.labelMedium)
    }
}

@Preview
@Composable
fun UserBoxPreview() {
    UserBox(5, idIcon = R.drawable.user, infor = "User")
}