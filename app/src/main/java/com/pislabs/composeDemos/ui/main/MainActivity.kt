package com.pislabs.composeDemos.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pislabs.composeDemos.R
import com.pislabs.composeDemos.ui.theme.ComposeDemosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDemosTheme {
                Scaffold(modifier = Modifier.fillMaxSize().safeDrawingPadding()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box (
        Modifier.fillMaxSize().background(Color.LightGray).padding(10.dp)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .border(1.dp, Color.Green, shape = RoundedCornerShape(8.dp))
                .padding(10.dp)
        ) {
            Column {
                Row {
                    Image(
                        painterResource(id = R.drawable.img_avatar),
                        contentDescription = "测试Greeting",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painterResource(id = R.drawable.img_avatar),
                        contentDescription = stringResource(id = R.string.app_name),
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .offset(x=20.dp, y = 20.dp)
                    )
                    Text(
                        text = "Hello $name!",
                        color = Color.Magenta,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(Color.Green)
                    )
                }
                Row {
                    Box (
                        Modifier
                            .size(50.dp)
                            .background(
                                shape = RoundedCornerShape(8.dp),
                                color = Color.Red
                            )
                    ) {
                        Text(text = "纯色", modifier = Modifier.align(Alignment.Center))
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Box (
                        Modifier
                            .size(50.dp)
                            .background(
                                shape = RoundedCornerShape(8.dp),
                                brush = Brush.verticalGradient(
                                    colors = listOf(Color.Red, Color.Yellow, Color.White)
                                )
                            )
                    ){
                        Text(text = "渐变色", fontSize = 10.sp,  modifier = Modifier.align(Alignment.Center))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeDemosTheme {
        Greeting("Android")
    }
}