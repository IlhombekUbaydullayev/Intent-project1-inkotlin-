package com.example.appkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        var b_open_second = findViewById<Button>(R.id.b_open_second)
        b_open_second.setOnClickListener {
            openSecondActivity()
        }
    }
    fun openSecondActivity(){
        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("name","Ilhombek ")
        intent.putExtra("age","24")
        startActivity(intent)
    }
}