/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.CertificadoMedico;
import com.sistema.citas.ups.Model.Cita;
import com.sistema.citas.ups.Repository.IPacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jorge
 */
public class PacienteController implements IPacienteController{
    
    @Autowired
    private IPacienteRepository rep;



    @Override
    public List<Cita> verHistorialCitas(int id) {
        List<Cita> listado = null;

        try{
            listado = rep.verHistorialCitas(id);
        }catch(Exception e){
            throw e;
        }
        return listado;
    }

    @Override
    public List<CertificadoMedico> solicitarCertificado(int medico) {
        List<CertificadoMedico> certificado = null;
        try {
            certificado = rep.solicitarCertificado(medico);    
        } catch (Exception e) {
            throw e;
        }
        return certificado;
    }

    @Override
    public int crearCertificado(CertificadoMedico medico) {
        int row = 0;
        try {
            row = rep.crearCertificado(medico);
        } catch (Exception e) {
            throw e;
        }
        return row;
    }
    
    
}
