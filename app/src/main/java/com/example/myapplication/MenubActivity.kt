package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menufood1.*
import kotlinx.android.synthetic.main.menufood2.*

class MenubActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menufood2)
        bottomfoodb1.setOnClickListener {
            var btnfood1 = Intent(this,Food_b1Activity::class.java)
            startActivity(btnfood1)
        }
        bottomfoodb2.setOnClickListener {
            var btnfood2 = Intent(this,Food_b2Activity::class.java)
            startActivity(btnfood2)
        }
        bottomfoodb3.setOnClickListener {
            var btnfood3 = Intent(this,Food_b3Activity::class.java)
            startActivity(btnfood3)
        }


    }
}