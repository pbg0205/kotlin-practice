package com.cooper.practice.basic.nullable

fun main() {
    val student1 = NullableStudent()
    student1.printName()

    val student2 = NullableStudent("cooper")
    student2.printName()
}