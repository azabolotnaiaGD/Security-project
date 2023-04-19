package com.security.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authenticated")
public class AuthenticatedController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String greeting(Authentication authentication) {
        String userName = authentication.getName();
        return "Spring Security In-memory Authentication Example - Welcome " + userName;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void post() {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put() {
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete() {
    }
}
