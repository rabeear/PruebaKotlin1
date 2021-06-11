package com.pruebaskotlin.test1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pruebaskotlin.test1.databinding.ActivityRegisterBinding
import java.util.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCancelar.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        binding.btnCrearCuentaNueva.setOnClickListener {
            var n = Date(12-12-12)
            var p:persona = persona("Rafa","esto",n, true,"oj@ok.com","rafa","rafa")

            binding.nombrePersona.setText(p.getNombre()) //funciona :)
        }
    }
}