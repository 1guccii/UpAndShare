package com.example.upandshare.ui

import GoogleSignInHelper
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.upandshare.navigation.Screen
import com.example.upandshare.ui.sc.ProfileScreen
import com.example.upandshare.ui.screen.CoffeeScreen
import com.example.upandshare.ui.screen.FolderScreen
import com.example.upandshare.ui.screen.HomeScreen
import com.example.upandshare.ui.screen.SearchScreen
import com.example.upandshare.ui.screen.SplashScreen
import com.example.upandshare.ui.screen.UploadScreen


@Composable
fun UpAndShareApp(googleSignInHelper: GoogleSignInHelper) {
    val navController = rememberNavController()
    val isLoggedIn = googleSignInHelper.firebaseUserState
    NavHost(navController = navController, startDestination = if (isLoggedIn != null) Screen.HOME.name else Screen.SPLASH.name) {
        composable(Screen.HOME.name) {
            HomeScreen(navController = navController)
        }
        composable(Screen.SPLASH.name) {
            SplashScreen(googleSignInHelper, navController = navController)
        }
        composable(Screen.SEARCH.name) {
            SearchScreen(navController = navController)
        }
        composable(Screen.UPLOAD.name) {
            UploadScreen(navController = navController)
        }
        composable(Screen.COFFEE.name) {
            CoffeeScreen(navController = navController)
        }
        composable(Screen.PROFILE.name) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.FOLDER.name) {
            FolderScreen(navController = navController)
        }
    }
}