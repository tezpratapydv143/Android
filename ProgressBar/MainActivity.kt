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
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar=findViewById<ProgressBar>(R.id.progressBar)
        val buttonShow=findViewById<Button>(R.id.buttonShow)
        val buttonHide=findViewById<Button>(R.id.buttonHide)
        val buttonGone=findViewById<Button>(R.id.buttonGone)

        buttonShow.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {

                progressBar.visibility = View.VISIBLE
            }
        })

        buttonHide.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                 progressBar.visibility = View.INVISIBLE
            }
        })
        buttonGone.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                progressBar.visibility = View.GONE
            }
        })
    }
}





