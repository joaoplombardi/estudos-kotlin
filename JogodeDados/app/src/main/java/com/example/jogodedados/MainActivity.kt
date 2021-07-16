package com.example.jogodedados

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imgJogador1: ImageView
    lateinit var imgJogador2: ImageView

    val imgs = intArrayOf(
        R.drawable.d01,
        R.drawable.d02,
        R.drawable.d03,
        R.drawable.d04,
        R.drawable.d05,
        R.drawable.d06
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgJogador1 = findViewById(R.id.imgJogador1)
        imgJogador2 = findViewById(R.id.imgJogador2)
    }

    fun Jogar(view: View) {
        val x = Random.nextInt(imgs.size)
        val y = Random.nextInt(imgs.size)

        imgJogador1.setImageResource(imgs[x])
        imgJogador2.setImageResource(imgs[y])

        var msg = "Empatou!"

        if (x > y) msg = "Jogador 1 Venceu!"

        else if(y > x) msg = "Jogador 2 Venceu!"

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}