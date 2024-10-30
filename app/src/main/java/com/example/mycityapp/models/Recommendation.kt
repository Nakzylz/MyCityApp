package com.example.mycityapp.models

data class Recommendation(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val address: String,
    val imageUrl: String
)