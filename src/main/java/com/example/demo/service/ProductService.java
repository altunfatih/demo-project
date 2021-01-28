package com.example.demo.service;

import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    Object saveProduct(Product product);

    Brand saveBrand(Brand brand);

    Category saveCategory(Category category);

    List<Product> getAll();

    void deleteById(Long id);

    Product update(Long id);

}
