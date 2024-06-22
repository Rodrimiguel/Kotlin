package com.example.kotlin_parcial1.routes

sealed class Routes(val routes: String) {
    object Page1: Routes("login")
    object Page2: Routes("Welcome/{emailName}"){
        fun createRoute(email: String): String{
            return "Welcome/$email"
        }
    }
}