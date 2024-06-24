package model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PagoNomina {
    private int idEmpleado;
    private String cedula;
    private String cuentaBanco;
    private Date fechaDePago;
    private String nombreCompleto;
    private String procedencia;
    private int sueldo;

    public PagoNomina(int idEmpleado, String cedula, String cuentaBanco, Date fechaDePago, String nombreCompleto, String procedencia, int sueldo) {
        this.idEmpleado = idEmpleado;
        this.cedula = cedula;
        this.cuentaBanco = cuentaBanco;
        this.fechaDePago = fechaDePago;
        this.nombreCompleto = nombreCompleto;
        this.procedencia = procedencia;
        this.sueldo = sueldo;
    }

    public PagoNomina() {
    }
}
