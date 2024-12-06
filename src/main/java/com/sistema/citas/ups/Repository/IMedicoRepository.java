package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.*;
import java.util.List;

public interface IMedicoRepository {
    
    List<Cita> verAgenda(int id);
    void registrarConsulta(Paciente paciente, Consulta consulta);
    List<CertificadoMedico> emitirCertificados(int paciente);
    
    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);
    int crearPaciente(Paciente paciente);
    int crearMedico(Medico medico);
    int crearRecordatorio(Recordatorio recordatorio);
    int crearCita(Cita cita);
    int cancelarCita(int id, Cita cita);
}
