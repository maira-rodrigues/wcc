package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)
        val dado1: ImageView = findViewById(R.id.dado1)
        val dado2: ImageView = findViewById(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            val numero: Int = lancarDados()
            dado1.setImageResource(escolherImagem(numero))
        }
    }

    fun escolherImagem(numero: Int): Int{
        when(numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun lancarDados(): Int{
        return (1..6).random()
    }
    
    fun doWhenClickOnButton(){
        //todo
    }
}