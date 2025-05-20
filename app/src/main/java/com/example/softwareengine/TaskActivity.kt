package com.example.softwareengine

import android.app.DatePickerDialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.softwareengine.ui.theme.SoftwareEngineTheme
import java.util.*

class TaskActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoftwareEngineTheme {
                Scaffold { innerPadding ->
                    ProfileBody(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileBody(modifier: Modifier = Modifier) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    var dob by remember { mutableStateOf("Select DOB") }
    var gender by remember { mutableStateOf("") }
    var agreedToTerms by remember { mutableStateOf(false) }

    val countries = listOf("Nepal", "India")
    val context = LocalContext.current
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("UserProfile", Context.MODE_PRIVATE)
    val editor = sharedPreferences.edit()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = firstName,
                onValueChange = { firstName = it },
                placeholder = { Text("Firstname") },
                modifier = Modifier.width(150.dp)
            )
            OutlinedTextField(
                value = lastName,
                onValueChange = { lastName = it },
                placeholder = { Text("Lastname") },
                modifier = Modifier.width(150.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            OutlinedTextField(
                value = country,
                onValueChange = {},
                readOnly = true,
                placeholder = { Text("Select your country") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded)
                },
                modifier = Modifier.fillMaxWidth().menuAnchor()
            )
            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                countries.forEach {
                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            country = it
                            expanded = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("DOB")
        Button(onClick = {
            val calendar = Calendar.getInstance()
            val y = calendar.get(Calendar.YEAR)
            val m = calendar.get(Calendar.MONTH)
            val d = calendar.get(Calendar.DAY_OF_MONTH)
            DatePickerDialog(context, { _, year, month, day ->
                dob = "$day/${month + 1}/$year"
            }, y, m, d).show()
        }) {
            Text(dob)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text("Gender")
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            listOf("Male", "Female", "Other").forEach {
                Row(
                    modifier = Modifier
                        .padding(end = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = gender == it,
                        onClick = { gender = it }
                    )
                    Text(it)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = agreedToTerms,
                onCheckedChange = { agreedToTerms = it }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("I have agreed to the terms and conditions")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    val localEmail : String = sharedPreferences.getString("email", "").toString()
                    if(email == localEmail) {
                        Toast.makeText(context, "Email already exists", Toast.LENGTH_SHORT).show()

                    }
                    editor.putString("firstName", firstName)
                    editor.putString("lastName", lastName)
                    editor.putString("email", email)
                    editor.putString("country", country)
                    editor.putString("dob", dob)
                    editor.putString("gender", gender)
                    editor.putBoolean("agreedToTerms", agreedToTerms)
                    editor.apply()

                    Toast.makeText(context, "Data saved successfully!", Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(0.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color.Black
                )
            ) {
                Text(text = "Register")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Already have an account? Sign In",
                modifier = Modifier.clickable {
                    // Handle the Sign In action
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    SoftwareEngineTheme {
        ProfileBody()
    }
}