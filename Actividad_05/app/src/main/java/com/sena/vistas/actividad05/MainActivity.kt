package com.sena.vistas.actividad05

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

        val input = findViewById<EditText>(R.id.inputName)
        val play = findViewById<Button>(R.id.btnPlay)
        input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { play.isEnabled = !s.isNullOrBlank() }
            override fun afterTextChanged(s: Editable?) {}
        })
        play.setOnClickListener { Toast.makeText(this, "¡Bienvenido, ${input.text}!", Toast.LENGTH_LONG).show() }
    }
}
