package com.example.upandshare.ui.uiComponents.Button.upload

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun StatusUpload(subject:String, university:String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(330.dp)
            .height(80.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column {
                Text(text = subject, style = Typography.titleMedium)
                Text(
                    text = university,
                    style = Typography.bodySmall,
                    modifier = Modifier.alpha(0.5f)
                )
            }
            Spacer(modifier = Modifier.weight(4f))
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.done),
                contentDescription = null
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
@Preview
fun StatusUploadPreview() {
    StatusUpload("Giai tich", "PNK")
}