package com.example.p21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.editTextText2)
        var button = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            val textoIngresado = editText.text.toString()
            textView.text = textoIngresado
        }
    }
}