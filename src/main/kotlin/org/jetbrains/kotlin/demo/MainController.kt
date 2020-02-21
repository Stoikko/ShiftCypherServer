package org.jetbrains.kotlin.demo

import org.springframework.web.bind.annotation.*

@RestController
class MainController {

    private val cypher: ShiftCypher = ShiftCypher()
    private val fileSaver: FileSaver = FileSaver()

    @PostMapping("/api/encode")
    fun greeting(@RequestBody payload: Payload): Response{
        val encodedMessage = cypher.encode(payload.Shift, payload.Message)
        fileSaver.saveMessageToFile(encodedMessage)
        return Response(encodedMessage)
    }


}