package com.example.demo.service.impl;

import com.example.demo.model.Brand;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository m_productRepository;

    @Override
    public Product saveProduct(Product product) {
        return (Product) m_productRepository.save(product);
    }

    @Override
    public Brand saveBrand(Brand brand) {
        return (Brand) m_productRepository.save(brand);
    }

    @Override
    public Category saveCategory(Category category) {
        return (Category) m_productRepository.save(category);
    }

    @Override
    public List<Product> getAll() {
        return m_productRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        m_productRepository.deleteById(id);
    }

    @Override
    public Product update(Long id) {
        return (Product) m_productRepository.findById(id).get();
    }

}
