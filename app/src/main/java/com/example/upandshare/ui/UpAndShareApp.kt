package com.example.upandshare.ui

import GoogleSignInHelper
import android.content.Context
import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.ui.screen.HomeScreen
import com.example.upandshare.ui.screen.SplashScreen


enum class UpAndShareAppScreen {
    HOME,
    SPLASH,
    MAP
}
@Composable
fun UpAndShareApp(googleSignInHelper: GoogleSignInHelper) {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = UpAndShareAppScreen.SPLASH.name) {
        composable(UpAndShareAppScreen.HOME.name) {
            HomeScreen()
        }
        composable(UpAndShareAppScreen.SPLASH.name) {
            SplashScreen(googleSignInHelper = googleSignInHelper, navController = navController)
        }
        
    }

}