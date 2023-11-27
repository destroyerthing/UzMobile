package com.example.uzmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uzmobile.databinding.ActivityLanguageChangeBinding

class LanguageChangeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLanguageChangeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanguageChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()


    }
    private fun initListeners(){
        with(binding){
            btnUzbLot.setOnClickListener{
                startActivity(
                    Intent(this@LanguageChangeActivity,MainActivity::class.java).apply {
                        putExtra("type",
                        "vea")
                    })
            }
        }
    }
}