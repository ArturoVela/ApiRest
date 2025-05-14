package api.rest.fisi.api.service;

import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.NaturalezasCurso;

public interface INaturalezasCursoService {
   // Listar todos los NaturalezasCurso de la tabla
    List<NaturalezasCurso> buscarTodos();
    // Guarda los NaturalezasCurso
    void guardar(NaturalezasCurso naturalezasCurso);

    void modificar(NaturalezasCurso naturalezasCurso);

    Optional<NaturalezasCurso> buscarId(Integer id);
    
    void eliminar(Integer id);
}
