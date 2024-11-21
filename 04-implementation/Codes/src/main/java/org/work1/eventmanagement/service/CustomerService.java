package org.work1.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.work1.eventmanagement.entity.Customer;
import org.work1.eventmanagement.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll(); // 使用实例对象
    }

    public Customer getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email); // 使用实例对象
    }
}
