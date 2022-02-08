package com.enigma.employee.controller;

import com.enigma.employee.models.Category;
import com.enigma.employee.models.Product;
import com.enigma.employee.services.CategoryService;
import com.enigma.employee.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @PostMapping
    @CrossOrigin
    public Product saveProduct(@RequestBody Product employee){
        return productService.insert(employee);
    }

    @GetMapping
    @CrossOrigin
    public List<Product> getAllProduct(){
        return productService.getProductList();
    }

    @GetMapping("/available")
    @CrossOrigin
    public List<Product> getAllProductNonExpired(){
        return productService.getProductBeforeExp();
    }

    @GetMapping("/category")
    @CrossOrigin
    public List<Category> getAllCategory(){
        return categoryService.getCategoryList();
    }

}
