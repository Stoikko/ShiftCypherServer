package org.jetbrains.kotlin.demo

import java.io.File

class FileSaver {

    fun saveMessageToFile(message: String){
        val currentTime = System.currentTimeMillis()
        val fileName = "message_$currentTime.txt"
        File(fileName).writeText(message)
    }
}