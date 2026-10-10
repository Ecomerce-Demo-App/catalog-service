package com.catalog.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(1, "Laptop", 1500),
                new Product(2, "Phone", 800),
                new Product(3, "Keyboard", 50)
        );
    }
}

record Product(
        int id,
        String name,
        double price
) {}
