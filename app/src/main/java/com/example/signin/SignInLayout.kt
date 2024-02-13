package com.example.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInLayout : AppCompatActivity() {
    private lateinit var rgPageLogin: TextView
    private lateinit var loginBTN: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_layout)


        var signpersonCIV=findViewById<EditText>(R.id.signpersonCIV)
        var enterUsername=findViewById<EditText>(R.id.enterUsername)
        var enterPass=findViewById<EditText>(R.id.enterPass)
        rgPageLogin = findViewById(R.id.rgPageLogin)
        loginBTN = findViewById(R.id.loginBTN)


        loginBTN.setOnClickListener() {
            var intent = Intent(this@SignInLayout, SignInComplete::class.java)
            startActivity(intent)

        }
        rgPageLogin.setOnClickListener() {
            var intent = Intent(this@SignInLayout, MainActivity::class.java)
            startActivity(intent)
        }
    }
}