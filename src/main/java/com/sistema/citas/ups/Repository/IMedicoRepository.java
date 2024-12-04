package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.*;

public interface IMedicoRepository {
    
    
    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);
    int crearPaciente(Paciente paciente);
    int crearMedico(Medico medico);
    int crearRecordatorio(Recordatorio recordatorio);
    int crearCita(Cita cita);
    int cancelarCita(int id, Cita cita);
}
