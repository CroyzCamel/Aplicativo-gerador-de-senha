package com.carlyle.gerador_de_senha

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlyle.gerador_de_senha.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val alphabet = arrayOf(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T", "U", "V", "Y", "Z"
    )
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            generationRandomPassword()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun generationRandomPassword() {
        val randomLetterOne = alphabet.random()
        val randomLetterTwo = alphabet.random()

        val maxRandomNumber = 9999
        val number = random.nextInt(maxRandomNumber)

        binding.txtSenha.text = "$randomLetterOne$randomLetterTwo - $number"
    }
}