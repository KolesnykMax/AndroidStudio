package com.example.myproject

class Bird(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name chirps")
    }
}