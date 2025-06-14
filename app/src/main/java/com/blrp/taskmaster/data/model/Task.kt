package com.blrp.taskmaster.data.model

data class Task(
    val taskId: Long,
    val taskName: String,
    val taskDetails: String,
    val taskEndDate: String,
    val taskFiles: MutableList<String> = mutableListOf()
)