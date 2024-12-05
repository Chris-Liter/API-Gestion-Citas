/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.Cita;
import com.sistema.citas.ups.Model.Medico;
import com.sistema.citas.ups.Model.Paciente;
import com.sistema.citas.ups.Model.Recordatorio;

/**
 *
 * @author jorge
 */
public interface IMedicoController {
    
    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);
    int crearPaciente(Paciente paciente);
    int crearMedico(Medico medico);
    int crearRecordatorio(Recordatorio recordatorio);
    int programarCita(Cita cita);
    int cancelarCita(int id, Cita cita);
    
}
