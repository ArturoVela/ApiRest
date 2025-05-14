package api.rest.fisi.api.service;

import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.TiposCurso;

public interface ITiposCursoService {

    List<TiposCurso> buscarTodos();
    void guardar(TiposCurso tiposCurso);
    void modificar(TiposCurso tiposCurso);
    Optional<TiposCurso> buscarId(Integer id);
    void eliminar(Integer id);

}
