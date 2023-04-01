package com.khnsoft.ratatouille.server.test.controller

import com.khnsoft.ratatouille.server.test.dto.UserDto
import org.springframework.web.bind.annotation.*

@RestController
class AccessTestController {

    @GetMapping("ping")
    fun ping(): String {
        return "pong"
    }

    @PostMapping("testBody")
    fun testBody(@RequestBody user: UserDto): String {
        return user.name
    }

    @GetMapping("testUrl/{name}")
    fun testUrl(@PathVariable("name") name: String): String {
        return name
    }

    @GetMapping("testParam")
    fun testParam(@RequestParam("name") name: String): String {
        return name
    }
}