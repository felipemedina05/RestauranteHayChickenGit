package com.example.restaurantehaychicken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }
}