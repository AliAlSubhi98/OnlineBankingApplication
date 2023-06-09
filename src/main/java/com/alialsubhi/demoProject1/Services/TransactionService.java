package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Statement;
import com.alialsubhi.demoProject1.Models.Transaction;
import com.alialsubhi.demoProject1.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
}
