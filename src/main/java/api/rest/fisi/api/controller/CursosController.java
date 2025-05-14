package api.rest.fisi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.fisi.api.entity.CategoriasCursos;
import api.rest.fisi.api.entity.Cursos;
import api.rest.fisi.api.entity.CursosDTO;
import api.rest.fisi.api.entity.NaturalezasCurso;
import api.rest.fisi.api.entity.TiposCurso;
import api.rest.fisi.api.repository.CategoriasCursosRepository;
import api.rest.fisi.api.repository.NaturalezasCursoRepository;
import api.rest.fisi.api.repository.TiposCursoRepository;
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

    @Autowired
    private TiposCursoRepository repoTiposCurso;

    @Autowired
    private NaturalezasCursoRepository repoNaturalezasCurso;

    @Autowired
    private CategoriasCursosRepository repoCategoriasCursos;

    @GetMapping("/cursos")
    public List<Cursos> buscarTodos() {
        return serviceCursos.buscarTodos();
    }

    @PostMapping("/cursos")
    public ResponseEntity<?> guardar(@RequestBody CursosDTO dto) {
        Cursos curso = new Cursos();
        curso.setDescripcion(dto.getDescripcion());
        TiposCurso tipo = repoTiposCurso.findById(dto.getId_tipo()).orElse(null);
        NaturalezasCurso naturaleza = repoNaturalezasCurso.findById(dto.getId_naturaleza()).orElse(null);
        CategoriasCursos categoria = repoCategoriasCursos.findById(dto.getId_categoria()).orElse(null);

        curso.setId_tipo(tipo);
        curso.setId_naturaleza(naturaleza);
        curso.setId_categoria(categoria);

        return ResponseEntity.ok(serviceCursos.guardar(curso));

    }

    @PutMapping("/cursos")
    public ResponseEntity<?> modificar(@RequestBody CursosDTO dto) {
        if (dto.getIdcurso() == null) {
            return ResponseEntity.badRequest().body("El idcurso no puede ser nulo");
        }

        Cursos curso = new Cursos();
        curso.setIdcurso(dto.getIdcurso());
        curso.setDescripcion(dto.getDescripcion());  
        curso.setId_tipo(new TiposCurso(dto.getId_tipo()));
        curso.setId_naturaleza(new NaturalezasCurso(dto.getId_naturaleza()));
        curso.setId_categoria(new CategoriasCursos(dto.getId_categoria()));

        return ResponseEntity.ok(serviceCursos.modificar(curso));

    }

    @GetMapping("/cursos/{id}")
    public Optional<Cursos> buscarId(@PathVariable("id") Integer id) {
        return serviceCursos.buscarId(id);
    }

    @DeleteMapping("/cursos/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceCursos.eliminar(id);
        return "curso eliminado";
    }
}