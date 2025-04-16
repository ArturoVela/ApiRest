package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.repository.ClientesRepository;
import api.rest.fisi.api.entity.Clientes;
import api.rest.fisi.api.service.IClientesService;

@Service

public class ClientesService implements IClientesService {
   @Autowired
   private ClientesRepository repoClientes; 

    @Override
    public List<Clientes> buscarTodos() {
         return repoClientes.findAll();
    }
    @Override
    public void guardar(Clientes cliente) {
        repoClientes.save(cliente);
    }
    @Override
    public void modificar(Clientes cliente) {
        repoClientes.save(cliente);
    }
    @Override
    public Optional<Clientes> buscarId(Integer id) {
        return repoClientes.findById(id);
    }
    @Override
    public void eliminar(Integer id) {
        repoClientes.deleteById(id);
    }

}