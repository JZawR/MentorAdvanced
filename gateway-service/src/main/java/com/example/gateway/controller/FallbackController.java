package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Mono<String> orderServiceFallBack(){
        return Mono.just("Order Service is taking too long to respond or is down. Please try again later");
    }
}