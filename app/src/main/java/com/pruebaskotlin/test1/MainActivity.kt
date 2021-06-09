package com.pruebaskotlin.test1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pruebaskotlin.test1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.clickLogin.setOnClickListener {
            if (checkVacio()) { //Si false, o login false o vacio, pero vacio enseña error
                val i = Intent(this, PrincipalActivity::class.java)
                startActivity(i)
            }
        }
    }

    //Función provisional login, esperando conexión a db;
    private fun login(user:String, pswd:String) :Boolean {
        return if (user == "Rafa" && pswd == "hola") {
            true
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun checkVacio() :Boolean {
        return if(user.text.isEmpty() || password.text.isEmpty()) {
            showErrorEmpty()
            false
        } else {
            login(user.text.toString(), password.text.toString())
        }

    }

    private fun showErrorEmpty() {
        Toast.makeText(this,"No puedes dejar campos vacios", Toast.LENGTH_SHORT).show()
    }
}