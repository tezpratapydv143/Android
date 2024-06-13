package com.example.app11

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

//Intent
//Implicit Intent

class MainActivity : AppCompatActivity() {
    lateinit var imageView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         imageView=findViewById<ImageView>(R.id.imageView)


        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {

               val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intent,100)
            }
        })


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (requestCode == 100 && resultCode == RESULT_OK) {
            val bitmap =intent?.extras?.get("data") as Bitmap

            imageView.setImageBitmap(bitmap)
        }

    }

}





