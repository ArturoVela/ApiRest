package api.rest.fisi.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.fisi.api.entity.NaturalezasCurso;
import api.rest.fisi.api.repository.NaturalezasCursoRepository;
import api.rest.fisi.api.service.INaturalezasCursoService;

@Service
public class NaturalezasCursoService implements INaturalezasCursoService{ 

     @Autowired
     private NaturalezasCursoRepository repoNaturalezasCurso;
        public List<NaturalezasCurso> buscarTodos(){
            return repoNaturalezasCurso.findAll();
        }
        public void guardar(NaturalezasCurso naturalezasCurso){
            repoNaturalezasCurso.save(naturalezasCurso);
        }
        public void modificar(NaturalezasCurso naturalezasCurso){
            repoNaturalezasCurso.save(naturalezasCurso);
        }
        public Optional<NaturalezasCurso> buscarId(Integer id){
            return repoNaturalezasCurso.findById(id);
        }
        public void eliminar(Integer id){
            repoNaturalezasCurso.deleteById(id);
        }


}
