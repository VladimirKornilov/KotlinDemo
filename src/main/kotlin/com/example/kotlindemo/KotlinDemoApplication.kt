package com.example.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
    println("Hello World!")
    runApplication<KotlinDemoApplication>(*args)
}