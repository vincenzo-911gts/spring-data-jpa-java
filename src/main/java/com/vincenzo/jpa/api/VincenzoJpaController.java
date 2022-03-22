package com.vincenzo.jpa.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/vincenzo/jpa")
@RestController
public class VincenzoJpaController {

    @GetMapping("/bmw")
    public ResponseEntity<String> test() {

        return ResponseEntity.ok().body("BMW");
    }
}
