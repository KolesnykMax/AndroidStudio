package com.example.myproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bird = Bird("Sparrow")
        val dog = Dog("Buddy")
        val fish = Fish("Nemo")

        /*bird.makeSound()  //Завдання до 2-ї практичної
        bird.feed()

        dog.makeSound()
        dog.feed()
        dog.loudVoice()
        dog.quietVoice()

        fish.makeSound()
        fish.feed()*/


    }

}


//for commit on branch