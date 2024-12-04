/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.citas.ups.Controller;

import com.sistema.citas.ups.Model.Cita;
import com.sistema.citas.ups.Model.Recordatorio;

/**
 *
 * @author jorge
 */
public interface IMedicoController {
    
    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);
    
}
