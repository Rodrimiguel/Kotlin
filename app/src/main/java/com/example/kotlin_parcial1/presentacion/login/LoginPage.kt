package com.example.kotlin_parcial1.presentacion.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    ){
        Text(text = "CAM", fontSize = 60.sp, fontWeight = FontWeight.Bold)
        Text(text = "Inicia con tu cuenta")
        Spacer(modifier = Modifier.height(28.dp))
        TextField(
            /*value = email,
            onValueChange = { email = it },
            label = { Text("Email") }*/
        )






















    }





















}













@Preview(showBackground = true)
@Composable
fun LoginPacePreview (){
    Kotlin_Parcial1Theme {
        LoginPage()
    }
}