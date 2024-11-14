package com.example.tugas.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tugas.model.Producer

@Composable
fun ProducerItem(producer: Producer) {
    Column(
        modifier = Modifier
            .width(120.dp)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = producer.photoResId),
            contentDescription = producer.name,
            modifier = Modifier
                .size(80.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = producer.name,
            style = MaterialTheme.typography.bodySmall
        )
    }
}
