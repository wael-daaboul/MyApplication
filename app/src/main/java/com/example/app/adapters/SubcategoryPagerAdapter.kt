package com.example.app.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.app.SubcategoryProductsFragment

class SubcategoryPagerAdapter(
    activity: FragmentActivity,
    private val subcategories: Array<String>
) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = subcategories.size

    override fun createFragment(position: Int): Fragment {
        return SubcategoryProductsFragment().apply {
            arguments = Bundle().apply {
                putString("subcategory", subcategories[position])
            }
        }
    }
} 