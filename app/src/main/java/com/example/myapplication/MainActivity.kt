package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            var btn1 = Intent(this,MenuaActivity::class.java)
            startActivity(btn1)
        }
        button2.setOnClickListener {
            var btn2 = Intent(this,MenubActivity::class.java)
            startActivity(btn2)
        }
        button3.setOnClickListener {
            var btn3 = Intent(this,MenucActivity::class.java)
            startActivity(btn3)
        }



    }

}
