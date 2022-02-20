package com.cooper.practice.basic.list

fun main() {
    val listPrinter = ListPrinter()

    val immutableList = ListPractice(listOf(1, 2, 3))
    listPrinter.print(immutableList.getList())

    val mutableList = MutablePractice(mutableListOf())
    mutableList.add(2)
    mutableList.add(4)
    mutableList.add(6)
    listPrinter.print(mutableList.getList())
}