package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Models.Investment;
import com.alialsubhi.demoProject1.Services.CustomerService;
import com.alialsubhi.demoProject1.Services.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "investments")
public class InvestmentController {

    @Autowired
    InvestmentService investmentService;
    @GetMapping(value = "getAll")
    public List<Investment> getAllCustomers() {
        return investmentService.getAllInvestments();
    }//    }//http://localhost:8080/investments/getAll
}
