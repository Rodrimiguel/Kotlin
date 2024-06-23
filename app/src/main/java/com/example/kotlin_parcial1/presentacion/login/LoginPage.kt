package com.example.kotlin_parcial1.presentacion.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.kotlin_parcial1.routes.Routes
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun LoginPage(
    navController : NavHostController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var sorry_errorMessage by remember { mutableStateOf("") }


    Column(
        Modifier
            .fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sign in to your account", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "Iniciar sesión con tu email y contraseña")
        Spacer(modifier = Modifier.height(28.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") }
        )
        Button(
            onClick = {
                if (email == "pedro@pe.com.ar" && password == "abc123") {
                    sorry_errorMessage = ""
                    navController.navigate(Routes.Page2.createRoute(email))
                } else {
                    sorry_errorMessage = "Datos Incorrectos. Por favor intenté otra vez"
                }
            }
        ) {
            Text("LOG IN | INGRESAR")
        }
        if (sorry_errorMessage.isNotEmpty()) {
            Text(sorry_errorMessage)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPacePreview() {
    Kotlin_Parcial1Theme {
        LoginPage(navHostController)
    }
}