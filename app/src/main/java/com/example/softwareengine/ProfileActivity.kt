package com.example.softwareengine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.softwareengine.ui.theme.SoftwareEngineTheme


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                ProfileBody(innerPadding = innerPadding)
            }
        }
    }
}

@Composable
fun ProfileBody(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        // Top Header Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                tint = Color.Red,
                contentDescription = null,
                modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
                    .clickable {
                        // Handle back navigation
                    }
            )

            Text(
                text = "Dikshanta",
                style = TextStyle(
                    fontSize = 28.sp,
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold
                )
            )

            Icon(
                painter = painterResource(id = R.drawable.baseline_more_horiz_24),
                tint = Color.Red,
                contentDescription = null,
                modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
                    .clickable {
                        // Handle more options
                    }
            )
        }

        // New Row for User Details with ic_logo
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.me),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape = CircleShape)

            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "174", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Post")
            }


            Column {
                Text(text = "772", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Followers")
            }

            Column {
                Text(text = "714", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Following")
            }
        }

        Column (modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 15.dp)){
            Text(text = "Dikshanta Chapagin", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("AI/ML Student", modifier = Modifier.alpha(alpha = 0.5f))
            Text("240226@softwarica.edu.np")
            Text("Followed by Elon Musk and Steve Jobs")
        }


        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){
            Button(onClick = {
                //to do when button clicked

            }, shape = RoundedCornerShape(0.dp),
                border = BorderStroke(1.dp, Color.Gray),
               colors = ButtonDefaults.buttonColors(
                   contentColor = Color. White,
                   containerColor = Color.Black
               )
                ) {

                Text(text = "Follow")
            }

            OutlinedButton(onClick = {

            }, ) {
                Text(text = "Message")
            }

            OutlinedButton(onClick = {

            }) {
                Text(text = "Email")
            }

            OutlinedButton(onClick = {

            }) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    SoftwareEngineTheme {
        ProfileBody(innerPadding = PaddingValues(0.dp))
    }
}
