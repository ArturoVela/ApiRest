package api.rest.fisi.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import api.rest.fisi.api.repository.RegistrosRepository;
import api.rest.fisi.api.entity.Registros;
import api.rest.fisi.api.service.IRegistrosService;

@Service // Indica que esta clase es un servicio de Spring
public class RegistrosService implements IRegistrosService {

    @Autowired // Inyecta una instancia de RegistrosRepository
    private RegistrosRepository repoRegistros;

    @Override
    public List<Registros> buscarTodos() {
        return repoRegistros.findAll(); // Usa el repositorio para obtener todos los registros
    }

    @Override
    public void guardar(Registros registro) {
        repoRegistros.save(registro); // Usa el repositorio para guardar un registro
    }

    @Override
    public void modificar(Registros registro) {
        repoRegistros.save(registro); // Usa el repositorio para actualizar un registro (guarda si no existe)
    }

    @Override
    public Optional<Registros> buscarId(Integer id) {
        return repoRegistros.findById(id); // Usa el repositorio para buscar un registro por su ID
    }

    @Override
    public void eliminar(Integer id) {
        repoRegistros.deleteById(id); // Usa el repositorio para eliminar un registro por su ID
    }
}