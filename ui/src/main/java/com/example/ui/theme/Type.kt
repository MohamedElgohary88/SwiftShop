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
        fontSize = Dimens().TextSize22,
        lineHeight = Dimens().TextHeight28
    ),

    titleMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize16,
        lineHeight = Dimens().TextHeight24
    ),

    titleSmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize14,
        lineHeight = Dimens().TextHeight20
    ),

    bodyLarge = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.SemiBold,
        fontSize = Dimens().TextSize16,
        lineHeight = Dimens().TextHeight24
    ),

    bodyMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize14,
        lineHeight = Dimens().TextHeight20
    ),

    bodySmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize12,
        lineHeight = Dimens().TextHeight16
    ),

    labelLarge = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.SemiBold,
        fontSize = Dimens().TextSize14,
        lineHeight = Dimens().TextHeight20
    ),

    labelMedium = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize12,
        lineHeight = Dimens().TextHeight16
    ),

    labelSmall = TextStyle(
        fontFamily = Imprima,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens().TextSize11,
        lineHeight = Dimens().TextHeight14
    )
)