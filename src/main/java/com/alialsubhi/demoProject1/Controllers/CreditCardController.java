package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.CreditCard;
import com.alialsubhi.demoProject1.Services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "creditCards")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;

    @GetMapping(value = "getAll")
    public List<CreditCard> getAllCreditCards() {
        return creditCardService.getAllCreditCards();
    }//    }//http://localhost:8080/creditCards/getAll


}
