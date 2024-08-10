package com.avrians.suitmediatesportal.ui.screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avrians.suitmediatesportal.databinding.ActivityFirstScreenBinding

class FirstScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, SecondScreenActivity::class.java))
        }

    }
}