package com.example.productionapi.api.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productions")
public class ProductRestController {

    @GetMapping
    public String selectAllProduction(){
        return "production";
    }
}
