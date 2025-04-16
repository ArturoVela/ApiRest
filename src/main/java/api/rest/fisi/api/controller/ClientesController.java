package api.rest.fisi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.Clientes;
import api.rest.fisi.api.service.IClientesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/restful")
public class ClientesController {

    @Autowired
    private IClientesService serviceClientes;

    @GetMapping("/clientes")
    public List<Clientes> buscarTodos() {
        return serviceClientes.buscarTodos();
    }

    @PostMapping("/clientes")
    public Clientes guardar(@RequestBody Clientes cliente) {
        serviceClientes.guardar(cliente);
        return cliente;
    }
    
 
    
    

    
}
