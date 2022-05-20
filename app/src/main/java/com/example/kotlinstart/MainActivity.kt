package com.example.kotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataClass = SomeDataClass("Bob",25)

        val name = dataClass.name
        val age = dataClass.age

        SingletonObj.someFun()

        val editText: EditText= findViewById(R.id.edit_text)
        editText.setText("Name is $name ,age $age")



        val button: Button = findViewById(R.id.someBtn)
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "someBtn", Toast.LENGTH_SHORT).show()
        }
    }
}

object SingletonObj {
    fun someFun(){

    }

}
