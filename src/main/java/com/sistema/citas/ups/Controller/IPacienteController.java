/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.CertificadoMedico;
import com.sistema.citas.ups.Model.Cita;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface IPacienteController {
    List<Cita> verHistorialCitas(int id);
    List<CertificadoMedico> solicitarCertificado(int medico);
    int crearCertificado(CertificadoMedico medico);
    
}
