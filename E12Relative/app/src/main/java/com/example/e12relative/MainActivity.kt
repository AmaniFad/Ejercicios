package com.example.e12relative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = findViewById<Button>(R.id.button)

        b.setOnClickListener {
            Toast.makeText(this, "registre complet", Toast.LENGTH_SHORT).show();
        }
    }
}