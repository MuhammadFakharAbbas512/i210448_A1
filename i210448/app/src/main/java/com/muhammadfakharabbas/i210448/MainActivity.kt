package com.muhammadfakharabbas.i210448

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onc()
    }
    fun onc(){
        var txt_mentor = findViewById<TextView>(R.id.txt_mentor)
        var txt_me = findViewById<TextView>(R.id.txt_me)
        txt_mentor.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        txt_me.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}