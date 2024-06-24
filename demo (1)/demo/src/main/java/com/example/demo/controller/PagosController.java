package com.example.demo.controller;

import com.example.demo.model.PagoEmpleados;
import com.example.demo.service.PagoEmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/unapec/api/v1/payment/")
public class PagosController {
    private final PagoEmpleadosService service;

    @Autowired
    public PagosController(PagoEmpleadosService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<PagoEmpleados>> getPagos(){
        return ResponseEntity.ok(service.getAllPagos().getBody());
    }
}
