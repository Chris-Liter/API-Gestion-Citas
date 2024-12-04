package com.sistema.citas.ups.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "certificadomedico")
public class CertificadoMedico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int paciente_id;

    private int medico_id;

    private String descripcionEnfermedad;
    private Date fechaEmision;
    private Date fechaVencimiento;
}
