package com.example.sistemamedico

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform