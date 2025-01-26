package com.example.app.model

data class Category(
    val id: Int,
    val name: String,
    val subcategories: List<String>,
    val iconResId: Int
) 