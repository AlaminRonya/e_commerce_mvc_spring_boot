package com.example.e_commerce_app.page_controller;

import com.example.e_commerce_app.dto.LoginDto;
import com.example.e_commerce_app.dto.UserDto;
import com.example.e_commerce_app.models.User;
import com.example.e_commerce_app.services.AdminsServices;
import com.example.e_commerce_app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminsServices adminsServices;



    @GetMapping("/login")
    public String viewLoginPage(@ModelAttribute("loginDto") LoginDto loginDto){
        return "login";
    }

    @PostMapping("/login")
    public String  vLoginPage(@ModelAttribute("loginDto") LoginDto loginDto, RedirectAttributes redirectAttributes){
        if (adminsServices.getAdmins(loginDto.getEmail(), loginDto.getPassword())){
            return "redirect:/admin";
        }else {

            for (User user: userService.getAllUser()){
                if (user.getEmail().equals(loginDto.getEmail()) && user.getPassword().equals(loginDto.getPassword())){
                    redirectAttributes.addFlashAttribute("username", user.getEmail());
                    return "redirect:/home";
                }
            }
            return "login";

        }


    }


    @GetMapping("/register")
    public String v_register(@ModelAttribute("userDto") UserDto userDto){
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("userDto") UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userService.save(user);
        return "register";
    }
}
