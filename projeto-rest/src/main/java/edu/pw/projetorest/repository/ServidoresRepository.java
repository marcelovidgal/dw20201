package edu.pw.projetorest.repository;

import edu.pw.projetorest.models.Servidores;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServidoresRepository extends JpaRepository<Servidores, Long> {

    Optional<Servidores> findByServidorId(Integer servidorId);

}
