package com.example.uzmobile.fragments.minutes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.uzmobile.ExpandableListViewAdapter
import com.example.uzmobile.R
import com.example.uzmobile.databinding.FragmentDailyMinuteBinding
import com.example.uzmobile.databinding.FragmentUssdCodeExpandableBinding
import com.example.uzmobile.fragments.HomeFragment


class DailyMinuteFragment : Fragment(R.layout.fragment_daily_minute) {


    private var _binding: FragmentDailyMinuteBinding? = null
    private val binding get() = _binding!!


    private val categories: MutableList<String> = ArrayList()
    private val items: MutableList<MutableList<String>> = ArrayList()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDailyMinuteBinding.bind(view)



        initList()
        initButtons()

        val expandableAdapter = ExpandableListViewAdapter(requireContext(), categories, items)

        binding.expandableListview.setAdapter(expandableAdapter)

        binding.backButton.setOnClickListener {
            val homeFragment = HomeFragment()
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

        val category8: MutableList<String> = ArrayList()
        category8.add("Ulanish")



        items.add(category1)
        items.add(category2)
        items.add(category3)
        items.add(category4)
        items.add(category5)
        items.add(category5)
        items.add(category6)




        categories.add("20 daqiqa")
        categories.add("30 daqiqa")
        categories.add("40 daqiqa")
        categories.add("50 daqiqa")
        categories.add("60 daqiqa ")
        categories.add("70 daqiqa")
    }

    private fun initButtons() {

        binding.dailyButton.setOnClickListener {
            val dailyMinuteBinding = DailyMinuteFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, dailyMinuteBinding)
            transaction.commit()
        }

        binding.weeklyButton.setOnClickListener {
            val weeklyMinuteFragment = WeeklyMinuteFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, weeklyMinuteFragment)
            transaction.commit()
        }

        binding.monthlyButton.setOnClickListener {
            val monthlyMinuteFragment = MonthlyMinuteFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, monthlyMinuteFragment)
            transaction.commit()
        }

        binding.secondWeeklyButton.setOnClickListener {
            val weeklyMinuteTwoFragment = WeeklyMinuteTwoFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, weeklyMinuteTwoFragment)
            transaction.commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

