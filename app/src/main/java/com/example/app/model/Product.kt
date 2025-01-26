package com.example.app.model

data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val subcategory: String,
    val price: Double,
    val unit: String,
    val imageResId: Int
) 