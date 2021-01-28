package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_brandId;

    private String m_brandName;

    @OneToMany
    private List<Product> m_products;

}
