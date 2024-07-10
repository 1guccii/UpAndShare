package com.example.upandshare.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.upandshare.R

val Inter_black = Font(R.font.inter_black)
val Inter_regular = Font(R.font.inter_regular)
val Inter_Medium = Font(R.font.inter_medium)
val Inter_bold = Font(R.font.inter_bold)
// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FontFamily(Inter_bold),
        fontWeight = FontWeight(700),
        fontSize = 80.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = Color.White
    ),
    bodyMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(Inter_Medium),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),
        ),
    titleLarge = TextStyle(
        fontSize = 36.sp,
        fontFamily = FontFamily(Inter_bold),
        fontWeight = FontWeight(800),
        color = Color(0xFFFFFFFF),
        ),
    displayMedium = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(Inter_Medium),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),
        )
)