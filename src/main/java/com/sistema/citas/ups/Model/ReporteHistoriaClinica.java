package com.sistema.citas.ups.Model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "reportehistoriaclinica")
public class ReporteHistoriaClinica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@OneToMany(mappedBy = "reporteHistoriaClinica")
    private List<String> consultas;

    private List<String> diagnosticosFrecuentes;
    private int paciente_id;


}
