package com.example.testdriven

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.example.testdriven.ui.theme.TestDrivenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestDrivenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Testbutton()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun Testbutton(){

    var counter  by remember { mutableStateOf(0)}

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Button(onClick = { counter++ }, modifier = Modifier.testTag("BtnHello")) {
            Text(text = "Click")
        }

        Text(text = counter.toString(), modifier = Modifier.testTag("Counter"))

    }



}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestDrivenTheme {
        Greeting("Android")
    }
}