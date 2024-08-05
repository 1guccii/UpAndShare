package com.example.upandshare.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.upandshare.R

val Poppin_black = Font(R.font.poppins_black)
val Poppin_regular = Font(R.font.poppins_regular)
val Poppin_Medium = Font(R.font.poppins_medium)
val Poppin_bold = Font(R.font.poppins_bold)
val Poppin_extrabold = Font(R.font.poppins_extrabold)
// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FontFamily(Poppin_bold),
        fontWeight = FontWeight(700),
        fontSize = 96.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = Color.Black
    ),
    bodyMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(Poppin_Medium),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),
        ),
    titleLarge = TextStyle(
        fontSize = 36.sp,
        fontFamily = FontFamily(Poppin_bold),
        fontWeight = FontWeight(800),
        color = Color(0xFFFFFFFF),
        ),
    displayMedium = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(Poppin_Medium),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),
        ),
    labelMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(Poppin_Medium),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),
    ),
    titleMedium = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(Poppin_bold),
        fontWeight = FontWeight(700),
        color = Color(0xFF000000)
        ),
    headlineMedium = TextStyle(
        fontSize = 28.sp,
        fontFamily = FontFamily(Poppin_bold),
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
        ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(Poppin_bold),
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
        ),
    labelSmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(Poppin_Medium),
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
        )
)