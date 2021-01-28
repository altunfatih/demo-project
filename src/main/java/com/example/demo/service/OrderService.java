package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderService {

    Order saveOrder(Order order);

    List<Order> getAll();

    void deleteById(Long id);

    Order update(Long id);
}
