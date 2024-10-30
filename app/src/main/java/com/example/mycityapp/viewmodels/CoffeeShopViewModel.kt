package com.example.mycityapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.models.Recommendation
import com.example.mycityapp.repository.RecommendationRepository

class CoffeeShopViewModel : ViewModel() {
    private val repository = RecommendationRepository()

    private val _recommendations = MutableLiveData<List<Recommendation>>()
    val recommendations: LiveData<List<Recommendation>> get() = _recommendations

    init {
        _recommendations.value = repository.getRecommendationsByCategory("Coffee Shops")
    }
}