package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long m_productId;

    private String m_productName;

    private String m_productCode;

    private double m_unitPrice;

    private int m_stock;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

}
