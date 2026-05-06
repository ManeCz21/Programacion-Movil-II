package com.example.horalocalapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "HoraLocalApp",
    ) {
        App()
    }
}