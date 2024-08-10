package com.avrians.suitmediatesportal.ui.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avrians.suitmediatesportal.databinding.ActivityThirdScreenBinding

class ThirdScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}