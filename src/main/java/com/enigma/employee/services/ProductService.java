package com.enigma.employee.services;


import com.enigma.employee.models.Product;

import java.util.List;

public interface
ProductService {
    List<Product> getProductList ();
    Product insert(Product product);
    List<Product> getProductBeforeExp();
}
