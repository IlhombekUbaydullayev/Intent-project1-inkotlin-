package com.example.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }
    fun initView(){
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var name = intent.getStringExtra("name")
        var age = intent.getStringExtra("age")
        tv_second.text = name + age
    }
}