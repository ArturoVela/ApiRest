package api.rest.fisi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.fisi.api.entity.NaturalezasCurso;
public interface NaturalezasCursoRepository extends JpaRepository<NaturalezasCurso, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
