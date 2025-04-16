package api.rest.fisi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.fisi.api.entity.Registros;

public interface RegistrosRepository extends JpaRepository <Registros, Integer> {
 }
