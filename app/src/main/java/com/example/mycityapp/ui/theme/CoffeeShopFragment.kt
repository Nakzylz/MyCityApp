package com.example.mycityapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CoffeeShopFragment() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Recommended Coffee Shops:")
        Text(text = "1. Coffee Shop 1")
        Text(text = "2. Coffee Shop 2")
        Text(text = "3. Coffee Shop 3")
    }
}