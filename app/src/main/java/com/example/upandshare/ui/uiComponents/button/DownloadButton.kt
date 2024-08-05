package com.example.upandshare.ui.uiComponents.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.sp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun DownloadButton(subject: String, university: String, onClick: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment =Alignment.CenterVertically,
        modifier = Modifier
            .width(260.dp)
            .height(70.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
    ) {

        Spacer(modifier = Modifier.width(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = subject, style = Typography.bodySmall)
            Spacer(modifier = Modifier.weight(1f))
            Row {
                Text(text = university, style = Typography.labelSmall.copy(fontSize = 10.sp), modifier = Modifier.alpha(0.5f))
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        IconButton(onClick = onClick) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.download_32_light), contentDescription = null)
        }
    }
}

@Preview
@Composable
fun DownloadPreview() {
    DownloadButton(subject = "Giai tich", university = "Phenikaa", onClick = {})
}