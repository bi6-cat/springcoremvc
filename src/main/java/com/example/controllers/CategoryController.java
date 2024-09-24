package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.services.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String index(Model model){
        var categories = categoryService.findAll();
        model.addAttribute("categories",categories);
        return "category/index";
    }

    @GetMapping("/create")
    public String create(){
        return "category/create";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        categoryService.deleteById(id);
        return "redirect:/category";
    }
}
