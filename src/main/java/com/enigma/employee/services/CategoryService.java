package com.enigma.employee.services;

import com.enigma.employee.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategoryList ();
    Category getById(String id);
    Category insert(Category category);
}
