package com.example.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui.R
import com.example.ui.composable.CustomButton
import com.example.ui.composable.TeamixTextField
import com.example.ui.screens.login.composable.LoginComponents
import com.example.ui.theme.Background
import com.example.ui.theme.Black60
import com.example.ui.theme.Dimens
import com.example.ui.theme.Gray
import com.example.ui.theme.Imprima
import com.example.ui.theme.Primary

@Composable
fun LoginScreen() {

}

@Preview(showSystemUi = true)
@Composable
fun LoginContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(Dimens().SpacingXLarge)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.login_image),
                contentDescription = "login image",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens().SpacingSuperMassive),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Welcome Back to Swift Shop",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = Dimens().SpacingLarge),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Medium,
                fontFamily = Imprima,
            )
            Text(
                text = "Unlock a world of shopping convenience with Swift Shop",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = Gray,
                fontFamily = Imprima,
            )
        }
        item {
            LoginComponents(
                email = "",
                password = "",
                isLogin = false,
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