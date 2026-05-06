package com.example.horalocalapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform