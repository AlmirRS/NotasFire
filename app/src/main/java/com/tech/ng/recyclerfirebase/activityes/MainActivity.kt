package com.tech.ng.recyclerfirebase.activityes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tech.ng.recyclerfirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.buttonFloat.setOnClickListener {
            startActivity(Intent(this, ActivityAnotacoes::class.java))
        }

    }
}