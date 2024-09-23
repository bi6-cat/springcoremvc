package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "home/index";
    }

    @GetMapping("/about")
    public String about(){
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "home/contact";
    }

    @GetMapping("/categories")
    public String service(){
        return "home/categories";
    }

    @GetMapping("/products")
    public String product(){
        return "home/products";
    }
}
