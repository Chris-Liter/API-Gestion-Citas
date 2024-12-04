package com.sistema.citas.ups.Repository;

import com.sistema.citas.ups.Model.*;

public interface IMedicoRepository {
    
    
    int confirmarCita(int id, Cita cita);
    int enviarRecordatorio(Recordatorio recordatorio);

}
