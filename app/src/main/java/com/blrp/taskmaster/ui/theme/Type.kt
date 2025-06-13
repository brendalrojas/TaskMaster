package com.blrp.taskmaster.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.blrp.taskmaster.R

// Set of Material typography styles to start with

val raleway = FontFamily(
    Font(R.font.raleway_medium),
    Font(R.font.raleway_black),
    Font(R.font.raleway_bold),
    Font(R.font.raleway_extrabold),
    Font(R.font.raleway_italic),
    Font(R.font.raleway_regular),
    Font(R.font.raleway_semibold),
    Font(R.font.raleway_thin)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = raleway,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)