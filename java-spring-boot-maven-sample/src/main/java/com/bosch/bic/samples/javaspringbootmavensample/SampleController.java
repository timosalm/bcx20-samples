package com.bosch.bic.samples.javaspringbootmavensample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/api/v1/messages")
    public ResponseEntity<String> retrieveMessage() {
        logger.info("Retrieve message");
        return ResponseEntity.ok("Hello BCX!");
    }
}
