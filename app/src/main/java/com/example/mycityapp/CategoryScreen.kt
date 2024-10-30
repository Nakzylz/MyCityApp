package com.example.mycityapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController) {
    val categories = listOf(
        "Coffee Shops" to R.drawable.coffee_icon, // Replace with actual drawable resources
        "Restaurants" to R.drawable.restaurant_icon,
        "Kid-Friendly Places" to R.drawable.kid_friendly_icon,
        "Parks" to R.drawable.park_icon,
        "Shopping Centers" to R.drawable.shopping_icon
    )

    Scaffold(
        topBar = { TopAppBar(title = { Text("Explore Dallas") }) }
    ) { innerPadding ->
        // Set a background color for the entire screen
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .background(Color(0xFFF5F5F5)) // Light background color
        ) {
            categories.forEach { (name, icon) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate("recommendationScreen/$name") }
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = icon),
                        contentDescription = name,
                        modifier = Modifier.size(48.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = name, style = MaterialTheme.typography.bodyLarge)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}





