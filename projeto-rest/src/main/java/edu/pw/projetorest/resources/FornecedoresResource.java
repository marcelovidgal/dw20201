package edu.pw.projetorest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Fornecedores;
import edu.pw.projetorest.repository.FornecedoresRepository;

@RestController
@RequestMapping(value = "/api")
public class FornecedoresResource {

    @Autowired
    FornecedoresRepository fornecedoresRepository;

    @GetMapping("/fornecedores")
    public List<Fornecedores> listaFornecedores() {
        return (List<Fornecedores>) fornecedoresRepository.findAll();
    }
}