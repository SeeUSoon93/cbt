package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserAPIController {

    private final UserService userService;

    @PostMapping("/signup")
    public String signup(User user){
        userService.save(user);
        return "redirect:/main";
    }

    @PostMapping("/login")
    public String login(User user){
        userService.save(user);
        return "redirect:/main";
    }
}
