package com.example.app11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

//Intent
//Implicit Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView=findViewById<ImageView>(R.id.imageView)

        val activityResult=registerForActivityResult(ActivityResultContracts.GetContent(),
            {
                imageView.setImageURI(it)
            }

        )

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                activityResult.launch("image/*")

            }
        })


    }

}





