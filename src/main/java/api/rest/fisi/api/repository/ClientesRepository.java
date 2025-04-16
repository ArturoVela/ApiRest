package api.rest.fisi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import api.rest.fisi.api.entity.Clientes;

/**
 * ! Repositorio JPA para la entidad Clientes.
 * ? Extiende de JpaRepository para heredar métodos CRUD y de paginación.
 */
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    // * No se definen métodos adicionales aquí, JpaRepository provee los básicos.
}