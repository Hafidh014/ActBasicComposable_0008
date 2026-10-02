package com.example.prak3

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.size

@Composable
fun Tugas(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier = modifier.fillMaxSize()
    ) {
        val screenHeight = maxHeight

        Image(
            painter = painterResource(
                id = R.drawable.gtr
            ),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.25f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
                .padding(top = screenHeight * 0.055f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 12.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(
                    screenHeight * 0.045f
                )
            )

            Image(
                painter = painterResource(
                    id = R.drawable.umy
                ),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(110.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(
                modifier = Modifier.height(
                    screenHeight * 0.055f
                )
            )
        }
    }


}