package com.example.testdriven.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.testTag
import java.lang.reflect.Modifier

@Composable
fun Bye(){
    var state by remember { mutableStateOf("Hello") }

        Button(onClick = { state = "Bye" }) {
            Text(text = state)
        }
}