package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement,Long> {
}
