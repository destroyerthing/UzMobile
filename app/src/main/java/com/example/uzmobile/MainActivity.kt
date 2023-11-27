package com.example.uzmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uzmobile.databinding.ActivityMainBinding
import com.example.uzmobile.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.nav_host_container, homeFragment).commit()
    }
}