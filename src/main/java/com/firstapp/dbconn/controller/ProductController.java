package com.firstapp.dbconn.controller;

import com.firstapp.dbconn.entity.Product;
import com.firstapp.dbconn.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public List<Product> addProducts(
            @RequestBody List<Product> products) {

        return productRepository.saveAll(products);
    }
}