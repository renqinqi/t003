package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users2")
public class UserController2 {
    private UserService userService;
    @GetMapping
    public String findById(Model model){
        User userData=userService.findById(7);
        model.addAttribute("u",userData);
        return "user2";
    }
}
