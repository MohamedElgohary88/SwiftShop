package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ui.R

val Imprima = FontFamily(
    Font(R.font.imprima_regular, weight = FontWeight.Normal)
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextSize22,
        lineHeight = TextHeight28
    ),

    titleMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize16,
        lineHeight = TextHeight24
    ),

    titleSmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize14,
        lineHeight = TextHeight20
    ),

    bodyLarge = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextSize16,
        lineHeight = TextHeight24
    ),

    bodyMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize14,
        lineHeight = TextHeight20
    ),

    bodySmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize12,
        lineHeight = TextHeight16
    ),

    labelLarge = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextSize14,
        lineHeight = TextHeight20
    ),

    labelMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize12,
        lineHeight = TextHeight16
    ),

    labelSmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize11,
        lineHeight = TextHeight14
    )
)