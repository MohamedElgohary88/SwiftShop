package com.example.ui.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.ui.R
import com.example.ui.composable.CustomButton
import com.example.ui.screens.login.composable.LoginComponents
import com.example.ui.theme.Background
import com.example.ui.theme.Dimens
import com.example.ui.theme.Gray
import com.example.ui.theme.Imprima

@Composable
fun SignUpScreen() {

}

@Composable
fun SignUpContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(Dimens().SpacingXLarge)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.signup_image),
                contentDescription = "signup image",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens().SpacingSuperMassive),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Welcome to Swift Shop",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = Dimens().SpacingLarge),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Medium,
                fontFamily = Imprima,
            )
            Text(
                text = "Join the Swift Shop community today and start exploring a world of incredible deals",
                style = MaterialTheme.typography.bodyLarge,
                color = Gray,
                modifier = Modifier.padding(
                    bottom = Dimens().SpacingXLarge
                ),
                textAlign = TextAlign.Center,
                fontFamily = Imprima,
            )
        }
        item {
            LoginComponents(
                email = "",
                password = "",
                isLogin = true,
                passwordVisibility = true,
                onClickPasswordVisibility = {},
                onChangeEmail = {},
                onChangePassword = {}
            )
            CustomButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Login",
                textStyle = MaterialTheme.typography.bodyLarge,
                onClick = { /*TODO*/ },
                spacingTop = Dimens().SpacingXLarge,
                spacingBottom = Dimens().SpacingXLarge
            )
        }
    }
}