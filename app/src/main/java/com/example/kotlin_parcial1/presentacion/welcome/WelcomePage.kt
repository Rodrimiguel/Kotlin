package com.example.kotlin_parcial1.presentacion.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_parcial1.routes.Routes
import com.example.kotlin_parcial1.ui.theme.Kotlin_Parcial1Theme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomePage(
    navController: NavHostController,
    emailName: String
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val coroutineScope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                NavigationDrawerItem(
                    label = {
                        Text(text = "Cerrar Sesión | Log Out")
                    },
                    selected = currentRoute == Routes.Page1.routes,
                    onClick = {
                        navController.navigate(Routes.Page1.routes)
                    },
                )
                NavigationDrawerItem(
                    label = {
                        Text(text = "Welcome | Bienvenido")
                    },
                    selected = currentRoute == Routes.Page2.routes,
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
        Scaffold(
            modifier = Modifier,
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                coroutineScope.launch {
                                    drawerState.open()
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "MENU"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Text("WELCOME TO OUR WEBSITE")
                    }
                )
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { navController.navigate("LOG IN") }) {
                    Icon(Icons.Default.Close, contentDescription = "CERRAR SESIÓN / LOT OUT")
                }
            }
        )  { innerPadding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "BIENVENIDO",
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 18.dp)
                )
                Text(
                    text = "HOLA, PEDRO",
                    fontSize = 26.sp
                )
                Text(
                    text = emailName,
                    fontSize = 26.sp
                )
            }
        }

    }
}
@Preview(showBackground = true)
@Composable
fun WelcomePagePreview() {
    val navHostController = rememberNavController()
    Kotlin_Parcial1Theme {
        WelcomePage(navHostController, "tester@tester.com")
    }
}