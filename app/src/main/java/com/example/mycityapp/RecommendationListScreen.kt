package com.example.mycityapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mycityapp.model.Place

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecommendationListScreen(category: String, navController: NavController, places: List<Place>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(category) },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            items(places) { place ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate("detailsScreen/${place.name}") }
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = place.imageResId),
                        contentDescription = place.name,
                        modifier = Modifier
                            .size(64.dp) // Set the size for the image
                            .padding(end = 8.dp) // Add padding to the right of the image
                    )
                    // Use a Column for text to manage multiple lines better
                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = place.name, style = MaterialTheme.typography.bodyLarge)
                        Text(text = place.address, style = MaterialTheme.typography.bodySmall)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp)) // Add some space between items
            }
        }
    }
}
