package com.example.kotlin_parcial1.presentacion.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun LoginPage(

) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){}





















}













@Preview(showBackground = true)
@Composable
fun LoginPacePreview (){
    Kotlin_Parcial1Theme {
        LoginPage()
    }
}