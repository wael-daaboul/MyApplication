package com.example.app.data

import com.example.app.model.Product
import com.example.app.model.Purchase

object PurchasesRepository {
    private val purchases = mutableMapOf<Int, Purchase>()

    fun addOrUpdatePurchase(product: Product, quantity: Int) {
        if (quantity > 0) {
            purchases[product.id] = Purchase(product, quantity)
        } else {
            purchases.remove(product.id)
        }
    }

    fun getPurchases(): List<Purchase> = purchases.values.toList()

    fun clearPurchases() {
        purchases.clear()
    }

    fun getTotalPrice(): Double {
        return purchases.values.sumOf { it.product.price * it.quantity }
    }
} 