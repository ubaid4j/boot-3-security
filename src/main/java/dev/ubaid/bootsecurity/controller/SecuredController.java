package dev.ubaid.bootsecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class SecuredController {
    @GetMapping
    public ResponseEntity<String> helloWorld() {
        log.debug("----------------------------Incoming Requests------------------------");
        return ResponseEntity.ok("Hello World and it is secured");
    }
}
