package api.rest.fisi.api.service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.Clientes;

/**
 * ! Define los servicios (operaciones de negocio) para la entidad Clientes.
 */
public interface IClientesService {
    /**
     * * Lista todos los clientes de la tabla.
     */
    List<Clientes> buscarTodos();

    /**
     * * Guarda un nuevo cliente en la tabla.
     */
    void guardar(Clientes cliente);

    /**
     * * Modifica un cliente existente en la tabla.
     */
    void modificar(Clientes cliente);

    /**
     * * Busca un cliente por su ID.
     */
    Optional<Clientes> buscarId(Integer id);

    /**
     * * Elimina un cliente por su ID.
     */
    void eliminar(Integer id);
}