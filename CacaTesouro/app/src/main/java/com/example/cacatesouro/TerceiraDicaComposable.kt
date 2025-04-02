package com.example.cacatesouro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class TerceiraDicaComposable {

    @Composable
    fun TerceiraDica(navigateSecondHint: () -> Unit, navigateQuestion: () -> Unit){
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Terceira Dica")
            Button(onClick = {navigateSecondHint()}) {
                Text("Dica Anterior")
            }
            Button(onClick = {navigateQuestion()}) {
                Text("Responder Pergunta")
            }
        }
    }
}

