package com.example.lab04;

import com.example.lab04.repository.AplicacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.lab04.entity.Aplicacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AplicacaoRepository repository) {
		return (args) -> {
			repository.save(new Aplicacao("bugtracker", "jose.maria", "aplicacao de rastreamento de bugs"));
			repository.save(new Aplicacao("despesas", "maria.joao", "aplicacao para rastrear relatorios de despesas"));
			repository.save(new Aplicacao("notificacoes", "jose.mateus",
					"aplicacao para enviar alertas e notificacoes aos usuarios"));

			for (Aplicacao aplicacao : repository.findAll()) {
				log.info("a aplicacao eh: " + aplicacao.toString());
			}
		};
	}
}