package api.rest.fisi.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.rest.fisi.api.entity.Cursos;
import api.rest.fisi.api.service.ICursosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/restful")
public class CursosController {
    @Autowired
    private ICursosService serviceCursos;

    @GetMapping("/cursos")
    public List<Cursos> buscarTodos() {
        return serviceCursos.buscarTodos();
    }
    @PostMapping("/cursos")
    public Cursos guardar(@RequestBody Cursos curso) {
       serviceCursos.guardar(curso);        
       return curso;
    }
    @PutMapping("/cursos")
    public Cursos modificar(@RequestBody Cursos curso) {
        serviceCursos.modificar(curso);
        return curso;
    }
    @GetMapping("/cursos/{id}")
    public Optional<Cursos> buscarId(@PathVariable("idcurso") Integer idcurso){
        return serviceCursos.buscarId(idcurso);
    }
    @DeleteMapping("/cursos/{id}")
    public String eliminar(@PathVariable Integer idcurso){
        serviceCursos.eliminar(idcurso);
        return "curso eliminado";
    }
}