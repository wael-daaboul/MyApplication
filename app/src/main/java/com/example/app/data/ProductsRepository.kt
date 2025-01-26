package com.example.app.data

import com.example.app.R
import com.example.app.model.Product

object ProductsRepository {
    private const val FRUITS_VEGGIES = "Fruits & Vegetables"
    
    private val fruitProducts = listOf(
        "Apple", "Orange", "Banana", "Grapes (Red/Green)", "Watermelon",
        "Melon", "Strawberry", "Kiwi", "Mango", "Pomegranate",
        "Pineapple", "Pear", "Peach", "Apricot", "Berries (Blue/Black)", "Cherry"
    )

    private val vegetableProducts = listOf(
        "Tomato", "Cucumber", "Pepper (Red/Yellow/Green)", "Eggplant",
        "Zucchini", "Potato", "Onion (Red/White)", "Carrot", "Cauliflower",
        "Broccoli", "Spinach", "Cabbage", "Lettuce", "Green Beans",
        "Corn", "Turnip", "Beetroot"
    )

    private val herbsProducts = listOf(
        "Mint", "Parsley", "Dill", "Coriander", "Basil", "Thyme Leaves",
        "Bay Leaves", "Grape Leaves", "Lettuce (Romaine/Local/Mountain)", "Arugula"
    )

    private val driedProducts = listOf(
        "Dates (Medjool, Sugary, Ajwa)", "Raisins", "Dried Apricots",
        "Prunes (Dried Plums)", "Dried Figs", "Walnut", "Almond", "Hazelnut",
        "Cashew", "Pistachio", "Tamarind", "Date Sweets"
    )

