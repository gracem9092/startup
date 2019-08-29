package com.climate.startup.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
public class StartupController {

    @GetMapping(path = "/startup", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<StartupResources> getMessage(@RequestParam(required = false) String word) {
        log.info("Incoming GET query, with a param {}", word);
        String message = "Your word is : " + word;
        StartupResources build = StartupResources.builder()
                .startupResource(StartupResources.StartupResource.builder()
                        .message(message)
                        .build())
                .build();
        return ResponseEntity.ok(build);

    }
}
