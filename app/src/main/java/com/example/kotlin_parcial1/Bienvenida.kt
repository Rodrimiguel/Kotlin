package com.example.kotlin_parcial1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme

@Composable
fun Bienvenida(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Bienvenido",
        modifier = modifier
    )





}


@Preview(showBackground = true)
@Composable
fun BienvenidaPreview() {
    Kotlin_Parcial1Theme {
        Bienvenida("")
    }
}