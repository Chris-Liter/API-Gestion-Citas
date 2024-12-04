/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.CertificadoMedico;
import com.sistema.citas.ups.Model.Cita;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface IPacienteRepository {
    List<Cita> verHistorialCitas(int id);
    List<CertificadoMedico> solicitarCertificado(int medico);
    int crearCertificado(CertificadoMedico medico);
}
