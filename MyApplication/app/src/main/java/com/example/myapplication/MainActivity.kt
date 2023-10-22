package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.view.View;
import android.widget.Toast;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button9);


        button.setOnClickListener {
            Log.d("MainActivity", "Botó apretat")
        }

        button.setOnClickListener {
            Toast.makeText(this, "boto apretat", Toast.LENGTH_SHORT).show();
        };
    }
}