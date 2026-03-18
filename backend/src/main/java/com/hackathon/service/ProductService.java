package com.hackathon.service;

import com.hackathon.entity.Product;
import com.hackathon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getAllProducts() {
        try {
            Thread.sleep(50);
        } catch (Exception ignored) {}

        return repository.findAll();
    }
}
