package com.example.tugas.data


import com.example.tugas.R
import com.example.tugas.model.Movie

object DummyData {
    val movies = listOf(
        Movie(
            id = 1,
            name = "Avengers: Endgame (2019)",
            genre = "Action",
            photo = R.drawable.avengers
        ),
        Movie(
            id = 2,
            name = "Iron Man (2008)",
            genre = "Sci-Fi",
            photo = R.drawable.iron
        ),
        Movie(
            id = 3,
            name = "Black Panther (2018)",
            genre = "Action",
            photo = R.drawable.black
        ),
        Movie(
            id = 4,
            name = "Venom: The Last Dance (2024)",
            genre = "Action",
            photo = R.drawable.venom
        ),
        Movie(
            id = 5,
            name = "Gladiator II (2024)",
            genre = "Action",
            photo = R.drawable.gladi
        ),
        Movie(
            id = 6,
            name = "Agak Laen",
            genre = "Action",
            photo = R.drawable.laen
        ),
        Movie(
            id = 7,
            name = "Home Sweet Loan",
            genre = "Action",
            photo = R.drawable.home
        ),
        Movie(
            id = 8,
            name = "Bila Esok Ibu Tiada",
            genre = "Action",
            photo = R.drawable.ibu
        ),
        Movie(
            id = 9,
            name = "Mariposa",
            genre = "Action",
            photo = R.drawable.mariposa
        ),
        Movie(
            id = 10,
            name = "Terlalu Tampan",
            genre = "Action",
            photo = R.drawable.terlalu
        )
    )

}
