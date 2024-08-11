package com.example.bootkart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data                //creating the POJO setup
@AllArgsConstructor //creating Constructor
@NoArgsConstructor
public class Product {
    @Id 
    private int productId;
    private String productName;
    private int price;
}
