package com.example.e_commerce_app.global_data;

import com.example.e_commerce_app.models.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<>();
    }
}
