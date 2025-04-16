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

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/restful") // Mapea las peticiones HTTP con la ruta base "/restful"
public class RegistrosController {

    @Autowired // Inyecta una instancia de IRegistrosService
    private IRegistrosService serviceRegistros;

    @GetMapping("/registros") // Mapea las peticiones GET a "/restful/registros"
    public List<Registros> buscarTodos() {
        return serviceRegistros.buscarTodos(); // Llama al servicio para obtener todos los registros
    }

    @PostMapping("/registros") // Mapea las peticiones POST a "/restful/registros"
    public Registros guardar(@RequestBody Registros registro) {
        serviceRegistros.guardar(registro); // Llama al servicio para guardar un nuevo registro
        return registro; // Devuelve el registro guardado
    }

    @PutMapping("/registros") // Mapea las peticiones PUT a "/restful/registros"
    public Registros modificar(@RequestBody Registros registro) {
        serviceRegistros.modificar(registro); // Llama al servicio para modificar un registro existente
        return registro; // Devuelve el registro modificado
    }

    @GetMapping("/registros/{id}") 
    public Optional<Registros> buscarId(@PathVariable("id") Integer id) {
        return serviceRegistros.buscarId(id); }

    @DeleteMapping("/registros/{id}") // Mapea las peticiones DELETE a "/restful/registros/{id}"
    public String eliminar(@PathVariable Integer id) {
        serviceRegistros.eliminar(id); // Llama al servicio para eliminar un registro por su ID
        return "Registro eliminado con exito"; // Devuelve un mensaje de éxito
    }
}