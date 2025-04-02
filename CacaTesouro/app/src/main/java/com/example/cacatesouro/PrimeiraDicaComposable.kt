package com.example.cacatesouro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class PrimeiraDicaComposable {

    @Composable
    fun PrimeiraDica(navigateQuestion: () -> Unit, navigateSecondHint: () -> Unit){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Primeira Dica")
            Button(onClick = {navigateQuestion()}) {
                Text("Voltar para Pergunta")
            }
            Button(onClick = {navigateSecondHint()}) {
                Text("Próxima Dica")
            }
        }
    }
}

