package com.example.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.model.Purchase
import java.text.NumberFormat
import java.util.Locale

class PurchaseAdapter(
    private val purchases: List<Purchase>
) : RecyclerView.Adapter<PurchaseAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productName: TextView = view.findViewById(R.id.productName)
        val quantity: TextView = view.findViewById(R.id.quantity)
        val price: TextView = view.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_purchase, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val purchase = purchases[position]
        val currencyFormat = NumberFormat.getCurrencyInstance(Locale.US)
        
        holder.productName.text = purchase.product.name
        holder.quantity.text = "x${purchase.quantity}"
        holder.price.text = currencyFormat.format(purchase.product.price * purchase.quantity)
    }

    override fun getItemCount() = purchases.size
} 