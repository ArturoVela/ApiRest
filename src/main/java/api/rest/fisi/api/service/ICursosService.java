package api.rest.fisi.api.service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.Cursos;

public interface ICursosService {
    // Listar todos los Cursos de la tabla
    List<Cursos> buscarTodos();
    // Guarda los Cursos
    void guardar(Cursos curso);
    
    void modificar(Cursos curso);

    Optional<Cursos> buscarId(Integer id);
    
    void eliminar(Integer id);
}
