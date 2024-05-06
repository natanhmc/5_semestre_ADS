package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.reView)

        val listOfProduto = mainViewModel.getProdutos()
        val adapter = ProdutoAdapter(listOfProduto){
            irParaDetalhes(it)
        }

        recycler.adapter = adapter
    }
    private fun irParaDetalhes(item: Produto) {
        Intent(this, ProdutoDetalheActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }
}