package com.example.prak3

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

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
    }


}