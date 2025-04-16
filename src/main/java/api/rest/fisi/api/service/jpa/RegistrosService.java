package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import api.rest.fisi.api.repository.RegistrosRepository;
import api.rest.fisi.api.entity.Registros;
import api.rest.fisi.api.service.IRegistrosService;

@Service

public class RegistrosService implements IRegistrosService {
   @Autowired
   private RegistrosRepository repoRegistros; 

    public List<Registros> buscarTodos() {
         return repoRegistros.findAll();
    }

    public void guardar(Registros registro) {
        repoRegistros.save(registro);
    }
    

}
// package api.rest.fisi.api.service.jpa;