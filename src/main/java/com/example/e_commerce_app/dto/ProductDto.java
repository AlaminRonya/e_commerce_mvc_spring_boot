package com.example.e_commerce_app.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Long categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
