package com.avrians.suitmediatesportal.ui.screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avrians.suitmediatesportal.databinding.ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChooseUser.setOnClickListener {
            startActivity(Intent(this, ThirdScreenActivity::class.java))
        }
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}