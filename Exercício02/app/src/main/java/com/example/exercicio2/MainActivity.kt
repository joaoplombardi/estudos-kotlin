package com.example.exercicio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imageView01: ImageView
    lateinit var imageView02: ImageView

    var controller = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView01 = findViewById(R.id.imageView01)
        imageView02 = findViewById(R.id.imageView02)
    }

    fun trocarImagens(view: View) {
        this.controller = !this.controller

        val img01 = if (controller) R.drawable.quimica else R.drawable.artista
        val img02 = if (controller) R.drawable.artista else R.drawable.quimica

        imageView01.setImageResource(img01)
        imageView02.setImageResource(img02)
    }
}