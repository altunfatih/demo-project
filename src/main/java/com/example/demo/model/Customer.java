package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long m_customerId;

    private String m_customerName;

    private String m_customerSurname;

    private boolean m_authorization;

    private CustomerType m_customerType;
}
