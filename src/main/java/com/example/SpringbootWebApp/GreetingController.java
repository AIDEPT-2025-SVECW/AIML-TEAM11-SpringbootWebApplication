package com.example.SpringbootWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "! Welcome to Spring Boot!");
        return "result";
    }
}
