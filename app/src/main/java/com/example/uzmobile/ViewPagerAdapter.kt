package com.example.uzmobile

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.uzmobile.fragments.HomeFragment

class ViewPagerAdapter(
    private val items: ArrayList<Fragment>,
    activity: HomeFragment
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {

        return items[position]

    }
}