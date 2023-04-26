package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Account;
import com.alialsubhi.demoProject1.Models.CreditCard;
import com.alialsubhi.demoProject1.Repositories.CreditCardRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    CreditCardRepositories creditCardRepositories;

    public List<CreditCard> getAllCreditCards() {
        return creditCardRepositories.findAll();
    }

}
