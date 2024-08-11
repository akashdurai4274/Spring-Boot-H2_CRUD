package com.example.bootkart.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bootkart.model.Product;
import com.example.bootkart.service.ProductService;


@RestController
public class ProductController {

    @Autowired
    ProductService service;
    
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public void getSingleProducts(@PathVariable int prodId) {
        service.getProductById(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
        return "Product added Successfully!!";
    }
    
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
        return "Product Updated successfully!!";
    }

    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
        return "Product Deleted Successfully!!";
    }
}
