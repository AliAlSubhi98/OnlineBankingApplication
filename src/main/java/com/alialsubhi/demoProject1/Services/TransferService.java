package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Transaction;
import com.alialsubhi.demoProject1.Models.Transfer;
import com.alialsubhi.demoProject1.Repositories.TransactionRepository;
import com.alialsubhi.demoProject1.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    @Autowired
    TransferRepository transferRepository;

    public List<Transfer> getAllTransfers(){
        return transferRepository.findAll();
    }
}
