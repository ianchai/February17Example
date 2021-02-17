package com.helloworld

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity() : AppCompatActivity(){

    private lateinit var textView:TextView
    private lateinit var editText:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickIt(view: View) {
        textView = findViewById<TextView>(R.id.textView)
        editText = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this,"Hello, "+editText.text,Toast.LENGTH_SHORT).show()
        textView.setText("Welcome to programming, "+editText.text)
    }

    fun longClick(view: View) {
        Toast.makeText(this,"Long press, "+editText.text,Toast.LENGTH_SHORT).show()
    }
}