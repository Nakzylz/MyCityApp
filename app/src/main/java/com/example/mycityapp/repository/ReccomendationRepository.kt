package com.example.mycityapp.repository

import com.example.mycityapp.models.Recommendation

class RecommendationRepository {
    fun getRecommendationsByCategory(category: String): List<Recommendation> {
        return sampleData.filter { it.category == category }
    }

    private val sampleData = listOf(
        Recommendation(1, "Houndstooth Coffee", "Coffee Shops", "A cozy coffee spot...", "Location 1", "url_to_image"),
        // Add more sample recommendations here
    )
}