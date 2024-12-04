package com.sistema.citas.ups.Model;

import java.util.Date;

import lombok.Data;

@Data
public class PacienteConsulta {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    private String diagnostico;
    /////
    /// 
    private Date fecha;
    private String detalles;
    private String signosVitales;

    private int paciente_id;

    private int medico_id;

}
