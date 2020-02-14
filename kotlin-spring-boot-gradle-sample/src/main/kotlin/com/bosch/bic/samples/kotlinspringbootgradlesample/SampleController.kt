package com.bosch.bic.samples.kotlinspringbootgradlesample

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    private val logger = LoggerFactory.getLogger(SampleController::class.java)

    @GetMapping("/api/v1/messages")
    fun retrieveMessage(): ResponseEntity<String> {
        logger.info("Retrieve message")
        return ResponseEntity.ok("Hello BCX!")
    }
}
