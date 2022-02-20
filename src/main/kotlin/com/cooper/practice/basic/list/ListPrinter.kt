package com.cooper.practice.basic.list

class ListPrinter {

    fun print(list: List<Int>) {
        println("------start----------")
        for (i in list) {
            println(i)
        }
        println("-------end-----------")
    }
}