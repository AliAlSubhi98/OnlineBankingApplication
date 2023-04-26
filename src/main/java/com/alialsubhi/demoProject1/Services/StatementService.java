package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Statement;
import com.alialsubhi.demoProject1.Repositories.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {

    @Autowired
    StatementRepository statementRepository;

    public List<Statement> getAllStatements(){
        return statementRepository.findAll();
    }
}
