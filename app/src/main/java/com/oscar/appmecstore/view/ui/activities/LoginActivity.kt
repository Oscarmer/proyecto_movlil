package com.oscar.appmecstore.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.oscar.appmecstore.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val boton1=findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
        val signbot=findViewById<Button>(R.id.signbot)
        signbot.setOnClickListener {
            val intento1 = Intent(this, SignupActivity::class.java)
            startActivity(intento1)
        }
    }
}