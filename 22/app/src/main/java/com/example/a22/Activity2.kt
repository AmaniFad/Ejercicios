package com.example.ejercicio.a22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonBlue = findViewById<Button>(R.id.button)

        buttonBlue.setOnClickListener {
            callSecondActivity() }
    }

    fun callSecondActivity(){
        val first_intent = Intent(this, MainActivity:: class.java)
        first_intent.putExtra("color1", "Azul")
        startActivity(first_intent)
    }
    /*
        override fun onStart() {
            super.onStart()
            Log.d("onLog", "onStart")
        }

        override fun onResume() {
            super.onResume()
            Log.d("onLog", "onResume")
        }

        override fun onPause() {
            super.onPause()
            Log.d("onLog", "onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d("onLog", "onStop")
        }
        675443876
        override fun onDestroy() {
            super.onDestroy()
            Log.d("onLog", "onDestroy")
        }*/
}