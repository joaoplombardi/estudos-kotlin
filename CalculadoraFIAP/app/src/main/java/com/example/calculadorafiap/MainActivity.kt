package com.example.calculadorafiap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var edtNumero01: EditText
    lateinit var edtNumero02: EditText
    lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero01 = findViewById(R.id.edtNumero01)
        edtNumero02 = findViewById(R.id.edtNumero02)
        txtResultado = findViewById(R.id.txtResultado)


    }


    fun validar(numero01: String, numero02: String) : Boolean{
        if (numero01.trim().isEmpty()){
            Toast.makeText(this, "Informe corretamente o primeiro número inteiro",
                Toast.LENGTH_SHORT).show()
            return false
        }

        if (numero02.trim().isEmpty()){
            Toast.makeText(this, "Informe corretamente o segundo número inteiro",
                Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    fun somar(view: View) {

        val strNumero01 = edtNumero01.text.toString()
        val strNumero02 = edtNumero02.text.toString()

        if (! validar(strNumero01, strNumero02)) {
            return
        }

        try {
            txtResultado.text = "A soma atual é: ${strNumero01.toInt() + strNumero02.toInt()}"
        } catch (e: Exception) {
            Toast.makeText(
                this,
                "Não foi possível somar os valores informados",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}