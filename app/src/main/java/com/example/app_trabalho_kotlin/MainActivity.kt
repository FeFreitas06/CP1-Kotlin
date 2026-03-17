package com.example.app_trabalho_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app_trabalho_kotlin.screens.*
import com.example.app_trabalho_kotlin.ui.theme.App_trabalho_kotlinTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_trabalho_kotlinTheme  {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController = navController, startDestination = "login") {
                        composable("login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController = navController)
                        }
                        composable("menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController = navController)
                        }
                        composable("perfil") {
                            PerfilScreen(modifier = Modifier.padding(innerPadding), navController = navController)
                        }
                        composable("pedidos") {
                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController = navController)
                        }
                    }
                }
            }
        }
    }
}