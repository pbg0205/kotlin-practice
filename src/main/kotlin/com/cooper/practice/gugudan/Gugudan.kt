package com.cooper.practice.gugudan

class Gugudan(val number: Int) {

    fun print() {
        for (count in 1..9) {
            println("$number x $count = " + count * number)
        }
    }

}