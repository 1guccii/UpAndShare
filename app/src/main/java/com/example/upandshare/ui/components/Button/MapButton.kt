package com.example.upandshare.ui.components.Button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.upandshare.R
import com.example.upandshare.ui.theme.Typography

@Composable
fun MapButton(onClick: () -> Unit, textButton: String, iconButton:Int, colorButton: Color)  {
    Button(
        onClick = onClick,
        colors = ButtonColors(
            containerColor = colorButton,
            contentColor = Color.Black,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.White),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            Icon(painter = painterResource(id = iconButton), contentDescription = "Math Icon")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = textButton, style = Typography.displayMedium)
        }
    }
}

@Preview
@Composable
fun MapButtonPreview() {
    MapButton(onClick = { /*TODO*/ }, textButton = "IT", iconButton = R.drawable.medicine_pill, Color(0xFFF7C846))
}