package com.example.a22

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle: Bundle? = intent.extras

        val stringtxt: String? = bundle?.getString("color1")

        val colorString = intent?.extras?.getString("color1").toString()

        var txtViewString = findViewById<TextView>(R.id.textView2)

        txtViewString.text = colorString
        //val result = Intent(this, MainActivity::class.java)
    }
}