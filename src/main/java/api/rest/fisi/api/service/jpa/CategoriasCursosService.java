package api.rest.fisi.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.fisi.api.entity.CategoriasCursos;
import api.rest.fisi.api.repository.CategoriasCursosRepository;
import api.rest.fisi.api.service.ICategoriasCursosService;

@Service
public class CategoriasCursosService  implements ICategoriasCursosService{
    @Autowired
    private CategoriasCursosRepository repoCategoriasCursos;
    public List<CategoriasCursos> buscarTodos(){
        return repoCategoriasCursos.findAll();
    }
    public void guardar(CategoriasCursos categoriasCursos){
        repoCategoriasCursos.save(categoriasCursos);
    }
    public void modificar(CategoriasCursos categoriasCursos){
        repoCategoriasCursos.save(categoriasCursos);
    }
    public Optional<CategoriasCursos> buscarId(Integer id){
        return repoCategoriasCursos.findById(id);
    }
    public void eliminar(Integer id){
        repoCategoriasCursos.deleteById(id);
    }

}
