package com.example.restaurantehaychicken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View

class Reconocer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reconocer)

    }

    fun RegEmpleado(btnRegistrarEmpleado: View) {val RegEmp=Intent(this, RegistrarEmpleado::class.java)
    startActivity(RegEmp)}


    fun RegUsuario(btnRegistrarUsuario: View) {val RegUsu=Intent(this, Registrarse::class.java)
    startActivity(RegUsu)}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }

}