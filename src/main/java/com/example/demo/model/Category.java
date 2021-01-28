package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_categoryId;

    private String m_categoryName;

    @OneToMany
    private List<Product> m_products;
}
