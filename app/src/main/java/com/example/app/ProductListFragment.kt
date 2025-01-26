package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.adapters.CategoryAdapter
import com.example.app.data.CategoriesRepository

class ProductListFragment : Fragment() {
    private lateinit var toolbar: Toolbar
    private lateinit var searchButton: ImageButton
    private lateinit var menuButton: ImageButton
    private lateinit var categoriesGrid: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        toolbar = view.findViewById(R.id.toolbar)
        searchButton = view.findViewById(R.id.searchButton)
        menuButton = view.findViewById(R.id.menuButton)
        categoriesGrid = view.findViewById(R.id.categoriesGrid)
        
        setupToolbar()
        setupCategoriesGrid()
        setupButtons()
    }

    private fun setupToolbar() {
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setupCategoriesGrid() {
        categoriesGrid.layoutManager = GridLayoutManager(context, 2)
        categoriesGrid.adapter = CategoryAdapter(CategoriesRepository.categories) { category ->
            val action = ProductListFragmentDirections.actionProductListToSubcategory(
                categoryName = category.name,
                subcategories = category.subcategories.toTypedArray()
            )
            findNavController().navigate(action)
        }
    }

    private fun setupButtons() {
        searchButton.setOnClickListener {
            // Show search dialog or navigate to search screen
        }

        menuButton.setOnClickListener {
            // Pop back to home fragment
            findNavController().popBackStack(R.id.homeFragment, false)
        }
    }
} 