package com.cooper.practice.basic.list

class MutablePractice (private val list : MutableList<Int>) {

    fun getList() : MutableList<Int> {
        return list
    }

    fun add(a: Int) {
        list.add(a)
    }
}