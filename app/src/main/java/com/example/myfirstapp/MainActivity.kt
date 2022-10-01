package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCLickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var buttonCounter = 0
        btnCLickMe.setOnClickListener {
            buttonCounter++
            val updatedText = "You clicked the button $buttonCounter times"
            tvMyTextView.text = updatedText
            Toast.makeText(this, "Hey I'm a Toast!", Toast.LENGTH_LONG).show()
        }

    }
}