package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Contratos;
import edu.pw.projetorest.repository.ContratosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Restful Contratos")
@CrossOrigin(origins = "*")
public class ContratosResource {

    @Autowired
    ContratosRepository contratosRepository;

    // Retorna lista de contratos
    @GetMapping("/contratos")
    @ApiOperation(value = "Retorna lista de contratos")
    public List<Contratos> listaContratos() {
        return contratosRepository.findAll();
    }

    // Retorna contrato por contratoId
    @GetMapping("/contratos/{contratoId}")
    @ApiOperation(value = "Retorna um registro por Id do contrato")
    public Optional<Contratos> listaContratoUnico(@PathVariable(value = "contratoId") Integer contratoId) {
        return contratosRepository.findByContratoId(contratoId);
    }

}
