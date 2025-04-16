package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.repository.RegistrosRepository;
import api.rest.fisi.api.entity.Registros;
import api.rest.fisi.api.service.IRegistrosService;

/**
 * ! Indica que esta clase es un servicio de Spring.
 */
@Service
public class RegistrosService implements IRegistrosService {

    /**
     * * Inyecta la dependencia del repositorio de Registros.
     */
    @Autowired
    private RegistrosRepository repoRegistros;

    /**
     * * Implementación del método para buscar todos los registros.
     */
    @Override
    public List<Registros> buscarTodos() {
        return repoRegistros.findAll();
    }

    /**
     * * Implementación del método para guardar un registro.
     */
    @Override
    public void guardar(Registros registro) {
        repoRegistros.save(registro);
    }

    /**
     * * Implementación del método para modificar un registro.
     */
    @Override
    public void modificar(Registros registro) {
        repoRegistros.save(registro);
    }

    /**
     * * Implementación del método para buscar un registro por su ID.
     */
    @Override
    public Optional<Registros> buscarId(Integer id) {
        return repoRegistros.findById(id);
    }

    /**
     * * Implementación del método para eliminar un registro por su ID.
     */
    @Override
    public void eliminar(Integer id) {
        repoRegistros.deleteById(id);
    }
}