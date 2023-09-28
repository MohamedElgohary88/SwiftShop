package com.example.ui.screens.onboarding

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ui.R
import com.example.ui.composable.CustomButton
import com.example.ui.theme.Dimens
import com.example.ui.theme.Imprima
import com.example.ui.theme.Primary

@Composable
fun OnboardingScreen() {

}

@Composable
fun OnboardingContent() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Image(
                painter = painterResource(id = R.drawable.onboarding),
                contentDescription = "onboarding image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Swift Shop: Your Gateway to \nSmart Shopping",
                style = MaterialTheme.typography.titleLarge,
                fontFamily = Imprima,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 32.sp,
                modifier = Modifier.padding(
                    start = Dimens().SpacingXLarge,
                    top = Dimens().SpacingExtraHuge,
                    bottom = Dimens().SpacingXMedium
                )
            )
            Text(
                text = "Join our vibrant community of shoppers and \nsellers today, and let's Swiftly Shop together!",
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = Imprima,
                modifier = Modifier.padding(
                    horizontal = Dimens().SpacingXLarge,
                    vertical = Dimens().SpacingXMedium
                )
            )
        }
        item {
            Spacer(modifier = Modifier.height(Dimens().SpacingExtraHuge))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = Dimens().SpacingXLarge,
                        vertical = Dimens().SpacingXMedium
                    )
            ) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.width(Dimens().SpacingExtraHuge))
                CustomButton(
                    text = "Sign In",
                    textStyle = MaterialTheme.typography.bodyLarge,
                    onClick = { /*TODO*/ })
            }
        }
    }
}