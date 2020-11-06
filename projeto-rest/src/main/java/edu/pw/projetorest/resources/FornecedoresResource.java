package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Fornecedores;
import edu.pw.projetorest.repository.FornecedoresRepository;

@RestController
@RequestMapping(value = "/api")
public class FornecedoresResource {

    @Autowired
    FornecedoresRepository fornecedoresRepository;

    // Retorna lista de fornecedores
    @GetMapping("/fornecedores")
    public List<Fornecedores> listaFornecedores() {
        return fornecedoresRepository.findAll();
    }

    // Retorna fornecedor por fornecedorId
    @GetMapping("/fornecedores/{fornecedorId}")
    public Optional<Fornecedores> listaFornecedorUnico(@PathVariable(value = "fornecedorId") Integer fornecedorId) {
        return fornecedoresRepository.findByFornecedorId(fornecedorId);
    }

}