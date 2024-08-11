package com.example.bootkart.service;

import java.util.*;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.bootkart.model.Product;
import com.example.bootkart.repository.ProductRepo;

@Service
@Component
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public void getProductById(int prodId) {
        repo.findById(prodId).orElse(new Product(prodId, null, prodId));
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
    
      /* public List<Product> products =new ArrayList<>( Arrays.asList(
            new Product(101, "HP-Laptop-15s", 60000),
            new Product(102, "Cannon-DSLR", 25000),
            new Product(103, "Motorola-G13", 15000)
      ));
      
      public List<Product> getProducts(){
            return products;
      }
      
      public Product getProductsById(int prodId){
            return products.stream()
            .filter(p-> p.getProductId() == prodId)
            .findFirst().orElse(new Product(100, "No Product", 0));
            
      }
      
      public void addProduct(Product prod){
            products.add(prod);
      }
      
      public void updateProduct(Product prod) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getProductId() == prod.getProductId()) {
                products.set(i, prod);
                }
            }
      }
      
      public void deleteProduct(int prodId) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getProductId() == prodId) {
                products.remove(i);
                }
            }
      } */
     
}
