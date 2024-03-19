package com.example.androidkotlin

class House {
    val houseColor: String = "red"
    val numberOfWindows: Int = 2
    val isForsale: Boolean = false

    fun updateColor() {
    }

    fun putOnSale() {
    }

}

fun main() {
    val A1 = House()
    val A2 = House()
    val A3 = House()

    println(A1.houseColor)
    println("=".repeat(50))
    println(A2.numberOfWindows)
    println("=".repeat(50))
    println(A3.isForsale)
}