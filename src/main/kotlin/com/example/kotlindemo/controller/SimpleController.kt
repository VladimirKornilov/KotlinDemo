package com.example.kotlindemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping
    fun greetings(): String {
        return "Hello World!"
    }
}


