package com.example.uzmobile.fragments.sms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.uzmobile.ExpandableListViewAdapter
import com.example.uzmobile.R
import com.example.uzmobile.databinding.FragmentDailyMinuteBinding
import com.example.uzmobile.databinding.FragmentMonthlyMinuteBinding
import com.example.uzmobile.databinding.FragmentMonthlySmsBinding
import com.example.uzmobile.fragments.HomeFragment

class MonthlySmsFragment : Fragment(R.layout.fragment_monthly_sms) {

    private var _binding: FragmentMonthlySmsBinding? = null
    private val binding get() = _binding!!


    private val categories: MutableList<String> = ArrayList()
    private val items: MutableList<MutableList<String>> = ArrayList()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMonthlySmsBinding.bind(view)



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




        categories.add("SMS 10")
        categories.add("SMS 20")
        categories.add("SMS 25")
        categories.add("SMS 50")
        categories.add("SMS 100 ")
        categories.add("SMS 500")
    }

    private fun initButtons() {

        binding.dailyButton.setOnClickListener {
            val dailySmsFragment = DailySmsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, dailySmsFragment)
            transaction.commit()
        }

        binding.weeklyButton.setOnClickListener {
            val weeklySmsFragment = WeeklySmsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, weeklySmsFragment)
            transaction.commit()
        }

        binding.monthlyButton.setOnClickListener {
            val monthlySmsFragment = MonthlySmsFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, monthlySmsFragment)
            transaction.commit()
        }

        binding.secondWeeklyButton.setOnClickListener {
            val weeklySmsTwoFragment = WeeklySmsTwoFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.nav_host_container, weeklySmsTwoFragment)
            transaction.commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}