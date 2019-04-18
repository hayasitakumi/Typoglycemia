package com.example.typoglycemia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        start_button_id.setOnClickListener{
            val intent = Intent(this,MyApplication::class.java)
            startActivity(intent)
        }
    }
}
