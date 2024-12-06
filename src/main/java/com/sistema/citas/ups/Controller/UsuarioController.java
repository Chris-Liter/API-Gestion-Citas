package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.Consulta;
import com.sistema.citas.ups.Model.Paciente;
import com.sistema.citas.ups.Model.Usuario;
import com.sistema.citas.ups.Repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioController implements IUsuarioController{

    @Autowired
    private IUsuarioRepository rep;

    @Override
    public Usuario login(String email, String password) {
        Usuario usuario = null;
        try{
            usuario = rep.iniciarSesion(email, password);
        }catch(Exception e){
            throw e;
        }
        return usuario;
    }

    @Override
    public void cerrarSesion() {
        
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> listado = null;
        try{
            listado = rep.getAll();
        }catch(Exception e){
            throw e;
        }
        return listado;
    }

    @Override
    public int updateUsuario(Usuario usuario) {
        int row;
        try{
            row = rep.update(usuario);
        }catch(Exception e){
            throw e;
        }
        return row;
    }

    @Override
    public int crearUsuario(Usuario usuario) {
        int row = 0;
        try{
            row = rep.crearUsuario(usuario);
        }catch(Exception e){
            throw e;
        }
        return row;
    }

    @Override
    public int generarReporte(Consulta consulta, Paciente paciente) {
        int row;
        try{
            row = rep.generarReporte(consulta, paciente);
        }catch(Exception e){
            throw e;
        }
        return row;
    }

    @Override
    public int deleteUsuario(int id) {
        int row;
        try{
            row = rep.delete(id);
        }catch(Exception e){
            throw e;
        }
        return row;
    }
}
