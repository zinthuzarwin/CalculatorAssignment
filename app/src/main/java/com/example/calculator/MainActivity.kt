package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill numbers!!", Toast.LENGTH_LONG).show()
            } else {
               var c: Double = numOne.text.toString().toDouble()+ numTwo.text.toString().toDouble()
                textTwo.text=c.toString()
            }
        }

        btnSub.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(applicationContext,"Please Fill numbers!!", Toast.LENGTH_LONG).show()
            } else {
                var c:Double = numOne.text.toString().toDouble() - numTwo.text.toString().toDouble()
                textTwo.text=c.toString()
            }
        }

        btnMultiply.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill numbers!!", Toast.LENGTH_LONG).show()
            } else {
                var c:Double = numOne.text.toString().toDouble()* numTwo.text.toString().toDouble()
                textTwo.text=c.toString()
            }
        }

        btnDivide.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill numbers!!", Toast.LENGTH_LONG).show()
            } else {
                var c:Double = numOne.text.toString().toDouble() / numTwo.text.toString().toDouble()
                textTwo.text=c.toString()
            }
        }

        btnModulus.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill numbers!!", Toast.LENGTH_LONG).show()
            } else {
                var c:Double = numOne.text.toString().toDouble() / numTwo.text.toString().toDouble()
                textTwo.text=c.toString()
            }
        }

        btnDelete.setOnClickListener {
            numOne.setText("")
            numTwo.setText("")
            textTwo.setText("0")
        }
    }
}
