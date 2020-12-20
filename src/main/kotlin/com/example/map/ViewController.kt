package com.example.map

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ViewController {
    @GetMapping(value = ["/"])
    fun index(): String {
        return "index"
    }
}
