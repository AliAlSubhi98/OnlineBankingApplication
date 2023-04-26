package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {
}
