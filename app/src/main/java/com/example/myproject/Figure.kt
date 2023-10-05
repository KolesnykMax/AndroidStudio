package com.example.myproject

data class Figure(val width: Double, val height: Double, val color: Color) {
    val area: Double = width * height
}