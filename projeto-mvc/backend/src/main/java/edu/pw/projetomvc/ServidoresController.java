package edu.pw.projetomvc;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import edu.pw.projetomvc.repository.*;
import edu.pw.projetomvc.entity.*;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping(path="/servidores")
public class ServidoresController {

	private ServidoresRepository servidoresRepository;

	public ServidoresController(ServidoresRepository servidoresRepository) {
		//super();
		this.servidoresRepository = servidoresRepository;
	}

	//@GetMapping("/greeting")
	//public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	//	model.addAttribute("name", name);
	//	return "greeting";
	//}

	//@GetMapping
	//public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	//	List<Entes> entes = new ArrayList<>();
	//	entes = entesRepository.findAll();
	//	//for (Entes ente : entes) {
	//	//	System.out.println(ente.getNome());
	//	//}
	//	model.addAttribute("name", name);
	//	model.addAttribute("entes", entes);
	//	return "greeting";
	//}

	@GetMapping
	public List<Servidores> listagem() {
		List<Servidores> servidores = new ArrayList<>();
		//entes = entesRepository.findAll();
		return servidoresRepository.findAll();
	}

	//@GetMapping
	//public ResponseEntity<List<Entes>> getAll() {
	//	List<Entes> entes = new ArrayList<>();
	//	entes = entesRepository.findAll();
	//	return new ResponseEntity<>(entes, HttpStatus.OK);
	//}

	//for (Aplicacao aplicacao : repository.findAll()) {
	//	log.info("a aplicacao eh: " + aplicacao.toString());
	//}

	//@GetMapping(path="/{id}")
	//public ResponseEntity<Optional<Entes>> getById(@PathVariable Long id){
	//	Optional<Entes> entes = Optional.empty();
	//	try {
	//		entes = entesRepository.findById((long) id);
	//		return new ResponseEntity<Optional<Entes>>(entes, HttpStatus.OK);
	//	}catch (NoSuchElementException nsee){
	//		return new ResponseEntity<Optional<Entes>>(entes, HttpStatus.NOT_FOUND);
	//	}
	//}

}
