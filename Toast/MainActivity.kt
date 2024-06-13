package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonShort = findViewById<Button>(R.id.buttonShort)
        val buttonLong = findViewById<Button>(R.id.buttonLong)

        buttonShort.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                 Toast.makeText(this@MainActivity,"this is short toast msg",Toast.LENGTH_SHORT).show()
            }
        })

        buttonLong.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
               Toast.makeText(this@MainActivity,"this is long toast msg",Toast.LENGTH_LONG).show()
            }
        })

    }
}










