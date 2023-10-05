package com.example.myproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun second_Ex (){
        val bird = Bird("Sparrow")
        val dog = Dog("Buddy")
        val fish = Fish("Nemo")

        bird.makeSound()  //Завдання до 2-ї практичної
        bird.feed()

        dog.makeSound()
        dog.feed()
        dog.loudVoice()
        dog.quietVoice()

        fish.makeSound()
        fish.feed()
    }

    fun third_Ex(){

        val figure = Figure(10.0, 5.0, Color.RED)

        // Отримати area через геттер
        val area = figure.area

        println("Площа: $area")

        val shapes = listOf(
            Rectangle(10.0, 5.0),
            Oval(5.0, 3.0),
            Line(7.0),
            Rectangle(4.0, 6.0),
            Oval(8.0, 4.0),
            Line(9.0)
        )

        // Порахувати кількість Rectangle, Oval та Line за допомогою фільтрації списку
        val rectangleCount = shapes.filterIsInstance<Rectangle>().count()
        val ovalCount = shapes.filterIsInstance<Oval>().count()
        val lineCount = shapes.filterIsInstance<Line>().count()

        println("Кількість Rectangle: $rectangleCount")
        println("Кількість Oval: $ovalCount")
        println("Кількість Line: $lineCount")

        // Порахувати кількість Rectangle, Oval та Line за допомогою when в циклі списку
        var rectangleCount2 = 0
        var ovalCount2 = 0
        var lineCount2 = 0

        for (shape in shapes) {
            when (shape) {
                is Rectangle -> rectangleCount2++
                is Oval -> ovalCount2++
                is Line -> lineCount2++
            }
        }

        println("Кількість Rectangle (за допомогою when): $rectangleCount2")
        println("Кількість Oval (за допомогою when): $ovalCount2")
        println("Кількість Line (за допомогою when): $lineCount2")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //second_Ex() //Друге завдання

        third_Ex() //Трете завдання

    }

}


//for commit on branch