package com.example.ui.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.ui.R
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.LightOrange
import com.example.ui.theme.OrangeGray
import com.example.ui.theme.Primary


data class Category(val icon: Painter, val title: String)

@Composable
fun LoadCategoryPainters() {
    val shirtPainter = rememberAsyncImagePainter(model = R.drawable.shirt)
    val laptopPainter = rememberAsyncImagePainter(model = R.drawable.laptop)
    val sofaPainter = rememberAsyncImagePainter(model = R.drawable.sofa)
    val shoesPainter = rememberAsyncImagePainter(model = R.drawable.shoes)

    val categoriesList = listOf(
        Category(shirtPainter, "Clothes"),
        Category(laptopPainter, "Electronics"),
        Category(sofaPainter, "Furniture"),
        Category(shoesPainter, "Shoes")
    )
    CategoriesList(categories = categoriesList)
}


@Composable
fun CategoriesList(categories: List<Category>) {
    Text(
        text = "Categories",
        modifier = Modifier.padding(
            horizontal = Dimens().SpacingXLarge,
            vertical = Dimens().SpacingXMedium
        ),
        fontFamily = Imprima,
        style = MaterialTheme.typography.titleLarge,
        color = Primary
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens().SpacingXLarge),
        horizontalArrangement = Arrangement.SpaceBetween,
        content = {
            categories.forEach { category ->
                CategoryCard(icon = category.icon, text = category.title)
            }
        }
    )
}


@Composable
fun CategoryCard(icon: Painter, text: String) {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .padding(horizontal = Dimens().SpacingXMedium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .border(1.dp, color = LightOrange, shape = CircleShape)
                .clip(CircleShape)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Primary,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text,
            color = OrangeGray,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
        )
    }
}


@Preview
@Composable
fun CircularCardExample() {
    CategoryCard(
        icon = painterResource(id = R.drawable.laptop),
        text = "Card Title",
    )
}