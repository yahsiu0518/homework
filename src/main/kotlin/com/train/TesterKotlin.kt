package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of  ticket")
    var ticket =scanner.nextInt()
    println("Please enter number of  round trip ticket")
    var round_trip = scanner.nextInt()

    val t = TestrKotlin (ticket, round_trip)
    t.print()

}

class TestrKotlin(var ticket: Int , var round_trip: Int) {

    fun print(){
        println("單程票張數="+ticket+"\n"
                +"來回票張數="+round_trip+"\n"
                +"單程票金額=" + ticket*1000 + "\n"
                +"來回票金額=" + round_trip*2000*0.9+"\n"
                +"總折扣金額=" +((round_trip*2000)-(round_trip*2000*0.9f)));

    }

}
