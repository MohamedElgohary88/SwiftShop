package com.example.ui.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.Black
import com.example.ui.theme.Dimens
import com.example.ui.theme.Gray
import com.example.ui.theme.Imprima
import com.example.ui.theme.LightOrange
import com.example.ui.theme.Primary

@Composable
fun SimpleProductCard() {
    Box(
        modifier = Modifier
            .width(140.dp)
            .height(200.dp)
            .padding(horizontal = Dimens().SpacingMedium)
            .border(1.dp, LightOrange, shape = RoundedCornerShape(Dimens().Radius8))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens().SpacingXLarge)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
                    .border(
                        1.dp,
                        Color.Transparent,
                        shape = RoundedCornerShape(Dimens().Radius8)
                    ),
                painter = painterResource(id = R.drawable.sofa_image),
                contentDescription = "product image"
            )
            Text(
                text = "FS - Nike Air Max 270 React...", modifier = Modifier.padding(
                    vertical = Dimens().SpacingXMedium,
                ),
                fontFamily = Imprima,
                style = MaterialTheme.typography.bodySmall,
                color = Black
            )
            Text(
                text = "\$299,43", modifier = Modifier.padding(bottom = Dimens().SpacingXLarge),
                fontFamily = Imprima,
                style = MaterialTheme.typography.bodySmall,
                color = Primary
            )
        }
    }
}


@Composable
fun ProductListHorizontal(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens().SpacingXLarge, vertical = Dimens().SpacingXMedium),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            fontFamily = Imprima,
            style = MaterialTheme.typography.titleMedium,
            color = Primary
        )
        Text(
            text = "See more",
            fontFamily = Imprima,
            style = MaterialTheme.typography.bodyMedium,
            color = Gray
        )
    }
    LazyRow(contentPadding = PaddingValues(horizontal = Dimens().SpacingXLarge)) {
        items(10) {
            SimpleProductCard()
        }
    }
}