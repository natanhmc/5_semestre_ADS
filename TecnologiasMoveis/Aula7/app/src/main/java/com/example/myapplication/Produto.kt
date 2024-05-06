package com.example.myapplication

import java.io.Serializable

data class Produto(
    val urlImage : String,
    val name : String,
    val price : String
) : Serializable
