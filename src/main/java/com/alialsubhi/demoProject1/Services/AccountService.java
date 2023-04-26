package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Controllers.AccountController;
import com.alialsubhi.demoProject1.Models.Account;
import com.alialsubhi.demoProject1.Models.Customer;
import com.alialsubhi.demoProject1.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

}
