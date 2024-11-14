package com.example.tugas.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tugas.data.DataProduser
import com.example.tugas.model.Movie
import com.example.tugas.model.Producer
import com.example.tugas.presentation.MovieItem // Import MovieItem
import com.example.tugas.presentation.ProducerItem // Import ProducerItem

@Composable
fun MovieScreenContent() {
    var selectedIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        // Konten utama
        Column(
            modifier = Modifier.weight(1f)
        ) {
            // Bagian judul "Movie"
            Text(
                text = "Movie",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            // Bagian "Produser"
            Text(
                text = "Produser",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(DataProduser.producers) { producer ->
                    ProducerItem(producer = producer)
                }
            }

            // Bagian "Movie"
            Text(
                text = "Movie",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(DataProduser.movies) { movie ->
                    MovieItem(movie = movie)
                }
            }
        }

        // Navigasi Bawah
        BottomNavigationBar(selectedIndex = selectedIndex) { index ->
            selectedIndex = index
        }
    }
}

@Composable
fun BottomNavigationBar(selectedIndex: Int, onItemSelected: (Int) -> Unit) {
    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.background
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = selectedIndex == 0,
            onClick = { onItemSelected(0) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Star, contentDescription = "Rating") },
            label = { Text("Rating") },
            selected = selectedIndex == 1,
            onClick = { onItemSelected(1) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "About") },
            label = { Text("About") },
            selected = selectedIndex == 2,
            onClick = { onItemSelected(2) }
        )
    }
}
