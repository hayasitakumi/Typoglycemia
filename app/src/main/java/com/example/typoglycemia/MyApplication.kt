package com.example.typoglycemia

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MyApplication : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val res = getResources()

        val ward_list = res.getStringArray(R.array.weekday)

        val ward = Ward(ward_list)

        var random_ward = ward.random()
        var shuffled_ward = ward.shuffle(random_ward)

        shuffled_ward_id.text = shuffled_ward

        answer_button_id.setOnClickListener() {

            if (input_ward_id.text.toString() == random_ward) {
                check_id.setTextColor(Color.parseColor("#FF8080"))
                check_id.text = "正解"

            } else {
                check_id.text = "不正解"
                check_id.setTextColor(Color.parseColor("#80B3FF"))
            }

            random_ward = ward.random()
            shuffled_ward = ward.shuffle(random_ward)

            shuffled_ward_id.text = shuffled_ward

        }
    }
}
