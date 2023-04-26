package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepositories extends JpaRepository <CreditCard, Long> {

}
