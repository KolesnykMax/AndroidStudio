package com.example.myproject

open class Animal(protected val name: String) {
    private var isHungry = true

    open fun makeSound() {
        println("$name makes a sound")
    }

    fun feed() {
        isHungry = false
        println("$name is now fed")
    }
}