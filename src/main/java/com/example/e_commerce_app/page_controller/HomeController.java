package com.example.e_commerce_app.page_controller;

import com.example.e_commerce_app.global_data.GlobalData;
import com.example.e_commerce_app.services.CategoryService;
import com.example.e_commerce_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public String page(){
        GlobalData.cart.clear();
        return "index";
    }

    @GetMapping("/home")
    public String home(@ModelAttribute("username") String name){
        System.out.println(name);
        return "home";
    }
    @PostMapping("/playBtn")
    public String checkout_back(@ModelAttribute("username") String name){
        return "home";
    }

    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shopByCategory(Model model, @PathVariable long id){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductByCategoryId(id));
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable long id){
        model.addAttribute("products", productService.getProductById(id).get());
        return "viewProduct";
    }



}
