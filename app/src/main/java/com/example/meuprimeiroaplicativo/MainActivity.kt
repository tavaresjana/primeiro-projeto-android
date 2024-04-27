package com.example.meuprimeiroaplicativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meuprimeiroaplicativo.ui.theme.MeuPrimeiroAplicativoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuPrimeiroAplicativoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
/* Box{
     Text(text = "Alcool ou gasolina")
     Text(text = "Gasolina")
     
 }
   Column {
       Text(text = "Alcool ou gasolina")
       Text(text = "Gasolina")
       //cada um numa linha vertical
   }*/
 Row {
     Text(text = "Alcool ou gasolina")
     Text(text = "Gasolina")
     //um do lado do outro
 }

}