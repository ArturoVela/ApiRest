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
    public void guardar(Cursos curso){
        repoCursos.save(curso);
    }
    public void modificar(Cursos curso){
        repoCursos.save(curso);
    }
    public Optional<Cursos> buscarId(Integer idcurso){
        return repoCursos.findById(idcurso);
    }
    public void eliminar(Integer idcurso){
        repoCursos.deleteById(idcurso);
    }
}
