package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()

        }
    }
}

@Composable
fun MainBody(){
    Column(
        modifier = Modifier
//        .width(width = 0.dp)

            .fillMaxSize()
            .background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(text = "Hello", style = TextStyle(
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Start,
            fontStyle = FontStyle.Italic,
            fontSize = 30.sp

        ), modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Android")
        Text(text = "Android")
        Image(
            painter = painterResource(R.drawable.dk),
            contentDescription = null,
            modifier = Modifier
                .height(height = 200.dp)
                .width(width = 400.dp)
        )
    }
}

@Preview
@Composable
fun MainPreview(){
    MainBody()


}