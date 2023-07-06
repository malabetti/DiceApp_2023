package com.nnt.diceapp2023_turmad

import android.graphics.Color.alpha
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.chip.ChipGroup
import com.nnt.diceapp2023_turmad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var estaAnimando = false
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botao.setOnClickListener {lancarDado(binding.textoView, binding.chipGroup, binding.imageView)}
    }

    private fun atualizarImagem(idDaImagem: Int) {
        if(!estaAnimando) {
            estaAnimando = true
            binding.imageView.animate().apply {
                duration = 500
                //scaleY(0f)
                scaleX(0f)
                alpha(0f)
            }.withEndAction {
                binding.imageView.animate().apply {
                    duration = 500
                    //scaleY(1f)
                    scaleX(1f)
                    alpha(1f)
                }
                binding.imageView.setImageResource(idDaImagem)
                estaAnimando = false
            }.start()
        }
    }

    private fun lancarDado(texto: TextView, grupoDeDados: ChipGroup, imagem: ImageView) {
        val faceSorteada: Int
        when(grupoDeDados.checkedChipId) {
            R.id.d4 -> {
               Toast.makeText(this, "Dado 4", Toast.LENGTH_SHORT).show()
               faceSorteada = (1..4).random()
                when(faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d4_1)
                    2 -> atualizarImagem(R.drawable.d4_2)
                    3 -> atualizarImagem(R.drawable.d4_3)
                    4 -> atualizarImagem(R.drawable.d4_4)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }
            R.id.d6 -> {
                Toast.makeText(this, "Dado 6", Toast.LENGTH_SHORT).show()
                faceSorteada = (1..6).random()
                when(faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d6_1)
                    2 -> atualizarImagem(R.drawable.d6_2)
                    3 -> atualizarImagem(R.drawable.d6_3)
                    4 -> atualizarImagem(R.drawable.d6_4)
                    5 -> atualizarImagem(R.drawable.d6_5)
                    6 -> atualizarImagem(R.drawable.d6_6)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }
            R.id.d8 -> {
                Toast.makeText(this, "Dado 8", Toast.LENGTH_SHORT).show()
                faceSorteada = (1..8).random()
                when(faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d8_1)
                    2 -> atualizarImagem(R.drawable.d8_2)
                    3 -> atualizarImagem(R.drawable.d8_3)
                    4 -> atualizarImagem(R.drawable.d8_4)
                    5 -> atualizarImagem(R.drawable.d8_5)
                    6 -> atualizarImagem(R.drawable.d8_6)
                    7 -> atualizarImagem(R.drawable.d8_7)
                    8 -> atualizarImagem(R.drawable.d8_8)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }
            R.id.d10 -> {
                Toast.makeText(this, "Dado 10", Toast.LENGTH_SHORT).show()
                faceSorteada = (1..10).random()
                when (faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d10_1)
                    2 -> atualizarImagem(R.drawable.d10_2)
                    3 -> atualizarImagem(R.drawable.d10_3)
                    4 -> atualizarImagem(R.drawable.d10_4)
                    5 -> atualizarImagem(R.drawable.d10_5)
                    6 -> atualizarImagem(R.drawable.d10_6)
                    7 -> atualizarImagem(R.drawable.d10_7)
                    8 -> atualizarImagem(R.drawable.d10_8)
                    9 -> atualizarImagem(R.drawable.d10_9)
                    10 -> atualizarImagem(R.drawable.d10_10)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }

            R.id.d12 -> {
                Toast.makeText(this, "Dado 12", Toast.LENGTH_SHORT).show()
                faceSorteada = (1..12).random()
                when (faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d12_1)
                    2 -> atualizarImagem(R.drawable.d12_2)
                    3 -> atualizarImagem(R.drawable.d12_3)
                    4 -> atualizarImagem(R.drawable.d12_4)
                    5 -> atualizarImagem(R.drawable.d12_5)
                    6 -> atualizarImagem(R.drawable.d12_6)
                    7 -> atualizarImagem(R.drawable.d12_7)
                    8 -> atualizarImagem(R.drawable.d12_8)
                    9 -> atualizarImagem(R.drawable.d12_9)
                    10 -> atualizarImagem(R.drawable.d12_10)
                    11 -> atualizarImagem(R.drawable.d12_11)
                    12 -> atualizarImagem(R.drawable.d12_12)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }

            R.id.d20 -> {
                Toast.makeText(this, "Dado 20", Toast.LENGTH_SHORT).show()
                faceSorteada = (1..20).random()
                when (faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d20_1)
                    2 -> atualizarImagem(R.drawable.d20_2)
                    3 -> atualizarImagem(R.drawable.d20_3)
                    4 -> atualizarImagem(R.drawable.d20_4)
                    5 -> atualizarImagem(R.drawable.d20_5)
                    6 -> atualizarImagem(R.drawable.d20_6)
                    7 -> atualizarImagem(R.drawable.d20_7)
                    8 -> atualizarImagem(R.drawable.d20_8)
                    9 -> atualizarImagem(R.drawable.d20_9)
                    10 -> atualizarImagem(R.drawable.d20_10)
                    11 -> atualizarImagem(R.drawable.d20_11)
                    12 -> atualizarImagem(R.drawable.d20_12)
                    13 -> atualizarImagem(R.drawable.d20_13)
                    14 -> atualizarImagem(R.drawable.d20_14)
                    15 -> atualizarImagem(R.drawable.d20_15)
                    16 -> atualizarImagem(R.drawable.d20_16)
                    17 -> atualizarImagem(R.drawable.d20_17)
                    18 -> atualizarImagem(R.drawable.d20_18)
                    19 -> atualizarImagem(R.drawable.d20_19)
                    20 -> atualizarImagem(R.drawable.d20_20)
                }
                Toast.makeText(this, "Sorteado: $faceSorteada", Toast.LENGTH_SHORT).show()
                texto.text = faceSorteada.toString()
            }

            //R.id.d10 -> texto.text = (1..10).random().toString()
            //R.id.d12 -> texto.text = (1..12).random().toString()
            //R.id.d20 -> texto.text = (1..20).random().toString()
        }
    }

}