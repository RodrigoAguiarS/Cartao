package br.com.rodrigo.cartao.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rodrigo.cartao.R
import br.com.rodrigo.cartao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}