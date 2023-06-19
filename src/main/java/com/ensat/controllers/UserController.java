package com.ensat.controllers;

import com.ensat.entities.User;
import com.ensat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("register")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String saveUser(User user) {
        userService.saveUser(user);
        return "index";
    }

    @PostMapping("/login/{email}/{password}")
    public String handleRegistration(@PathVariable String email, @PathVariable String password, Model model) {
        if (userService.Checkfromlogin(email,password)==true){
            return "home";
        } else {
            model.addAttribute("error", "Username or password incorrect");
            return "index";
        }
    }

    
}
