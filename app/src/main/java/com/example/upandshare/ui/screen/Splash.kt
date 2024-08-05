
package com.example.upandshare.ui.screen

import GoogleSignInHelper
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.upandshare.navigation.Screen
import com.example.upandshare.ui.uiComponents.button.connectButton.ConnectGoogleButton
import com.example.upandshare.ui.theme.Typography
import com.google.android.gms.auth.api.signin.GoogleSignIn

@Composable
fun SplashScreen(googleSignInHelper: GoogleSignInHelper, navController: NavController) {
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
        googleSignInHelper.handleSignInResult(task)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color(0xFFF6F5F5))
    ) {
        Column(
            modifier = Modifier.padding(bottom = 100.dp)
        ) {
            Text(
                text = "Up",
                style = Typography.headlineLarge,
            )
            Text(
                text = "And",
                style = Typography.headlineLarge,
            )
            Text(
                text = "Share",
                style = Typography.headlineLarge,
            )
        }
        ConnectGoogleButton(onClick = { googleSignInHelper.signIn(launcher).let {
            navController.navigate(Screen.HOME.name) {
                popUpToRoute
            }
        } }
        )
    }
}
@Preview
@Composable
fun Preview() {
}
