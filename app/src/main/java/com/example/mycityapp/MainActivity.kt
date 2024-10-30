package com.example.mycityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import com.example.mycityapp.data.*
import com.mycityapp.ui.theme.MyCityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCityAppTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "categoryScreen") {
        composable("categoryScreen") { CategoryScreen(navController) }
        composable("recommendationScreen/{category}") { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            val places = getCategoryPlaces(category)
            RecommendationListScreen(category, navController, places)
        }
        composable("detailsScreen/{placeName}") { backStackEntry ->
            val placeName = backStackEntry.arguments?.getString("placeName") ?: ""
            val place = findPlaceByName(placeName)
            place?.let { RecommendationDetailsScreen(navController, it) }
        }
    }
}


@Preview
@Composable
fun PreviewMainScreen() {
    MyCityAppTheme {
        MainScreen()
    }
}







