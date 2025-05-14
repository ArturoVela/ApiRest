package api.rest.fisi.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.NaturalezasCurso;
import api.rest.fisi.api.service.INaturalezasCursoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/restful")

public class NaturalezasCursoController {
   @Autowired
    private INaturalezasCursoService serviceNaturalezasCurso; 
    @GetMapping("/naturalezascurso")
    public List<NaturalezasCurso> buscarTodos() {
        return serviceNaturalezasCurso.buscarTodos();
    }
    @PostMapping("/naturalezascurso")
    public NaturalezasCurso guardar(@RequestBody NaturalezasCurso naturalezasCurso) {
        serviceNaturalezasCurso.guardar(naturalezasCurso);
        return naturalezasCurso;
    }
    @PutMapping("/naturalezascurso")
    public NaturalezasCurso modificar(@RequestBody NaturalezasCurso naturalezasCurso) {
        serviceNaturalezasCurso.modificar(naturalezasCurso);
        return naturalezasCurso;
    }
    @GetMapping("/naturalezascurso/{id}")
    public Optional<NaturalezasCurso> buscarId(@PathVariable("id") Integer id) {
        return serviceNaturalezasCurso.buscarId(id);
    }
    @DeleteMapping("/naturalezascurso/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceNaturalezasCurso.eliminar(id);
        return "Naturaleza de curso eliminada";
    }

}
