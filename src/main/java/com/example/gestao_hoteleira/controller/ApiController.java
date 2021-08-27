package com.example.gestao_hoteleira.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("api/health")
    public ResponseEntity<?> healtCheck() {
    return ResponseEntity.ok("Está funcionando!");
    }
}
