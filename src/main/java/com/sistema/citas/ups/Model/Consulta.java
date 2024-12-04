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
@Table(name = "consulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;
    private String detalles;
    private String signosVitales;

    private int paciente_id;

    private int medico_id;

    // @ManyToOne
    // @JoinColumn(name = "reporte_historia_clinica_id") // Ajusta el nombre de la columna si es necesario
    // private ReporteHistoriaClinica reporteHistoriaClinica;

    public String getDiagnostico() {
        return detalles;
    }
    
}
