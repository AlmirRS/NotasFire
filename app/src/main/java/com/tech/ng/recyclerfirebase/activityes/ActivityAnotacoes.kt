package com.tech.ng.recyclerfirebase.activityes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tech.ng.recyclerfirebase.R
import com.tech.ng.recyclerfirebase.databinding.ActivityAnotacoesBinding

class ActivityAnotacoes : AppCompatActivity() {

    private val binding by lazy {
        ActivityAnotacoesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.setTitle("Adicionar anotações")
    }
}