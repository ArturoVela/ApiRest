package api.rest.fisi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.CategoriasCursos;
import api.rest.fisi.api.service.ICategoriasCursosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/restful")
public class CategoriasCursosController {
    @Autowired
    private ICategoriasCursosService serviceCategoriasCursos;

    @GetMapping("/categoriacursos")
    public List<CategoriasCursos> buscarTodos() {
        return serviceCategoriasCursos.buscarTodos();
    }

    @PostMapping("/categoriacursos")
    public CategoriasCursos guardar(@RequestBody CategoriasCursos categoriasCursos) {
        serviceCategoriasCursos.guardar(categoriasCursos);
        return categoriasCursos;
    }

    @PutMapping("/categoriacursos")
    public CategoriasCursos modificar(@RequestBody CategoriasCursos categoriasCursos) {
        serviceCategoriasCursos.modificar(categoriasCursos);
        return categoriasCursos;
    }

    @GetMapping("/categoriacursos/{id}")
    public Optional<CategoriasCursos> buscarId(@PathVariable("id") Integer id) {
        return serviceCategoriasCursos.buscarId(id);
    }

    @DeleteMapping("/categoriacursos/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceCategoriasCursos.eliminar(id);
        return "Categoria de curso eliminada";
    }

}
