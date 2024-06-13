package com.example.app11

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

//Intent
//Implicit Intent

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val editText=findViewById<EditText>(R.id.editText)


        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
               val url =editText.text.toString()

                val intent=Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://$url"))
                startActivity(intent)


                 }
        })


    }



}





