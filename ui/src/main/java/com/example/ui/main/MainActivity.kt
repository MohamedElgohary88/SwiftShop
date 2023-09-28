package com.example.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import com.example.ui.screens.login.LoginContent
import com.example.ui.screens.onboarding.OnboardingContent
import com.example.ui.screens.signup.SignUpContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContent {
            // LoginContent()
            // OnboardingContent()
            // SignUpContent()
        }
    }
}