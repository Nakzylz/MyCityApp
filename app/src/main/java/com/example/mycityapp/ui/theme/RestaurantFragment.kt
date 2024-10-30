package com.example.mycityapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RestaurantFragment() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Recommended Restaurants:")
        Text(text = "1. Restaurant 1")
        Text(text = "2. Restaurant 2")
        Text(text = "3. Restaurant 3")
    }
}