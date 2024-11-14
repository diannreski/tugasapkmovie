package com.example.tugas.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas.model.Movie

@Composable
fun MovieItem(movie: Movie) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = movie.photo),
            contentDescription = movie.name,
            modifier = Modifier.size(60.dp) // Ukuran gambar lebih kecil
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = movie.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = movie.genre,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
    }
}
