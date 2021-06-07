package com.pruebaskotlin.test1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var n:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickLogin.setOnClickListener {
            if (checkVacio()) { //Si false, o login false o vacio, pero vacio enseña error
                
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
            login(user.toString(), password.toString())
        }

    }

    private fun showErrorEmpty() {
        Toast.makeText(this,"No puedes dejar campos vacios", Toast.LENGTH_SHORT).show()
    }
}