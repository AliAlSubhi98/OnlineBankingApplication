package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Models.Loan;
import com.alialsubhi.demoProject1.Repositories.CustomerRepository;
import com.alialsubhi.demoProject1.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
