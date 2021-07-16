package com.example.exerccio01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgvProficoes: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgvProficoes = findViewById(R.id.imgvProficoes)
    }
    fun mudarImagem(view: View) {
        imgvProficoes.setImageResource(
            when(view.id){
            R.id.btnMatematica -> R.drawable.matematica
            R.id.btnQuimica -> R.drawable.quimica
            R.id.btnArtista -> R.drawable.artista
            else -> R.drawable.padrao
        })
    }
}