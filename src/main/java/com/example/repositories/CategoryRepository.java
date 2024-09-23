package com.example.repositories;

import java.util.List;

import com.example.entities.Category;

public interface CategoryRepository {
    List<Category> findAll();

    Category findById(int id);

    void save(Category category);

    void deleteById(int id);
}
