package com.example.upandshare.ui.uiComponents.Button.Payment

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R

@Composable
fun DonateButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFCA64), contentColor = Color(0xFF000000)),
        modifier = Modifier
            .width(350.dp)
            .height(56.dp)
    ) {
        Row {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.coffee),
                contentDescription = null,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.weight(2f))
            Text(text = "Buy for me a coffee", modifier = Modifier.align(Alignment.CenterVertically))
            Spacer(modifier = Modifier.weight(2f))
        }
    }
}

@Preview
@Composable
fun DonateButtonPreview() {
    DonateButton()
}