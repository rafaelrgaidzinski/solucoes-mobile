package com.example.cacatesouro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class PerguntaComposable {

    @Composable
    fun Pergunta(navigateHome: () -> Unit, navigateFirstHint: () -> Unit, navigateTreasure: () -> Unit){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Qual o nome da charada?")
            Button(onClick = {navigateHome()}) {
                Text("Voltar para a Home")
            }
            Button(onClick = {navigateFirstHint()}) {
                Text("Primeira Dica")
            }
            Button(onClick = {navigateTreasure()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green,
                    contentColor = Color.White
                ) ) {
                Text("Acertou a Resposta")
            }
        }
    }
}

