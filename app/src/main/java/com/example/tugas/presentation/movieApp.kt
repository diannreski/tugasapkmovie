package com.example.tugas.presentation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.tugas.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun MovieApp() {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(selectedIndex = selectedIndex, onItemSelected = { index ->
                selectedIndex = index
            })
        }
    ) { paddingValues ->
        when (selectedIndex) {
            0 -> MovieScreenContent() // Halaman Movies
            1 -> RatingScreen()       // Halaman Rating dengan LazyVerticalGrid
            2 -> AboutScreen()        // Halaman About
        }
    }
}

@Composable
fun RatingScreen() {
    val ratings = listOf(
        "Rating Avengers: Endgame (2019) - 8.5",
        "Iron Man (2008) - 7.9",
        "Black Panther (2018) - 9.0",
        "Venom: The Last Dance (2024) - 6.8",
        "Gladiator II (2024)  - 8.1",
        "Agak Laen - 7.3",
        "Home Sweet Loan - 9.4",
        "Bila Esok Ibu Tiada - 10.10",
        "Meriposa - 8.2",
        "Terlalu Tampan - 8.8",
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(ratings) { rating ->
            Text(text = rating)
        }
    }
}

@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Back Button
        IconButton(
            onClick = { /* Handle back action */ },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Profile Image
        Surface(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterHorizontally),
            shape = CircleShape,
            color = Color.LightGray
        ) {
            Image(
                painter = painterResource(id = R.drawable.dian), // Replace with your image
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(120.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Name
        Text(
            text = "Dian Reski Amelia",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))

        // University and Program Information
        Text(
            text = "Universitas Papua",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Jurusan
        Text(
            text = "Informatika",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Contact Information Title
        Text(
            text = "Contact Person",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Email
        Text(
            text = "Email : reskidian73@gmail.com",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(4.dp))

        // Phone Number
        Text(
            text = "Telephone : 082198275787",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
