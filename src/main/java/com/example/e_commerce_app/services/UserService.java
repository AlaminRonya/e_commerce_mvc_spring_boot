package com.example.e_commerce_app.services;

import com.example.e_commerce_app.models.User;
import com.example.e_commerce_app.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void save(User user){
        userRepo.save(user);
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
