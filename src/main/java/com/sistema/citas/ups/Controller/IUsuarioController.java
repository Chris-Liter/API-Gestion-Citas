package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.Consulta;
import com.sistema.citas.ups.Model.Paciente;
import java.util.List;

import com.sistema.citas.ups.Model.Usuario;

public interface IUsuarioController {
    Usuario login(String email, String password);
    void cerrarSesion();
    List<Usuario> getAll();
    int updateUsuario(Usuario usuario);
    int crearUsuario(Usuario usuario);
    int generarReporte(Consulta consulta, Paciente paciente);
    int deleteUsuario(int id);
}
