package com.example.app_trabalho_kotlin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF3F51B5)) // Fundo Azul
            .padding(32.dp)
    ) {
        Text(
            text = "MENU",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val buttonModifier = Modifier.fillMaxWidth(0.5f)
            Button(
                onClick = { navController.navigate("perfil") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = buttonModifier
            ) {
                Text(text = "Perfil", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
            }
            Button(
                onClick = { navController.navigate("pedidos") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = buttonModifier
            ) {
                Text(text = "Pedidos", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
            }
            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = buttonModifier
            ) {
                Text(text = "Sair", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
            }
        }
    }
}