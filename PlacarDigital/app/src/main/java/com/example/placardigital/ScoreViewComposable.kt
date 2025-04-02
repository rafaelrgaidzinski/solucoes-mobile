package com.example.placardigital

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class ScoreViewComposable {

    @Composable
    fun TeamScore(score: Score) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(modifier = Modifier.padding(top = 16.dp), text = score.teamName)
            Button(onClick = {score.teamScore += 1}) {
                Text("+")
            }
            Text(modifier = Modifier.padding(16.dp), text = "${score.teamScore}")
            Button(onClick = {score.teamScore -= 1}) {
                Text("-")
            }
        }
    }

    @Composable
    fun ScoreView(homeTeam: Score, awayTeam: Score) {
        Column (
            modifier = Modifier.fillMaxSize().background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Row (
                modifier = Modifier.fillMaxWidth().background(Color.White),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                TeamScore(homeTeam)
                TeamScore(awayTeam)
            }
        }
    }
}