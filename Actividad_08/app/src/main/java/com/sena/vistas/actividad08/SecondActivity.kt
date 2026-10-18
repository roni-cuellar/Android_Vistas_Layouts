package com.sena.vistas.actividad08

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val destination = intent.getStringExtra("mode") ?: "Destination"
        findViewById<TextView>(R.id.destinationText).text = destination

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
