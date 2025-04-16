package api.rest.fisi.api.service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.Registros;

public interface IRegistrosService {
    // Lista todos los registros
    List<Registros> buscarTodos();

    // Guarda un registro
    void guardar(Registros registro);

    // Modifica un registro
    void modificar(Registros registro);

    // Busca un registro por ID
    Optional<Registros> buscarId(Integer id);

    // Elimina un registro por ID
    void eliminar(Integer id);
}