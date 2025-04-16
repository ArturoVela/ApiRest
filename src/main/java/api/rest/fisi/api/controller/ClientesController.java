package api.rest.fisi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.Clientes;
import api.rest.fisi.api.service.IClientesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ! Controlador REST para la entidad Clientes.
 */
@RestController
/**
 * ? Define la ruta base para las peticiones a este controlador.
 */
@RequestMapping("/restful")
public class ClientesController {

    /**
     * * Inyecta el servicio para la lógica de negocio de Clientes.
     */
    @Autowired
    private IClientesService serviceClientes;

    /**
     * * Endpoint para obtener todos los clientes.
     */
    @GetMapping("/clientes")
    public List<Clientes> buscarTodos() {
        return serviceClientes.buscarTodos();
    }

    /**
     * * Endpoint para guardar un nuevo cliente.
     */
    @PostMapping("/clientes")
    public Clientes guardar(@RequestBody Clientes cliente) {
        serviceClientes.guardar(cliente);
        return cliente;
    }

    /**
     * * Endpoint para modificar un cliente existente.
     */
    @PutMapping("/clientes")
    public Clientes modificar(@RequestBody Clientes cliente) {
        serviceClientes.modificar(cliente);
        return cliente;
    }

    /**
     * * Endpoint para obtener un cliente por su ID.
     */
    @GetMapping("/clientes/{id}")
    public Optional<Clientes> buscarId(@PathVariable("id") Integer id) {
        return serviceClientes.buscarId(id);
    }

    /**
     * * Endpoint para eliminar un cliente por su ID.
     */
    @DeleteMapping("/clientes/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        serviceClientes.eliminar(id);
        return "Cliente eliminado con exito";
    }
}