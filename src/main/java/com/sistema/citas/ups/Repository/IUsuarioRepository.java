package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.Usuario;

import java.util.List;

public interface IUsuarioRepository {
    Usuario iniciarSesion(String email, String password);
    void cerrarSesion();
    List<Usuario> getAll();
    int update(Usuario usuario);
}
