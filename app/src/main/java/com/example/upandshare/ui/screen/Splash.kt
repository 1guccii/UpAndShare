@file:Suppress("DEPRECATION")

package com.example.upandshare.ui.screen

import GoogleSignInHelper
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.upandshare.ui.UpAndShareAppScreen
import com.example.upandshare.ui.components.Button.ConnectButton.ConnectGoogleButton
import com.example.upandshare.ui.theme.Typography
import com.google.android.gms.auth.api.signin.GoogleSignIn

@Composable
fun SplashScreen(googleSignInHelper:GoogleSignInHelper, navController: NavController) {
    val firebaseUserState = googleSignInHelper.firebaseUserState

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
        googleSignInHelper.handleSignInResult(task)
    }
    LaunchedEffect(firebaseUserState) {
        if (firebaseUserState != null) {
            navController.navigate(UpAndShareAppScreen.HOME.name)
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(3 / 4f)
                .padding(bottom = 80.dp)
        ) {
        Text(text = "Upload", style = Typography.headlineLarge)
        Text(text = "And", style = Typography.headlineLarge)
        Text(text = "Share", style = Typography.headlineLarge)
        }
        Spacer(modifier = Modifier.height(72.dp))
        ConnectGoogleButton(onClick = {googleSignInHelper.signIn(launcher)})
    }
}
