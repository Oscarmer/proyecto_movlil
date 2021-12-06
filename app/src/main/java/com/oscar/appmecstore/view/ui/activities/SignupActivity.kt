package com.oscar.appmecstore.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.oscar.appmecstore.R

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val botonsign=findViewById<Button>(R.id.botonsign)
        botonsign.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}