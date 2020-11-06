package edu.pw.projetorest.repository;

import edu.pw.projetorest.models.Fornecedores;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<Fornecedores, Long> {

    Optional<Fornecedores> findByFornecedorId(Integer fornecedorId);

}