package com.tech.ng.recyclerfirebase.activityes.formlogin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.tech.ng.recyclerfirebase.R
import com.tech.ng.recyclerfirebase.databinding.ActivityCadastroBinding

class ActivityCadastro : AppCompatActivity() {

    private val binding by lazy { ActivityCadastroBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.textIrLogin.setOnClickListener {
            startActivity(Intent(this, ActivityLogin::class.java))
        }

        binding.buttonCadastro.setOnClickListener {
            val nome = binding.cadastroNome.text.toString()
            val email = binding.cadastroEmail.text.toString()
            val senha = binding.cadastroSenha.text.toString()

            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() ){

                val snackbar = Snackbar.make(it,"Preencha todos os campos", Snackbar.LENGTH_LONG)
                snackbar.setBackgroundTint(Color.RED)
                snackbar.setTextColor(Color.WHITE)
                snackbar.show()
            }else{

            }
        }

    }
}