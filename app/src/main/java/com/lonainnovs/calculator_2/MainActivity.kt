package com.lonainnovs.calculator_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

//Time: 2hrs 30 min
//Create a calculator app that is capable of performing the following operations on any
//2 numbers: Addition, Subtraction, Modulus, Division.
//Use TextInputLayouts with TextInputEditTexts and be sure to validate your inputs
//appropriately. There also should only be one textview to display the result of all the
//operations.


class MainActivity : AppCompatActivity() {
    lateinit var  tilFirstNumber:TextInputLayout
    lateinit var  etFirstNumber: TextInputEditText
    lateinit var  tilLastNumber:TextInputLayout
    lateinit var  etLastNumber: TextInputEditText
    lateinit var  btnAdd: Button
    lateinit var  btnDivide: Button
    lateinit var  btnSubtract: Button
    lateinit var  btnMod: Button
    lateinit var  tvDisplay: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNumber=findViewById(R.id.tilFirstNumber)
        etFirstNumber =findViewById(R.id.etFirstNumber)
        tilLastNumber=findViewById(R.id.tilLastNumber)
        etLastNumber =findViewById(R.id.etLastNumber)
        btnAdd=findViewById(R.id. btnAdd)
        btnSubtract =findViewById(R.id.btnSubtract)
        btnMod=findViewById(R.id. btnMod)
        btnDivide=findViewById(R.id.btnDivide)
        tvDisplay =findViewById(R.id.tvDisplay)


        btnAdd.setOnClickListener {
            var num1 =etFirstNumber.text.toString().toDouble()
            var num2 =etLastNumber.text.toString().toDouble()
            add(num1,num2)
        }
        btnSubtract.setOnClickListener {
            var num1 =etFirstNumber.text.toString().toDouble()
            var num2 =etLastNumber.text.toString().toDouble()
            subtract(num1, num2)
        }
        btnMod.setOnClickListener {
            var num1 =etFirstNumber.text.toString().toDouble()
            var num2 =etLastNumber.text.toString().toDouble()
            modulus(num1,num2)
//            validateInputs()
        }
        btnDivide.setOnClickListener {
            var num1=etFirstNumber.text.toString().toDouble()
            var num2=etLastNumber.text.toString().toDouble()
            division(num1,num2)
        }

       // validateInputs()
        listenOperations()

    }
    fun listenOperations(){
    btnAdd.setOnClickListener {
        var num1 =etFirstNumber.text.toString().toDouble()
        var num2 =etLastNumber.text.toString().toDouble()
        add(num1,num2)
    }
    btnSubtract.setOnClickListener {
        var num1 =etFirstNumber.text.toString().toDouble()
        var num2 =etLastNumber.text.toString().toDouble()
        subtract(num1, num2)
    }
    btnMod.setOnClickListener {
        var num1 =etFirstNumber.text.toString().toDouble()
        var num2 =etLastNumber.text.toString().toDouble()
        modulus(num1,num2)
//            validateInputs()
    }
    btnDivide.setOnClickListener {
        var num1=etFirstNumber.text.toString().toDouble()
        var num2=etLastNumber.text.toString().toDouble()
        division(num1,num2)
    }
    }

    fun modulus(num1: Double, num2: Double) {
        var mod =num1%num2
        tvDisplay.text=mod.toString()
    }

    fun division(num1: Double,num2: Double) {
        var div = num1/num2
        tvDisplay.text=div.toString()
    }

    fun subtract(num1: Double, num2: Double) {

        var difference=num1-num2
        tvDisplay.text =difference.toString()
    }

    fun add(num1:Double,num2:Double){
        var total=num1+num2
        tvDisplay.text = total.toString()
    }

    fun validateInputs(){
            var error=false

            tilFirstNumber.error=null
            tilLastNumber.error=null

    var numOne = etFirstNumber.text.toString()
    if (numOne.isBlank()) {
        tilFirstNumber.error = "Please input a number"
        error = true
    }
    var numTwo = etFirstNumber.text.toString()
    if (numTwo.isBlank()) {
        tilLastNumber.error = "Please input a number"
        error = true
    }
    if (!error) {
    }

//
//        btnAdd.setOnClickListener { validateInputs() }
//       btnSubtract.setOnClickListener { validateInputs() }
//       btnMod.setOnClickListener { validateInputs() }
//       btnDivide.setOnClickListener { validateInputs() }

        }
}

