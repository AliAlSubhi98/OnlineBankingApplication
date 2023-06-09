package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.CreditCard;
import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Repositories.CreditCardRepositories;
import com.alialsubhi.demoProject1.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
