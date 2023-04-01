package com.khnsoft.ratatouille.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RatatouilleServerApplication

fun main(args: Array<String>) {
    runApplication<RatatouilleServerApplication>(*args)
}
