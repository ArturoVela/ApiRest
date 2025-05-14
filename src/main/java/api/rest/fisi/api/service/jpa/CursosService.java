package api.rest.fisi.api.service.jpa;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import api.rest.fisi.api.entity.Cursos;
import api.rest.fisi.api.repository.CursosRepository;
import api.rest.fisi.api.service.ICursosService;

@Service
public class CursosService implements ICursosService {
    @Autowired
    private CursosRepository repoCursos;
    public List<Cursos> buscarTodos(){
        return repoCursos.findAll();
    }
    public Cursos guardar(Cursos curso){
         return repoCursos.save(curso);
    }
    public Cursos modificar(Cursos curso){
        return repoCursos.save(curso);
    }
    public Optional<Cursos> buscarId(Integer id){
        return repoCursos.findById(id);
    }
    public void eliminar(Integer id){
        repoCursos.deleteById(id);
    }
}
