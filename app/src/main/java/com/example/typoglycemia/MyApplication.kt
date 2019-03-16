package com.example.typoglycemia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
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

//        var i = 0
//        while (i < ward.count()) {
//            Log.d("TAG", ward[i].toString())
//            i++
//        }

//        for(i in 0..ward.count()){
//            Log.d("TAG", i.toString())
////            Log.d("TAG", ward[i].toString())
//        }


        //Log.d("TAG", ward.count().toString())

//        random_ward.text = ward
//
        answer_button_id.setOnClickListener() {

            if (input_ward_id.text.toString() == random_ward) {
                check_id.text = "正解"
            } else {
                check_id.text = "不正解"
            }

            random_ward = ward.random()
            shuffled_ward = ward.shuffle(random_ward)

            shuffled_ward_id.text = shuffled_ward

        }
    }
}
