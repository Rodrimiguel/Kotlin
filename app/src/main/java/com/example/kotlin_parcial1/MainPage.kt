package com.example.kotlin_parcial1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
//import com.example.kotlin_parcial1.presentacion.login.LoginPage
import com.example.kotlin_parcial1.routes.Routes
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun MainPage(modifier: Modifier = Modifier) {

    val navHostController = rememberNavController()

    MainNavHost(modifier, navHostController)
}

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navHostController : NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = "login"
    ) {
        composable(Routes.Page1.routes) { LoginPage(navHostController) }

        composable(
            Routes.Page2.routes,
            arguments = listOf(
                navArgument("emailName") {
                    type = NavType.StringType
                    defaultValue = "Pepe"
                })
        ) {
            val email = it.arguments?.getString("emailName")
            if (email != null) {
                WelcomePage(
                    navHostController,
                    emailName = email
                )
            }

        }
    }
}

@Preview (showBackground = true)
@Composable
fun MainPagePreview(){
    Kotlin_Parcial1Theme {
        MainPage()
    }
}