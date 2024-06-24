package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "pagos_profesores")
public class PagoEmpleados {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_EMPLEADO")
        private int idEmpleado;

        @Column(name = "CEDULA", nullable = false)
        private String cedula;

        @Column(name = "CUENTA_BANCO", nullable = false)
        private String cuentaBanco;

        @Temporal(TemporalType.DATE)
        @Column(name = "FECHA_DE_PAGO", nullable = false)
        private Date fechaDePago;

        @Column(name = "NOMBRE_COMPLETO", nullable = false)
        private String nombreCompleto;

        @Column(name = "PROCEDENCIA", nullable = false)
        private String procedencia;

        @Column(name = "SUELDO", nullable = false)
        private int sueldo;
}
