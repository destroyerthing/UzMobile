package com.example.uzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.uzmobile.ExpandableListViewAdapter
import com.example.uzmobile.R
import com.example.uzmobile.databinding.FragmentRateExpandableBinding
import com.example.uzmobile.databinding.FragmentUssdCodeExpandableBinding


class RateExpandableFragment : Fragment(R.layout.fragment_rate_expandable) {

    private var _binding: FragmentRateExpandableBinding? = null
    private val binding get() = _binding!!


    private val categories: MutableList<String> = ArrayList()
    private val items: MutableList<MutableList<String>> = ArrayList()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRateExpandableBinding.bind(view)



        initList()


        val expandableAdapter = ExpandableListViewAdapter(requireContext(), categories, items)

        binding.expandableListview.setAdapter(expandableAdapter)

        binding.backButton.setOnClickListener{
            val homeFragment =  HomeFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, homeFragment)
            transaction.commit()
        }


    }

    private fun initList() {
        val category1: MutableList<String> = ArrayList()
        category1.add("Ulanish")


        val category2: MutableList<String> = ArrayList()
        category2.add("Ulanish")


        val category3: MutableList<String> = ArrayList()
        category3.add("Ulanish")

        val category4: MutableList<String> = ArrayList()
        category4.add("Ulanish")

        val category5: MutableList<String> = ArrayList()
        category5.add("Ulanish")

        val category6: MutableList<String> = ArrayList()
        category6.add("Ulanish")


        val category7: MutableList<String> = ArrayList()
        category7.add("Ulanish")




        items.add(category1)
        items.add(category2)
        items.add(category3)
        items.add(category4)
        items.add(category5)
        items.add(category5)
        items.add(category6)
        items.add(category7)




        categories.add("Oddiy")
        categories.add("Delovoy")
        categories.add("Komfort")
        categories.add("Bolajon")
        categories.add("Yoshlar")
        categories.add("Traffic")
        categories.add("Traffic 2")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}