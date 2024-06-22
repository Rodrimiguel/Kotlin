package com.example.kotlin_parcial1

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun MainPage (modifier: Modifier = Modifier) {

}



@Preview (showBackground = true)
@Composable
fun MainPagePreview(){
    Kotlin_Parcial1Theme {
        MainPage()
    }
}