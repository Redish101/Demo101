package com.example.demo101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demo101.ui.theme.Demo101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo101Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloContent()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelloContent() {
    Scaffold(
        topBar = {
            MediumTopAppBar(title = {
                Text(text = "Redish101", style = MaterialTheme.typography.headlineLarge)
            })
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
            {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "哈哈哈")
                }

            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Demo101Theme {
        HelloContent()
    }
}