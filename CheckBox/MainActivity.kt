package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResult = findViewById<TextView>(R.id.textViewResult)
       val checkBox1 = findViewById<CheckBox>(R.id.checkbox1)
        checkBox1.setOnCheckedChangeListener(object : OnCheckedChangeListener {

            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean)
            {
                 if (isChecked){
                     textViewResult.text = "Thank you for accepting Terms and Conditions"
                 }
                else {
                    textViewResult.text = "Please accept Terms and Conditions to continue"
                }

            }
        })



    }
}










