package com.blrp.taskmaster.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.blrp.taskmaster.R
import com.blrp.taskmaster.data.model.Task

@Composable
fun TaskItem(
   //task: Task, onTaskCompleted: (Boolean) -> Unit, onClick: () -> Unit,
) {
    val checked = remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checked.value,
                onCheckedChange = { checked.value = it }
            )
            Text(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                text = "Eat vegetables",
                fontStyle = FontStyle.Normal,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(
                    0xFF000000
                )
            )
        }
        AsyncImage(
            modifier = Modifier
                .size(20.dp),
            model = R.drawable.folder,
            contentDescription = "user",
            contentScale = ContentScale.Crop,
        )
    }
}