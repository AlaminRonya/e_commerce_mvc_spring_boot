package com.example.e_commerce_app.repositories;

import com.example.e_commerce_app.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
