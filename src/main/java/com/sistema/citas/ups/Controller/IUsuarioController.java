package com.sistema.citas.ups.Controller;

import java.util.List;

import com.sistema.citas.ups.Model.Usuario;

public interface IUsuarioController {
    Usuario login(String email, String password);
    void cerrarSesion();
    List<Usuario> getAll();
    int updateUsuario(Usuario usuario);
}
