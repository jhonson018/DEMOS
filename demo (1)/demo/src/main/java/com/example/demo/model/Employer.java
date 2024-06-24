package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name="EmpleadosApec")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id_Empleado", nullable = false)
    private Long Id_Empleado;

    @Column(name = "Nombre_Completo",nullable = false)
    private String Nombre_Completo;

    @Column(name = "Cedula",nullable = false)
    private String Cedula;

    @Column(name = "Cuenta_Banco",nullable = false)
    private String Cuenta_Banco;

    @Column(name = "Sueldo",nullable = false)
    private String Sueldo;

    @Column(name = "Fecha_De_Pago",nullable = false)
    private String Fecha_De_Pago;
}
