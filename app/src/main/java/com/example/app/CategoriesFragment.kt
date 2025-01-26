package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.data.CategoriesRepository
import com.example.app.adapters.CategoryAdapter

class CategoriesFragment : Fragment() {
    private lateinit var categoriesGrid: RecyclerView
    private lateinit var toolbar: Toolbar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar = view.findViewById(R.id.toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        categoriesGrid = view.findViewById(R.id.categoriesGrid)
        categoriesGrid.layoutManager = GridLayoutManager(context, 2)
        categoriesGrid.adapter = CategoryAdapter(CategoriesRepository.categories) { category ->
            val action = CategoriesFragmentDirections.actionCategoriesToSubcategory(
                categoryName = category.name,
                subcategories = category.subcategories.toTypedArray()
            )
            findNavController().navigate(action)
        }
    }
} 