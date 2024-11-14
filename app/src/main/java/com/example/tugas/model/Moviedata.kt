package com.example.tugas.model

data class Producer(
    val name: String,
    val photoResId: Int
)

data class Movie(
    val id: Int,
    val name: String,
    val genre: String,
    val photo: Int
)
