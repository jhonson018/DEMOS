package com.example.demo.controller;

import com.example.demo.model.Employer;
import com.example.demo.service.EmployerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/unapec/api/v1/employee/")

public class EmployerController {
    private final EmployerService service;

    public EmployerController(EmployerService service) {
        this.service = service;
    }
    @GetMapping("")
    public ResponseEntity<List<Employer>> getEmployer(){

        return new ResponseEntity<>(service.cashAllEmployer(), HttpStatus.OK);

    }


}
