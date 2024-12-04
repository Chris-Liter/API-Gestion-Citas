package com.sistema.citas.ups.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "medico")
public class Medico{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String especialidad;
    private int usuario_id;


}
