package com.example.ui.composable

import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.Primary
import com.example.ui.theme.White

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    onClick: () -> Unit,
    spacingStart: Dp = Dimens().SpacingXXLarge,
    spacingEnd: Dp = Dimens().SpacingXXLarge,
    spacingTop: Dp = Dimens().SpacingLarge,
    spacingBottom: Dp = Dimens().SpacingLarge,
) {
    Box(
        modifier = modifier
            .background(Primary, RoundedCornerShape(Dimens().Radius8))
            .padding(
                start = spacingStart,
                end = spacingEnd,
                top = spacingTop,
                bottom = spacingBottom
            )
            .clickable { onClick() },

        ) {
        Text(
            modifier = modifier.fillMaxWidth(),
            text = text,
            fontFamily = Imprima,
            textAlign = TextAlign.Center,
            style = textStyle,
            color = White
        )
    }
}