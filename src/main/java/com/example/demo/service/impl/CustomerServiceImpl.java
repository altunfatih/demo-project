package com.example.demo.service.impl;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository m_customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return m_customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return m_customerRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        m_customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Long id) {
        return m_customerRepository.findById(id).get();
    }
}
