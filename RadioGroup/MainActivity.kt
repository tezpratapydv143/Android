package com.example.app11

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.EditText
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

        val radioGroup1=findViewById<RadioGroup>(R.id.radioGroup1)



        val buttonSubmit=findViewById<Button>(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {

                val radioId=radioGroup1.checkedRadioButtonId

                val radioButton=findViewById<RadioButton>(radioId)

                val radioButtonText=radioButton.text.toString()

                if (radioButtonText.equals("Android 14")) {
                    Toast.makeText(this@MainActivity,"Its Correct",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this@MainActivity,"its incorrect",Toast.LENGTH_SHORT).show()
                }
    }
})


    }
}










