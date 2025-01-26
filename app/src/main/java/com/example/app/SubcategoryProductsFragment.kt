package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.adapters.ProductAdapter
import com.example.app.data.ProductsRepository
import com.example.app.data.PurchasesRepository
import com.example.app.model.Product

class SubcategoryProductsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_subcategory_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        recyclerView = view.findViewById(R.id.productsRecyclerView)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val subcategory = arguments?.getString("subcategory") ?: return
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = ProductAdapter(
            products = ProductsRepository.getProductsBySubcategory(subcategory),
            onProductAdded = { product, quantity ->
                PurchasesRepository.addOrUpdatePurchase(product, quantity)
                context?.let {
                    android.widget.Toast.makeText(
                        it,
                        if (quantity > 0) "Added ${quantity}x ${product.name}"
                        else "Removed ${product.name}",
                        android.widget.Toast.LENGTH_SHORT
                    ).show()
                }
            }
        )
    }
} 