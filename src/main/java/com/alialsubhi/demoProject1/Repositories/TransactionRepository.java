package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
