package com.example.ui.screens.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.composable.SwiftTextField
import com.example.ui.screens.home.composable.CategoriesList
import com.example.ui.screens.home.composable.LoadCategoryPainters
import com.example.ui.screens.home.composable.ProductCardWithIcon
import com.example.ui.screens.home.composable.ProductListHorizontal
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.LightOrange
import com.example.ui.theme.Primary

@Composable
fun HomeScreen() {

}

@Composable
fun HomeContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Text(
                text = "Welcome Mohamed Elgohary",
                modifier = Modifier.padding(Dimens().SpacingXLarge),
                fontFamily = Imprima,
                style = MaterialTheme.typography.titleLarge,
                color = Primary
            )
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(
                        start = Dimens().SpacingXLarge,
                        end = Dimens().SpacingXLarge,
                        bottom = Dimens().SpacingXMedium
                    )
                    .border(1.dp, LightOrange, shape = RoundedCornerShape(Dimens().Radius8))
            ) {
                SwiftTextField(value = "", onValueChange = {}, hint = "Search", leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.magnifer),
                        contentDescription = null
                    )
                })
            }
        }
        item {
            LoadCategoryPainters()
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                ProductCardWithIcon()
                ProductCardWithIcon()
            }
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                ProductCardWithIcon()
                ProductCardWithIcon()
            }
        }
        item {
            ProductListHorizontal(text = "Flash Sale")
        }
        item {
            ProductListHorizontal(text = "Mega Sale")
        }
    }
}