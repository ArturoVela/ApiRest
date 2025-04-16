package api.rest.fisi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.Registros;
import api.rest.fisi.api.service.IRegistrosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ! Controlador REST para la entidad Registros.
 */
@RestController
/**
 * ? Define la ruta base para las peticiones a este controlador.
 */
@RequestMapping("/restful")
public class RegistrosController {

    /**
     * * Inyecta el servicio para la lógica de negocio de Registros.
     */
    @Autowired
    private IRegistrosService serviceRegistros;

    /**
     * * Endpoint para obtener todos los registros.
     */
    @GetMapping("/registros")
    public List<Registros> buscarTodos() {
        return serviceRegistros.buscarTodos();
    }

    /**
     * * Endpoint para guardar un nuevo registro.
     */
    @PostMapping("/registros")
    public Registros guardar(@RequestBody Registros registro) {
        serviceRegistros.guardar(registro);
        return registro;
    }

    /**
     * * Endpoint para modificar un registro existente.
     */
    @PutMapping("/registros")
    public Registros modificar(@RequestBody Registros registro) {
        serviceRegistros.modificar(registro);
        return registro;
    }

    /**
     * * Endpoint para obtener un registro por su ID.
     */
    @GetMapping("/registros/{id}")
    public Optional<Registros> buscarId(@PathVariable("id") Integer id) {
        return serviceRegistros.buscarId(id);
    }

    /**
     * * Endpoint para eliminar un registro por su ID.
     */
    @DeleteMapping("/registros/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceRegistros.eliminar(id);
        return "Registro eliminado con exito";
    }
}