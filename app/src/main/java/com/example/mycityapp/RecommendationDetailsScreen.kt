package com.example.mycityapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mycityapp.model.Place

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecommendationDetailsScreen(navController: NavController, place: Place) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = place.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        // Added vertical scroll capability
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .background(Color(0xFFF5F5F5)) // Light gray background
                .verticalScroll(rememberScrollState()) // Enable scrolling
        ) {
            Image(
                painter = painterResource(id = place.imageResId),
                contentDescription = place.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Limit image height to prevent overflow
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = place.name, style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = place.address, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = place.description, style = MaterialTheme.typography.bodySmall)
        }
    }
}



