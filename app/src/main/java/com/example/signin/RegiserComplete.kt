package com.example.signin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegiserComplete : AppCompatActivity() {
    private lateinit var arUsername:TextView
    private lateinit var arEmail:TextView
    private lateinit var arpass:TextView
    private lateinit var arconPass:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regiser_complete)

        arUsername=findViewById(R.id.arUsername)
        arEmail=findViewById(R.id.arEmail)
        arpass=findViewById(R.id.arpass)
        arconPass=findViewById(R.id.arconPass)


        var regUsername=intent.getStringExtra("username")
        var regemail=intent.getStringExtra("email")
        var regpass=intent.getStringExtra("pass")
        var regconPass=intent.getStringExtra("conPass")


        arUsername.text=regUsername.toString()
        arEmail.text=regemail.toString()
        arpass.text=regpass.toString()
        arconPass.text=regconPass.toString()

    }
}