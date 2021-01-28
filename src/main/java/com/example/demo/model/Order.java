package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long m_orderId;

    @ManyToOne
    private Customer m_customerId;

    @ManyToOne
    private Product m_productId;

    private int m_quantity;

}
