package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.buildSpannedString
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.menufood1.*


class MenuaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menufood1)

        bottomfa1.setOnClickListener {
            var btnfood1 = Intent(this,FoodaActivity::class.java)
            startActivity(btnfood1)
        }
        bottomfooda2.setOnClickListener {
            var btnfood2 = Intent(this,Food_a2Activity::class.java)
            startActivity(btnfood2)
        }
        bottomfooda3.setOnClickListener {
            var btnfood3 = Intent(this,Food_a3Activity::class.java)
            startActivity(btnfood3)
        }


    }
}