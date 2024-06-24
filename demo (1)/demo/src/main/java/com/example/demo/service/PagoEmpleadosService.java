package com.example.demo.service;

import com.example.demo.model.PagoEmpleados;
import com.example.demo.repository.PagoEmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoEmpleadosService {

    private final PagoEmpleadosRepository empleadosRepository;
    @Autowired
    public PagoEmpleadosService(PagoEmpleadosRepository empleadosRepository) {
        this.empleadosRepository = empleadosRepository;
    }

    public ResponseEntity<List<PagoEmpleados>> getAllPagos(){
        return ResponseEntity.ok(empleadosRepository.findAll());
    }
}
