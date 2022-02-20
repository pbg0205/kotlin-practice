package com.cooper.practice.basic.nullable

import java.util.*

class NullableStudent(private val name: String? = null) {

    //elvis 연산자를 사용하면 null 값이 존재할 경우, 메서드를 실행하지 않는다.
    fun printName() {
        println(name?.uppercase(Locale.getDefault()))
    }

}