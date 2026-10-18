package com.sena.vistas.actividad08

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

        findViewById<Button>(R.id.btnDestination).setOnClickListener { startActivity(Intent(this, SecondActivity::class.java).putExtra("mode", "Destination")) }
        findViewById<Button>(R.id.btnAction).setOnClickListener { startActivity(Intent(this, SecondActivity::class.java).putExtra("mode", "Action")) }
    }
}
