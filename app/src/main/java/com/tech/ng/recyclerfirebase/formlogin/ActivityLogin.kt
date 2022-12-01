package com.tech.ng.recyclerfirebase.activityes.formlogin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.tech.ng.recyclerfirebase.R
import com.tech.ng.recyclerfirebase.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.textIrCadatro.setOnClickListener {
            startActivity(Intent(this, ActivityCadastro::class.java))
        }

        binding.buttonLogin.setOnClickListener {
            val email = binding.loginEmail.text.toString()
            val senha = binding.loginSenha.text.toString()

            if (email.isEmpty() || senha.isEmpty()) {
                val snackbar = Snackbar.make(it,"Preencha todos os campos", Snackbar.LENGTH_LONG)
                snackbar.setBackgroundTint(Color.RED)
                snackbar.setTextColor(Color.WHITE)
                snackbar.show()
            }else{

            }
        }

    }
}