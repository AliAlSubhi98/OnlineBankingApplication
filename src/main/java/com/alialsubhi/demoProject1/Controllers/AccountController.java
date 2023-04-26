package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Account;
import com.alialsubhi.demoProject1.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "accounts")
public class AccountController {

    @Autowired
    AccountService accountService;
    @GetMapping(value = "getAll")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }//http://localhost:8080/accounts/getAll
}
