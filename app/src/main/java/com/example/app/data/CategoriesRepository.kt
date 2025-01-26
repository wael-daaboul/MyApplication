package com.example.app.data

import com.example.app.R
import com.example.app.model.Category

object CategoriesRepository {
    val categories = listOf(
        Category(
            id = 1,
            name = "Fruits & Vegetables",
            iconResId = R.drawable.ic_fruits_veggies_category,
            subcategories = listOf(
                "All",
                "Fruits",
                "Vegetables",
                "Herbs & Lettuce",
                "Dates & Dried Fruits"
            )
        ),
        Category(
            id = 2,
            name = "Baked Goods",
            subcategories = listOf(
                "All",
                "Bread",
                "Pastries",
                "Cakes & Baked Sweets"
            ),
            iconResId = R.drawable.ic_bakery
        ),
        Category(
            id = 3,
            name = "Dairy & Eggs",
            subcategories = listOf(
                "All",
                "Cheeses",
                "Yogurt & Milk",
                "Eggs",
                "Plant-based Dairy"
            ),
            iconResId = R.drawable.ic_dairy
        ),
        Category(
            id = 4,
            name = "Beverages",
            subcategories = listOf(
                "All",
                "Natural Juices",
                "Soft Drinks",
                "Mineral Water",
                "Sports Drinks",
                "Energy Drinks"
            ),
            iconResId = R.drawable.ic_beverages
        ),
        Category(
            id = 5,
            name = "Breakfast Food",
            subcategories = listOf(
                "All",
                "Breakfast Cereals",
                "Jam & Honey",
                "Peanut Butter",
                "Toast"
            ),
            iconResId = R.drawable.ic_breakfast
        ),
        Category(
            id = 6,
            name = "Poultry",
            subcategories = listOf(
                "All",
                "Whole Chicken",
                "Chicken Parts",
                "Frozen Poultry"
            ),
            iconResId = R.drawable.ic_poultry
        ),
        Category(
            id = 7,
            name = "Meat",
            subcategories = listOf(
                "All",
                "Beef",
                "Lamb",
                "Frozen Meat"
            ),
            iconResId = R.drawable.ic_meat
        )
    )
} 