package com.security.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void get() {}

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void post() {}

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void put() {}

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete() {}
}
