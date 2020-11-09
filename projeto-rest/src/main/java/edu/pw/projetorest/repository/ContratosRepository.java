package edu.pw.projetorest.repository;

import edu.pw.projetorest.models.Contratos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratosRepository extends JpaRepository<Contratos, Long> {

    Optional<Contratos> findByContratoId(Integer contratoId);

}