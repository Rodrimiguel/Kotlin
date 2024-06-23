package com.example.kotlin_parcial1.presentacion.welcome

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.kotlin_parcial1.routes.Routes
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomePage(
    navController: NavHostController,
    emailName: String
) {val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)


    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                NavigationDrawerItem(
                    label = {
                        Text(text = "Cerrar Sesión | Log Out")
                    },
                    selected = currentRoute== Routes.Page1.routes,
                    onClick = {
                        navController.navigate(Routes.Page1.routes)
                    },
                )
                NavigationDrawerItem(
                    label = {
                        Text(text = "Welcome | Bienvenido")
                    },
                    selected = currentRoute== Routes.Page2.routes,
                    onClick = {
                        navController.navigate(Routes.Page2.createRoute(emailName))
                        coroutineScope.launch {
                            drawerState.close()
                        }
                    },
                )
            }
        }
    ) {




    }




}