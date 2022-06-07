package com.example.e_commerce_app.repositories;

import com.example.e_commerce_app.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class UserCustomRepoImp implements UserCustomRepo{
    @Autowired
    private EntityManager entityManager;
    @Override
    public User findByUserEmailAndPassword(String email, String password) {
//        String sql = "select e from Employee e where e.firstName = :firstname";
//        final TypedQuery<Employee> query = entityManager.createQuery(sql, Employee.class);
//        query.setParameter("firstname", firstname);
//        return query.getResultList();


//        String sql = "select u from User u where u.email = :email and u.password= :password";
//        final TypedQuery<User> query = entityManager.createQuery(sql, User.class);
//        query.setParameter("email", email);
//        query.setParameter("password", password);
//        return query.getSingleResult();
        return null;
    }
}
