package api.rest.fisi.api.service;

import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.CategoriasCursos;

public interface ICategoriasCursosService {
    // Listar todos los Cursos de la tabla
    List<CategoriasCursos> buscarTodos();
    // Guarda los Cursos
    void guardar(CategoriasCursos curso);
    
    void modificar(CategoriasCursos curso);

    Optional<CategoriasCursos> buscarId(Integer id);
    
    void eliminar(Integer id);

}
