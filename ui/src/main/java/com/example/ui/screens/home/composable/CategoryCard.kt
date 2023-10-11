package com.example.ui.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.ui.R
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.LightOrange
import com.example.ui.theme.OrangeGray
import com.example.ui.theme.Primary


data class Category(val icon: Painter, val title: String)

val categoriesList = mutableListOf<Category>()

@Composable
fun AddCategory() {
    categoriesList.add(Category(painterResource(id = R.drawable.shirt), "Clothes"))
    categoriesList.add(Category(painterResource(id = R.drawable.laptop), "Electronics"))
    categoriesList.add(Category(painterResource(id = R.drawable.sofa), "Furniture"))
    categoriesList.add(Category(painterResource(id = R.drawable.shoes), "Shoes"))
}

@Composable
fun CategoriesList() {
    AddCategory()
    Text(
        text = "Categories",
        modifier = Modifier.padding(vertical = Dimens().SpacingXLarge),
        fontFamily = Imprima,
        style = MaterialTheme.typography.titleLarge,
        color = Primary
    )
    LazyRow {
        items(categoriesList.size) { index ->
            CategoryCard(icon = categoriesList[index].icon, text = categoriesList[index].title)
        }
    }
}


@Composable
fun CategoryCard(
    modifier: Modifier = Modifier,
    icon: Painter,
    text: String,
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = modifier
                .size(50.dp)
                .border(1.dp, color = LightOrange, shape = CircleShape)
                .clip(CircleShape)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Primary,
                modifier = modifier.size(24.dp)
            )
        }
        Spacer(modifier = modifier.height(8.dp))
        Text(
            text = text,
            color = OrangeGray,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
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