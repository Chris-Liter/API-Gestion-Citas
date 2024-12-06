/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.CertificadoMedico;
import com.sistema.citas.ups.Model.Cita;
import com.sistema.citas.ups.Model.Consulta;
import com.sistema.citas.ups.Model.Medico;
import com.sistema.citas.ups.Model.Paciente;
import com.sistema.citas.ups.Model.Recordatorio;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface IMedicoController {
    
    List<Cita> verAgenda(int id);
    void registrarConsulta(Paciente paciente, Consulta consulta);
    List<CertificadoMedico> emitirCertificados(int paciente);

    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);
    int crearPaciente(Paciente paciente);
    int crearMedico(Medico medico);
    int crearRecordatorio(Recordatorio recordatorio);
    int programarCita(Cita cita);
    int cancelarCita(int id, Cita cita);
    
}
