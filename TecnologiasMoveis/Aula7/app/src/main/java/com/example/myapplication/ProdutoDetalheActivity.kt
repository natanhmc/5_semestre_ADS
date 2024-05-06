package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProdutoDetalheActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produto_detalhe)

        // Recupera um produto passado por bundle
        val productBundle = intent.getSerializableExtra("data") as? Produto

        val name = findViewById<TextView>(R.id.tvProductName)
        val price = findViewById<TextView>(R.id.tvProductPrice)
        val image = findViewById<ImageView>(R.id.imgProduct)

        Glide.with(this).load(productBundle?.urlImage).centerCrop().into(image)
        name.text = productBundle?.name
        price.text = productBundle?.price
 }
}