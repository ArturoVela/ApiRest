package api.rest.fisi.api.service;
import java.util.List;
import api.rest.fisi.api.entity.Clientes;
public interface IClientesService {
    // listar Clientes de la tabla
    List<Clientes> buscarTodos();

    // Guardar los Clientes
    void guardar(Clientes cliente);
}