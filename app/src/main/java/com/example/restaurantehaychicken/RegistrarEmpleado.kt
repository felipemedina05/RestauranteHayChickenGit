package com.example.restaurantehaychicken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.Spinner


class RegistrarEmpleado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_empleado)

        val spinner = findViewById<Spinner>(R.id.SpinnerRol)

        val lista = resources.getStringArray(R.array.SpinnerRol)

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner.adapter = adaptador

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }
}