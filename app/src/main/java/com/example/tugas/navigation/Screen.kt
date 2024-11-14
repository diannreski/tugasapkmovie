package com.example.tugas.navigation



sealed class Screen(val route: String) {
    object MovieListScreen : Screen("movie_list")
    object MovieDetailScreen : Screen("movie_detail/{movieId}") {
        fun createRoute(movieId: Int) = "movie_detail/$movieId"
        }
}