package com.example.placardigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.placardigital.ui.theme.PlacarDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlacarDigitalTheme {
                val scoreViewComposable = ScoreViewComposable()
                val homeTeam = Score("Palmeiras", 0)
                val awayTeam = Score("Corinthians", 0)
                scoreViewComposable.ScoreView(homeTeam, awayTeam)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestPreview() {
    PlacarDigitalTheme {
        val scoreViewComposable = ScoreViewComposable()
        val homeTeam = Score("Palmeiras", 0)
        val awayTeam = Score("Corinthians", 0)
        scoreViewComposable.ScoreView(homeTeam, awayTeam)
    }
}