package com.example.restaurantehaychicken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View


class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


    }

    fun IniciarSesion(btnIniciarSesion: View) {val Log=Intent(this, Iniciar::class.java)
    startActivity(Log)}

    fun Registro(btnRegistro: View) {val Reg=Intent(this,Reconocer::class.java)
    startActivity(Reg)}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }
    }



