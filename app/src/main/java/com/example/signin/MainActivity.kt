package com.example.signin

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var registerBTN:Button
    private lateinit var rgPageLogin:TextView
    private lateinit var Username:EditText
    private lateinit var Email:EditText
    private lateinit var pass:EditText
    private lateinit var conPass:EditText
    private lateinit var personCIV: CircleImageView
    var uri: Uri?=null



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBTN=findViewById(R.id.registerBTN)
        rgPageLogin=findViewById(R.id.rgPageLogin)
        Username=findViewById(R.id.Username)
        Email=findViewById(R.id.Email)
        pass=findViewById(R.id.pass)
        conPass=findViewById(R.id.conPass)
        personCIV = findViewById(R.id.personCIVH)
        personCIV.setOnClickListener {
            pickImage()
        }


        registerBTN.setOnClickListener(){

            var username=Username.text.toString()
            var email=Email.text.toString()
            var pass=pass.text.toString()
            var conpass=conPass.text.toString()



            var intent=Intent(this@MainActivity,RegiserComplete::class.java)
            intent.putExtra("username",username)
            intent.putExtra("email",email)
            intent.putExtra("pass",pass)
            intent.putExtra("conpass",conpass)
            startActivity(intent)
        }
        rgPageLogin.setOnClickListener() {
            var intent = Intent(this@MainActivity, SignInLayout::class.java)
            startActivity(intent)
        }

    }

    private fun pickImage() {

        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intent,1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)





    }
}