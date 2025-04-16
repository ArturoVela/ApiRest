package api.rest.fisi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.fisi.api.entity.Registros;

/**
 * ! Repositorio JPA para la entidad Registros.
 * ? Extiende de JpaRepository para heredar métodos CRUD y de paginación.
 */
public interface RegistrosRepository extends JpaRepository<Registros, Integer> {
    // * No se definen métodos adicionales aquí, JpaRepository provee los básicos.
}