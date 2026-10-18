package com.sena.vistas.actividad03

import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.content.Intent
import android.net.Uri
import android.text.TextWatcher
import android.text.Editable
import android.app.AlertDialog

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnDialog).setOnClickListener { showNameDialog() }
        showNameDialog()
    }
    private fun showNameDialog() {
        val input = EditText(this)
        input.hint = "Nombre"
        input.setSingleLine(true)
        val container = LinearLayout(this)
        container.setPadding(24, 8, 24, 0)
        container.addView(input)
        AlertDialog.Builder(this)
            .setTitle("Escribe tu nombre")
            .setView(container)
            .setNegativeButton("CANCELAR", null)
            .setPositiveButton("ACEPTAR") { _, _ ->
                Toast.makeText(this, "Hola, ${input.text}", Toast.LENGTH_SHORT).show()
            }.show()
    }
}
