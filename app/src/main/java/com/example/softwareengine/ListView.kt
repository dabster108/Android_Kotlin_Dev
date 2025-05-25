package com.example.softwareengine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.softwareengine.ui.theme.SoftwareEngineTheme

class ListView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoftwareEngineTheme {
                ListViewBody()
            }
        }
    }
}

@Composable
fun ListViewBody() {
    val scrollState = rememberScrollState()
    // Create a list of 5 drawable resource ids for ic_logo.jpg
    val imageList = listOf(
        R.drawable.ic_logo,
        R.drawable.ic_logo,
        R.drawable.ic_logo,
        R.drawable.ic_logo,
        R.drawable.ic_logo
    )
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(scrollState)
        ) {
            // Horizontally scrollable row of images using LazyRow
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                items(imageList.size) { index ->
                    androidx.compose.foundation.Image(
                        painter = painterResource(id = imageList[index]),
                        contentDescription = "Logo $index",
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .background(Color.LightGray)
                            .height(80.dp)
                            .fillMaxWidth(0.2f)
                    )
                }
            }
            // 5 boxes with different colors
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Red)
            )
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Green)
            )
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Blue)
            )
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Yellow)
            )
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListViewBodyPreview() {
    SoftwareEngineTheme {
        ListViewBody()
    }
}

