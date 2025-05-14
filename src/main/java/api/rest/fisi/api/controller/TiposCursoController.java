package api.rest.fisi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import api.rest.fisi.api.entity.TiposCurso;
import api.rest.fisi.api.service.ITiposCursoService;

@RestController
@RequestMapping("/restful")

public class TiposCursoController {
    @Autowired
    private ITiposCursoService serviceTiposCurso;

    @GetMapping("/tiposcurso")
    public List<TiposCurso> buscarTodos() {
        return serviceTiposCurso.buscarTodos();
    }

    @PostMapping("/tiposcurso")
    public TiposCurso guardar(@RequestBody TiposCurso tiposCurso) {
        serviceTiposCurso.guardar(tiposCurso);
        return tiposCurso;
    }
    @PutMapping("/tiposcurso")
    public TiposCurso modificar(@RequestBody TiposCurso tiposCurso) {
        serviceTiposCurso.modificar(tiposCurso);
        return tiposCurso;
    }
    @GetMapping("/tiposcurso/{id}")
    public Optional<TiposCurso> buscarId(@PathVariable("id") Integer id) {
        return serviceTiposCurso.buscarId(id);
    }
    @DeleteMapping("/tiposcurso/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceTiposCurso.eliminar(id);
        return "Tipo de curso eliminado";
    }
    

}
