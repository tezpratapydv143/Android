package com.example.app11

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val id=intent.getIntExtra("USER_ID",0)
        val address=intent.getStringExtra("USER_ADDRESS")


        val textViewId=findViewById<TextView>(R.id.textViewId)
        val textViewAddress=findViewById<TextView>(R.id.textViewAddress)

        textViewId.text = id.toString()

        textViewAddress.text = address
    }
}