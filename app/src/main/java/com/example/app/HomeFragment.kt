package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {
    private lateinit var searchView: SearchView
    private lateinit var viewProductsButton: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        searchView = view.findViewById(R.id.searchView)
        viewProductsButton = view.findViewById(R.id.viewProductsButton)
        
        setupSearchView()
        setupButton()
    }

    private fun setupSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle search query submission
                query?.let {
                    // Navigate to search results or filter products
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle search query text changes
                return true
            }
        })
    }

    private fun setupButton() {
        viewProductsButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeToProductList())
        }
    }
} 