package com.example.tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.tugas.presentation.MovieApp
import com.example.tugas.ui.theme.TugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MovieApp()  // Panggil MovieApp di sini
                }
            }
        }
    }
}
