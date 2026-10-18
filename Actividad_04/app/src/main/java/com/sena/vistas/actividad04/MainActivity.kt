package com.sena.vistas.actividad04

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

        val display = findViewById<TextView>(R.id.display)
        var firstNumber: Int? = null
        for (digit in 0..9) {
            val id = resources.getIdentifier("key$digit", "id", packageName)
            findViewById<Button>(id).setOnClickListener {
                display.text = if (display.text.toString() == "0") "$digit" else "${display.text}$digit"
            }
        }
        findViewById<Button>(R.id.keyPlus).setOnClickListener {
            firstNumber = display.text.toString().toIntOrNull() ?: 0
            display.text = "0"
        }
        findViewById<Button>(R.id.keyEquals).setOnClickListener {
            firstNumber?.let { number ->
                val secondNumber = display.text.toString().toIntOrNull() ?: 0
                display.text = (number + secondNumber).toString()
            }
            firstNumber = null
        }
        findViewById<Button>(R.id.keyClear).setOnClickListener {
            firstNumber = null
            display.text = "0"
        }
    }
}
