package com.example.engn.sharedpreferencekotlin

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun save(view : View){

        val sharedPreferences = getSharedPreferences("userInfo",Context.MODE_PRIVATE)

        val editor = sharedPreferences.edit()
        editor.putString("username",editusername.text.toString())
        editor.putString("password",editpass.text.toString())
        editor.apply()

        Toast.makeText(this,"Kaydedildi..",Toast.LENGTH_LONG).show()

    }

    fun goster(view: View){
        val sharedPreferences = getSharedPreferences("userInfo",Context.MODE_PRIVATE)

        val name = sharedPreferences.getString("username"," ")
        val psw =sharedPreferences.getString("password"," ")

        textView.text = name + " " +psw



    }
}

