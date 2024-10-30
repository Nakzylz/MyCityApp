package com.example.mycityapp.data

import com.example.mycityapp.model.Place

fun getCategoryPlaces(category: String): List<Place> {
    return when (category) {
        "Coffee Shops" -> coffeeShops
        "Restaurants" -> restaurants
        "Kid-Friendly Places" -> kidFriendlyPlaces
        "Parks" -> parks
        "Shopping Centers" -> shoppingCenters
        else -> emptyList()
    }
}

fun findPlaceByName(name: String): Place? {
    return (coffeeShops + restaurants + kidFriendlyPlaces + parks + shoppingCenters).find { it.name == name }
}
