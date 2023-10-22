package com.example.button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_submit: Button = findViewById<Button>(R.id.button);
        btn_submit.set(){
            setWebButton()
        }
    }

    fun setMessageButton(){

    }
    fun setWebButton(){
        //val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://campus.institutpedralbes.cat/my/"))
    }

    fun setCallButton(){

    }
}