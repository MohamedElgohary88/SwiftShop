package com.example.ui.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.Black
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.LightOrange
import com.example.ui.theme.Primary
import com.example.ui.theme.White

@Composable
fun ProductCardWithIcon() {
    Column(
        modifier = Modifier
            .width(140.dp)
            .height(200.dp)
            .padding(horizontal = Dimens().SpacingMedium)
    ) {
        Box(
            modifier = Modifier
                .padding(Dimens().SpacingXMedium)
                .width(140.dp)
                .fillMaxHeight(.5f)
                .background(color = Color.Transparent)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.8f)
                    .border(
                        1.dp,
                        Color.Transparent,
                        shape = RoundedCornerShape(Dimens().Radius8)
                    ),
                painter = painterResource(id = R.drawable.sofa_image),
                contentDescription = "product image"
            )

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(36.dp)
                    .padding(end = Dimens().SpacingXLarge)
                    .background(White)
                    .border(
                        1.dp,
                        Color.Transparent,
                        shape = CircleShape
                    )
            ) {
                Image(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(28.dp)
                        .background(Black)
                        .border(
                            1.dp,
                            Color.Transparent,
                            shape = CircleShape
                        ),
                    painter = painterResource(id = R.drawable.bag),
                    contentDescription = "bag icon"
                )
            }
        }

        Text(
            text = "FS - Nike Air Max 270 React...",
            modifier = Modifier.padding(
                top = Dimens().SpacingXSmall,
                start = Dimens().SpacingXMedium,
                end = Dimens().SpacingXMedium
            ),
            fontFamily = Imprima,
            style = MaterialTheme.typography.bodySmall,
            color = Black
        )

        Text(
            text = "\$299,43",
            modifier = Modifier.padding(bottom = Dimens().SpacingXMedium),
            fontFamily = Imprima,
            style = MaterialTheme.typography.bodySmall,
            color = Primary
        )
    }
}