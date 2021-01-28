package com.example.demo.service.impl;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository m_orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return m_orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return m_orderRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        m_orderRepository.deleteById(id);
    }

    @Override
    public Order update(Long id) {
        return m_orderRepository.findById(id).get();
    }
}
