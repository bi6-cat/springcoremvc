package com.example.services;

import com.example.dtos.category.CategoryDTO;
import com.example.entities.Category;
import com.example.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepository.findAll().stream()
            .map(category -> new CategoryDTO(category.getId(), category.getName(), category.getDescription()))
            .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO findById(int id) {
        Category category = categoryRepository.findById(id);
        if (category == null) {
            throw new RuntimeException("Category not found");
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        return categoryDTO;
    }

    @Override
    public void save(CategoryDTO category) {
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setDescription(category.getDescription());
        categoryRepository.save(newCategory);
    }

    @Override
    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }
}
