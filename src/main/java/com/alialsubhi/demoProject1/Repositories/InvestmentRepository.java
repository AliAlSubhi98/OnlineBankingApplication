package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment,Long> {
}
