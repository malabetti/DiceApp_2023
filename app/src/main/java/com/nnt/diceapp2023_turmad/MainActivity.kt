package com.nnt.diceapp2023_turmad

import android.graphics.Color.alpha
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
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
               faceSorteada = (1..4).random()
                when(faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d4_1)
                    2 -> atualizarImagem(R.drawable.d4_2)
                    3 -> atualizarImagem(R.drawable.d4_3)
                    4 -> atualizarImagem(R.drawable.d4_4)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d6 -> {
                faceSorteada = (1..6).random()
                when(faceSorteada) {
                    1 -> atualizarImagem(R.drawable.d6_1)
                    2 -> atualizarImagem(R.drawable.d6_2)
                    3 -> atualizarImagem(R.drawable.d6_3)
                    4 -> atualizarImagem(R.drawable.d6_4)
                    5 -> atualizarImagem(R.drawable.d6_5)
                    6 -> atualizarImagem(R.drawable.d6_6)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d8 -> {
                faceSorteada = (1..8).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d8_1)
                    2 -> imagem.setImageResource(R.drawable.d8_2)
                    3 -> imagem.setImageResource(R.drawable.d8_3)
                    4 -> imagem.setImageResource(R.drawable.d8_4)
                    5 -> imagem.setImageResource(R.drawable.d8_5)
                    6 -> imagem.setImageResource(R.drawable.d8_6)
                    7 -> imagem.setImageResource(R.drawable.d8_7)
                    8 -> imagem.setImageResource(R.drawable.d8_8)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d10 -> texto.text = (1..10).random().toString()
            R.id.d12 -> texto.text = (1..12).random().toString()
            R.id.d20 -> texto.text = (1..20).random().toString()
        }
    }

}