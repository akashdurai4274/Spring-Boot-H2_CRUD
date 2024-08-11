package com.example.bootkart.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bootkart.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
