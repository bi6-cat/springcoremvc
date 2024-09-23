package com.example.services;

import com.example.dtos.category.CategoryDTO;
import java.util.List;

public interface CategoryService {
    List<CategoryDTO> findAll();

    CategoryDTO findById(int id);

    void save(CategoryDTO category);

    void deleteById(int id);
}
