package com.example.cacatesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cacatesouro.ui.theme.CacaTesouroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CacaTesouroTheme {
                val homeComposable = HomeComposable()
                val perguntaComposable = PerguntaComposable()
                val primeiraDicaComposable = PrimeiraDicaComposable()
                val segundaDicaComposable = SegundaDicaComposable()
                val terceiraDicaComposable = TerceiraDicaComposable()
                val tesouroComposable = TesouroComposable()

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Home") {
                    composable("Home") {
                        homeComposable.Home(
                            { navController.navigate("Pergunta") })
                    }
                    composable("Pergunta") {
                        perguntaComposable.Pergunta(
                            {navController.navigate("Home")},
                            {navController.navigate("PrimeiraDica")},
                            {navController.navigate("Tesouro")})
                    }
                    composable("PrimeiraDica") {
                        primeiraDicaComposable.PrimeiraDica(
                            {navController.navigate("Pergunta")},
                            {navController.navigate("SegundaDica")})
                    }
                    composable("SegundaDica") {
                        segundaDicaComposable.SegundaDica(
                            {navController.navigate("PrimeiraDica")},
                            {navController.navigate("TerceiraDica")})
                    }
                    composable("TerceiraDica") {
                        terceiraDicaComposable.TerceiraDica(
                            {navController.navigate("SegundaDica")},
                            {navController.navigate("Pergunta")})
                    }
                    composable("Tesouro") {
                        tesouroComposable.Tesouro(
                            { navController.navigate("Home") },
                            navController
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    CacaTesouroTheme {
        val homeComposable = HomeComposable()
        val perguntaComposable = PerguntaComposable()
        val primeiraDicaComposable = PrimeiraDicaComposable()
        val segundaDicaComposable = SegundaDicaComposable()
        val terceiraDicaComposable = TerceiraDicaComposable()
        val tesouroComposable = TesouroComposable()

        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "Home") {
            composable("Home") {
                homeComposable.Home({ navController.navigate("Home") })
            }
            composable("Pergunta") {
                perguntaComposable.Pergunta(
                    {navController.navigate("Home")},
                    {navController.navigate("PrimeiraDica")},
                    {navController.navigate("Tesouro")})
            }
            composable("PrimeiraDica") {
                primeiraDicaComposable.PrimeiraDica(
                    {navController.navigate("Pergunta")},
                    {navController.navigate("SegundaDica")})
            }
            composable("SegundaDica") {
                segundaDicaComposable.SegundaDica(
                    {navController.navigate("PrimeiraDica")},
                    {navController.navigate("TerceiraDica")})
            }
            composable("TerceiraDica") {
                terceiraDicaComposable.TerceiraDica(
                    {navController.navigate("SegundaDica")},
                        {navController.navigate("Pergunta")})
            }
            composable("Tesouro") {
                tesouroComposable.Tesouro(
                    { navController.navigate("Home") },
                    navController
                )
            }
        }
    }
}