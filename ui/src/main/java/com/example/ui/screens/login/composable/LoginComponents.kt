package com.example.ui.screens.login.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.ui.R
import com.example.ui.composable.SwiftTextField
import com.example.ui.theme.Black60
import com.example.ui.theme.Dimens

@Composable
fun LoginComponents(
    username: String = "",
    email: String,
    password: String,
    isLogin: Boolean,
    passwordVisibility: Boolean,
    onClickPasswordVisibility: (Boolean) -> Unit,
    onChangeEmail: (String) -> Unit,
    onChangeUsername: (String) -> Unit = {},
    onChangePassword: (String) -> Unit
) {
    if (isLogin) {
        Text(
            text = "Username",
            style = MaterialTheme.typography.bodyMedium,
            color = Black60
        )
        SwiftTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = Dimens().SpacingXMedium, bottom = Dimens().SpacingXLarge),
            value = username,
            onValueChange = { onChangeUsername(it) },
        )
    }
    Text(
        modifier = Modifier,
        text = "email",
        style = MaterialTheme.typography.bodyMedium,
        color = Black60
    )
    SwiftTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = Dimens().SpacingXMedium),
        value = email,
        onValueChange = { onChangeEmail(it) },
    )
    Text(
        modifier = Modifier.padding(top = Dimens().SpacingXLarge),
        text = "password",
        style = MaterialTheme.typography.bodyMedium,
        color = Black60
    )
    val passwordIcon =
        if (passwordVisibility) R.drawable.ic_eye else R.drawable.ic_eye_closed
    SwiftTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = Dimens().SpacingXMedium, bottom = Dimens().SpacingExtraHuge),
        value = password,
        onValueChange = { onChangePassword(it) },
        trailingIcon = {
            IconButton(onClick = { onClickPasswordVisibility(!passwordVisibility) }) {
                Icon(painter = painterResource(id = passwordIcon), contentDescription = null)
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
    )
}