package com.example.typoglycemia

import android.util.Log
import java.util.*

class Ward(wards: Array<String>) {
    val wards = wards

    fun random(): String {
        val rand = Random()
        var randomInt = rand.nextInt(wards.count())
        val ward = wards[randomInt]

        return ward
    }

    fun shuffle(ward: String): String {

        val list: List<Int> = (1..ward.count()-2).toList()
        val shuffled: List<Int> = list.shuffled()

        val shuffled_list = mutableListOf<Int>(0)
        shuffled_list += shuffled
        shuffled_list += mutableListOf<Int>(ward.count()-1)

        var shuffled_ward = charArrayOf()

        for (i in shuffled_list){
            shuffled_ward += ward[i]
        }

        return String(shuffled_ward)
    }
}