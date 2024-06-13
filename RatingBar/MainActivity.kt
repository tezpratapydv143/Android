package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RatingBar
import android.widget.RatingBar.OnRatingBarChangeListener
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ratingBar=findViewById<RatingBar>(R.id.ratingBar)
        ratingBar.setOnRatingBarChangeListener(object : OnRatingBarChangeListener {

            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {

                val ratingInfo= "User Selected $rating Rating"
                Toast.makeText(this@MainActivity,ratingInfo,Toast.LENGTH_SHORT).show()
            }

        })

    }
}





