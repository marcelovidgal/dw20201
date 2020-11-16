package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Servidores;
import edu.pw.projetorest.repository.ServidoresRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Restful Servidores")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class ServidoresResource {
    @Autowired
    ServidoresRepository servidoresRepository;

    // Retorna lista de servidores
    @GetMapping("/servidores")
    @ApiOperation(value = "Retorna lista de servidores")
    public List<Servidores> listaServidores() {
        return servidoresRepository.findAll();
    }

    // Retorna servidor por servidorId
    @GetMapping("/servidores/{servidorId}")
    @ApiOperation(value = "Retorna um registro por Id do servidor")
    public Optional<Servidores> listaServidorUnico(@PathVariable(value = "servidorId") Integer servidorId) {
        return servidoresRepository.findByServidorId(servidorId);
    }

}
