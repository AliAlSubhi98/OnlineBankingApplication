package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Investment;
import com.alialsubhi.demoProject1.Models.Loan;
import com.alialsubhi.demoProject1.Services.InvestmentService;
import com.alialsubhi.demoProject1.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "loans")
public class LoanController {

    @Autowired
    LoanService loanService;
    @GetMapping(value = "getAll")
    public List<Loan> getAllCustomers() {
        return loanService.getAllLoans();
    }//    }//http://localhost:8080/loans/getAll
}
