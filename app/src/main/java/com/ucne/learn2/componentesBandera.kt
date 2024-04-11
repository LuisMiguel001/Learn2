package com.ucne.learn2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.learn2.ui.theme.Learn2Theme

@Composable
fun Bandera() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            Box(
                modifier = Modifier
                    .size(150.dp, 320.dp)
                    .background(Color.Blue)
                    .offset(0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.width(110.dp))
            Box(
                modifier = Modifier
                    .size(150.dp, 320.dp)
                    .background(Color.Red)
                    .offset(100.dp, 0.dp)
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Row {
            Box(
                modifier = Modifier
                    .size(150.dp, 380.dp)
                    .background(Color.Blue)
                    .offset(0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.width(110.dp))
            Box(
                modifier = Modifier
                    .size(150.dp, 380.dp)
                    .background(Color.Red)
                    .offset(100.dp, 0.dp)
            )
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.escudo),
            contentDescription = "Escudo",
            modifier = Modifier
                .size(100.dp)
                .offset(155.dp, 320.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Learn2Theme {
        Bandera()
    }
}
