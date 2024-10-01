package com.example.friends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.friends.ui.theme.FriendsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FriendsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NamesDisplay(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun NamesDisplay(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f)) {
            Image(
                painter = painterResource(id = R.drawable.billie),
                contentDescription = "Billie Herrington",
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "Billie Herrington",
                modifier = Modifier.align(Alignment.TopCenter).padding(16.dp),
                color = Color.White
            )
        }
        Box(modifier = Modifier.align(Alignment.BottomStart).fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
            Image(
                painter = painterResource(id = R.drawable.van),
                contentDescription = "Van Darkholme",
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "Van Darkholme",
                modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp)
            )
        }
        Box(modifier = Modifier.align(Alignment.BottomEnd).fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
            Image(
                painter = painterResource(id = R.drawable.steve), // Замените на свой ресурс
                contentDescription = "Steve Rambo",
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "Steve Rambo",
                modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun NamesDisplayPreview() {
    FriendsTheme {
        NamesDisplay()
    }
}
