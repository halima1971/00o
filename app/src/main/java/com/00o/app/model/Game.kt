package com.00o.app.model

data class Game(
    val name: String,
    val url: String,
    val timestamp: Long = System.currentTimeMillis()
)
