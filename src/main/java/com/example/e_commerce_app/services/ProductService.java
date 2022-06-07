package com.example.e_commerce_app.services;

import com.example.e_commerce_app.models.Product;
import com.example.e_commerce_app.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }
    public void removeProductById(Long id){
        productRepo.deleteById(id);
    }
    public Optional<Product> getProductById(Long id){
        return productRepo.findById(id);
    }
    public List<Product> getAllProductByCategoryId(Long id){
        return productRepo.findAllByCategory_id(id);
    }


}
