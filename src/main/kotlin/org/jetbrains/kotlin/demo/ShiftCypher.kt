package org.jetbrains.kotlin.demo

class ShiftCypher {

    fun encode(shift: Int, message: String): String {
        val offset = shift % 26
        if (offset == 0) return message
        var d: Char
        val chars = CharArray(message.length)
        for ((index, c) in message.withIndex()) {
            if (c in 'A'..'Z') {
                d = c + offset
                if (d > 'Z') d -= 26
            }
            else if (c in 'a'..'z') {
                d = c + offset
                if (d > 'z') d -= 26
            }
            else
                d = c
            chars[index] = d
        }
        return chars.joinToString("")
    }
}