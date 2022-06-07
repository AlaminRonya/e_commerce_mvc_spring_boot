package com.example.e_commerce_app.services;

import com.example.e_commerce_app.models.Category;
import com.example.e_commerce_app.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }

    public void addCategory(Category category){
        categoryRepo.save(category);
    }

    public void removeCategory(Long id) {
        categoryRepo.deleteById(id);
    }

    public Optional<Category> getCategoryById(Long id){
        return categoryRepo.findById(id);
    }
}
