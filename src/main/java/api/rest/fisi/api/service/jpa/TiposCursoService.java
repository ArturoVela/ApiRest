package api.rest.fisi.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.fisi.api.entity.TiposCurso;
import api.rest.fisi.api.repository.TiposCursoRepository;
import api.rest.fisi.api.service.ITiposCursoService;

@Service
public class TiposCursoService implements ITiposCursoService{
    @Autowired
    private TiposCursoRepository repoTiposCurso;
    public List<TiposCurso> buscarTodos(){
        return repoTiposCurso.findAll();
    }
    public void guardar(TiposCurso tiposCurso){
        repoTiposCurso.save(tiposCurso);
    }
    public void modificar(TiposCurso tiposCurso){
        repoTiposCurso.save(tiposCurso);
    }
    public Optional<TiposCurso> buscarId(Integer id){
        return repoTiposCurso.findById(id);
    }
    public void eliminar(Integer id){
        repoTiposCurso.deleteById(id);
    }

}
