package com.example.uzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.uzmobile.R
import com.example.uzmobile.ViewPagerAdapter
import com.example.uzmobile.databinding.FragmentHomeBinding
import com.example.uzmobile.fragments.internets.DailyInternetFragment
import com.example.uzmobile.fragments.minutes.DailyMinuteFragment
import com.example.uzmobile.fragments.sms.DailySmsFragment


class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)


        binding.icUssdImageButton.setOnClickListener {
            val ussdCodeExpandableFragment = UssdCodeExpandableFragment()
            replaceFragment(ussdCodeExpandableFragment)
        }

        binding.icRateImageButton.setOnClickListener {
            val rateExpandableFragment = RateExpandableFragment()
            replaceFragment(rateExpandableFragment)
        }


        binding.icServiceImageButton.setOnClickListener {
            val serviceExpandableFragment = ServiceExpandableFragment()
            replaceFragment(serviceExpandableFragment)
        }

        binding.icMinuteImageButton.setOnClickListener {
            val dailyMinuteFragment = DailyMinuteFragment()
            replaceFragment(dailyMinuteFragment)
        }
        binding.icInternetImageButton.setOnClickListener {
            val dailyInternetFragment = DailyInternetFragment()
            replaceFragment(dailyInternetFragment)
        }

        binding.icSmsImageButton.setOnClickListener {
            val dailySmsFragment = DailySmsFragment()
            replaceFragment(dailySmsFragment)
        }


        val fragments: ArrayList<Fragment> = arrayListOf(
            PageOneFragment(),
            PageTwoFragment(),
            PageThreeFragment(),
            PageFourFragment(),
            PageFiveFragment()
        )


        val adapter = ViewPagerAdapter(fragments, this)
        binding.viewpager.adapter = adapter

        binding.dotsIndicator.attachTo(binding.viewpager)
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction().replace(R.id.nav_host_container, fragment).commit()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




