package com.example.demo.service;

import com.example.demo.model.Employer;
import com.example.demo.repository.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployerService {
    private final EmployerRepository repository;

    public EmployerService(EmployerRepository repository) {
        this.repository = repository;
    }

    public List<Employer> cashAllEmployer(){
        return repository.findAll();
    }
}
