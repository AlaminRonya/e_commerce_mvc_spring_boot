package com.example.e_commerce_app.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "admins_tbl")
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adminEmail;
    private String adminPassword;
}
