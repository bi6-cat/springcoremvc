package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
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