    val products = listOf(
        // Fruits with images
        Product(1, "Apple", FRUITS_VEGGIES, "Fruits", 1.99, "kg", R.drawable.img_product_apple),
        Product(2, "Orange", FRUITS_VEGGIES, "Fruits", 2.49, "kg", R.drawable.img_product_orange),
        Product(3, "Banana", FRUITS_VEGGIES, "Fruits", 1.79, "kg", R.drawable.img_product_banana),
        Product(4, "Red Grapes", FRUITS_VEGGIES, "Fruits", 3.99, "kg", R.drawable.img_product_grapes_red),
        Product(5, "Green Grapes", FRUITS_VEGGIES, "Fruits", 3.99, "kg", R.drawable.img_product_grapes_green),
        
        // Products using placeholder
        Product(6, "Watermelon", FRUITS_VEGGIES, "Fruits", 0.99, "kg", R.drawable.ic_fruit),
        Product(7, "Melon", FRUITS_VEGGIES, "Fruits", 2.99, "kg", R.drawable.ic_fruit),
        Product(8, "Strawberry", FRUITS_VEGGIES, "Fruits", 4.99, "box", R.drawable.ic_fruit),
        Product(9, "Kiwi", FRUITS_VEGGIES, "Fruits", 0.50, "piece", R.drawable.ic_fruit),
        Product(10, "Mango", FRUITS_VEGGIES, "Fruits", 2.99, "piece", R.drawable.ic_fruit),
        Product(11, "Pomegranate", FRUITS_VEGGIES, "Fruits", 2.49, "piece", R.drawable.ic_fruit),
        Product(12, "Pineapple", FRUITS_VEGGIES, "Fruits", 3.99, "piece", R.drawable.ic_fruit),
        Product(13, "Pear", FRUITS_VEGGIES, "Fruits", 1.99, "kg", R.drawable.ic_fruit),
        Product(14, "Peach", FRUITS_VEGGIES, "Fruits", 2.99, "kg", R.drawable.ic_fruit),
        Product(15, "Apricot", FRUITS_VEGGIES, "Fruits", 3.49, "kg", R.drawable.ic_fruit),
        Product(16, "Blueberries", FRUITS_VEGGIES, "Fruits", 4.99, "box", R.drawable.ic_fruit),
        Product(17, "Blackberries", FRUITS_VEGGIES, "Fruits", 4.99, "box", R.drawable.ic_fruit),
        Product(18, "Cherry", FRUITS_VEGGIES, "Fruits", 5.99, "kg", R.drawable.ic_fruit),

        // Vegetables
        Product(20, "Tomato", FRUITS_VEGGIES, "Vegetables", 1.99, "kg", R.drawable.ic_vegetable),
        Product(21, "Cucumber", FRUITS_VEGGIES, "Vegetables", 1.49, "kg", R.drawable.ic_vegetable),
        Product(22, "Red Pepper", FRUITS_VEGGIES, "Vegetables", 2.99, "kg", R.drawable.ic_vegetable),
        Product(23, "Yellow Pepper", FRUITS_VEGGIES, "Vegetables", 2.99, "kg", R.drawable.ic_vegetable),
        Product(24, "Green Pepper", FRUITS_VEGGIES, "Vegetables", 2.99, "kg", R.drawable.ic_vegetable),
        Product(25, "Eggplant", FRUITS_VEGGIES, "Vegetables", 1.99, "kg", R.drawable.ic_vegetable),
        Product(26, "Zucchini", FRUITS_VEGGIES, "Vegetables", 1.79, "kg", R.drawable.ic_vegetable),
        Product(27, "Potato", FRUITS_VEGGIES, "Vegetables", 1.29, "kg", R.drawable.ic_vegetable),
        Product(28, "Red Onion", FRUITS_VEGGIES, "Vegetables", 1.49, "kg", R.drawable.ic_vegetable),
        Product(29, "White Onion", FRUITS_VEGGIES, "Vegetables", 1.49, "kg", R.drawable.ic_vegetable),
        Product(30, "Carrot", FRUITS_VEGGIES, "Vegetables", 1.29, "kg", R.drawable.ic_vegetable),
        Product(31, "Cauliflower", FRUITS_VEGGIES, "Vegetables", 2.99, "piece", R.drawable.ic_vegetable),
        Product(32, "Broccoli", FRUITS_VEGGIES, "Vegetables", 2.99, "piece", R.drawable.ic_vegetable),
        Product(33, "Spinach", FRUITS_VEGGIES, "Vegetables", 1.99, "bunch", R.drawable.ic_vegetable),
        Product(34, "Cabbage", FRUITS_VEGGIES, "Vegetables", 1.99, "piece", R.drawable.ic_vegetable),
        Product(35, "Green Beans", FRUITS_VEGGIES, "Vegetables", 2.99, "kg", R.drawable.ic_vegetable),
        Product(36, "Corn", FRUITS_VEGGIES, "Vegetables", 0.99, "piece", R.drawable.ic_vegetable),
        Product(37, "Turnip", FRUITS_VEGGIES, "Vegetables", 1.49, "kg", R.drawable.ic_vegetable),
        Product(38, "Beetroot", FRUITS_VEGGIES, "Vegetables", 1.99, "kg", R.drawable.ic_vegetable),

        // Herbs & Lettuce
        Product(40, "Mint", FRUITS_VEGGIES, "Herbs & Lettuce", 0.99, "bunch", R.drawable.ic_herb),
        Product(41, "Parsley", FRUITS_VEGGIES, "Herbs & Lettuce", 0.89, "bunch", R.drawable.ic_herb),
        Product(42, "Dill", FRUITS_VEGGIES, "Herbs & Lettuce", 0.89, "bunch", R.drawable.ic_herb),
        Product(43, "Coriander", FRUITS_VEGGIES, "Herbs & Lettuce", 0.89, "bunch", R.drawable.ic_herb),
        Product(44, "Basil", FRUITS_VEGGIES, "Herbs & Lettuce", 1.29, "bunch", R.drawable.ic_herb),
        Product(45, "Thyme Leaves", FRUITS_VEGGIES, "Herbs & Lettuce", 1.49, "bunch", R.drawable.ic_herb),
        Product(46, "Bay Leaves", FRUITS_VEGGIES, "Herbs & Lettuce", 1.99, "pack", R.drawable.ic_herb),
        Product(47, "Grape Leaves", FRUITS_VEGGIES, "Herbs & Lettuce", 2.99, "pack", R.drawable.ic_herb),
        Product(48, "Romaine Lettuce", FRUITS_VEGGIES, "Herbs & Lettuce", 1.99, "piece", R.drawable.ic_herb),
        Product(49, "Local Lettuce", FRUITS_VEGGIES, "Herbs & Lettuce", 1.49, "piece", R.drawable.ic_herb),
        Product(50, "Mountain Lettuce", FRUITS_VEGGIES, "Herbs & Lettuce", 2.49, "piece", R.drawable.ic_herb),
        Product(51, "Arugula", FRUITS_VEGGIES, "Herbs & Lettuce", 1.99, "bunch", R.drawable.ic_herb),

        // Dates & Dried Fruits
        Product(60, "Medjool Dates", FRUITS_VEGGIES, "Dates & Dried Fruits", 12.99, "kg", R.drawable.ic_dried_fruit),
        Product(61, "Sugary Dates", FRUITS_VEGGIES, "Dates & Dried Fruits", 8.99, "kg", R.drawable.ic_dried_fruit),
        Product(62, "Ajwa Dates", FRUITS_VEGGIES, "Dates & Dried Fruits", 24.99, "kg", R.drawable.ic_dried_fruit),
        Product(63, "Raisins", FRUITS_VEGGIES, "Dates & Dried Fruits", 6.99, "kg", R.drawable.ic_dried_fruit),
        Product(64, "Dried Apricots", FRUITS_VEGGIES, "Dates & Dried Fruits", 9.99, "kg", R.drawable.ic_dried_fruit),
        Product(65, "Prunes", FRUITS_VEGGIES, "Dates & Dried Fruits", 8.99, "kg", R.drawable.ic_dried_fruit),
        Product(66, "Dried Figs", FRUITS_VEGGIES, "Dates & Dried Fruits", 11.99, "kg", R.drawable.ic_dried_fruit),
        Product(67, "Walnuts", FRUITS_VEGGIES, "Dates & Dried Fruits", 14.99, "kg", R.drawable.ic_dried_fruit),
        Product(68, "Almonds", FRUITS_VEGGIES, "Dates & Dried Fruits", 13.99, "kg", R.drawable.ic_dried_fruit),
        Product(69, "Hazelnuts", FRUITS_VEGGIES, "Dates & Dried Fruits", 15.99, "kg", R.drawable.ic_dried_fruit),
        Product(70, "Cashews", FRUITS_VEGGIES, "Dates & Dried Fruits", 16.99, "kg", R.drawable.ic_dried_fruit),
        Product(71, "Pistachios", FRUITS_VEGGIES, "Dates & Dried Fruits", 19.99, "kg", R.drawable.ic_dried_fruit),
        Product(72, "Tamarind", FRUITS_VEGGIES, "Dates & Dried Fruits", 7.99, "kg", R.drawable.ic_dried_fruit),
        Product(73, "Date Sweets", FRUITS_VEGGIES, "Dates & Dried Fruits", 11.99, "kg", R.drawable.ic_dried_fruit)
    )

    fun getProductsBySubcategory(subcategory: String): List<Product> {
        return when (subcategory) {
            "All" -> {
                // Get the category from the first product that matches any subcategory
                val category = products.firstOrNull()?.category ?: return emptyList()
                // Return all products from that category
                products.filter { it.category == category }
            }
            else -> products.filter { it.subcategory == subcategory }
        }
    }

    fun getProductNamesBySubcategory(subcategory: String): List<String> {
        return when (subcategory) {
            "All" -> {
                // Get all products from the current category
                val category = products.firstOrNull()?.category ?: return emptyList()
                products.filter { it.category == category }.map { it.name }
            }
            "Fruits" -> fruitProducts
            "Vegetables" -> vegetableProducts
            "Herbs and Lettuce" -> herbsProducts
            "Dates and Dried Fruits" -> driedProducts
            else -> emptyList()
        }
    }

    fun getAllProductNames(): List<String> = getProductNamesBySubcategory("All")
} 