package com.ucne.learn2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.learn2.ui.theme.Learn2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Learn2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Blue()
                }
            }
        }
    }
}

@Composable
fun Blue(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding()
            .offset(0.dp, 0.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.4f)
                    .padding(70.dp)
            )
        }
    }
}

@Composable
fun RedRight(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.error,
        modifier = Modifier
            .padding()
            .offset(250.dp, 0.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.4f)
                    .padding(200.dp)
            )
        }
    }
}

@Composable
fun Red(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.error,
        modifier = Modifier
            .padding()
            .offset(0.dp, 400.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(70.dp)
            )
        }
    }
}

@Composable
fun BlueRight(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding()
            .offset(250.dp, 400.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(70.dp)
            )
        }
    }
}

@Composable
fun Escudo(modifier: Modifier = Modifier) {
    Surface(modifier = Modifier.offset(170.dp, 330.dp))
    {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Descripción de la imagen",
            modifier = Modifier.size(50.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Learn2Theme {
        Blue()
        RedRight()
        Red()
        BlueRight()
        Escudo()
    }
}