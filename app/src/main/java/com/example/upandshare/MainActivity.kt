package com.example.upandshare

import GoogleSignInHelper
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.upandshare.ui.UpAndShareApp
import com.example.upandshare.ui.theme.UpAndShareTheme

class MainActivity : ComponentActivity() {
    private lateinit var googleSignInHelper: GoogleSignInHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        googleSignInHelper = GoogleSignInHelper(this, this)
        setContent {
            UpAndShareTheme {
                UpAndShareApp(googleSignInHelper = googleSignInHelper)
            }
        }
    }
}
