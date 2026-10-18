package com.sena.vistas.actividad02

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

        findViewById<Button>(R.id.btnView).setOnClickListener {
            val address = findViewById<EditText>(R.id.inputWeb).text.toString().trim()
            if (address.isBlank()) { Toast.makeText(this, "Escribe una dirección web", Toast.LENGTH_SHORT).show(); return@setOnClickListener }
            val url = if (address.startsWith("http://") || address.startsWith("https://")) address else "https://$address"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}
