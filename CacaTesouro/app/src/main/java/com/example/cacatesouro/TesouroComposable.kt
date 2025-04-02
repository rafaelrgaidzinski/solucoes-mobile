package com.example.cacatesouro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

class TesouroComposable {

    @Composable
    fun Tesouro(navigateHome: () -> Unit, navController: NavController){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Parabéns você ganhou o tesouro")
            Button(onClick = {
                navigateHome()
                navController.popBackStack("Home", false)
            }) {
                Text("Voltar para a Home")
            }
        }
    }
}

