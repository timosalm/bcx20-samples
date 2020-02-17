package com.bosch.bic.samples.javaboschiotthingssample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ThingsController {

    private final ThingsService thingsService;

    @GetMapping("/api/v1/things/{thingId}")
    public ResponseEntity<String> retrieveThingData(@PathVariable String thingId) throws ExecutionException,
            InterruptedException {
        log.info("Retrieve thing data");
        var data = this.thingsService.retrieveThingData(thingId);
        log.info("Retrieved thing data: \"{}\"", data);
        return ResponseEntity.ok(data);
    }
}
