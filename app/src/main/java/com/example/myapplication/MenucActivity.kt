package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menufood1.*
import kotlinx.android.synthetic.main.menufood3.*


class MenucActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menufood3)
        bottomfoodc1.setOnClickListener {
            var btnfood1 = Intent(this,FoodaActivity::class.java)
            startActivity(btnfood1)
        }
        bottomfoodc2.setOnClickListener {
            var btnfood2 = Intent(this,FoodaActivity::class.java)
            startActivity(btnfood2)
        }
        bottomfoodc3.setOnClickListener {
            var btnfood3 = Intent(this,FoodaActivity::class.java)
            startActivity(btnfood3)
        }


    }
}