package api.rest.fisi.api.service;

import java.util.List;
import java.util.Optional;
import api.rest.fisi.api.entity.CategoriasCursos;

public interface ICategoriasCursosService {
    List<CategoriasCursos> buscarTodos();
    void guardar(CategoriasCursos categoriasCursos);
    void modificar(CategoriasCursos categoriasCursos);
    Optional<CategoriasCursos> buscarId(Integer id);
    void eliminar(Integer id);
}
