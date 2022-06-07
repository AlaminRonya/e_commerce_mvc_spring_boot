package com.example.e_commerce_app.repositories;

import com.example.e_commerce_app.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCustomRepo {
    User findByUserEmailAndPassword(String email, String password);
}
