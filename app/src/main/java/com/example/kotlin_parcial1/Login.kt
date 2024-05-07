package com.example.kotlin_parcial1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun Login(name: String, modifier: Modifier = Modifier) {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 30.dp)) {
        Text(text = "LOGIN",
            modifier = modifier.align(Alignment.CenterHorizontally)
        )

        TextField(
            value = "Ingresar E-mail", onValueChange = {}, modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth(1f)
        )
            //Divider(modifier.padding(vertical = 30.dp), thickness = 3.dp, color = Color.Black)
            //Spacer(modifier = modifier.height(20.dp)
            //)
        Button(onClick = {},
            modifier
                .align(Alignment.CenterVertically)
                .padding(10.dp)
        )


        {
        TextField(value = "Ingresar Contraseña", onValueChange = {}, modifier = modifier
            .padding(top = 10.dp)
            .fillMaxWidth(1f)
        )


        }
        }

    }



























@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Kotlin_Parcial1Theme {
        Login("Android")
    }
}