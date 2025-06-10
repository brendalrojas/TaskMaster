package com.blrp.taskmaster.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.blrp.taskmaster.R

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFDAD5C1))
                    .height(50.dp)
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(8.dp),
                    model = R.drawable.user,
                    contentDescription = "user",
                    contentScale = ContentScale.Crop,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFFFFF))
                    .height(30.dp)
                    .padding(horizontal = 8.dp),
            ) {}
        }
        AsyncImage(
            modifier = Modifier
                .size(60.dp)
                .padding(start = 16.dp),
            model = R.drawable.planner,
            contentDescription = "planner",
            contentScale = ContentScale.Fit,
        )
    }
}

@Preview
@Composable
fun HeaderPreview() {
    Header()
}