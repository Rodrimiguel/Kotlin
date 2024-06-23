package com.example.kotlin_parcial1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
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
){


}







@Preview (showBackground = true)
@Composable
fun MainPagePreview(){
    Kotlin_Parcial1Theme {
        MainPage()
    }
}