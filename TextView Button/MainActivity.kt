package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)


        val textView1=findViewById<TextView>(R.id.textView1)

        val button1= findViewById<Button>(R.id.button1)

        button1.setOnClickListener(object : OnClickListener {

            override fun onClick(v: View?)
            {
                 textView1.text = "Good Morning"
            }
        })


    }
}










