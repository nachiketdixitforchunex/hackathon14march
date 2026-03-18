package com.hackathon.controller;

import com.hackathon.entity.Product;
import com.hackathon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts(){
        return service.getAllProducts();
    }
}
