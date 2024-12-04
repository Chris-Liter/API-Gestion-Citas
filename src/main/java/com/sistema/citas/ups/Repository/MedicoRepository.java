package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.Cita;
import com.sistema.citas.ups.Model.Recordatorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MedicoRepository implements IMedicoRepository {

    @Autowired
    private JdbcTemplate jdbc;
    
    @Override
    public int confirmarCita(int id, Cita cita) {
        String sql = "UPDATE cita set fecha = ?, hora = ?, estado = ?, paciente_id = ?, medico = ? where id = ?";
        try {
            System.out.println("Cita creada con éxito.");
            return jdbc.update(sql, cita.getFecha(), cita.getHora(), cita.getHora(), cita.getPaciente_id(), cita.getMedico_id(), id);
            
        } catch (DataAccessException e) {
            System.err.println("Error al insertar el medico: " + e.getMessage());
            return 0;
        }
    }

    
    @Override
    public int enviarRecordatorio(Recordatorio recordatorio) {
        String sql = "INSERT INTO recordatorio(fechaenvio, mensaje, cita_id) VALUES (?, ?, ?)";
        String verificarCedula = "SELECT * FROM recordatorio where id = ?";
        List<Recordatorio> ced = jdbc.query(verificarCedula, new Object[]{recordatorio.getId()}, new BeanPropertyRowMapper<>(Recordatorio.class));
        if(ced.size() <= 0){
            return jdbc.update(sql, recordatorio.getFechaEnvio(), recordatorio.getMensaje(), recordatorio.getCita_id());
        }
        return 0;
    }

    @Override
    public int crearMedico(Medico medico) {
        String sql = "INSERT INTO medico(especialidad, usuario_id) VALUES (?, ?)";
        try {
            System.out.println("Usuario creado con éxito.");
            return jdbc.update(sql, medico.getEspecialidad(), medico.getUsuario_id());
            
        } catch (DataAccessException e) {
            System.err.println("Error al insertar el medico: " + e.getMessage());
            return 0;
        }
    }


    @Override
    public int crearCita(Cita cita) {
        String sql = "INSERT INTO cita(fecha, hora, estado, paciente_id, medico_id) VALUES (?, ?, ?, ?, ?)";
        try {
            System.out.println("Cita creada con éxito.");
            return jdbc.update(sql, cita.getFecha(), cita.getHora(), cita.getHora(), cita.getPaciente_id(), cita.getMedico_id());
            
        } catch (DataAccessException e) {
            System.err.println("Error al insertar el medico: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public int crearRecordatorio(Recordatorio recordatorio) {
        String sql = "INSERT INTO recordatorio(fechaenvio, mensaje, cita_id) VALUES (?, ?, ?)";
        try {
            System.out.println("Recoratorio creado con éxito.");
            return jdbc.update(sql, recordatorio.getFechaEnvio(), recordatorio.getMensaje(), recordatorio.getCita_id());
            
        } catch (DataAccessException e) {
            System.err.println("Error al insertar el medico: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public int crearPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente(nombre, apellido, cedula, telefono, direccion, correo, diagnostico) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String verificarCedula = "SELECT * FROM paciente where cedula = ?";
        List<Paciente> ced = jdbc.query(verificarCedula, new Object[]{paciente.getCedula()}, new BeanPropertyRowMapper<>(Paciente.class));
        if(ced.size() <= 0){
            return jdbc.update(sql, paciente.getNombre(), paciente.getApellido(), paciente.getCedula(), paciente.getTelefono(), paciente.getDireccion(), paciente.getCorreo(), paciente.getDiagnostico());
        }
        return 0;
    }

    @Override
    public int cancelarCita(int id, Cita cita) {
        String sql = "UPDATE cita set fecha = ?, hora = ?, estado = ?, paciente_id = ?, medico = ? where id = ?";
        try {
            System.out.println("Cita creada con éxito.");
            return jdbc.update(sql, cita.getFecha(), cita.getHora(), cita.getHora(), cita.getPaciente_id(), cita.getMedico_id(), id);
            
        } catch (DataAccessException e) {
            System.err.println("Error al insertar el medico: " + e.getMessage());
            return 0;
        }
    }
    
}
