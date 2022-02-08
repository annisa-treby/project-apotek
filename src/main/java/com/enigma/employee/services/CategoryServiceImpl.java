package com.enigma.employee.services;

import com.enigma.employee.models.Category;
import com.enigma.employee.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(String id) {
        return null;
    }

    @Override
    public Category insert(Category category) {
        return categoryRepository.save(category);
    }
}
