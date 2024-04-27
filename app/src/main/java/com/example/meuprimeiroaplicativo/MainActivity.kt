package com.example.meuprimeiroaplicativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var valorGasolina = remember {
        mutableStateOf("")
    }
    var valorAlcool by remember {
        mutableStateOf("")
    }



   Column (
       Modifier
           .background(color = Color(0xBAA67AAD))
           .fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally,
       ){
       Column (
           verticalArrangement = Arrangement.spacedBy(16.dp),
           horizontalAlignment = Alignment.CenterHorizontally
       )
       {
           Text(
               text = "Álcool ou Gasolina?",
               style = TextStyle(
                   color = Color.White,
                   fontSize = 32.sp,
                   fontWeight = FontWeight.Bold
               )
           )

           Text(
               text = "Gasolina",
               style = TextStyle(
                   color = Color.DarkGray,
                   fontSize = 40.sp,
                   fontWeight = FontWeight.Bold
               )
           )

           TextField(
               value = valorGasolina.value,
               onValueChange = { novoValor ->
                   valorGasolina.value = novoValor
               },
               label = {
                   Text(text = "Gasolina")
               }
           )
           TextField(
               value = valorAlcool,
               onValueChange = {
                   valorAlcool = it
               },
               label = {
                   Text(text = "Álcool")
               }
           )
       }
   }
}

//pra ver
@Preview
@Composable
fun AppPreview(){
    MeuPrimeiroAplicativoTheme {
        App()
    }
}