package com.example.e_commerce_app.services;

import com.example.e_commerce_app.models.Admins;
import com.example.e_commerce_app.repositories.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminsServices {
    @Autowired
    private AdminsRepository adminsRepository;

    public boolean getAdmins(String email, String password){
        return checkAdmins(email, password);
    }

    public void addAdmins(String email, String password){
        Admins admins = new Admins();
        admins.setAdminEmail(email);
        admins.setAdminPassword(password);
        adminsRepository.save(admins);
    }

    private boolean checkAdmins(String email, String password) {
        List<Admins> admins = new ArrayList<>(adminsRepository.findAll());
        for (Admins a: admins){
            if (email.equals(a.getAdminEmail()) && password.equals(a.getAdminPassword())){
                return true;
            }
        }
        return false;
    }
}
