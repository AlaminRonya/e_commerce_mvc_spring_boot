package com.example.e_commerce_app.repositories;

import com.example.e_commerce_app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_id(Long id);
}
