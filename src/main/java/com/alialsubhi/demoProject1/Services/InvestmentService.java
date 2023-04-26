package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Models.Investment;
import com.alialsubhi.demoProject1.Repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    @Autowired
    InvestmentRepository investmentRepository;


    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }
}
