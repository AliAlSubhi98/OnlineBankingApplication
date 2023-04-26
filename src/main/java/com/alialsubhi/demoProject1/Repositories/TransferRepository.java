package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer,Long> {
}
