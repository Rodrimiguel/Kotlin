package com.example.kotlin_parcial1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun Login(name: String, modifier: Modifier = Modifier) {
    Column (modifier.padding(horizontal = 30.dp)) {
        Text(text = "LOGIN",
            modifier = modifier.align(Alignment.CenterHorizontally))
        TextField(
            value = "Ingresar E-mail", onValueChange = {}, modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth(1f)
        )

    }



}























@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Kotlin_Parcial1Theme {
        Login("Android")
    }
}