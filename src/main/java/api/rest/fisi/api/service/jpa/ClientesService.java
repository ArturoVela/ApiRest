package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.repository.ClientesRepository;
import api.rest.fisi.api.entity.Clientes;
import api.rest.fisi.api.service.IClientesService;

/**
 * ! Indica que esta clase es un servicio de Spring.
 */
@Service
public class ClientesService implements IClientesService {

    /**
     * * Inyecta la dependencia del repositorio de Clientes.
     */
    @Autowired
    private ClientesRepository repoClientes;

    /**
     * * Implementación del método para buscar todos los clientes.
     */
    @Override
    public List<Clientes> buscarTodos() {
        return repoClientes.findAll();
    }

    /**
     * * Implementación del método para guardar un cliente.
     */
    @Override
    public void guardar(Clientes cliente) {
        repoClientes.save(cliente);
    }

    /**
     * * Implementación del método para modificar un cliente.
     */
    @Override
    public void modificar(Clientes cliente) {
        repoClientes.save(cliente);
    }

    /**
     * * Implementación del método para buscar un cliente por su ID.
     */
    @Override
    public Optional<Clientes> buscarId(Integer id) {
        return repoClientes.findById(id);
    }

    /**
     * * Implementación del método para eliminar un cliente por su ID.
     */
    @Override
    public void eliminar(Integer id) {
        repoClientes.deleteById(id);
    }
}