package com.sistema.citas.ups.Repository;


import com.sistema.citas.ups.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository implements IUsuarioRepository{

    @Autowired
    private JdbcTemplate jdbc;
    
    @Override
    public Usuario iniciarSesion(String email, String password) {
        String sql = "SELECT * FROM usuario where email = ? and pass = ?";
        return jdbc.queryForObject(sql, new Object[]{email, password}, new BeanPropertyRowMapper<>(Usuario.class));
    }

    @Override
    public void cerrarSesion() {
        
        throw new UnsupportedOperationException("Unimplemented method 'cerrarSesion'");
    }

    @Override
    public List<Usuario> getAll() {
        String sql = "SELECT * FROM usuario";
        return jdbc.query(sql, BeanPropertyRowMapper.newInstance(Usuario.class));
    }

    @Override
    public int update(Usuario usuario) {
        String sql = "UPDATE usuario set nombre = ?, apellido = ?, telefono = ?, direccion = ?, email = ?, pass = ? where id = ?";
        try {
            System.out.println("Usuario creado con éxito.");
            return jdbc.update(sql, usuario.getNombre(), usuario.getApellido(), usuario.getTelefono(), usuario.getDireccion(), usuario.getEmail(), usuario.getPass(), usuario.getId());

        } catch (DataAccessException e) {
            System.err.println("Error al insertar el usuario: " + e.getMessage());
            return 0;
        }
    }


}
