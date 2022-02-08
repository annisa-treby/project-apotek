package com.enigma.employee.services;

import com.enigma.employee.models.Product;
import com.enigma.employee.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductBeforeExp() {
        List<Product> productList = productRepository.findAll();
        List<Product> availableProduct = productList.stream().filter(product -> product.getExpiredDate().after(new Date())).collect(Collectors.toList());
        return availableProduct;
    }


    @Override
    public Product insert(Product product) {
        return productRepository.save(product);
    }

}
