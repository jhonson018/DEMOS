package com.example.demo.controller;

import com.example.demo.model.PagoEmpleados;
import com.example.demo.service.PagoEmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/unapec/api/v1/payment/")
public class PagosController {
    private final PagoEmpleadosService service;
    private final RestTemplate restTemplate;

    @Autowired
    public PagosController(PagoEmpleadosService service, RestTemplate restTemplate) {
        this.service = service;
        this.restTemplate = restTemplate;
    }

    @GetMapping("")
    public ResponseEntity<List<PagoEmpleados>> getPagos(){
        return ResponseEntity.ok(service.getAllPagos().getBody());
    }

}
