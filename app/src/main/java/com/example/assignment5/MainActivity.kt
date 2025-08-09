package com.example.assignment5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val showNameButton = findViewById<Button>(R.id.showNameButton)
        val greetingText = findViewById<TextView>(R.id.greetingText)

        showNameButton.setOnClickListener {
            val name = nameInput.text.toString()
            greetingText.text = "Hello, $name!"
}
    }
}