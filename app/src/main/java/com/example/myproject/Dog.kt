package com.example.myproject

class Dog(name: String) : Animal(name), Voice {
    override fun makeSound() {
        println("$name barks")
    }

    override fun loudVoice() {
        println("$name barks loudly")
    }

    override fun quietVoice() {
        println("$name barks quietly")
    }
}