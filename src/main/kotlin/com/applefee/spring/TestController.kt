package com.applefee.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class TestController {

    @GetMapping("/hello")
    fun hello(): Mono<Map<String, String>> {
        return Mono.just(mapOf("title" to "applefee.com WebFlux!"))
    }
}