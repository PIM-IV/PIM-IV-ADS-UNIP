package com.sha.gestaoHoteleira.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sa
 * @date 6.02.2021
 * @time 14:05
 */
@RestController
public class ApiController
{
    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("Está funcionando!");
    }
}
