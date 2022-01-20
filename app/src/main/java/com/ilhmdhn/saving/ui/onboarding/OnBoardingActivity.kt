package com.ilhmdhn.saving.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilhmdhn.saving.R
import com.ilhmdhn.saving.databinding.ActivityOnBoardingBinding
import com.ilhmdhn.saving.ui.MainActivity
import kotlinx.coroutines.MainScope

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnStart.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}