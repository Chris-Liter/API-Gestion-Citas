package com.sistema.citas.ups.Controller;

import java.util.List;

import com.sistema.citas.ups.Model.ServiceResponse;
import com.sistema.citas.ups.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin("*")
public class UsuarioService {
    @Autowired
    private IUsuarioController controller;
    
    @PostMapping("/login/{email}/{pass}")
    public ResponseEntity<Usuario> Login(@PathVariable String email, @PathVariable String pass) {
        Usuario result = controller.login(email, pass);
        System.out.println(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("list")
    public ResponseEntity<List<Usuario>> list() {
        var result = controller.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<ServiceResponse> update(@RequestBody Usuario usuario){
        ServiceResponse serv = new ServiceResponse();
        int result = controller.updateUsuario(usuario);
        if(result == 1){
            serv.setMessage("Item actualizado");
        }
        return new ResponseEntity<>(serv, HttpStatus.OK);

    }
    

    
}