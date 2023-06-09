package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Statement;
import com.alialsubhi.demoProject1.Models.Transaction;
import com.alialsubhi.demoProject1.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "transactions")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "getAll")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }//    }//http://localhost:8080/transactions/getAll
}
