package com.cooper.practice.gugudan

fun main() {
    val number = readLine()!!.toInt()
    val gugudan = Gugudan(number)
    gugudan.print()
}
