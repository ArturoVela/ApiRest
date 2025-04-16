package api.rest.fisi.api.service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.entity.Clientes;
public interface IClientesService {
    // listar Clientes de la tabla
    List<Clientes> buscarTodos();

    // Guardar los Clientes
    void guardar(Clientes cliente);

    void modificar(Clientes cliente);

    Optional<Clientes> buscarId(Integer id);

    void eliminar(Integer id);
}