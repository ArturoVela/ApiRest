package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import api.rest.fisi.api.repository.ClientesRepository;
import api.rest.fisi.api.entity.Clientes;
import api.rest.fisi.api.service.IClientesService;

@Service

public class ClientesService implements IClientesService {
   @Autowired
   private ClientesRepository repoClientes; 

    public List<Clientes> buscarTodos() {
         return repoClientes.findAll();
    }

    public void guardar(Clientes cliente) {
        repoClientes.save(cliente);
    }
    

}