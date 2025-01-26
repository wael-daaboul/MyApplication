package com.example.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.model.Product
import com.google.android.material.button.MaterialButton

class ProductAdapter(
    private val products: List<Product>,
    private val onProductAdded: (Product, Int) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private val quantities = mutableMapOf<Int, Int>() // Store quantities by product ID

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productImage: ImageView = view.findViewById(R.id.productImage)
        val productName: TextView = view.findViewById(R.id.productName)
        val productDetails: TextView = view.findViewById(R.id.productDetails)
        val addButton: MaterialButton = view.findViewById(R.id.addButton)
        val quantityContainer: View = view.findViewById(R.id.quantityContainer)
        val decreaseButton: ImageButton = view.findViewById(R.id.decreaseButton)
        val quantityText: TextView = view.findViewById(R.id.quantityText)
        val increaseButton: ImageButton = view.findViewById(R.id.increaseButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        
        holder.productImage.setImageResource(product.imageResId)
        holder.productName.text = product.name
        holder.productDetails.text = "${product.price}$ / ${product.unit}"
        
        // Get current quantity for this product
        val quantity = quantities[product.id] ?: 0
        updateQuantityUI(holder, quantity)

        holder.addButton.setOnClickListener {
            quantities[product.id] = 1
            updateQuantityUI(holder, 1)
            onProductAdded(product, 1)
        }

        holder.decreaseButton.setOnClickListener {
            val currentQty = quantities[product.id] ?: 0
            if (currentQty > 1) {
                quantities[product.id] = currentQty - 1
                updateQuantityUI(holder, currentQty - 1)
                onProductAdded(product, currentQty - 1)
            } else {
                quantities.remove(product.id)
                updateQuantityUI(holder, 0)
            }
        }

        holder.increaseButton.setOnClickListener {
            val currentQty = quantities[product.id] ?: 0
            val newQty = currentQty + 1
            quantities[product.id] = newQty
            updateQuantityUI(holder, newQty)
            onProductAdded(product, newQty)
        }
    }

    private fun updateQuantityUI(holder: ViewHolder, quantity: Int) {
        if (quantity > 0) {
            holder.addButton.visibility = View.GONE
            holder.quantityContainer.visibility = View.VISIBLE
            holder.quantityText.text = quantity.toString()
            
            holder.decreaseButton.setImageResource(
                if (quantity == 1) R.drawable.ic_delete
                else R.drawable.ic_remove
            )
        } else {
            holder.addButton.visibility = View.VISIBLE
            holder.quantityContainer.visibility = View.GONE
        }
    }

    override fun getItemCount() = products.size
} 