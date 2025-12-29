package com.springJourneyMax.Dockerize_App.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Instant;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @GetMapping
    public String hello(){
        log.info("Hello Method Called Successfully : {}", Instant.now());
        return "Hello From Dockerized Product Service App";
    }
}
