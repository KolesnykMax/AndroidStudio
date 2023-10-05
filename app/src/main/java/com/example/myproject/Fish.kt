package com.example.myproject

class Fish(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name makes underwater sounds")
    }
}