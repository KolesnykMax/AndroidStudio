package com.example.myproject

sealed class Shape

data class Rectangle(val width: Double, val height: Double) : Shape()

data class Oval(val radiusX: Double, val radiusY: Double) : Shape()

data class Line(val length: Double) : Shape()