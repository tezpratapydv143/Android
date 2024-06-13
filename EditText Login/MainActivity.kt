package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val editTextUserName = findViewById<EditText>(R.id.editTextUserName)
       val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
       val buttonLogin = findViewById<Button>(R.id.buttonLogin)
       val textViewLoginResult = findViewById<TextView>(R.id.textViewLoginResult)

        buttonLogin.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?)
            {
                val userName = editTextUserName.text.toString()
                val password = editTextPassword.text.toString()

                //abcd && 1234
                if (userName.equals("abcd") && password.equals("1234")) {
                    textViewLoginResult.text= "Login Successfully"
                }
                else {
                    textViewLoginResult.text = "Username or Password is incorrect"
                }


            }
        })


    }
}










