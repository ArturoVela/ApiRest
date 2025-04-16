package api.rest.fisi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import api.rest.fisi.api.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
