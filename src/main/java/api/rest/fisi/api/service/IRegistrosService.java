package api.rest.fisi.api.service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.Registros;

/**
 * ! Define los servicios (operaciones de negocio) para la entidad Registros.
 */
public interface IRegistrosService {
    /**
     * * Lista todos los registros de la tabla.
     */
    List<Registros> buscarTodos();

    /**
     * * Guarda un nuevo registro en la tabla.
     */
    void guardar(Registros registro);

    /**
     * * Modifica un registro existente en la tabla.
     */
    void modificar(Registros registro);

    /**
     * * Busca un registro por su ID.
     */
    Optional<Registros> buscarId(Integer id);

    /**
     * * Elimina un registro por su ID.
     */
    void eliminar(Integer id);
}