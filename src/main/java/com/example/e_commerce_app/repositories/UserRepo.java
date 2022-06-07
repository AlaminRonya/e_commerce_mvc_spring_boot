package com.example.e_commerce_app.repositories;

import com.example.e_commerce_app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
//    boolean finByUserEmailAndPassword(String email, String password);
}
