package com.example.przygotowaniedokolosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dbH = MyDatabaseHelper(this)

        button1.setOnClickListener{
            var I = Intent(this, Main2Activity::class.java)
            dbH.apply {
                insert(etImiona.text.toString())
            }

            startActivity(I)
        }
    }
}
