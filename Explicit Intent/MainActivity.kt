package com.example.app11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Intent
//Explicit Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {

                val intent=Intent(this@MainActivity,HomeActivity::class.java)
                intent.putExtra("USER_ID",1234)
                intent.putExtra("USER_ADDRESS","hyderabad")

                startActivity(intent)

            }
        })


    }

}





